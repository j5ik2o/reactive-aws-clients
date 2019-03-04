package com.github.j5ik2o.reactive.dynamodb
import java.util

import com.amazonaws.regions.Region
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.model._
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters
import com.amazonaws.{ AmazonWebServiceRequest, ResponseMetadata }

object JavaSyncClientDecoratorV1 {

  def ofMetricsCollector(underlying: AmazonDynamoDB, _reporter: MetricsReporter): JavaSyncClientDecoratorV1 =
    new JavaSyncClientDecoratorV1Impl(underlying) with JavaSyncClientMetricsInterceptorV1 {
      override protected val reporter: MetricsReporter = _reporter
    }

}

trait JavaSyncClientDecoratorV1 extends AmazonDynamoDB {

  val underlying: AmazonDynamoDB

  override def setEndpoint(endpoint: String): Unit = underlying.setEndpoint(endpoint)

  override def setRegion(region: Region): Unit = underlying.setRegion(region)

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): BatchGetItemResult =
    underlying.batchGetItem(batchGetItemRequest)

  override def batchGetItem(requestItems: util.Map[String, KeysAndAttributes],
                            returnConsumedCapacity: String): BatchGetItemResult =
    underlying.batchGetItem(requestItems, returnConsumedCapacity)

  override def batchGetItem(requestItems: util.Map[String, KeysAndAttributes]): BatchGetItemResult =
    underlying.batchGetItem(requestItems)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): BatchWriteItemResult =
    underlying.batchWriteItem(batchWriteItemRequest)

  override def batchWriteItem(requestItems: util.Map[String, util.List[WriteRequest]]): BatchWriteItemResult =
    underlying.batchWriteItem(requestItems)

  override def createBackup(createBackupRequest: CreateBackupRequest): CreateBackupResult =
    underlying.createBackup(createBackupRequest)

  override def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): CreateGlobalTableResult =
    underlying.createGlobalTable(createGlobalTableRequest)

  override def createTable(createTableRequest: CreateTableRequest): CreateTableResult =
    underlying.createTable(createTableRequest)

  override def createTable(attributeDefinitions: util.List[AttributeDefinition],
                           tableName: String,
                           keySchema: util.List[KeySchemaElement],
                           provisionedThroughput: ProvisionedThroughput): CreateTableResult =
    underlying.createTable(attributeDefinitions, tableName, keySchema, provisionedThroughput)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): DeleteBackupResult =
    underlying.deleteBackup(deleteBackupRequest)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): DeleteItemResult =
    underlying.deleteItem(deleteItemRequest)

  override def deleteItem(tableName: String, key: util.Map[String, AttributeValue]): DeleteItemResult =
    underlying.deleteItem(tableName, key)

  override def deleteItem(tableName: String,
                          key: util.Map[String, AttributeValue],
                          returnValues: String): DeleteItemResult = underlying.deleteItem(tableName, key, returnValues)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): DeleteTableResult =
    underlying.deleteTable(deleteTableRequest)

  override def deleteTable(tableName: String): DeleteTableResult = underlying.deleteTable(tableName)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): DescribeBackupResult =
    underlying.describeBackup(describeBackupRequest)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): DescribeContinuousBackupsResult = underlying.describeContinuousBackups(describeContinuousBackupsRequest)

  override def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): DescribeEndpointsResult =
    underlying.describeEndpoints(describeEndpointsRequest)

  override def describeGlobalTable(describeGlobalTableRequest: DescribeGlobalTableRequest): DescribeGlobalTableResult =
    underlying.describeGlobalTable(describeGlobalTableRequest)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): DescribeGlobalTableSettingsResult = underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): DescribeLimitsResult =
    underlying.describeLimits(describeLimitsRequest)

  override def describeTable(describeTableRequest: DescribeTableRequest): DescribeTableResult =
    underlying.describeTable(describeTableRequest)

  override def describeTable(tableName: String): DescribeTableResult = underlying.describeTable(tableName)

  override def describeTimeToLive(describeTimeToLiveRequest: DescribeTimeToLiveRequest): DescribeTimeToLiveResult =
    underlying.describeTimeToLive(describeTimeToLiveRequest)

  override def getItem(getItemRequest: GetItemRequest): GetItemResult =
    underlying.getItem(getItemRequest)

  override def getItem(tableName: String, key: util.Map[String, AttributeValue]): GetItemResult =
    underlying.getItem(tableName, key)

  override def getItem(tableName: String,
                       key: util.Map[String, AttributeValue],
                       consistentRead: java.lang.Boolean): GetItemResult =
    underlying.getItem(tableName, key, consistentRead)

  override def listBackups(listBackupsRequest: ListBackupsRequest): ListBackupsResult =
    underlying.listBackups(listBackupsRequest)

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): ListGlobalTablesResult =
    underlying.listGlobalTables(listGlobalTablesRequest)

  override def listTables(listTablesRequest: ListTablesRequest): ListTablesResult =
    underlying.listTables(listTablesRequest)

  override def listTables(): ListTablesResult = underlying.listTables()

  override def listTables(exclusiveStartTableName: String): ListTablesResult =
    underlying.listTables(exclusiveStartTableName)

  override def listTables(exclusiveStartTableName: String, limit: Integer): ListTablesResult =
    underlying.listTables(exclusiveStartTableName, limit)

  override def listTables(limit: Integer): ListTablesResult = underlying.listTables(limit)

  override def listTagsOfResource(listTagsOfResourceRequest: ListTagsOfResourceRequest): ListTagsOfResourceResult =
    underlying.listTagsOfResource(listTagsOfResourceRequest)

  override def putItem(putItemRequest: PutItemRequest): PutItemResult =
    underlying.putItem(putItemRequest)

  override def putItem(tableName: String, item: util.Map[String, AttributeValue]): PutItemResult =
    underlying.putItem(tableName, item)

  override def putItem(tableName: String, item: util.Map[String, AttributeValue], returnValues: String): PutItemResult =
    underlying.putItem(tableName, item, returnValues)

  override def query(queryRequest: QueryRequest): QueryResult = underlying.query(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): RestoreTableFromBackupResult = underlying.restoreTableFromBackup(restoreTableFromBackupRequest)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): RestoreTableToPointInTimeResult =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)

  override def scan(scanRequest: ScanRequest): ScanResult = underlying.scan(scanRequest)

  override def scan(tableName: String, attributesToGet: util.List[String]): ScanResult =
    underlying.scan(tableName, attributesToGet)

  override def scan(tableName: String, scanFilter: util.Map[String, Condition]): ScanResult =
    underlying.scan(tableName, scanFilter)

  override def scan(tableName: String,
                    attributesToGet: util.List[String],
                    scanFilter: util.Map[String, Condition]): ScanResult =
    underlying.scan(tableName, attributesToGet, scanFilter)

  override def tagResource(tagResourceRequest: TagResourceRequest): TagResourceResult =
    underlying.tagResource(tagResourceRequest)

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): TransactGetItemsResult =
    underlying.transactGetItems(transactGetItemsRequest)

  override def transactWriteItems(transactWriteItemsRequest: TransactWriteItemsRequest): TransactWriteItemsResult =
    underlying.transactWriteItems(transactWriteItemsRequest)

  override def untagResource(untagResourceRequest: UntagResourceRequest): UntagResourceResult =
    underlying.untagResource(untagResourceRequest)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): UpdateContinuousBackupsResult = underlying.updateContinuousBackups(updateContinuousBackupsRequest)

  override def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): UpdateGlobalTableResult =
    underlying.updateGlobalTable(updateGlobalTableRequest)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): UpdateGlobalTableSettingsResult = underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)

  override def updateItem(updateItemRequest: UpdateItemRequest): UpdateItemResult =
    underlying.updateItem(updateItemRequest)

  override def updateItem(tableName: String,
                          key: util.Map[String, AttributeValue],
                          attributeUpdates: util.Map[String, AttributeValueUpdate]): UpdateItemResult =
    underlying.updateItem(tableName, key, attributeUpdates)

  override def updateItem(tableName: String,
                          key: util.Map[String, AttributeValue],
                          attributeUpdates: util.Map[String, AttributeValueUpdate],
                          returnValues: String): UpdateItemResult =
    underlying.updateItem(tableName, key, attributeUpdates, returnValues)

  override def updateTable(updateTableRequest: UpdateTableRequest): UpdateTableResult =
    underlying.updateTable(updateTableRequest)

  override def updateTable(tableName: String, provisionedThroughput: ProvisionedThroughput): UpdateTableResult =
    underlying.updateTable(tableName, provisionedThroughput)

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): UpdateTimeToLiveResult =
    underlying.updateTimeToLive(updateTimeToLiveRequest)

  override def shutdown(): Unit = underlying.shutdown()

  override def getCachedResponseMetadata(request: AmazonWebServiceRequest): ResponseMetadata =
    underlying.getCachedResponseMetadata(request)

  override def waiters(): AmazonDynamoDBWaiters = underlying.waiters()
}

class JavaSyncClientDecoratorV1Impl(override val underlying: AmazonDynamoDB) extends JavaSyncClientDecoratorV1
