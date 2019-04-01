package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.function.Consumer

import com.github.j5ik2o.reactive.aws.dynamodb.metrics.JavaSyncClientMetricsInterceptor
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.model._

object JavaSyncClientDecorator {

  def ofMetricsCollector(underlying: DynamoDbClient, _reporter: MetricsReporter): JavaSyncClientDecorator =
    new JavaSyncClientDecoratorImpl(underlying) with JavaSyncClientMetricsInterceptor {
      override protected val reporter: MetricsReporter = _reporter
    }

  class JavaSyncClientDecoratorImpl(override val underlying: DynamoDbClient) extends JavaSyncClientDecorator

}

@SuppressWarnings(Array("org.wartremover.warts.Equals", "org.wartremover.warts.ToString"))
trait JavaSyncClientDecorator extends DynamoDbClient {
  val underlying: DynamoDbClient

  override def serviceName(): String = underlying.serviceName()

  override def close(): Unit = underlying.close()

  override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): BatchGetItemResponse = underlying.batchGetItem(batchGetItemRequest)

  override def batchGetItem(
      batchGetItemRequest: Consumer[BatchGetItemRequest.Builder]
  ): BatchGetItemResponse = underlying.batchGetItem(batchGetItemRequest)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): BatchWriteItemResponse =
    underlying.batchWriteItem(batchWriteItemRequest)

  override def batchWriteItem(
      batchWriteItemRequest: Consumer[BatchWriteItemRequest.Builder]
  ): BatchWriteItemResponse = underlying.batchWriteItem(batchWriteItemRequest)

  override def createBackup(createBackupRequest: CreateBackupRequest): CreateBackupResponse =
    underlying.createBackup(createBackupRequest)

  override def createBackup(
      createBackupRequest: Consumer[CreateBackupRequest.Builder]
  ): CreateBackupResponse = underlying.createBackup(createBackupRequest)

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): CreateGlobalTableResponse = underlying.createGlobalTable(createGlobalTableRequest)

  override def createGlobalTable(
      createGlobalTableRequest: Consumer[CreateGlobalTableRequest.Builder]
  ): CreateGlobalTableResponse = underlying.createGlobalTable(createGlobalTableRequest)

  override def createTable(createTableRequest: CreateTableRequest): CreateTableResponse =
    underlying.createTable(createTableRequest)

  override def createTable(
      createTableRequest: Consumer[CreateTableRequest.Builder]
  ): CreateTableResponse = underlying.createTable(createTableRequest)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): DeleteBackupResponse =
    underlying.deleteBackup(deleteBackupRequest)

  override def deleteBackup(
      deleteBackupRequest: Consumer[DeleteBackupRequest.Builder]
  ): DeleteBackupResponse = underlying.deleteBackup(deleteBackupRequest)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): DeleteItemResponse =
    underlying.deleteItem(deleteItemRequest)

  override def deleteItem(
      deleteItemRequest: Consumer[DeleteItemRequest.Builder]
  ): DeleteItemResponse = underlying.deleteItem(deleteItemRequest)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): DeleteTableResponse =
    underlying.deleteTable(deleteTableRequest)

  override def deleteTable(
      deleteTableRequest: Consumer[DeleteTableRequest.Builder]
  ): DeleteTableResponse = underlying.deleteTable(deleteTableRequest)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): DescribeBackupResponse =
    underlying.describeBackup(describeBackupRequest)

  override def describeBackup(
      describeBackupRequest: Consumer[DescribeBackupRequest.Builder]
  ): DescribeBackupResponse = underlying.describeBackup(describeBackupRequest)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): DescribeContinuousBackupsResponse =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: Consumer[DescribeContinuousBackupsRequest.Builder]
  ): DescribeContinuousBackupsResponse =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest)

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): DescribeEndpointsResponse = underlying.describeEndpoints(describeEndpointsRequest)

  override def describeEndpoints(
      describeEndpointsRequest: Consumer[DescribeEndpointsRequest.Builder]
  ): DescribeEndpointsResponse = underlying.describeEndpoints(describeEndpointsRequest)

  override def describeEndpoints(): DescribeEndpointsResponse = underlying.describeEndpoints()

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): DescribeGlobalTableResponse = underlying.describeGlobalTable(describeGlobalTableRequest)

  override def describeGlobalTable(
      describeGlobalTableRequest: Consumer[DescribeGlobalTableRequest.Builder]
  ): DescribeGlobalTableResponse = underlying.describeGlobalTable(describeGlobalTableRequest)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): DescribeGlobalTableSettingsResponse =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: Consumer[DescribeGlobalTableSettingsRequest.Builder]
  ): DescribeGlobalTableSettingsResponse =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): DescribeLimitsResponse =
    underlying.describeLimits(describeLimitsRequest)

  override def describeLimits(
      describeLimitsRequest: Consumer[DescribeLimitsRequest.Builder]
  ): DescribeLimitsResponse = underlying.describeLimits(describeLimitsRequest)

  override def describeLimits(): DescribeLimitsResponse = underlying.describeLimits()

  override def describeTable(describeTableRequest: DescribeTableRequest): DescribeTableResponse =
    underlying.describeTable(describeTableRequest)

  override def describeTable(
      describeTableRequest: Consumer[DescribeTableRequest.Builder]
  ): DescribeTableResponse = underlying.describeTable(describeTableRequest)

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): DescribeTimeToLiveResponse = underlying.describeTimeToLive(describeTimeToLiveRequest)

  override def describeTimeToLive(
      describeTimeToLiveRequest: Consumer[DescribeTimeToLiveRequest.Builder]
  ): DescribeTimeToLiveResponse = underlying.describeTimeToLive(describeTimeToLiveRequest)

  override def getItem(getItemRequest: GetItemRequest): GetItemResponse =
    underlying.getItem(getItemRequest)

  override def getItem(getItemRequest: Consumer[GetItemRequest.Builder]): GetItemResponse =
    underlying.getItem(getItemRequest)

  override def listBackups(listBackupsRequest: ListBackupsRequest): ListBackupsResponse =
    underlying.listBackups(listBackupsRequest)

  override def listBackups(
      listBackupsRequest: Consumer[ListBackupsRequest.Builder]
  ): ListBackupsResponse = underlying.listBackups(listBackupsRequest)

  override def listBackups(): ListBackupsResponse = underlying.listBackups()

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): ListGlobalTablesResponse = underlying.listGlobalTables(listGlobalTablesRequest)

  override def listGlobalTables(
      listGlobalTablesRequest: Consumer[ListGlobalTablesRequest.Builder]
  ): ListGlobalTablesResponse = underlying.listGlobalTables(listGlobalTablesRequest)

  override def listGlobalTables(): ListGlobalTablesResponse = underlying.listGlobalTables()

  override def listTables(listTablesRequest: ListTablesRequest): ListTablesResponse =
    underlying.listTables(listTablesRequest)

  override def listTables(
      listTablesRequest: Consumer[ListTablesRequest.Builder]
  ): ListTablesResponse = underlying.listTables(listTablesRequest)

  override def listTables(): ListTablesResponse = underlying.listTables()

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): ListTagsOfResourceResponse = underlying.listTagsOfResource(listTagsOfResourceRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: Consumer[ListTagsOfResourceRequest.Builder]
  ): ListTagsOfResourceResponse = underlying.listTagsOfResource(listTagsOfResourceRequest)

  override def putItem(putItemRequest: PutItemRequest): PutItemResponse =
    underlying.putItem(putItemRequest)

  override def putItem(putItemRequest: Consumer[PutItemRequest.Builder]): PutItemResponse =
    underlying.putItem(putItemRequest)

  override def query(queryRequest: QueryRequest): QueryResponse = underlying.query(queryRequest)

  override def query(queryRequest: Consumer[QueryRequest.Builder]): QueryResponse =
    underlying.query(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): RestoreTableFromBackupResponse =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: Consumer[RestoreTableFromBackupRequest.Builder]
  ): RestoreTableFromBackupResponse =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): RestoreTableToPointInTimeResponse =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: Consumer[RestoreTableToPointInTimeRequest.Builder]
  ): RestoreTableToPointInTimeResponse =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)

  override def scan(scanRequest: ScanRequest): ScanResponse = underlying.scan(scanRequest)

  override def scan(scanRequest: Consumer[ScanRequest.Builder]): ScanResponse =
    underlying.scan(scanRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): TagResourceResponse =
    underlying.tagResource(tagResourceRequest)

  override def tagResource(
      tagResourceRequest: Consumer[TagResourceRequest.Builder]
  ): TagResourceResponse = underlying.tagResource(tagResourceRequest)

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): TransactGetItemsResponse = underlying.transactGetItems(transactGetItemsRequest)

  override def transactGetItems(
      transactGetItemsRequest: Consumer[TransactGetItemsRequest.Builder]
  ): TransactGetItemsResponse = underlying.transactGetItems(transactGetItemsRequest)

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): TransactWriteItemsResponse = underlying.transactWriteItems(transactWriteItemsRequest)

  override def transactWriteItems(
      transactWriteItemsRequest: Consumer[TransactWriteItemsRequest.Builder]
  ): TransactWriteItemsResponse = underlying.transactWriteItems(transactWriteItemsRequest)

  override def untagResource(untagResourceRequest: UntagResourceRequest): UntagResourceResponse =
    underlying.untagResource(untagResourceRequest)

  override def untagResource(
      untagResourceRequest: Consumer[UntagResourceRequest.Builder]
  ): UntagResourceResponse = underlying.untagResource(untagResourceRequest)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): UpdateContinuousBackupsResponse =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: Consumer[UpdateContinuousBackupsRequest.Builder]
  ): UpdateContinuousBackupsResponse =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest)

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): UpdateGlobalTableResponse = underlying.updateGlobalTable(updateGlobalTableRequest)

  override def updateGlobalTable(
      updateGlobalTableRequest: Consumer[UpdateGlobalTableRequest.Builder]
  ): UpdateGlobalTableResponse = underlying.updateGlobalTable(updateGlobalTableRequest)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): UpdateGlobalTableSettingsResponse =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: Consumer[UpdateGlobalTableSettingsRequest.Builder]
  ): UpdateGlobalTableSettingsResponse =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)

  override def updateItem(updateItemRequest: UpdateItemRequest): UpdateItemResponse =
    underlying.updateItem(updateItemRequest)

  override def updateItem(
      updateItemRequest: Consumer[UpdateItemRequest.Builder]
  ): UpdateItemResponse = underlying.updateItem(updateItemRequest)

  override def updateTable(updateTableRequest: UpdateTableRequest): UpdateTableResponse =
    underlying.updateTable(updateTableRequest)

  override def updateTable(
      updateTableRequest: Consumer[UpdateTableRequest.Builder]
  ): UpdateTableResponse = underlying.updateTable(updateTableRequest)

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): UpdateTimeToLiveResponse = underlying.updateTimeToLive(updateTimeToLiveRequest)

  override def updateTimeToLive(
      updateTimeToLiveRequest: Consumer[UpdateTimeToLiveRequest.Builder]
  ): UpdateTimeToLiveResponse = underlying.updateTimeToLive(updateTimeToLiveRequest)

  override def hashCode(): Int = underlying.hashCode()

  override def equals(obj: Any): Boolean = underlying == obj

  override def toString: String = underlying.toString
}
