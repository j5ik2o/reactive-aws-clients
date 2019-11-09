package com.github.j5ik2o.reactive.aws.dynamodb.cats

import java.net.URI
import java.util.UUID
import java.util.concurrent.{ Executor, Executors }

import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBContainerSpecSupport, DynamoDbAsyncClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import org.scalatest.{ AsyncFreeSpec, Matchers }
import org.scalatest.concurrent.ScalaFutures
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class DynamoDbCatsIOClientImplSpec
    extends AsyncFreeSpec
    with Matchers
    with ScalaFutures
    with DynamoDBContainerSpecSupport {
  implicit val pc: PatienceConfig = PatienceConfig(30 seconds, 1 seconds)

  val underlying = JavaDynamoDbAsyncClient
    .builder()
    .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(1).build())
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .region(Region.EU_WEST_1)
    .endpointOverride(URI.create(endpoint))
    .build()

  val catsEc = ExecutionContext.fromExecutor(Executors.newCachedThreadPool())
  val client = DynamoDbCatsIOClient(DynamoDbAsyncClient(underlying))(catsEc)

  "DynamoDbCatsIOClientImplSpec" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest.builder().limit(1).build()
      val listTablesResponse = client.listTables(listTablesRequest).unsafeToFuture().futureValue
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
      val putItemResponse = client.putItem(putItemRequest).unsafeToFuture().futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      val getItemRequest = GetItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(Map("Id" -> AttributeValue.builder().s("abc").build())).build()
      val getItemResponse = client.getItem(getItemRequest).unsafeToFuture().futureValue
      getItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      getItemResponse.itemAsScala.get.mapValues(_.sAsScala.get).toMap shouldBe Map("Id" -> "abc", "Name" -> "xyz")

      val updateItemRequest = UpdateItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(Map("Id" -> AttributeValue.builder().s("abc").build()))
        .attributeUpdatesAsScala(
          Some(
            Map(
              "Name" -> AttributeValueUpdate
                .builder()
                .action(AttributeAction.PUT).value(
                  AttributeValue.builder().s("---").build()
                ).build()
            )
          )
        ).build()
      val updateItemResponse = client.updateItem(updateItemRequest).unsafeToFuture().futureValue
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
      .createTable(createRequest).unsafeToFuture().futureValue
    (tableName, createResponse)
  }

}
