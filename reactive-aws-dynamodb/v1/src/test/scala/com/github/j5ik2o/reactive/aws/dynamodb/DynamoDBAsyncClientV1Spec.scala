package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.UUID
import java.util.concurrent.Executors

import com.amazonaws.auth.{ AWSStaticCredentialsProvider, BasicAWSCredentials }
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.dynamodb.DynamoDBEmbeddedSpecSupport
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class DynamoDBAsyncClientV1Spec extends FreeSpec with DynamoDBEmbeddedSpecSupport with Matchers with ScalaFutures {

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

  val underlying = JavaAsyncClientDecoratorV1.ofMetricsCollector(
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

  val client = DynamoDBAsyncClientV1(underlying)

  "DynamoDBClientV1Future" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: model.CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val listTablesRequest  = model.ListTablesRequest().withLimit(Some(1))
      val listTablesResponse = client.listTables(listTablesRequest).futureValue
      listTablesResponse.isSuccessful shouldBe true
      listTablesResponse.tableNames.get should contain(tableName)
    }
    "putItem & getItem & updateItem" in {
      val (tableName: String, createResponse: model.CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val putItemRequest = model
        .PutItemRequest()
        .withTableName(Some(tableName)).withItem(
          Some(
            Map[String, AttributeValue]("Id" -> model.AttributeValue().withString(Some("abc")))
          )
        )
      val putItemResponse = client.putItem(putItemRequest).futureValue
      putItemResponse.isSuccessful shouldBe true
      val getItemRequest = model
        .GetItemRequest()
        .withKey(Some(Map("Id" -> model.AttributeValue().withString(Some("abc"))))).withTableName(Some(tableName))
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

}
