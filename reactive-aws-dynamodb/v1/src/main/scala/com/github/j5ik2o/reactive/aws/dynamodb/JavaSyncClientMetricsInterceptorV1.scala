package com.github.j5ik2o.reactive.aws.dynamodb
import java.{ lang, util }

import com.amazonaws.regions.Region
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.model._
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters
import com.amazonaws.{ AmazonWebServiceRequest, ResponseMetadata }

trait JavaSyncClientMetricsInterceptorV1 extends AmazonDynamoDB with JavaClientMetricsInterceptor {

  abstract override def setEndpoint(endpoint: String): Unit = collectSync("setEndpoint", endpoint)(super.setEndpoint)

  abstract override def setRegion(region: Region): Unit = collectSync("setRegion", region)(super.setRegion)

  abstract override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): BatchGetItemResult =
    collectSync("batchGetItem", batchGetItemRequest)(super.batchGetItem)

  abstract override def batchGetItem(requestItems: util.Map[String, KeysAndAttributes],
                                     returnConsumedCapacity: String): BatchGetItemResult =
    collectSync("batchGetItem", (requestItems, returnConsumedCapacity)) { case (p1, p2) => super.batchGetItem(p1, p2) }

  abstract override def batchGetItem(requestItems: util.Map[String, KeysAndAttributes]): BatchGetItemResult =
    collectSync("batchGetItem", requestItems)(super.batchGetItem)

  abstract override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): BatchWriteItemResult =
    collectSync("batchWriteItem", batchWriteItemRequest)(super.batchWriteItem)

  abstract override def batchWriteItem(requestItems: util.Map[String, util.List[WriteRequest]]): BatchWriteItemResult =
    collectSync("batchWriteItem", requestItems)(super.batchWriteItem)

  abstract override def createBackup(createBackupRequest: CreateBackupRequest): CreateBackupResult =
    collectSync("createBackup", createBackupRequest)(super.createBackup)

  abstract override def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): CreateGlobalTableResult =
    collectSync("createGlobalTable", createGlobalTableRequest)(super.createGlobalTable)

  abstract override def createTable(createTableRequest: CreateTableRequest): CreateTableResult =
    collectSync("createTable", createTableRequest)(super.createTable)
  abstract override def createTable(attributeDefinitions: util.List[AttributeDefinition],
                                    tableName: String,
                                    keySchema: util.List[KeySchemaElement],
                                    provisionedThroughput: ProvisionedThroughput): CreateTableResult =
    collectSync("createTable", (attributeDefinitions, tableName, keySchema, provisionedThroughput)) {
      case (p1, p2, p3, p4) => super.createTable(p1, p2, p3, p4)
    }

  abstract override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): DeleteBackupResult =
    collectSync("deleteBackup", deleteBackupRequest)(super.deleteBackup)

  abstract override def deleteItem(deleteItemRequest: DeleteItemRequest): DeleteItemResult =
    collectSync("deleteItem", deleteItemRequest)(super.deleteItem)

  abstract override def deleteItem(tableName: String, key: util.Map[String, AttributeValue]): DeleteItemResult =
    collectSync("deleteItem", (tableName, key)) { case (p1, p2) => super.deleteItem(p1, p2) }

  abstract override def deleteItem(tableName: String,
                                   key: util.Map[String, AttributeValue],
                                   returnValues: String): DeleteItemResult =
    collectSync("deleteItem", (tableName, key, returnValues)) { case (p1, p2, p3) => super.deleteItem(p1, p2, p3) }

  abstract override def deleteTable(deleteTableRequest: DeleteTableRequest): DeleteTableResult =
    collectSync("deleteTable", deleteTableRequest)(super.deleteTable)

  abstract override def deleteTable(tableName: String): DeleteTableResult =
    collectSync("deleteTable", tableName)(super.deleteTable)

  abstract override def describeBackup(describeBackupRequest: DescribeBackupRequest): DescribeBackupResult =
    collectSync("describeBackup", describeBackupRequest)(super.describeBackup)

  abstract override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): DescribeContinuousBackupsResult =
    collectSync("describeContinuousBackups", describeContinuousBackupsRequest)(super.describeContinuousBackups)

  abstract override def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): DescribeEndpointsResult =
    collectSync("describeEndpoints", describeEndpointsRequest)(super.describeEndpoints)

  abstract override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): DescribeGlobalTableResult =
    collectSync("describeGlobalTable", describeGlobalTableRequest)(super.describeGlobalTable)

  abstract override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): DescribeGlobalTableSettingsResult =
    collectSync("describeGlobalTableSettings", describeGlobalTableSettingsRequest)(super.describeGlobalTableSettings)

  abstract override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): DescribeLimitsResult =
    collectSync("describeLimits", describeLimitsRequest)(super.describeLimits)

  abstract override def describeTable(describeTableRequest: DescribeTableRequest): DescribeTableResult =
    collectSync("describeTable", describeTableRequest)(super.describeTable)

  abstract override def describeTable(tableName: String): DescribeTableResult =
    collectSync("describeTable", tableName)(super.describeTable)

  abstract override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): DescribeTimeToLiveResult =
    collectSync("describeTimeToLive", describeTimeToLiveRequest)(super.describeTimeToLive)

  abstract override def getItem(getItemRequest: GetItemRequest): GetItemResult =
    collectSync("getItem", getItemRequest)(super.getItem)

  abstract override def getItem(tableName: String, key: util.Map[String, AttributeValue]): GetItemResult =
    collectSync("getItem", (tableName, key)) { case (p1, p2) => super.getItem(p1, p2) }

  abstract override def getItem(tableName: String,
                                key: util.Map[String, AttributeValue],
                                consistentRead: lang.Boolean): GetItemResult =
    collectSync("getItem", (tableName, key, consistentRead)) { case (p1, p2, p3) => super.getItem(p1, p2, p3) }

  abstract override def listBackups(listBackupsRequest: ListBackupsRequest): ListBackupsResult =
    collectSync("listBackups", listBackupsRequest)(super.listBackups)

  abstract override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): ListGlobalTablesResult =
    collectSync("listGlobalTables", listGlobalTablesRequest)(super.listGlobalTables)

  abstract override def listTables(listTablesRequest: ListTablesRequest): ListTablesResult =
    collectSync("listTables", listTablesRequest)(super.listTables)

  abstract override def listTables(): ListTablesResult = collectSync("listTables", ())(_ => super.listTables)

  abstract override def listTables(exclusiveStartTableName: String): ListTablesResult =
    collectSync("listTables", exclusiveStartTableName)(super.listTables)

  abstract override def listTables(exclusiveStartTableName: String, limit: Integer): ListTablesResult =
    collectSync("listTables", (exclusiveStartTableName, limit)) { case (p1, p2) => super.listTables(p1, p2) }

  abstract override def listTables(limit: Integer): ListTablesResult =
    collectSync("listTables", limit)(super.listTables)

  abstract override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): ListTagsOfResourceResult =
    collectSync("listTagsOfResource", listTagsOfResourceRequest)(super.listTagsOfResource)

  abstract override def putItem(putItemRequest: PutItemRequest): PutItemResult =
    collectSync("putItem", putItemRequest)(super.putItem)

  abstract override def putItem(tableName: String, item: util.Map[String, AttributeValue]): PutItemResult =
    collectSync("putItem", (tableName, item)) { case (p1, p2) => super.putItem(p1, p2) }

  abstract override def putItem(tableName: String,
                                item: util.Map[String, AttributeValue],
                                returnValues: String): PutItemResult =
    collectSync("putItem", (tableName, item)) { case (p1, p2) => super.putItem(p1, p2) }

  abstract override def query(queryRequest: QueryRequest): QueryResult =
    collectSync("query", queryRequest)(super.query)

  abstract override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): RestoreTableFromBackupResult =
    collectSync("restoreTableFromBackup", restoreTableFromBackupRequest)(super.restoreTableFromBackup)

  abstract override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): RestoreTableToPointInTimeResult =
    collectSync("restoreTableToPointInTime", restoreTableToPointInTimeRequest)(super.restoreTableToPointInTime)

  abstract override def scan(scanRequest: ScanRequest): ScanResult =
    collectSync("scan", scanRequest)(super.scan)

  abstract override def scan(tableName: String, attributesToGet: util.List[String]): ScanResult =
    collectSync("scan", (tableName, attributesToGet)) { case (p1, p2) => super.scan(p1, p2) }

  abstract override def scan(tableName: String, scanFilter: util.Map[String, Condition]): ScanResult =
    collectSync("scan", (tableName, scanFilter)) { case (p1, p2) => super.scan(p1, p2) }

  abstract override def scan(tableName: String,
                             attributesToGet: util.List[String],
                             scanFilter: util.Map[String, Condition]): ScanResult =
    collectSync("scan", (tableName, attributesToGet, scanFilter)) { case (p1, p2, p3) => super.scan(p1, p2, p3) }

  abstract override def tagResource(tagResourceRequest: TagResourceRequest): TagResourceResult =
    collectSync("tagResource", tagResourceRequest)(super.tagResource)

  abstract override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): TransactGetItemsResult =
    collectSync("transactGetItems", transactGetItemsRequest)(super.transactGetItems)

  abstract override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): TransactWriteItemsResult =
    collectSync("transactWriteItems", transactWriteItemsRequest)(super.transactWriteItems)

  abstract override def untagResource(untagResourceRequest: UntagResourceRequest): UntagResourceResult =
    collectSync("untagResource", untagResourceRequest)(super.untagResource)

  abstract override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): UpdateContinuousBackupsResult =
    collectSync("updateContinuousBackups", updateContinuousBackupsRequest)(super.updateContinuousBackups)

  abstract override def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): UpdateGlobalTableResult =
    collectSync("updateGlobalTable", updateGlobalTableRequest)(super.updateGlobalTable)

  abstract override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): UpdateGlobalTableSettingsResult =
    collectSync("updateGlobalTableSettings", updateGlobalTableSettingsRequest)(super.updateGlobalTableSettings)

  abstract override def updateItem(updateItemRequest: UpdateItemRequest): UpdateItemResult =
    collectSync("updateItem", updateItemRequest)(super.updateItem)

  abstract override def updateItem(tableName: String,
                                   key: util.Map[String, AttributeValue],
                                   attributeUpdates: util.Map[String, AttributeValueUpdate]): UpdateItemResult =
    collectSync("updateItem", (tableName, key, attributeUpdates)) { case (p1, p2, p3) => super.updateItem(p1, p2, p3) }

  abstract override def updateItem(tableName: String,
                                   key: util.Map[String, AttributeValue],
                                   attributeUpdates: util.Map[String, AttributeValueUpdate],
                                   returnValues: String): UpdateItemResult =
    collectSync("updateItem", (tableName, key, attributeUpdates)) { case (p1, p2, p3) => super.updateItem(p1, p2, p3) }

  abstract override def updateTable(updateTableRequest: UpdateTableRequest): UpdateTableResult =
    collectSync("batchGeupdateTabletItem", updateTableRequest)(super.updateTable)

  abstract override def updateTable(tableName: String,
                                    provisionedThroughput: ProvisionedThroughput): UpdateTableResult =
    collectSync("updateTable", (tableName, provisionedThroughput)) { case (p1, p2) => super.updateTable(p1, p2) }

  abstract override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): UpdateTimeToLiveResult =
    collectSync("updateTimeToLive", updateTimeToLiveRequest)(super.updateTimeToLive)

  abstract override def shutdown(): Unit = collectSync("shutdown", ())(_ => super.shutdown())

  abstract override def getCachedResponseMetadata(request: AmazonWebServiceRequest): ResponseMetadata =
    collectSync("getCachedResponseMetadata", request)(super.getCachedResponseMetadata)

  abstract override def waiters(): AmazonDynamoDBWaiters = collectSync("waiters", ())(_ => super.waiters)

}
