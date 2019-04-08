package com.github.j5ik2o.reactive.aws.dynamodb

import java.net.URI
import java.time.ZonedDateTime
import java.util.UUID

import com.github.j5ik2o.reactive.aws.dynamodb.implicits._
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }

import scala.concurrent.duration._

class DynamoDBAsyncClientImplSpec extends FreeSpec with Matchers with ScalaFutures with DynamoDBContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val _underlying = JavaDynamoDbAsyncClient
    .builder()
    .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(1).build())
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val underlying = JavaAsyncClientDecorator.ofMetricsCollector(
    _underlying,
    new MetricsReporter {
      override def increment(name: String, times: Long): Unit = {
        println(s"times = $times")
      }

      override def record(name: String, values: Long, times: Long): Unit = {
        println(s"records = $values, $times")
      }
    }
  )

  val client: DynamoDbAsyncClient = DynamoDbAsyncClient(underlying)

  "DynamoDBClientV2FutureSpec" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest.builder().limit(1).build()
      val listTablesResponse = client.listTables(listTablesRequest).futureValue
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
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      val getItemRequest = GetItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(Map("Id" -> AttributeValue.builder().s("abc").build())).build()
      val getItemResponse = client.getItem(getItemRequest).futureValue
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
                AttributeValue.builder().sAsScala("---").build()
              ).build()
          )
        ).build()
      val updateItemResponse = client.updateItem(updateItemRequest).futureValue
      updateItemResponse.sdkHttpResponse().isSuccessful shouldBe true
    }
    "batchWriteItem & batchGetItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val batchWriteItemRequest = BatchWriteItemRequest
        .builder().requestItemsAsScala(
          Map(
            tableName -> Seq(
              WriteRequest
                .builder().putRequest(
                  PutRequest
                    .builder().itemAsScala(
                      Map(
                        "Id"   -> AttributeValue.builder().s("111").build(),
                        "Name" -> AttributeValue.builder().s("abc").build()
                      )
                    ).build()
                ).build(),
              WriteRequest
                .builder().putRequest(
                  PutRequest
                    .builder().itemAsScala(
                      Map(
                        "Id"   -> AttributeValue.builder().s("222").build(),
                        "Name" -> AttributeValue.builder().s("xyz").build()
                      )
                    ).build()
                ).build()
            )
          )
        ).build()
      val batchWriteItemResponse = client.batchWriteItem(batchWriteItemRequest).futureValue
      batchWriteItemResponse.sdkHttpResponse().isSuccessful shouldBe true

      val batchGetItemRequest = BatchGetItemRequest
        .builder().requestItemsAsScala(
          Map(
            tableName -> KeysAndAttributes
              .builder().keysAsScala(
                Seq(
                  Map("Id" -> AttributeValue.builder().s("111").build()),
                  Map("Id" -> AttributeValue.builder().s("222").build())
                )
              ).build()
          )
        ).build()
      val batchGetItemResponse = client.batchGetItem(batchGetItemRequest).futureValue
      batchGetItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      println(batchGetItemResponse.responses)
    }
    "scan" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTableWithPartitionAndSortKey()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true

      val putItemRequest = PutItemRequest
        .builder()
        .tableName(tableName).itemAsScala(
          Map(
            "Id" -> AttributeValue.builder().s("abc").build(),
            "CreatedAt" -> AttributeValue
              .builder().n(ZonedDateTime.now().toInstant.toEpochMilli.toString).build(),
            "Name" -> AttributeValue.builder().s("xyz").build()
          )
        ).build()
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true

      val scanRequest  = ScanRequest.builder().tableName(tableName).build()
      val scanResponse = client.scan(scanRequest).futureValue
      scanResponse.sdkHttpResponse().isSuccessful shouldBe true
      scanResponse.itemsAsScala.get.exists(_.get("Id").exists(_.sAsScala.contains("abc"))) shouldBe true
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
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }

  private def createTableWithPartitionAndSortKey(
      tableName: String = "example_" + UUID.randomUUID().toString
  ): (String, CreateTableResponse) = {
    val createRequest = CreateTableRequest
      .builder()
      .attributeDefinitionsAsScala(
        Seq(
          AttributeDefinition
            .builder()
            .attributeName("Id")
            .attributeType(ScalarAttributeType.S).build(),
          AttributeDefinition
            .builder()
            .attributeName("CreatedAt")
            .attributeType(ScalarAttributeType.N).build()
        )
      )
      .keySchemaAsScala(
        Seq(
          KeySchemaElement
            .builder()
            .attributeName("Id")
            .keyType(KeyType.HASH).build(),
          KeySchemaElement
            .builder()
            .attributeName("CreatedAt")
            .keyType(KeyType.RANGE).build()
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
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }
}
