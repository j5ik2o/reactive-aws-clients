package com.github.j5ik2o.reactive.aws.dynamodb.v1

import java.util.UUID
import java.util.concurrent.Executors

import com.amazonaws.auth.{ AWSStaticCredentialsProvider, BasicAWSCredentials }
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBEmbeddedSpecSupport
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class DynamoDBAsyncClientSpec extends FreeSpec with DynamoDBEmbeddedSpecSupport with Matchers with ScalaFutures {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  implicit val executionContext: ExecutionContext =
    ExecutionContext.fromExecutorService(Executors.newCachedThreadPool())

  val _underlying = AmazonDynamoDBAsyncClientBuilder
    .standard().withCredentials(
      new AWSStaticCredentialsProvider(
        new BasicAWSCredentials(accessKeyId, secretAccessKey)
      )
    ).withEndpointConfiguration(
      new EndpointConfiguration(dynamoDBEndpoint, region.getName)
    ).build()

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

  val client = DynamoDBAsyncClient(underlying)

  "DynamoDBClientV1Future" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest().withLimit(Some(1))
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
            Map[String, AttributeValue]("Id" -> AttributeValue().withString(Some("abc")))
          )
        )
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.isSuccessful shouldBe true
      val getItemRequest =
        GetItemRequest()
          .withKey(Some(Map("Id" -> AttributeValue().withString(Some("abc"))))).withTableName(Some(tableName))
      val getItemResponse = client.getItem(getItemRequest).futureValue
      getItemResponse.isSuccessful shouldBe true
      getItemResponse.item.get.get("Id").flatMap(_.string) shouldBe Some("abc")

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
              .withAttributeType(Some(ScalarAttributeType.S))
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

}
