package com.github.j5ik2o.reactive.aws.dynamodb.monix

import java.net.URI
import java.util.UUID

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClientV2, DynamoDBContainerSpecSupport }
import monix.execution.Scheduler.Implicits.global
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.duration._

class DynamoDBMonixClientV2ImplSpec extends FreeSpec with Matchers with ScalaFutures with DynamoDBContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val underlying = DynamoDbAsyncClient
    .builder()
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val client = DynamoDBMonixClientV2(DynamoDBAsyncClientV2(underlying))

  "DynamoDBTaskClientV2Impl" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val listTablesRequest  = ListTablesRequest().withLimit(Some(1))
      val listTablesResponse = client.listTables(listTablesRequest).runToFuture.futureValue
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
      val putItemResponse = client.putItem(putItemRequest).runToFuture.futureValue
      putItemResponse.isSuccessful shouldBe true
      val getItemRequest = GetItemRequest()
        .withTableName(Some(tableName))
        .withKey(Some(Map("Id" -> AttributeValue().withString(Some("abc")))))
      val getItemResponse = client.getItem(getItemRequest).runToFuture.futureValue
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
      val updateItemResponse = client.updateItem(updateItemRequest).runToFuture.futureValue
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
      .createTable(createRequest).runToFuture.futureValue
    (tableName, createResponse)
  }
}
