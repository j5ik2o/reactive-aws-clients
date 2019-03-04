package com.github.j5ik2o.reactive.dynamodb

import java.net.URI
import java.time.ZonedDateTime
import java.util.UUID

import com.github.j5ik2o.reactive.dynamodb.model._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.duration._

class DynamoDBAsyncClientV2Spec extends FreeSpec with Matchers with ScalaFutures with DynamoDBContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val _underlying = DynamoDbAsyncClient
    .builder()
    .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(1).build())
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val underlying = JavaAsyncClientDecoratorV2.ofMetricsCollector(
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

  val client: DynamoDBAsyncClientV2 = DynamoDBAsyncClientV2(underlying)

  "DynamoDBClientV2FutureSpec" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val listTablesRequest  = model.ListTablesRequest().withLimit(Some(1))
      val listTablesResponse = client.listTables(listTablesRequest).futureValue
      listTablesResponse.isSuccessful shouldBe true
      listTablesResponse.tableNames.get should contain(tableName)
    }
    "putItem & getItem & updateItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val putItemRequest = PutItemRequest()
        .withTableName(Some(tableName)).withItem(
          Some(
            Map[String, AttributeValue](
              "Id"   -> AttributeValue().withString(Some("abc")),
              "Name" -> AttributeValue().withString(Some("xyz"))
            )
          )
        )
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.isSuccessful shouldBe true
      val getItemRequest = GetItemRequest()
        .withTableName(Some(tableName))
        .withKey(Some(Map("Id" -> AttributeValue().withString(Some("abc")))))
      val getItemResponse = client.getItem(getItemRequest).futureValue
      getItemResponse.isSuccessful shouldBe true
      getItemResponse.item.get.mapValues(_.string.get) shouldBe Map("Id" -> "abc", "Name" -> "xyz")

      val updateItemRequest = UpdateItemRequest()
        .withTableName(Some(tableName))
        .withKey(Some(Map("Id" -> AttributeValue().withString(Some("abc")))))
        .withAttributeUpdates(
          Some(
            Map(
              "Name" -> AttributeValueUpdate()
                .withAction(Some(AttributeAction.PUT)).withValue(Some(AttributeValue().withString(Some("---"))))
            )
          )
        )
      val updateItemResponse = client.updateItem(updateItemRequest).futureValue
      updateItemResponse.isSuccessful shouldBe true
    }
    "batchWriteItem & batchGetItem" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val batchWriteItemRequest = BatchWriteItemRequest().withRequestItems(
        Some(
          Map(
            tableName -> Seq(
              WriteRequest().withPutRequest(
                Some(
                  PutRequest().withItem(
                    Some(
                      Map(
                        "Id"   -> AttributeValue().withString(Some("111")),
                        "Name" -> AttributeValue().withString(Some("abc"))
                      )
                    )
                  )
                )
              ),
              WriteRequest().withPutRequest(
                Some(
                  PutRequest().withItem(
                    Some(
                      Map(
                        "Id"   -> AttributeValue().withString(Some("222")),
                        "Name" -> AttributeValue().withString(Some("xyz"))
                      )
                    )
                  )
                )
              )
            )
          )
        )
      )
      val batchWriteItemResponse = client.batchWriteItem(batchWriteItemRequest).futureValue
      batchWriteItemResponse.isSuccessful shouldBe true

      val batchGetItemRequest = BatchGetItemRequest().withRequestItems(
        Some(
          Map(
            tableName -> KeysAndAttributes().withKeys(
              Some(
                Seq(
                  Map("Id" -> AttributeValue().withString(Some("111"))),
                  Map("Id" -> AttributeValue().withString(Some("222")))
                )
              )
            )
          )
        )
      )
      val batchGetItemResponse = client.batchGetItem(batchGetItemRequest).futureValue
      batchGetItemResponse.isSuccessful shouldBe true
      println(batchGetItemResponse.responses)
    }
    "scan" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTableWithPartitionAndSortKey()
      createResponse.isSuccessful shouldBe true

      val putItemRequest = PutItemRequest()
        .withTableName(Some(tableName)).withItem(
          Some(
            Map(
              "Id"        -> AttributeValue().withString(Some("abc")),
              "CreatedAt" -> AttributeValue().withNumber(Some(ZonedDateTime.now().toInstant.toEpochMilli.toString)),
              "Name"      -> AttributeValue().withString(Some("xyz"))
            )
          )
        )
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.isSuccessful shouldBe true

      val scanRequest  = ScanRequest().withTableName(Some(tableName))
      val scanResponse = client.scan(scanRequest).futureValue
      scanResponse.isSuccessful shouldBe true
      scanResponse.items.get.exists(_.get("Id").exists(_.string.contains("abc"))) shouldBe true
    }
  }

  private def createTable(
      tableName: String = "example_" + UUID.randomUUID().toString
  ): (String, CreateTableResponse) = {
    val createRequest = CreateTableRequest()
      .withAttributeDefinitions(
        Some(
          Seq(
            AttributeDefinition()
              .withAttributeName(Some("Id"))
              .withAttributeType(Some(AttributeType.S))
          )
        )
      )
      .withKeySchema(
        Some(
          Seq(
            KeySchemaElement()
              .withAttributeName(Some("Id"))
              .withKeyType(Some(KeyType.HASH))
          )
        )
      )
      .withProvisionedThroughput(
        Some(
          ProvisionedThroughput()
            .withReadCapacityUnits(Some(10L))
            .withWriteCapacityUnits(Some(10L))
        )
      )
      .withTableName(Some(tableName))
    val createResponse = client
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }

  private def createTableWithPartitionAndSortKey(
      tableName: String = "example_" + UUID.randomUUID().toString
  ): (String, CreateTableResponse) = {
    val createRequest = CreateTableRequest()
      .withAttributeDefinitions(
        Some(
          Seq(
            AttributeDefinition()
              .withAttributeName(Some("Id"))
              .withAttributeType(Some(AttributeType.S)),
            AttributeDefinition()
              .withAttributeName(Some("CreatedAt"))
              .withAttributeType(Some(AttributeType.N))
          )
        )
      )
      .withKeySchema(
        Some(
          Seq(
            KeySchemaElement()
              .withAttributeName(Some("Id"))
              .withKeyType(Some(KeyType.HASH)),
            KeySchemaElement()
              .withAttributeName(Some("CreatedAt"))
              .withKeyType(Some(KeyType.RANGE))
          )
        )
      )
      .withProvisionedThroughput(
        Some(
          ProvisionedThroughput()
            .withReadCapacityUnits(Some(10L))
            .withWriteCapacityUnits(Some(10L))
        )
      )
      .withTableName(Some(tableName))
    val createResponse = client
      .createTable(createRequest).futureValue
    (tableName, createResponse)
  }
}
