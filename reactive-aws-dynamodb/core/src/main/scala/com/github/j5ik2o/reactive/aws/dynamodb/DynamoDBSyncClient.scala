// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient
import software.amazon.awssdk.services.dynamodb.paginators._

object DynamoDBSyncClient {

  def apply(underlying: DynamoDbClient): DynamoDBSyncClient = new DynamoDBSyncClientImpl(underlying)

}

trait DynamoDBSyncClient extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: DynamoDbClient

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Either[Throwable, BatchGetItemResponse] = {
    toEither(underlying.batchGetItem(batchGetItemRequest))
  }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemIterable = {
    underlying.batchGetItemPaginator(batchGetItemRequest)
  }

  override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): Either[Throwable, BatchWriteItemResponse] = {
    toEither(underlying.batchWriteItem(batchWriteItemRequest))
  }

  override def createBackup(createBackupRequest: CreateBackupRequest): Either[Throwable, CreateBackupResponse] = {
    toEither(underlying.createBackup(createBackupRequest))
  }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Either[Throwable, CreateGlobalTableResponse] = {
    toEither(underlying.createGlobalTable(createGlobalTableRequest))
  }

  override def createTable(createTableRequest: CreateTableRequest): Either[Throwable, CreateTableResponse] = {
    toEither(underlying.createTable(createTableRequest))
  }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Either[Throwable, DeleteBackupResponse] = {
    toEither(underlying.deleteBackup(deleteBackupRequest))
  }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Either[Throwable, DeleteItemResponse] = {
    toEither(underlying.deleteItem(deleteItemRequest))
  }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Either[Throwable, DeleteTableResponse] = {
    toEither(underlying.deleteTable(deleteTableRequest))
  }

  override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): Either[Throwable, DescribeBackupResponse] = {
    toEither(underlying.describeBackup(describeBackupRequest))
  }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Either[Throwable, DescribeContinuousBackupsResponse] = {
    toEither(underlying.describeContinuousBackups(describeContinuousBackupsRequest))
  }

  override def describeEndpoints(): Either[Throwable, DescribeEndpointsResponse] = {
    toEither(underlying.describeEndpoints())
  }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Either[Throwable, DescribeEndpointsResponse] = {
    toEither(underlying.describeEndpoints(describeEndpointsRequest))
  }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Either[Throwable, DescribeGlobalTableResponse] = {
    toEither(underlying.describeGlobalTable(describeGlobalTableRequest))
  }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Either[Throwable, DescribeGlobalTableSettingsResponse] = {
    toEither(underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest))
  }

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] = {
    toEither(underlying.describeLimits())
  }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Either[Throwable, DescribeLimitsResponse] = {
    toEither(underlying.describeLimits(describeLimitsRequest))
  }

  override def describeTable(describeTableRequest: DescribeTableRequest): Either[Throwable, DescribeTableResponse] = {
    toEither(underlying.describeTable(describeTableRequest))
  }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Either[Throwable, DescribeTimeToLiveResponse] = {
    toEither(underlying.describeTimeToLive(describeTimeToLiveRequest))
  }

  override def getItem(getItemRequest: GetItemRequest): Either[Throwable, GetItemResponse] = {
    toEither(underlying.getItem(getItemRequest))
  }

  override def listBackups(): Either[Throwable, ListBackupsResponse] = {
    toEither(underlying.listBackups())
  }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Either[Throwable, ListBackupsResponse] = {
    toEither(underlying.listBackups(listBackupsRequest))
  }

  override def listGlobalTables(): Either[Throwable, ListGlobalTablesResponse] = {
    toEither(underlying.listGlobalTables())
  }

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Either[Throwable, ListGlobalTablesResponse] = {
    toEither(underlying.listGlobalTables(listGlobalTablesRequest))
  }

  override def listTables(): Either[Throwable, ListTablesResponse] = {
    toEither(underlying.listTables())
  }

  override def listTables(listTablesRequest: ListTablesRequest): Either[Throwable, ListTablesResponse] = {
    toEither(underlying.listTables(listTablesRequest))
  }

  def listTablesPaginator(): ListTablesIterable = {
    underlying.listTablesPaginator()
  }

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesIterable = {
    underlying.listTablesPaginator(listTablesRequest)
  }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Either[Throwable, ListTagsOfResourceResponse] = {
    toEither(underlying.listTagsOfResource(listTagsOfResourceRequest))
  }

  override def putItem(putItemRequest: PutItemRequest): Either[Throwable, PutItemResponse] = {
    toEither(underlying.putItem(putItemRequest))
  }

  override def query(queryRequest: QueryRequest): Either[Throwable, QueryResponse] = {
    toEither(underlying.query(queryRequest))
  }

  def queryPaginator(queryRequest: QueryRequest): QueryIterable = {
    underlying.queryPaginator(queryRequest)
  }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Either[Throwable, RestoreTableFromBackupResponse] = {
    toEither(underlying.restoreTableFromBackup(restoreTableFromBackupRequest))
  }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Either[Throwable, RestoreTableToPointInTimeResponse] = {
    toEither(underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest))
  }

  override def scan(scanRequest: ScanRequest): Either[Throwable, ScanResponse] = {
    toEither(underlying.scan(scanRequest))
  }

  def scanPaginator(scanRequest: ScanRequest): ScanIterable = {
    underlying.scanPaginator(scanRequest)
  }

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] = {
    toEither(underlying.tagResource(tagResourceRequest))
  }

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Either[Throwable, TransactGetItemsResponse] = {
    toEither(underlying.transactGetItems(transactGetItemsRequest))
  }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Either[Throwable, TransactWriteItemsResponse] = {
    toEither(underlying.transactWriteItems(transactWriteItemsRequest))
  }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] = {
    toEither(underlying.untagResource(untagResourceRequest))
  }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Either[Throwable, UpdateContinuousBackupsResponse] = {
    toEither(underlying.updateContinuousBackups(updateContinuousBackupsRequest))
  }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Either[Throwable, UpdateGlobalTableResponse] = {
    toEither(underlying.updateGlobalTable(updateGlobalTableRequest))
  }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Either[Throwable, UpdateGlobalTableSettingsResponse] = {
    toEither(underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest))
  }

  override def updateItem(updateItemRequest: UpdateItemRequest): Either[Throwable, UpdateItemResponse] = {
    toEither(underlying.updateItem(updateItemRequest))
  }

  override def updateTable(updateTableRequest: UpdateTableRequest): Either[Throwable, UpdateTableResponse] = {
    toEither(underlying.updateTable(updateTableRequest))
  }

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Either[Throwable, UpdateTimeToLiveResponse] = {
    toEither(underlying.updateTimeToLive(updateTimeToLiveRequest))
  }

}
