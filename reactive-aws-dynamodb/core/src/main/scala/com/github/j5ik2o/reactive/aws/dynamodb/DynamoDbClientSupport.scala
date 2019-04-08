package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import software.amazon.awssdk.services.dynamodb.model._

private[dynamodb] trait DynamoDbClientSupport[M[_]] { this: DynamoDbClient[M] =>

  def batchGetItem(requestItems: Map[String, KeysAndAttributes],
                   returnConsumedCapacity: ReturnConsumedCapacity): M[BatchGetItemResponse] = {
    batchGetItem(
      BatchGetItemRequest
        .builder()
        .requestItemsAsScala(requestItems).returnConsumedCapacity(returnConsumedCapacity).build()
    )

  }

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): M[BatchGetItemResponse] = {
    batchGetItem(BatchGetItemRequest.builder().requestItemsAsScala(requestItems).build())
  }

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): M[BatchWriteItemResponse] = {
    batchWriteItem(BatchWriteItemRequest.builder().requestItemsAsScala(requestItems).build())
  }

  def createTable(attributeDefinitions: Seq[AttributeDefinition],
                  tableName: String,
                  keySchema: Seq[KeySchemaElement],
                  provisionedThroughput: ProvisionedThroughput): M[CreateTableResponse] = {
    createTable(
      CreateTableRequest
        .builder()
        .attributeDefinitionsAsScala(attributeDefinitions)
        .tableName(tableName)
        .keySchemaAsScala(keySchema)
        .provisionedThroughput(provisionedThroughput).build()
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
    describeTable(DescribeTableRequest.builder().tableName(tableName).build())
  }

  def deleteItem(tableName: String, key: Map[String, AttributeValue]): M[DeleteItemResponse] = {
    deleteItem(DeleteItemRequest.builder().tableName(tableName).keyAsScala(key).build())
  }

  def deleteItem(tableName: String,
                 key: Map[String, AttributeValue],
                 returnValues: ReturnValue): M[DeleteItemResponse] = {
    deleteItem(
      DeleteItemRequest
        .builder().tableName(tableName).keyAsScala(key)
        .returnValues(returnValues).build()
    )
  }

  def deleteTable(tableName: String): M[DeleteTableResponse] = {
    deleteTable(DeleteTableRequest.builder().tableName(tableName).build())
  }

  def listBackups(): M[ListBackupsResponse] = {
    listBackups(ListBackupsRequest.builder().build())
  }

  def listTables: M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().build())
  }

  def listTables(exclusiveStartTableName: String): M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().exclusiveStartTableName(exclusiveStartTableName).build())
  }

  def listTables(exclusiveStartTableName: String, limit: Int): M[ListTablesResponse] = {
    listTables(
      ListTablesRequest
        .builder().exclusiveStartTableName(exclusiveStartTableName).limit(limit).build()
    )
  }

  def listTables(limit: Int): M[ListTablesResponse] = {
    listTables(ListTablesRequest.builder().limit(limit).build())
  }

  def putItem(tableName: String, item: Map[String, AttributeValue]): M[PutItemResponse] = {
    putItem(PutItemRequest.builder().tableName(tableName).itemAsScala(item).build())
  }

  def putItem(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): M[PutItemResponse] = {
    putItem(
      PutItemRequest
        .builder().tableName(tableName).itemAsScala(item).returnValues(returnValues).build()
    )
  }

  def scan(tableName: String, attributesToGet: Seq[String]): M[ScanResponse] = {
    scan(
      ScanRequest
        .builder().tableNameAsScala(Some(tableName)).attributesToGetAsScala(Some(attributesToGet)).build()
    )
  }

  def scan(tableName: String, scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(ScanRequest.builder().tableNameAsScala(Some(tableName)).scanFilterAsScala(Some(scanFilter)).build())
  }

  def scan(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(
      ScanRequest
        .builder()
        .tableName(tableName).attributesToGetAsScala(attributesToGet)
        .scanFilterAsScala(scanFilter).build()
    )
  }

  def getItem(tableName: String, key: Map[String, AttributeValue]): M[GetItemResponse] = {
    getItem(GetItemRequest.builder().tableNameAsScala(Some(tableName)).keyAsScala(Some(key)).build())
  }

  def getItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): M[GetItemResponse] = {
    getItem(
      GetItemRequest.builder().tableName(tableName).keyAsScala(key).consistentReadAsScala(consistentRead).build()
    )
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate]): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest
        .builder().tableName(tableName)
        .keyAsScala(key)
        .attributeUpdatesAsScala(attributeUpdates).build()
    )
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate],
                 returnValues: ReturnValue): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest
        .builder()
        .tableName(tableName)
        .keyAsScala(key)
        .attributeUpdatesAsScala(attributeUpdates)
        .returnValues(returnValues).build()
    )
  }

  def updateTable(tableName: String, provisionedThroughput: ProvisionedThroughput): M[UpdateTableResponse] = {
    updateTable(UpdateTableRequest.builder().build())
  }

}
