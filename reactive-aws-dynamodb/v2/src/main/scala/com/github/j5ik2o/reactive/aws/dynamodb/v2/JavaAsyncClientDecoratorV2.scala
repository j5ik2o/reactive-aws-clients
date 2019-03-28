package com.github.j5ik2o.reactive.aws.dynamodb.v2

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

import com.github.j5ik2o.reactive.aws.dynamodb.v2.metrics.JavaAsyncClientMetricsInterceptor
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.paginators.{
  BatchGetItemPublisher,
  ListTablesPublisher,
  QueryPublisher,
  ScanPublisher
}

object JavaAsyncClientDecoratorV2 {

  def ofMetricsCollector(underlying: DynamoDbAsyncClient, _reporter: MetricsReporter): JavaAsyncClientDecoratorV2 =
    new JavaAsyncClientDecoratorV2Impl(underlying) with JavaAsyncClientMetricsInterceptor {
      override protected val reporter: MetricsReporter = _reporter
    }

}

@SuppressWarnings(Array("org.wartremover.warts.Equals", "org.wartremover.warts.ToString"))
trait JavaAsyncClientDecoratorV2 extends DynamoDbAsyncClient {

  val underlying: DynamoDbAsyncClient

  override def serviceName(): String = underlying.serviceName()

  override def close(): Unit = underlying.close()

