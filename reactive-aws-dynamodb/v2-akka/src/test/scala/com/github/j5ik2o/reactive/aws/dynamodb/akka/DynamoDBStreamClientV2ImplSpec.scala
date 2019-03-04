package com.github.j5ik2o.reactive.aws.dynamodb.akka

import java.net.URI
import java.util.UUID

import akka.actor.ActorSystem
import akka.stream.scaladsl.{ Sink, Source }
import akka.stream.{ ActorMaterializer, Materializer }
import akka.testkit.TestKit
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClientV2, DynamoDBContainerSpecSupport }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpecLike, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.duration._

class DynamoDBStreamClientV2ImplSpec
    extends TestKit(ActorSystem("DynamoDBStreamClientV2ImplSpec"))
    with FreeSpecLike
    with Matchers
    with ScalaFutures
    with DynamoDBContainerSpecSupport {

  implicit val mat: Materializer = ActorMaterializer()

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  val underlying = DynamoDbAsyncClient
    .builder()
    .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(1).build())
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()
  val client = DynamoDBStreamClientV2(DynamoDBAsyncClientV2(underlying))

  "DynamoDBStreamClientV2Impl" - {
    "createTable & listTables" in {
      val (tableName: String, createResponse: CreateTableResponse) = createTable()
      createResponse.isSuccessful shouldBe true
      val listTablesRequest = ListTablesRequest().withLimit(Some(1))
      val listTablesResponse =
        Source.single(listTablesRequest).via(client.listTablesFlow()).runWith(Sink.head).futureValue
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
      val putItemResponse =
        Source.single(putItemRequest).via(client.putItemFlow()).runWith(Sink.head).futureValue
      putItemResponse.isSuccessful shouldBe true
      val getItemRequest = GetItemRequest()
        .withTableName(Some(tableName))
        .withKey(Some(Map("Id" -> AttributeValue().withString(Some("abc")))))
      val getItemResponse =
        Source.single(getItemRequest).via(client.getItemFlow()).runWith(Sink.head).futureValue
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
      val updateItemResponse =
        Source.single(updateItemRequest).via(client.updateItemFlow()).runWith(Sink.head).futureValue
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
    val createResponse = Source.single(createRequest).via(client.createTableFlow()).runWith(Sink.head).futureValue
    (tableName, createResponse)
  }

}
