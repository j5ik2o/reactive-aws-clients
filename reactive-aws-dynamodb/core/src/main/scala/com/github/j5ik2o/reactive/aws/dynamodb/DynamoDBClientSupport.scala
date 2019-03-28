package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model._

private[dynamodb] trait DynamoDBClientSupport[M[_]] { this: DynamoDBClient[M] =>

  def batchGetItem(requestItems: Map[String, KeysAndAttributes],
                   returnConsumedCapacity: ReturnConsumedCapacity): M[BatchGetItemResponse] = {
    batchGetItem(
      BatchGetItemRequest()
        .withRequestItems(Some(requestItems)).withReturnConsumedCapacity(Some(returnConsumedCapacity))
    )
  }

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): M[BatchGetItemResponse] = {
    batchGetItem(BatchGetItemRequest().withRequestItems(Some(requestItems)))
  }

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): M[BatchWriteItemResponse] = {
    batchWriteItem(BatchWriteItemRequest().withRequestItems(Some(requestItems)))
  }

  def createTable(attributeDefinitions: Seq[AttributeDefinition],
                  tableName: String,
                  keySchema: Seq[KeySchemaElement],
                  provisionedThroughput: ProvisionedThroughput): M[CreateTableResponse] = {
    createTable(
      CreateTableRequest()
        .withAttributeDefinitions(Some(attributeDefinitions))
        .withTableName(Some(tableName))
        .withKeySchema(Some(keySchema))
        .withProvisionedThroughput(Some(provisionedThroughput))
    )
  }

  def describeEndpoints(): M[DescribeEndpointsResponse] = {
    describeEndpoints(DescribeEndpointsRequest())
  }

  def describeLimits: M[DescribeLimitsResponse] = {
    describeLimits(DescribeLimitsRequest())
  }

  def listGlobalTables: M[ListGlobalTablesResponse] = {
    listGlobalTables(ListGlobalTablesRequest())
  }

  def describeTable(tableName: String): M[DescribeTableResponse] = {
    describeTable(DescribeTableRequest().withTableName(Some(tableName)))
  }

  def deleteItem(tableName: String, key: Map[String, AttributeValue]): M[DeleteItemResponse] = {
    deleteItem(DeleteItemRequest().withTableName(Some(tableName)).withKey(Some(key)))
  }

  def deleteItem(tableName: String,
                 key: Map[String, AttributeValue],
                 returnValues: ReturnValue): M[DeleteItemResponse] = {
    deleteItem(
      DeleteItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withReturnValues(Some(returnValues))
    )
  }

  def deleteTable(tableName: String): M[DeleteTableResponse] = {
    deleteTable(DeleteTableRequest().withTableName(Some(tableName)))
  }

  def listBackups(): M[ListBackupsResponse] = {
    listBackups(ListBackupsRequest())
  }

  def listTables: M[ListTablesResponse] = {
    listTables(ListTablesRequest())
  }

  def listTables(exclusiveStartTableName: String): M[ListTablesResponse] = {
    listTables(ListTablesRequest().withExclusiveStartTableName(Some(exclusiveStartTableName)))
  }

  def listTables(exclusiveStartTableName: String, limit: Int): M[ListTablesResponse] = {
    listTables(ListTablesRequest().withExclusiveStartTableName(Some(exclusiveStartTableName)).withLimit(Some(limit)))
  }

  def listTables(limit: Int): M[ListTablesResponse] = {
    listTables(ListTablesRequest().withLimit(Some(limit)))
  }

  def putItem(tableName: String, item: Map[String, AttributeValue]): M[PutItemResponse] = {
    putItem(PutItemRequest().withTableName(Some(tableName)).withItem(Some(item)))
  }

  def putItem(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): M[PutItemResponse] = {
    putItem(PutItemRequest().withTableName(Some(tableName)).withItem(Some(item)).withReturnValues(Some(returnValues)))
  }

  def scan(tableName: String, attributesToGet: Seq[String]): M[ScanResponse] = {
    scan(ScanRequest().withTableName(Some(tableName)).withAttributesToGet(Some(attributesToGet)))
  }

  def scan(tableName: String, scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(ScanRequest().withTableName(Some(tableName)).withScanFilter(Some(scanFilter)))
  }

  def scan(tableName: String, attributesToGet: Seq[String], scanFilter: Map[String, Condition]): M[ScanResponse] = {
    scan(
      ScanRequest()
        .withTableName(Some(tableName)).withAttributesToGet(Some(attributesToGet)).withScanFilter(Some(scanFilter))
    )
  }

  def getItem(tableName: String, key: Map[String, AttributeValue]): M[GetItemResponse] = {
    getItem(GetItemRequest().withTableName(Some(tableName)).withKey(Some(key)))
  }

  def getItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): M[GetItemResponse] = {
    getItem(GetItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withConsistentRead(Some(consistentRead)))
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate]): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withAttributeUpdates(Some(attributeUpdates))
    )
  }

  def updateItem(tableName: String,
                 key: Map[String, AttributeValue],
                 attributeUpdates: Map[String, AttributeValueUpdate],
                 returnValues: ReturnValue): M[UpdateItemResponse] = {
    updateItem(
      UpdateItemRequest()
        .withTableName(Some(tableName))
        .withKey(Some(key))
        .withAttributeUpdates(Some(attributeUpdates))
        .withReturnValues(Some(returnValues))
    )
  }

  def updateTable(tableName: String, provisionedThroughput: ProvisionedThroughput): M[UpdateTableResponse] = {
    updateTable(UpdateTableRequest())
  }

}
