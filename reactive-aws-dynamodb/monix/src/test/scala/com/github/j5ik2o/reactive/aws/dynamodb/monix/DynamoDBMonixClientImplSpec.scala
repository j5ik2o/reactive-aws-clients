package com.github.j5ik2o.reactive.aws.dynamodb.monix

import java.net.URI
import java.util.UUID

import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClient, DynamoDBContainerSpecSupport }
import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import monix.execution.Scheduler.Implicits.global
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.duration._

class DynamoDBMonixClientImplSpec extends FreeSpec with Matchers with ScalaFutures with DynamoDBContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val underlying = DynamoDbAsyncClient
    .builder()
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val client = DynamoDBMonixClient(DynamoDBAsyncClient(underlying))

  "DynamoDBTaskClientV2Impl" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest.builder().withLimitAsScala(Some(1)).build()
      val listTablesResponse = client.listTables(listTablesRequest).runToFuture.futureValue
      listTablesResponse.sdkHttpResponse().isSuccessful shouldBe true
      listTablesResponse.tableNamesAsScala.get should contain(tableName)
    }
    "putItem & getItem & updateItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val putItemRequest = PutItemRequest
        .builder()
        .withTableNameAsScala(Some(tableName)).withItemAsScala(
          Some(
            Map[String, AttributeValue](
              "Id"   -> AttributeValue.builder().withSAsScala(Some("abc")).build(),
              "Name" -> AttributeValue.builder().withSAsScala(Some("xyz")).build()
            )
          )
        ).build()
      val putItemResponse = client.putItem(putItemRequest).runToFuture.futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      val getItemRequest = GetItemRequest
        .builder()
        .withTableNameAsScala(Some(tableName))
        .withKeyAsScala(Some(Map("Id" -> AttributeValue.builder().withSAsScala(Some("abc")).build()))).build()
      val getItemResponse = client.getItem(getItemRequest).runToFuture.futureValue
      getItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      getItemResponse.itemAsScala.get.mapValues(_.sAsScala.get) shouldBe Map("Id" -> "abc", "Name" -> "xyz")

      val updateItemRequest = UpdateItemRequest
        .builder()
        .withTableNameAsScala(Some(tableName))
        .withKeyAsScala(Some(Map("Id" -> AttributeValue.builder().withSAsScala(Some("abc")).build())))
        .withAttributeUpdatesAsScala(
          Some(
            Map(
              "Name" -> AttributeValueUpdate
                .builder()
                .withActionAsScala(Some(AttributeAction.PUT)).withValueAsScala(
                  Some(AttributeValue.builder().withSAsScala(Some("---")).build())
                ).build()
            )
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
      .withAttributeDefinitionsAsScala(
        Some(
          Seq(
            AttributeDefinition
              .builder()
              .withAttributeNameAsScala(Some("Id"))
              .withAttributeTypeAsScala(Some(ScalarAttributeType.S)).build()
          )
        )
      )
      .withKeySchemaAsScala(
        Some(
          Seq(
            KeySchemaElement
              .builder()
              .withAttributeNameAsScala(Some("Id"))
              .withKeyTypeAsScala(Some(KeyType.HASH)).build()
          )
        )
      )
      .withProvisionedThroughputAsScala(
        Some(
          ProvisionedThroughput
            .builder()
            .withReadCapacityUnitsAsScala(Some(10L))
            .withWriteCapacityUnitsAsScala(Some(10L)).build()
        )
      )
      .withTableNameAsScala(Some(tableName)).build()
    val createResponse = client
      .createTable(createRequest).runToFuture.futureValue
    (tableName, createResponse)
  }
}
