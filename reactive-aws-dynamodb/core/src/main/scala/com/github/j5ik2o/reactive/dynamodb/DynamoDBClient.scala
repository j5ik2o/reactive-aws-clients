package com.github.j5ik2o.reactive.dynamodb

import com.github.j5ik2o.reactive.dynamodb.model._

trait DynamoDBClient[M[_]] {

  def batchGetItem(request: BatchGetItemRequest): M[BatchGetItemResponse]

  def batchGetItem(requestItems: Map[String, KeysAndAttributes],
                   returnConsumedCapacity: String): M[BatchGetItemResponse] = {
    batchGetItem(
      BatchGetItemRequest()
        .withRequestItems(Some(requestItems)).withReturnConsumedCapacity(Some(returnConsumedCapacity))
    )
  }

  def batchGetItem(requestItems: Map[String, KeysAndAttributes]): M[BatchGetItemResponse] = {
    batchGetItem(BatchGetItemRequest().withRequestItems(Some(requestItems)))
  }

  def batchWriteItem(
      request: BatchWriteItemRequest
  ): M[BatchWriteItemResponse]

  def batchWriteItem(requestItems: Map[String, Seq[WriteRequest]]): M[BatchWriteItemResponse] = {
    batchWriteItem(BatchWriteItemRequest().withRequestItems(Some(requestItems)))
  }

  def createBackup(request: CreateBackupRequest): M[CreateBackupResponse]

  def createGlobalTable(
      request: CreateGlobalTableRequest
  ): M[CreateGlobalTableResponse]

  def createTable(request: CreateTableRequest): M[CreateTableResponse]

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

  def describeContinuousBackups(request: DescribeContinuousBackupsRequest): M[DescribeContinuousBackupsResponse]

  def describeEndpoints(request: DescribeEndpointsRequest): M[DescribeEndpointsResponse]

  def describeBackup(request: DescribeBackupRequest): M[DescribeBackupResponse]

  def describeGlobalTable(request: DescribeGlobalTableRequest): M[DescribeGlobalTableResponse]

  def describeGlobalTableSettings(request: DescribeGlobalTableSettingsRequest): M[DescribeGlobalTableSettingsResponse]

  def describeLimits(request: DescribeLimitsRequest): M[DescribeLimitsResponse]

  def describeLimits: M[DescribeLimitsResponse] = {
    describeLimits(DescribeLimitsRequest())
  }

  def describeTimeToLive(request: DescribeTimeToLiveRequest): M[DescribeTimeToLiveResponse]

  def listGlobalTables(request: ListGlobalTablesRequest): M[ListGlobalTablesResponse]

  def listGlobalTables: M[ListGlobalTablesResponse] = {
    listGlobalTables(ListGlobalTablesRequest())
  }

  def describeTable(
      request: DescribeTableRequest
  ): M[DescribeTableResponse]

  def describeTable(tableName: String): M[DescribeTableResponse] = {
    describeTable(DescribeTableRequest().withTableName(Some(tableName)))
  }

  def deleteBackup(request: DeleteBackupRequest): M[DeleteBackupResponse]

  def deleteItem(request: DeleteItemRequest): M[DeleteItemResponse]

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

  def deleteTable(request: DeleteTableRequest): M[DeleteTableResponse]

  def deleteTable(tableName: String): M[DeleteTableResponse] = {
    deleteTable(DeleteTableRequest().withTableName(Some(tableName)))
  }

  def listBackups(request: ListBackupsRequest): M[ListBackupsResponse]

  def listBackups(): M[ListBackupsResponse] = {
    listBackups(ListBackupsRequest())
  }

  def listTables(request: ListTablesRequest): M[ListTablesResponse]

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

  def listTagsOfResource(request: ListTagsOfResourceRequest): M[ListTagsOfResourceResponse]

  def putItem(request: PutItemRequest): M[PutItemResponse]

  def putItem(tableName: String, item: Map[String, AttributeValue]): M[PutItemResponse] = {
    putItem(PutItemRequest().withTableName(Some(tableName)).withItem(Some(item)))
  }

  def putItem(tableName: String, item: Map[String, AttributeValue], returnValues: ReturnValue): M[PutItemResponse] = {
    putItem(PutItemRequest().withTableName(Some(tableName)).withItem(Some(item)).withReturnValues(Some(returnValues)))
  }

  def query(request: QueryRequest): M[QueryResponse]

  def restoreTableFromBackup(
      request: RestoreTableFromBackupRequest
  ): M[RestoreTableFromBackupResponse]

  def restoreTableToPointInTime(request: RestoreTableToPointInTimeRequest): M[RestoreTableToPointInTimeResponse]

  def scan(request: ScanRequest): M[ScanResponse]

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

  def getItem(request: GetItemRequest): M[GetItemResponse]

  def getItem(tableName: String, key: Map[String, AttributeValue]): M[GetItemResponse] = {
    getItem(GetItemRequest().withTableName(Some(tableName)).withKey(Some(key)))
  }

  def getItem(tableName: String, key: Map[String, AttributeValue], consistentRead: Boolean): M[GetItemResponse] = {
    getItem(GetItemRequest().withTableName(Some(tableName)).withKey(Some(key)).withConsistentRead(Some(consistentRead)))
  }

  def updateGlobalTableSettings(
      request: UpdateGlobalTableSettingsRequest
  ): M[UpdateGlobalTableSettingsResponse]

  def updateItem(request: UpdateItemRequest): M[UpdateItemResponse]

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

  def updateTable(request: UpdateTableRequest): M[UpdateTableResponse]

  def updateTable(tableName: String, provisionedThroughput: ProvisionedThroughput): M[UpdateTableResponse] = {
    updateTable(UpdateTableRequest())
  }

  def updateTimeToLive(request: UpdateTimeToLiveRequest): M[UpdateTimeToLiveResponse]

  def tagResource(request: TagResourceRequest): M[TagResourceResponse]

  def transactGetItems(request: TransactGetItemsRequest): M[TransactGetItemsResponse]

  def transactWriteItems(request: TransactWriteItemsRequest): M[TransactWriteItemsResponse]

  def untagResource(request: UntagResourceRequest): M[UntagResourceResponse]

  def updateContinuousBackups(request: UpdateContinuousBackupsRequest): M[UpdateContinuousBackupsResponse]

  def updateGlobalTable(request: UpdateGlobalTableRequest): M[UpdateGlobalTableResponse]

}
