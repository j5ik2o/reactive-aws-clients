package com.github.j5ik2o.reactive.aws.dynamodb

import java.net.URI
import java.time.ZonedDateTime
import java.util.UUID

import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import com.github.j5ik2o.reactive.aws.dynamodb.implicits._
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }
import software.amazon.awssdk.services.dynamodb.model._

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
      val listTablesRequest  = ListTablesRequest.builder().withLimitAsScala(Some(1)).build()
      val listTablesResponse = client.listTables(listTablesRequest).futureValue
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
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true
      val getItemRequest = GetItemRequest
        .builder()
        .withTableNameAsScala(Some(tableName))
        .withKeyAsScala(Some(Map("Id" -> AttributeValue.builder().withSAsScala(Some("abc")).build()))).build()
      val getItemResponse = client.getItem(getItemRequest).futureValue
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
      val updateItemResponse = client.updateItem(updateItemRequest).futureValue
      updateItemResponse.sdkHttpResponse().isSuccessful shouldBe true
    }
    "batchWriteItem & batchGetItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.sdkHttpResponse().isSuccessful shouldBe true
      val batchWriteItemRequest = BatchWriteItemRequest
        .builder().withRequestItemsAsScala(
          Some(
            Map(
              tableName -> Seq(
                WriteRequest
                  .builder().withPutRequestAsScala(
                    Some(
                      PutRequest
                        .builder().withItemAsScala(
                          Some(
                            Map(
                              "Id"   -> AttributeValue.builder().withSAsScala(Some("111")).build(),
                              "Name" -> AttributeValue.builder().withSAsScala(Some("abc")).build()
                            )
                          )
                        ).build()
                    )
                  ).build(),
                WriteRequest
                  .builder().withPutRequestAsScala(
                    Some(
                      PutRequest
                        .builder().withItemAsScala(
                          Some(
                            Map(
                              "Id"   -> AttributeValue.builder().withSAsScala(Some("222")).build(),
                              "Name" -> AttributeValue.builder().withSAsScala(Some("xyz")).build()
                            )
                          )
                        ).build()
                    )
                  ).build()
              )
            )
          )
        ).build()
      val batchWriteItemResponse = client.batchWriteItem(batchWriteItemRequest).futureValue
      batchWriteItemResponse.sdkHttpResponse().isSuccessful shouldBe true

      val batchGetItemRequest = BatchGetItemRequest
        .builder().withRequestItemsAsScala(
          Some(
            Map(
              tableName -> KeysAndAttributes
                .builder().withKeysAsScala(
                  Some(
                    Seq(
                      Map("Id" -> AttributeValue.builder().withSAsScala(Some("111")).build()),
                      Map("Id" -> AttributeValue.builder().withSAsScala(Some("222")).build())
                    )
                  )
                ).build()
            )
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
        .withTableNameAsScala(Some(tableName)).withItemAsScala(
          Some(
            Map(
              "Id" -> AttributeValue.builder().withSAsScala(Some("abc")).build(),
              "CreatedAt" -> AttributeValue
                .builder().withNAsScala(Some(ZonedDateTime.now().toInstant.toEpochMilli.toString)).build(),
              "Name" -> AttributeValue.builder().withSAsScala(Some("xyz")).build()
            )
          )
        ).build()
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.sdkHttpResponse().isSuccessful shouldBe true

      val scanRequest  = ScanRequest.builder().withTableNameAsScala(Some(tableName)).build()
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
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }

  private def createTableWithPartitionAndSortKey(
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
              .withAttributeTypeAsScala(Some(ScalarAttributeType.S)).build(),
            AttributeDefinition
              .builder()
              .withAttributeNameAsScala(Some("CreatedAt"))
              .withAttributeTypeAsScala(Some(ScalarAttributeType.N)).build()
          )
        )
      )
      .withKeySchemaAsScala(
        Some(
          Seq(
            KeySchemaElement
              .builder()
              .withAttributeNameAsScala(Some("Id"))
              .withKeyTypeAsScala(Some(KeyType.HASH)).build(),
            KeySchemaElement
              .builder()
              .withAttributeNameAsScala(Some("CreatedAt"))
              .withKeyTypeAsScala(Some(KeyType.RANGE)).build()
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
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }
}
