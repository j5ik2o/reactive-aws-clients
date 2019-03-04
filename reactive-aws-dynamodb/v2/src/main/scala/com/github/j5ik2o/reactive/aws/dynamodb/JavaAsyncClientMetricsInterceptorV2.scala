package com.github.j5ik2o.reactive.aws.dynamodb
import java.util.concurrent.CompletableFuture
import java.util.function.BiConsumer

import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

trait JavaAsyncClientMetricsInterceptorV2 extends DynamoDbAsyncClient with JavaClientMetricsInterceptor {

  abstract override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): CompletableFuture[BatchGetItemResponse] = {
    collectCompletableFuture("batchGetItem", batchGetItemRequest)(super.batchGetItem)
  }

  abstract override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): CompletableFuture[BatchWriteItemResponse] =
    collectCompletableFuture("batchWriteItem", batchWriteItemRequest)(super.batchWriteItem)

  abstract override def createBackup(
      createBackupRequest: CreateBackupRequest
  ): CompletableFuture[CreateBackupResponse] =
    collectCompletableFuture("createBackup", createBackupRequest)(super.createBackup)

  abstract override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): CompletableFuture[CreateGlobalTableResponse] =
    collectCompletableFuture("createGlobalTable", createGlobalTableRequest)(super.createGlobalTable)

  abstract override def createTable(createTableRequest: CreateTableRequest): CompletableFuture[CreateTableResponse] =
    collectCompletableFuture("createTable", createTableRequest)(super.createTable)

  abstract override def deleteBackup(
      deleteBackupRequest: DeleteBackupRequest
  ): CompletableFuture[DeleteBackupResponse] =
    collectCompletableFuture("createTable", deleteBackupRequest)(super.deleteBackup)

  abstract override def deleteItem(deleteItemRequest: DeleteItemRequest): CompletableFuture[DeleteItemResponse] =
    collectCompletableFuture("deleteItem", deleteItemRequest)(super.deleteItem)

  abstract override def deleteTable(deleteTableRequest: DeleteTableRequest): CompletableFuture[DeleteTableResponse] =
    collectCompletableFuture("deleteTable", deleteTableRequest)(super.deleteTable)

  abstract override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): CompletableFuture[DescribeBackupResponse] =
    collectCompletableFuture("describeBackup", describeBackupRequest)(super.describeBackup)

  abstract override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): CompletableFuture[DescribeContinuousBackupsResponse] =
    collectCompletableFuture("describeContinuousBackups", describeContinuousBackupsRequest)(
      super.describeContinuousBackups
    )

  abstract override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): CompletableFuture[DescribeEndpointsResponse] =
    collectCompletableFuture("describeEndpoints", describeEndpointsRequest)(super.describeEndpoints)

  abstract override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): CompletableFuture[DescribeGlobalTableResponse] =
    collectCompletableFuture("describeGlobalTable", describeGlobalTableRequest)(super.describeGlobalTable)

  abstract override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): CompletableFuture[DescribeGlobalTableSettingsResponse] =
    collectCompletableFuture("describeGlobalTableSettings", describeGlobalTableSettingsRequest)(
      super.describeGlobalTableSettings
    )

  abstract override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): CompletableFuture[DescribeLimitsResponse] =
    collectCompletableFuture("describeLimits", describeLimitsRequest)(super.describeLimits)

  abstract override def describeTable(
      describeTableRequest: DescribeTableRequest
  ): CompletableFuture[DescribeTableResponse] =
    collectCompletableFuture("describeTable", describeTableRequest)(super.describeTable)

  abstract override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): CompletableFuture[DescribeTimeToLiveResponse] =
    collectCompletableFuture("describeTimeToLive", describeTimeToLiveRequest)(super.describeTimeToLive)

  abstract override def getItem(getItemRequest: GetItemRequest): CompletableFuture[GetItemResponse] =
    collectCompletableFuture("getItem", getItemRequest)(super.getItem)

  abstract override def listBackups(listBackupsRequest: ListBackupsRequest): CompletableFuture[ListBackupsResponse] =
    collectCompletableFuture("listBackups", listBackupsRequest)(super.listBackups)

  abstract override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): CompletableFuture[ListGlobalTablesResponse] =
    collectCompletableFuture("listGlobalTables", listGlobalTablesRequest)(super.listGlobalTables)

  abstract override def listTables(listTablesRequest: ListTablesRequest): CompletableFuture[ListTablesResponse] =
    collectCompletableFuture("listTables", listTablesRequest)(super.listTables)

  abstract override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): CompletableFuture[ListTagsOfResourceResponse] =
    collectCompletableFuture("listTagsOfResource", listTagsOfResourceRequest)(super.listTagsOfResource)

  abstract override def putItem(putItemRequest: PutItemRequest): CompletableFuture[PutItemResponse] =
    collectCompletableFuture("putItem", putItemRequest)(super.putItem)

  abstract override def query(queryRequest: QueryRequest): CompletableFuture[QueryResponse] =
    collectCompletableFuture("query", queryRequest)(super.query)

  abstract override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): CompletableFuture[RestoreTableFromBackupResponse] =
    collectCompletableFuture("restoreTableFromBackup", restoreTableFromBackupRequest)(super.restoreTableFromBackup)

  abstract override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): CompletableFuture[RestoreTableToPointInTimeResponse] =
    collectCompletableFuture("restoreTableToPointInTime", restoreTableToPointInTimeRequest)(
      super.restoreTableToPointInTime
    )

  abstract override def scan(scanRequest: ScanRequest): CompletableFuture[ScanResponse] =
    collectCompletableFuture("scan", scanRequest)(super.scan)

  abstract override def tagResource(tagResourceRequest: TagResourceRequest): CompletableFuture[TagResourceResponse] =
    collectCompletableFuture("tagResource", tagResourceRequest)(super.tagResource)

  abstract override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): CompletableFuture[TransactGetItemsResponse] =
    collectCompletableFuture("transactGetItems", transactGetItemsRequest)(super.transactGetItems)

  abstract override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): CompletableFuture[TransactWriteItemsResponse] =
    collectCompletableFuture("transactWriteItems", transactWriteItemsRequest)(super.transactWriteItems)

  abstract override def untagResource(
      untagResourceRequest: UntagResourceRequest
  ): CompletableFuture[UntagResourceResponse] =
    collectCompletableFuture("untagResource", untagResourceRequest)(super.untagResource)

  abstract override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): CompletableFuture[UpdateContinuousBackupsResponse] =
    collectCompletableFuture("updateContinuousBackups", updateContinuousBackupsRequest)(super.updateContinuousBackups)

  abstract override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): CompletableFuture[UpdateGlobalTableResponse] =
    collectCompletableFuture("updateGlobalTable", updateGlobalTableRequest)(super.updateGlobalTable)

  abstract override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): CompletableFuture[UpdateGlobalTableSettingsResponse] =
    collectCompletableFuture("updateGlobalTableSettings", updateGlobalTableSettingsRequest)(
      super.updateGlobalTableSettings
    )

  protected def collectCompletableFuture[A, B](name: String,
                                               request: A)(f: A => CompletableFuture[B]): CompletableFuture[B] = {
    val start = currentTime
    f(request).whenComplete(new BiConsumer[B, Throwable] {
      override def accept(t: B, u: Throwable): Unit = {
        reporter.record(name, currentTime - start)
        reporter.increment(name)
      }
    })
  }

  abstract override def updateItem(updateItemRequest: UpdateItemRequest): CompletableFuture[UpdateItemResponse] =
    collectCompletableFuture("updateItem", updateItemRequest)(super.updateItem)

  abstract override def updateTable(updateTableRequest: UpdateTableRequest): CompletableFuture[UpdateTableResponse] =
    collectCompletableFuture("updateTable", updateTableRequest)(super.updateTable)

  abstract override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): CompletableFuture[UpdateTimeToLiveResponse] =
    collectCompletableFuture("updateTimeToLive", updateTimeToLiveRequest)(super.updateTimeToLive)

}
