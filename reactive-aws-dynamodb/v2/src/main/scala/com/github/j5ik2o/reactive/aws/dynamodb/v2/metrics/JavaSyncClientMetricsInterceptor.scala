package com.github.j5ik2o.reactive.aws.dynamodb.v2.metrics

import com.github.j5ik2o.reactive.aws.metrics.JavaClientMetricsInterceptor
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model._

trait JavaSyncClientMetricsInterceptor extends DynamoDbClient with JavaClientMetricsInterceptor {

  abstract override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): BatchGetItemResponse = {
    collectSync("batchGetItem", batchGetItemRequest)(super.batchGetItem)
  }

  abstract override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): BatchWriteItemResponse =
    collectSync("batchWriteItem", batchWriteItemRequest)(super.batchWriteItem)

  abstract override def createBackup(
      createBackupRequest: CreateBackupRequest
  ): CreateBackupResponse =
    collectSync("createBackup", createBackupRequest)(super.createBackup)

  abstract override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): CreateGlobalTableResponse =
    collectSync("createGlobalTable", createGlobalTableRequest)(super.createGlobalTable)

  abstract override def createTable(createTableRequest: CreateTableRequest): CreateTableResponse =
    collectSync("createTable", createTableRequest)(super.createTable)

  abstract override def deleteBackup(
      deleteBackupRequest: DeleteBackupRequest
  ): DeleteBackupResponse =
    collectSync("createTable", deleteBackupRequest)(super.deleteBackup)

  abstract override def deleteItem(deleteItemRequest: DeleteItemRequest): DeleteItemResponse =
    collectSync("deleteItem", deleteItemRequest)(super.deleteItem)

  abstract override def deleteTable(deleteTableRequest: DeleteTableRequest): DeleteTableResponse =
    collectSync("deleteTable", deleteTableRequest)(super.deleteTable)

  abstract override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): DescribeBackupResponse =
    collectSync("describeBackup", describeBackupRequest)(super.describeBackup)

  abstract override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): DescribeContinuousBackupsResponse =
    collectSync("describeContinuousBackups", describeContinuousBackupsRequest)(super.describeContinuousBackups)

  abstract override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): DescribeEndpointsResponse =
    collectSync("describeEndpoints", describeEndpointsRequest)(super.describeEndpoints)

  abstract override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): DescribeGlobalTableResponse =
    collectSync("describeGlobalTable", describeGlobalTableRequest)(super.describeGlobalTable)

  abstract override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): DescribeGlobalTableSettingsResponse =
    collectSync("describeGlobalTableSettings", describeGlobalTableSettingsRequest)(super.describeGlobalTableSettings)

  abstract override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): DescribeLimitsResponse =
    collectSync("describeLimits", describeLimitsRequest)(super.describeLimits)

  abstract override def describeTable(
      describeTableRequest: DescribeTableRequest
  ): DescribeTableResponse =
    collectSync("describeTable", describeTableRequest)(super.describeTable)

  abstract override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): DescribeTimeToLiveResponse =
    collectSync("describeTimeToLive", describeTimeToLiveRequest)(super.describeTimeToLive)

  abstract override def getItem(getItemRequest: GetItemRequest): GetItemResponse =
    collectSync("getItem", getItemRequest)(super.getItem)

  abstract override def listBackups(listBackupsRequest: ListBackupsRequest): ListBackupsResponse =
    collectSync("listBackups", listBackupsRequest)(super.listBackups)

  abstract override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): ListGlobalTablesResponse =
    collectSync("listGlobalTables", listGlobalTablesRequest)(super.listGlobalTables)

  abstract override def listTables(listTablesRequest: ListTablesRequest): ListTablesResponse =
    collectSync("listTables", listTablesRequest)(super.listTables)

  abstract override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): ListTagsOfResourceResponse =
    collectSync("listTagsOfResource", listTagsOfResourceRequest)(super.listTagsOfResource)

  abstract override def putItem(putItemRequest: PutItemRequest): PutItemResponse =
    collectSync("putItem", putItemRequest)(super.putItem)

  abstract override def query(queryRequest: QueryRequest): QueryResponse =
    collectSync("query", queryRequest)(super.query)

  abstract override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): RestoreTableFromBackupResponse =
    collectSync("restoreTableFromBackup", restoreTableFromBackupRequest)(super.restoreTableFromBackup)

  abstract override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): RestoreTableToPointInTimeResponse =
    collectSync("restoreTableToPointInTime", restoreTableToPointInTimeRequest)(super.restoreTableToPointInTime)

  abstract override def scan(scanRequest: ScanRequest): ScanResponse =
    collectSync("scan", scanRequest)(super.scan)

  abstract override def tagResource(tagResourceRequest: TagResourceRequest): TagResourceResponse =
    collectSync("tagResource", tagResourceRequest)(super.tagResource)

  abstract override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): TransactGetItemsResponse =
    collectSync("transactGetItems", transactGetItemsRequest)(super.transactGetItems)

  abstract override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): TransactWriteItemsResponse =
    collectSync("transactWriteItems", transactWriteItemsRequest)(super.transactWriteItems)

  abstract override def untagResource(
      untagResourceRequest: UntagResourceRequest
  ): UntagResourceResponse =
    collectSync("untagResource", untagResourceRequest)(super.untagResource)

  abstract override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): UpdateContinuousBackupsResponse =
    collectSync("updateContinuousBackups", updateContinuousBackupsRequest)(super.updateContinuousBackups)

  abstract override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): UpdateGlobalTableResponse =
    collectSync("updateGlobalTable", updateGlobalTableRequest)(super.updateGlobalTable)

  abstract override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): UpdateGlobalTableSettingsResponse =
    collectSync("updateGlobalTableSettings", updateGlobalTableSettingsRequest)(super.updateGlobalTableSettings)

  abstract override def updateItem(updateItemRequest: UpdateItemRequest): UpdateItemResponse =
    collectSync("updateItem", updateItemRequest)(super.updateItem)

  abstract override def updateTable(updateTableRequest: UpdateTableRequest): UpdateTableResponse =
    collectSync("updateTable", updateTableRequest)(super.updateTable)

  abstract override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): UpdateTimeToLiveResponse =
    collectSync("updateTimeToLive", updateTimeToLiveRequest)(super.updateTimeToLive)
}
