package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Source
import com.github.j5ik2o.reactive.aws.dynamodb.model._

trait DynamoDBStreamClientSupport {
  this: DynamoDBStreamClient =>

  import DynamoDBStreamClient._

  def batchGetItemSource(requestItems: Map[String, KeysAndAttributes],
                         returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
                         parallelism: Int = DefaultParallelism): Source[BatchGetItemResponse, NotUsed] = {
    Source
      .single(
        BatchGetItemRequest()
          .withRequestItems(Some(requestItems)).withReturnConsumedCapacity(returnConsumedCapacity)
      ).via(batchGetItemFlow(parallelism))
  }

  def batchWriteItemSource(requestItems: Map[String, Seq[WriteRequest]],
                           parallelism: Int = DefaultParallelism): Source[BatchWriteItemResponse, NotUsed] = {
    Source
      .single(BatchWriteItemRequest().withRequestItems(Some(requestItems))).via(
        batchWriteItemFlow(parallelism)
      )
  }

  def createTableSource(attributeDefinitions: Seq[AttributeDefinition],
                        tableName: String,
                        keySchema: Seq[KeySchemaElement],
                        provisionedThroughput: ProvisionedThroughput,
                        parallelism: Int = DefaultParallelism): Source[CreateTableResponse, NotUsed] = {
    Source
      .single(
        CreateTableRequest()
          .withAttributeDefinitions(Some(attributeDefinitions))
          .withTableName(Some(tableName))
          .withKeySchema(Some(keySchema))
          .withProvisionedThroughput(Some(provisionedThroughput))
      ).via(createTableFlow(parallelism))
  }

  def describeEndpointsSource(parallelism: Int = DefaultParallelism): Source[DescribeEndpointsResponse, NotUsed] = {
    Source.single(DescribeEndpointsRequest()).via(describeEndpointsFlow(parallelism))
  }

  def describeLimitsSource(parallelism: Int = DefaultParallelism): Source[DescribeLimitsResponse, NotUsed] = {
    Source.single(DescribeLimitsRequest()).via(describeLimitsFlow(parallelism))
  }

  def listGlobalTablesSource(parallelism: Int = DefaultParallelism): Source[ListGlobalTablesResponse, NotUsed] = {
    Source.single(ListGlobalTablesRequest()).via(listGlobalTablesFlow(parallelism))
  }

  def describeTableSource(tableName: String,
                          parallelism: Int = DefaultParallelism): Source[DescribeTableResponse, NotUsed] = {
    Source.single(DescribeTableRequest().withTableName(Some(tableName))).via(describeTableFlow(parallelism))
  }

  def deleteItemSource(tableName: String,
                       key: Map[String, AttributeValue],
                       returnValues: Option[ReturnValue] = None,
                       parallelism: Int = DefaultParallelism): Source[DeleteItemResponse, NotUsed] = {
    Source
      .single(
        DeleteItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withReturnValues(returnValues)
      ).via(deleteItemFlow(parallelism))
  }

  def deleteTableSource(tableName: String,
                        parallelism: Int = DefaultParallelism): Source[DeleteTableResponse, NotUsed] = {
    Source.single(DeleteTableRequest().withTableName(Some(tableName))).via(deleteTableFlow(parallelism))
  }

  def listBackupsSource(parallelism: Int = DefaultParallelism): Source[ListBackupsResponse, NotUsed] = {
    Source.single(ListBackupsRequest()).via(listBackupsFlow(parallelism))
  }

  def listTablesSource(exclusiveStartTableName: Option[String] = None,
                       limit: Option[Int] = None,
                       parallelism: Int = DefaultParallelism): Source[ListTablesResponse, NotUsed] = {
    Source
      .single(ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit)).via(
        listTablesFlow(parallelism)
      )
  }

  def putItemSource(tableName: String,
                    item: Map[String, AttributeValue],
                    returnValues: Option[ReturnValue] = None,
                    parallelism: Int = DefaultParallelism): Source[PutItemResponse, NotUsed] = {
    Source
      .single(PutItemRequest().withTableName(Some(tableName)).withItem(Some(item)).withReturnValues(returnValues)).via(
        putItemFlow(parallelism)
      )
  }

  def scanSource(tableName: String,
                 scanFilter: Option[Map[String, Condition]] = None,
                 attributesToGet: Option[Seq[String]] = None,
                 parallelism: Int = DefaultParallelism): Source[ScanResponse, NotUsed] = {
    (scanFilter, attributesToGet) match {
      case (Some(sf), _) =>
        Source
          .single(
            ScanRequest()
              .withTableName(Some(tableName)).withScanFilter(Some(sf))
          ).via(scanFlow(parallelism))
      case (_, Some(atg)) =>
        Source
          .single(ScanRequest().withTableName(Some(tableName)).withAttributesToGet(Some(atg))).via(
            scanFlow(parallelism)
          )
      case _ =>
        throw new IllegalArgumentException("")
    }
  }

  def getItemSource(tableName: String,
                    key: Map[String, AttributeValue],
                    consistentRead: Option[Boolean] = None,
                    parallelism: Int = DefaultParallelism): Source[GetItemResponse, NotUsed] = {
    Source
      .single(
        GetItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withConsistentRead(consistentRead)
      ).via(getItemFlow(parallelism))
  }

  def updateItemSource(tableName: String,
                       key: Map[String, AttributeValue],
                       attributeUpdates: Map[String, AttributeValueUpdate],
                       returnValues: Option[ReturnValue] = None,
                       parallelism: Int = DefaultParallelism): Source[UpdateItemResponse, NotUsed] = {
    Source
      .single(
        UpdateItemRequest()
          .withTableName(Some(tableName))
          .withKey(Some(key))
          .withAttributeUpdates(Some(attributeUpdates))
          .withReturnValues(returnValues)
      ).via(updateItemFlow(parallelism))
  }

  def updateTableSource(tableName: String,
                        provisionedThroughput: ProvisionedThroughput,
                        parallelism: Int = DefaultParallelism): Source[UpdateTableResponse, NotUsed] = {
    Source.single(UpdateTableRequest()).via(updateTableFlow(parallelism))
  }

}