  override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): CompletableFuture[BatchGetItemResponse] = underlying.batchGetItem(batchGetItemRequest)

  override def batchGetItem(
      batchGetItemRequest: Consumer[BatchGetItemRequest.Builder]
  ): CompletableFuture[BatchGetItemResponse] = underlying.batchGetItem(batchGetItemRequest)

  override def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchGetItemPaginator(
      batchGetItemRequest: Consumer[BatchGetItemRequest.Builder]
  ): BatchGetItemPublisher = underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): CompletableFuture[BatchWriteItemResponse] =
    underlying.batchWriteItem(batchWriteItemRequest)

  override def batchWriteItem(
      batchWriteItemRequest: Consumer[BatchWriteItemRequest.Builder]
  ): CompletableFuture[BatchWriteItemResponse] = underlying.batchWriteItem(batchWriteItemRequest)

  override def createBackup(createBackupRequest: CreateBackupRequest): CompletableFuture[CreateBackupResponse] =
    underlying.createBackup(createBackupRequest)

  override def createBackup(
      createBackupRequest: Consumer[CreateBackupRequest.Builder]
  ): CompletableFuture[CreateBackupResponse] = underlying.createBackup(createBackupRequest)

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): CompletableFuture[CreateGlobalTableResponse] = underlying.createGlobalTable(createGlobalTableRequest)

  override def createGlobalTable(
      createGlobalTableRequest: Consumer[CreateGlobalTableRequest.Builder]
  ): CompletableFuture[CreateGlobalTableResponse] = underlying.createGlobalTable(createGlobalTableRequest)

  override def createTable(createTableRequest: CreateTableRequest): CompletableFuture[CreateTableResponse] =
    underlying.createTable(createTableRequest)

  override def createTable(
      createTableRequest: Consumer[CreateTableRequest.Builder]
  ): CompletableFuture[CreateTableResponse] = underlying.createTable(createTableRequest)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): CompletableFuture[DeleteBackupResponse] =
    underlying.deleteBackup(deleteBackupRequest)

  override def deleteBackup(
      deleteBackupRequest: Consumer[DeleteBackupRequest.Builder]
  ): CompletableFuture[DeleteBackupResponse] = underlying.deleteBackup(deleteBackupRequest)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): CompletableFuture[DeleteItemResponse] =
    underlying.deleteItem(deleteItemRequest)

  override def deleteItem(
      deleteItemRequest: Consumer[DeleteItemRequest.Builder]
  ): CompletableFuture[DeleteItemResponse] = underlying.deleteItem(deleteItemRequest)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): CompletableFuture[DeleteTableResponse] =
    underlying.deleteTable(deleteTableRequest)

  override def deleteTable(
      deleteTableRequest: Consumer[DeleteTableRequest.Builder]
  ): CompletableFuture[DeleteTableResponse] = underlying.deleteTable(deleteTableRequest)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): CompletableFuture[DescribeBackupResponse] =
    underlying.describeBackup(describeBackupRequest)

  override def describeBackup(
      describeBackupRequest: Consumer[DescribeBackupRequest.Builder]
  ): CompletableFuture[DescribeBackupResponse] = underlying.describeBackup(describeBackupRequest)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): CompletableFuture[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: Consumer[DescribeContinuousBackupsRequest.Builder]
  ): CompletableFuture[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest)

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): CompletableFuture[DescribeEndpointsResponse] = underlying.describeEndpoints(describeEndpointsRequest)

  override def describeEndpoints(
      describeEndpointsRequest: Consumer[DescribeEndpointsRequest.Builder]
  ): CompletableFuture[DescribeEndpointsResponse] = underlying.describeEndpoints(describeEndpointsRequest)

  override def describeEndpoints(): CompletableFuture[DescribeEndpointsResponse] = underlying.describeEndpoints()

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): CompletableFuture[DescribeGlobalTableResponse] = underlying.describeGlobalTable(describeGlobalTableRequest)

  override def describeGlobalTable(
      describeGlobalTableRequest: Consumer[DescribeGlobalTableRequest.Builder]
  ): CompletableFuture[DescribeGlobalTableResponse] = underlying.describeGlobalTable(describeGlobalTableRequest)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): CompletableFuture[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: Consumer[DescribeGlobalTableSettingsRequest.Builder]
  ): CompletableFuture[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): CompletableFuture[DescribeLimitsResponse] =
    underlying.describeLimits(describeLimitsRequest)

  override def describeLimits(
      describeLimitsRequest: Consumer[DescribeLimitsRequest.Builder]
  ): CompletableFuture[DescribeLimitsResponse] = underlying.describeLimits(describeLimitsRequest)

  override def describeLimits(): CompletableFuture[DescribeLimitsResponse] = underlying.describeLimits()

  override def describeTable(describeTableRequest: DescribeTableRequest): CompletableFuture[DescribeTableResponse] =
    underlying.describeTable(describeTableRequest)

  override def describeTable(
      describeTableRequest: Consumer[DescribeTableRequest.Builder]
  ): CompletableFuture[DescribeTableResponse] = underlying.describeTable(describeTableRequest)

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): CompletableFuture[DescribeTimeToLiveResponse] = underlying.describeTimeToLive(describeTimeToLiveRequest)

  override def describeTimeToLive(
      describeTimeToLiveRequest: Consumer[DescribeTimeToLiveRequest.Builder]
  ): CompletableFuture[DescribeTimeToLiveResponse] = underlying.describeTimeToLive(describeTimeToLiveRequest)

  override def getItem(getItemRequest: GetItemRequest): CompletableFuture[GetItemResponse] =
    underlying.getItem(getItemRequest)

  override def getItem(getItemRequest: Consumer[GetItemRequest.Builder]): CompletableFuture[GetItemResponse] =
    underlying.getItem(getItemRequest)

  override def listBackups(listBackupsRequest: ListBackupsRequest): CompletableFuture[ListBackupsResponse] =
    underlying.listBackups(listBackupsRequest)

  override def listBackups(
      listBackupsRequest: Consumer[ListBackupsRequest.Builder]
  ): CompletableFuture[ListBackupsResponse] = underlying.listBackups(listBackupsRequest)

  override def listBackups(): CompletableFuture[ListBackupsResponse] = underlying.listBackups()

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): CompletableFuture[ListGlobalTablesResponse] = underlying.listGlobalTables(listGlobalTablesRequest)

  override def listGlobalTables(
      listGlobalTablesRequest: Consumer[ListGlobalTablesRequest.Builder]
  ): CompletableFuture[ListGlobalTablesResponse] = underlying.listGlobalTables(listGlobalTablesRequest)

  override def listGlobalTables(): CompletableFuture[ListGlobalTablesResponse] = underlying.listGlobalTables()

  override def listTables(listTablesRequest: ListTablesRequest): CompletableFuture[ListTablesResponse] =
    underlying.listTables(listTablesRequest)

  override def listTables(
      listTablesRequest: Consumer[ListTablesRequest.Builder]
  ): CompletableFuture[ListTablesResponse] = underlying.listTables(listTablesRequest)

  override def listTables(): CompletableFuture[ListTablesResponse] = underlying.listTables()

  override def listTablesPaginator(): ListTablesPublisher = underlying.listTablesPaginator()

  override def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTablesPaginator(listTablesRequest: Consumer[ListTablesRequest.Builder]): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): CompletableFuture[ListTagsOfResourceResponse] = underlying.listTagsOfResource(listTagsOfResourceRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: Consumer[ListTagsOfResourceRequest.Builder]
  ): CompletableFuture[ListTagsOfResourceResponse] = underlying.listTagsOfResource(listTagsOfResourceRequest)

  override def putItem(putItemRequest: PutItemRequest): CompletableFuture[PutItemResponse] =
    underlying.putItem(putItemRequest)

  override def putItem(putItemRequest: Consumer[PutItemRequest.Builder]): CompletableFuture[PutItemResponse] =
    underlying.putItem(putItemRequest)

  override def query(queryRequest: QueryRequest): CompletableFuture[QueryResponse] = underlying.query(queryRequest)

  override def query(queryRequest: Consumer[QueryRequest.Builder]): CompletableFuture[QueryResponse] =
    underlying.query(queryRequest)

  override def queryPaginator(queryRequest: QueryRequest): QueryPublisher = underlying.queryPaginator(queryRequest)

  override def queryPaginator(queryRequest: Consumer[QueryRequest.Builder]): QueryPublisher =
    underlying.queryPaginator(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): CompletableFuture[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: Consumer[RestoreTableFromBackupRequest.Builder]
  ): CompletableFuture[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): CompletableFuture[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: Consumer[RestoreTableToPointInTimeRequest.Builder]
  ): CompletableFuture[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)

  override def scan(scanRequest: ScanRequest): CompletableFuture[ScanResponse] = underlying.scan(scanRequest)

  override def scan(scanRequest: Consumer[ScanRequest.Builder]): CompletableFuture[ScanResponse] =
    underlying.scan(scanRequest)

  override def scanPaginator(scanRequest: ScanRequest): ScanPublisher = underlying.scanPaginator(scanRequest)

  override def scanPaginator(scanRequest: Consumer[ScanRequest.Builder]): ScanPublisher =
    underlying.scanPaginator(scanRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): CompletableFuture[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest)

  override def tagResource(
      tagResourceRequest: Consumer[TagResourceRequest.Builder]
  ): CompletableFuture[TagResourceResponse] = underlying.tagResource(tagResourceRequest)

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): CompletableFuture[TransactGetItemsResponse] = underlying.transactGetItems(transactGetItemsRequest)

  override def transactGetItems(
      transactGetItemsRequest: Consumer[TransactGetItemsRequest.Builder]
  ): CompletableFuture[TransactGetItemsResponse] = underlying.transactGetItems(transactGetItemsRequest)

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): CompletableFuture[TransactWriteItemsResponse] = underlying.transactWriteItems(transactWriteItemsRequest)

  override def transactWriteItems(
      transactWriteItemsRequest: Consumer[TransactWriteItemsRequest.Builder]
  ): CompletableFuture[TransactWriteItemsResponse] = underlying.transactWriteItems(transactWriteItemsRequest)

  override def untagResource(untagResourceRequest: UntagResourceRequest): CompletableFuture[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest)

  override def untagResource(
      untagResourceRequest: Consumer[UntagResourceRequest.Builder]
  ): CompletableFuture[UntagResourceResponse] = underlying.untagResource(untagResourceRequest)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): CompletableFuture[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: Consumer[UpdateContinuousBackupsRequest.Builder]
  ): CompletableFuture[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest)

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): CompletableFuture[UpdateGlobalTableResponse] = underlying.updateGlobalTable(updateGlobalTableRequest)

  override def updateGlobalTable(
      updateGlobalTableRequest: Consumer[UpdateGlobalTableRequest.Builder]
  ): CompletableFuture[UpdateGlobalTableResponse] = underlying.updateGlobalTable(updateGlobalTableRequest)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): CompletableFuture[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: Consumer[UpdateGlobalTableSettingsRequest.Builder]
  ): CompletableFuture[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)

  override def updateItem(updateItemRequest: UpdateItemRequest): CompletableFuture[UpdateItemResponse] =
    underlying.updateItem(updateItemRequest)

  override def updateItem(
      updateItemRequest: Consumer[UpdateItemRequest.Builder]
  ): CompletableFuture[UpdateItemResponse] = underlying.updateItem(updateItemRequest)

  override def updateTable(updateTableRequest: UpdateTableRequest): CompletableFuture[UpdateTableResponse] =
    underlying.updateTable(updateTableRequest)

  override def updateTable(
      updateTableRequest: Consumer[UpdateTableRequest.Builder]
  ): CompletableFuture[UpdateTableResponse] = underlying.updateTable(updateTableRequest)

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): CompletableFuture[UpdateTimeToLiveResponse] = underlying.updateTimeToLive(updateTimeToLiveRequest)

  override def updateTimeToLive(
      updateTimeToLiveRequest: Consumer[UpdateTimeToLiveRequest.Builder]
  ): CompletableFuture[UpdateTimeToLiveResponse] = underlying.updateTimeToLive(updateTimeToLiveRequest)

  override def hashCode(): Int = underlying.hashCode()

  override def equals(obj: Any): Boolean = underlying == obj

  override def toString: String = underlying.toString

}

class JavaAsyncClientDecoratorV2Impl(val underlying: DynamoDbAsyncClient) extends JavaAsyncClientDecoratorV2
