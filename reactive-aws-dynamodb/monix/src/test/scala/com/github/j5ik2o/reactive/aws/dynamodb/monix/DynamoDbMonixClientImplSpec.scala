package com.github.j5ik2o.reactive.aws.dynamodb.monix

import java.net.URI
import java.util.UUID

import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBContainerSpecSupport, DynamoDbAsyncClient }
import monix.execution.Scheduler.Implicits.global
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.duration._

class DynamoDbMonixClientImplSpec extends FreeSpec with Matchers with ScalaFutures with DynamoDBContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val underlying = JavaDynamoDbAsyncClient
    .builder()
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val client = DynamoDbMonixClient(DynamoDbAsyncClient(underlying))

  "DynamoDBTaskClientV2Impl" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest.builder().limit(1).build()
      val listTablesResponse = client.listTables(listTablesRequest).runToFuture.futureValue
      listTablesResponse.sdkHttpResponse().isSuccessful shouldBe true
      listTablesResponse.tableNamesAsScala.get should contain(tableName)
    }
    "putItem & getItem & updateItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val putItemRequest = PutItemRequest
        .builder()
        .tableName(tableName).itemAsScala(
          Map[String, AttributeValue](
            "Id"   -> AttributeValue.builder().s("abc").build(),
            "Name" -> AttributeValue.builder().s("xyz").build()
          )
        ).build()
      val putItemResponse = client.putItem(putItemRequest).runToFuture.futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      val getItemRequest = GetItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(Map("Id" -> AttributeValue.builder().s("abc").build())).build()
      val getItemResponse = client.getItem(getItemRequest).runToFuture.futureValue
      getItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      getItemResponse.itemAsScala.get.mapValues(_.s) shouldBe Map("Id" -> "abc", "Name" -> "xyz")

      val updateItemRequest = UpdateItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(Map("Id" -> AttributeValue.builder().s("abc").build()))
        .attributeUpdatesAsScala(
          Map(
            "Name" -> AttributeValueUpdate
              .builder()
              .action(AttributeAction.PUT).value(
                AttributeValue.builder().s("---").build()
              ).build()
          )
        ).build()
      val updateItemResponse = client.updateItem(updateItemRequest).runToFuture.futureValue
      updateItemResponse.sdkHttpResponse().isSuccessful shouldBe true
    }
  }

  private def createTable(
      tableName: String = "example_" + UUID.randomUUID().toString
  ): (String, CreateTableResponse) = {
    val createRequest = CreateTableRequest
      .builder()
      .attributeDefinitionsAsScala(
        Seq(
          AttributeDefinition
            .builder()
            .attributeName("Id")
            .attributeType(ScalarAttributeType.S).build()
        )
      )
      .keySchemaAsScala(
        Seq(
          KeySchemaElement
            .builder()
            .attributeName("Id")
            .keyType(KeyType.HASH).build()
        )
      )
      .provisionedThroughput(
        ProvisionedThroughput
          .builder()
          .readCapacityUnits(10L)
          .writeCapacityUnits(10L).build()
      )
      .tableName(tableName).build()
    val createResponse = client
      .createTable(createRequest).runToFuture.futureValue
    (tableName, createResponse)
  }
}
