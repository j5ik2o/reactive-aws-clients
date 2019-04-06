// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.utils.ToEitherSupport
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.{ DynamoDbClient => JavaDynamoDbClient }
import software.amazon.awssdk.services.dynamodb.paginators._

object DynamoDbSyncClient extends ToEitherSupport {

  def apply(underlying: JavaDynamoDbClient): DynamoDbSyncClient = new DynamoDbSyncClientImpl(underlying)

}

trait DynamoDbSyncClient extends DynamoDbClient[Either[Throwable, ?]] {
  val underlying: JavaDynamoDbClient
  import DynamoDbSyncClient._

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Either[Throwable, BatchGetItemResponse] =
    underlying.batchGetItem(batchGetItemRequest).toEither

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemIterable =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Either[Throwable, BatchWriteItemResponse] =
    underlying.batchWriteItem(batchWriteItemRequest).toEither

  override def createBackup(createBackupRequest: CreateBackupRequest): Either[Throwable, CreateBackupResponse] =
    underlying.createBackup(createBackupRequest).toEither

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Either[Throwable, CreateGlobalTableResponse] =
    underlying.createGlobalTable(createGlobalTableRequest).toEither

  override def createTable(createTableRequest: CreateTableRequest): Either[Throwable, CreateTableResponse] =
    underlying.createTable(createTableRequest).toEither

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Either[Throwable, DeleteBackupResponse] =
    underlying.deleteBackup(deleteBackupRequest).toEither

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Either[Throwable, DeleteItemResponse] =
    underlying.deleteItem(deleteItemRequest).toEither

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Either[Throwable, DeleteTableResponse] =
    underlying.deleteTable(deleteTableRequest).toEither

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Either[Throwable, DescribeBackupResponse] =
    underlying.describeBackup(describeBackupRequest).toEither

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Either[Throwable, DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest).toEither

  override def describeEndpoints(): Either[Throwable, DescribeEndpointsResponse] =
    underlying.describeEndpoints().toEither

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Either[Throwable, DescribeEndpointsResponse] =
    underlying.describeEndpoints(describeEndpointsRequest).toEither

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Either[Throwable, DescribeGlobalTableResponse] =
    underlying.describeGlobalTable(describeGlobalTableRequest).toEither

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Either[Throwable, DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest).toEither

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] =
    underlying.describeLimits().toEither

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Either[Throwable, DescribeLimitsResponse] =
    underlying.describeLimits(describeLimitsRequest).toEither

  override def describeTable(describeTableRequest: DescribeTableRequest): Either[Throwable, DescribeTableResponse] =
    underlying.describeTable(describeTableRequest).toEither

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Either[Throwable, DescribeTimeToLiveResponse] =
    underlying.describeTimeToLive(describeTimeToLiveRequest).toEither

  override def getItem(getItemRequest: GetItemRequest): Either[Throwable, GetItemResponse] =
    underlying.getItem(getItemRequest).toEither

  override def listBackups(): Either[Throwable, ListBackupsResponse] =
    underlying.listBackups().toEither

  override def listBackups(listBackupsRequest: ListBackupsRequest): Either[Throwable, ListBackupsResponse] =
    underlying.listBackups(listBackupsRequest).toEither

  override def listGlobalTables(): Either[Throwable, ListGlobalTablesResponse] =
    underlying.listGlobalTables().toEither

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Either[Throwable, ListGlobalTablesResponse] =
    underlying.listGlobalTables(listGlobalTablesRequest).toEither

  override def listTables(): Either[Throwable, ListTablesResponse] =
    underlying.listTables().toEither

  override def listTables(listTablesRequest: ListTablesRequest): Either[Throwable, ListTablesResponse] =
    underlying.listTables(listTablesRequest).toEither

  def listTablesPaginator(): ListTablesIterable =
    underlying.listTablesPaginator()

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesIterable =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Either[Throwable, ListTagsOfResourceResponse] =
    underlying.listTagsOfResource(listTagsOfResourceRequest).toEither

  override def putItem(putItemRequest: PutItemRequest): Either[Throwable, PutItemResponse] =
    underlying.putItem(putItemRequest).toEither

  override def query(queryRequest: QueryRequest): Either[Throwable, QueryResponse] =
    underlying.query(queryRequest).toEither

  def queryPaginator(queryRequest: QueryRequest): QueryIterable =
    underlying.queryPaginator(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Either[Throwable, RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest).toEither

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Either[Throwable, RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest).toEither

  override def scan(scanRequest: ScanRequest): Either[Throwable, ScanResponse] =
    underlying.scan(scanRequest).toEither

  def scanPaginator(scanRequest: ScanRequest): ScanIterable =
    underlying.scanPaginator(scanRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toEither

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Either[Throwable, TransactGetItemsResponse] =
    underlying.transactGetItems(transactGetItemsRequest).toEither

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Either[Throwable, TransactWriteItemsResponse] =
    underlying.transactWriteItems(transactWriteItemsRequest).toEither

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toEither

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Either[Throwable, UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest).toEither

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Either[Throwable, UpdateGlobalTableResponse] =
    underlying.updateGlobalTable(updateGlobalTableRequest).toEither

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Either[Throwable, UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest).toEither

  override def updateItem(updateItemRequest: UpdateItemRequest): Either[Throwable, UpdateItemResponse] =
    underlying.updateItem(updateItemRequest).toEither

  override def updateTable(updateTableRequest: UpdateTableRequest): Either[Throwable, UpdateTableResponse] =
    underlying.updateTable(updateTableRequest).toEither

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Either[Throwable, UpdateTimeToLiveResponse] =
    underlying.updateTimeToLive(updateTimeToLiveRequest).toEither

}
