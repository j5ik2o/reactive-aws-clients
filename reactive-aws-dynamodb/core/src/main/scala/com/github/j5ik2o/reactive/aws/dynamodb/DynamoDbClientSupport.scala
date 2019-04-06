package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import software.amazon.awssdk.services.dynamodb.model._

private[dynamodb] trait DynamoDbClientSupport[M[_]] { this: DynamoDbClient[M] =>

  def batchGetItem(requestItems: Map[String, KeysAndAttributes],
                   returnConsumedCapacity: ReturnConsumedCapacity): M[BatchGetItemResponse] = {
    batchGetItem(
      BatchGetItemRequest
        .builder()
        .withRequestItemsAsScala(Some(requestItems)).withReturnConsumedCapacityAsScala(Some(returnConsumedCapacity)).build()
    )
  }

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): M[BatchGetItemResponse] = {
    batchGetItem(BatchGetItemRequest.builder().withRequestItemsAsScala(Some(requestItems)).build())
  }

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): M[BatchWriteItemResponse] = {
    batchWriteItem(BatchWriteItemRequest.builder().withRequestItemsAsScala(Some(requestItems)).build())
  }

  def createTable(attributeDefinitions: Seq[AttributeDefinition],
                  tableName: String,
                  keySchema: Seq[KeySchemaElement],
                  provisionedThroughput: ProvisionedThroughput): M[CreateTableResponse] = {
    createTable(
      CreateTableRequest
        .builder()
        .withAttributeDefinitionsAsScala(Some(attributeDefinitions))
        .withTableNameAsScala(Some(tableName))
        .withKeySchemaAsScala(Some(keySchema))
        .withProvisionedThroughputAsScala(Some(provisionedThroughput)).build()
    )
  }

  def describeEndpoints(): M[DescribeEndpointsResponse] = {
    describeEndpoints(DescribeEndpointsRequest.builder().build())
  }

  def describeLimits: M[DescribeLimitsResponse] = {
    describeLimits(DescribeLimitsRequest.builder().build())
  }

  def listGlobalTables: M[ListGlobalTablesResponse] = {
    listGlobalTables(ListGlobalTablesRequest.builder().build())
  }

  def describeTable(tableName: String): M[DescribeTableResponse] = {
    describeTable(DescribeTableRequest.builder().withTableNameAsScala(Some(tableName)).build())
  }

  def deleteItem(tableName: String, key: Map[String, AttributeValue]): M[DeleteItemResponse] = {
    deleteItem(DeleteItemRequest.builder().withTableNameAsScala(Some(tableName)).withKeyAsScala(Some(key)).build())
  }

  def deleteItem(tableName: String,
                 key: Map[String, AttributeValue],
                 returnValues: ReturnValue): M[DeleteItemResponse] = {
    deleteItem(
      DeleteItemRequest
        .builder().withTableNameAsScala(Some(tableName)).withKeyAsScala(Some(key)).withReturnValuesAsScala(
          Some(returnValues)
        ).build()
    )
  }

  def deleteTable(tableName: String): M[DeleteTableResponse] = {
    deleteTable(DeleteTableRequest.builder().withTableNameAsScala(Some(tableName)).build())
  }

  def listBackups(): M[ListBackupsResponse] = {
    listBackups(ListBackupsRequest.builder().build())
  }

  def listTables: M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().build())
  }

  def listTables(exclusiveStartTableName: String): M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().withExclusiveStartTableNameAsScala(Some(exclusiveStartTableName)).build())
  }

  def listTables(exclusiveStartTableName: String, limit: Int): M[ListTablesResponse] = {
    listTables(
      ListTablesRequest
        .builder().withExclusiveStartTableNameAsScala(Some(exclusiveStartTableName)).withLimitAsScala(Some(limit)).build()
    )
  }

  def listTables(limit: Int): M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().withLimitAsScala(Some(limit)).build())
  }

  def putItem(tableName: String, item: Map[String, AttributeValue]): M[PutItemResponse] = {
    putItem(PutItemRequest.builder().withTableNameAsScala(Some(tableName)).withItemAsScala(Some(item)).build())
  }

  def putItem(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): M[PutItemResponse] = {
    putItem(
      PutItemRequest
        .builder().withTableNameAsScala(Some(tableName)).withItemAsScala(Some(item)).withReturnValuesAsScala(
          Some(returnValues)
        ).build()
    )
  }

  def scan(tableName: String, attributesToGet: Seq[String]): M[ScanResponse] = {
    scan(
      ScanRequest
        .builder().withTableNameAsScala(Some(tableName)).withAttributesToGetAsScala(Some(attributesToGet)).build()
    )
  }

  def scan(tableName: String, scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(ScanRequest.builder().withTableNameAsScala(Some(tableName)).withScanFilterAsScala(Some(scanFilter)).build())
  }

  def scan(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(
      ScanRequest
        .builder()
        .withTableNameAsScala(Some(tableName)).withAttributesToGetAsScala(Some(attributesToGet)).withScanFilterAsScala(
          Some(scanFilter)
        ).build()
    )
  }

  def getItem(tableName: String, key: Map[String, AttributeValue]): M[GetItemResponse] = {
    getItem(GetItemRequest.builder().withTableNameAsScala(Some(tableName)).withKeyAsScala(Some(key)).build())
  }

  def getItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): M[GetItemResponse] = {
    getItem(
      GetItemRequest
        .builder().withTableNameAsScala(Some(tableName)).withKeyAsScala(Some(key)).withConsistentReadAsScala(
          Some(consistentRead)
        ).build()
    )
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate]): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest
        .builder().withTableNameAsScala(Some(tableName)).withKeyAsScala(Some(key)).withAttributeUpdatesAsScala(
          Some(attributeUpdates)
        ).build()
    )
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate],
                 returnValues: ReturnValue): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest
        .builder()
        .withTableNameAsScala(Some(tableName))
        .withKeyAsScala(Some(key))
        .withAttributeUpdatesAsScala(Some(attributeUpdates))
        .withReturnValuesAsScala(Some(returnValues)).build()
    )
  }

  def updateTable(tableName: String, provisionedThroughput: ProvisionedThroughput): M[UpdateTableResponse] = {
    updateTable(UpdateTableRequest.builder().build())
  }

}
