// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.CompletableFuture

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.paginators._

import scala.compat.java8.FutureConverters
import scala.concurrent.Future

object DynamoDBAsyncClient {

  def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait DynamoDBAsyncClient extends DynamoDBClient[Future] {
  val underlying: DynamoDbAsyncClient
  import DynamoDBAsyncClient._

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] = {
    underlying.batchGetItem(batchGetItemRequest).toFuture
  }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher = {
    underlying.batchGetItemPaginator(batchGetItemRequest)
  }

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] = {
    underlying.batchWriteItem(batchWriteItemRequest).toFuture
  }

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] = {
    underlying.createBackup(createBackupRequest).toFuture
  }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] = {
    underlying.createGlobalTable(createGlobalTableRequest).toFuture
  }

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] = {
    underlying.createTable(createTableRequest).toFuture
  }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] = {
    underlying.deleteBackup(deleteBackupRequest).toFuture
  }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] = {
    underlying.deleteItem(deleteItemRequest).toFuture
  }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] = {
    underlying.deleteTable(deleteTableRequest).toFuture
  }

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] = {
    underlying.describeBackup(describeBackupRequest).toFuture
  }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] = {
    underlying.describeContinuousBackups(describeContinuousBackupsRequest).toFuture
  }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] = {
    underlying.describeEndpoints(describeEndpointsRequest).toFuture
  }

  override def describeEndpoints(): Future[DescribeEndpointsResponse] = {
    underlying.describeEndpoints().toFuture
  }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] = {
    underlying.describeGlobalTable(describeGlobalTableRequest).toFuture
  }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] = {
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest).toFuture
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    underlying.describeLimits(describeLimitsRequest).toFuture
  }

  override def describeLimits(): Future[DescribeLimitsResponse] = {
    underlying.describeLimits().toFuture
  }

  override def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] = {
    underlying.describeTable(describeTableRequest).toFuture
  }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] = {
    underlying.describeTimeToLive(describeTimeToLiveRequest).toFuture
  }

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] = {
    underlying.getItem(getItemRequest).toFuture
  }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] = {
    underlying.listBackups(listBackupsRequest).toFuture
  }

  override def listBackups(): Future[ListBackupsResponse] = {
    underlying.listBackups().toFuture
  }

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] = {
    underlying.listGlobalTables(listGlobalTablesRequest).toFuture
  }

  override def listGlobalTables(): Future[ListGlobalTablesResponse] = {
    underlying.listGlobalTables().toFuture
  }

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] = {
    underlying.listTables(listTablesRequest).toFuture
  }

  override def listTables(): Future[ListTablesResponse] = {
    underlying.listTables().toFuture
  }

  def listTablesPaginator(): ListTablesPublisher = {
    underlying.listTablesPaginator()
  }

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher = {
    underlying.listTablesPaginator(listTablesRequest)
  }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] = {
    underlying.listTagsOfResource(listTagsOfResourceRequest).toFuture
  }

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] = {
    underlying.putItem(putItemRequest).toFuture
  }

  override def query(queryRequest: QueryRequest): Future[QueryResponse] = {
    underlying.query(queryRequest).toFuture
  }

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher = {
    underlying.queryPaginator(queryRequest)
  }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] = {
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest).toFuture
  }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] = {
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest).toFuture
  }

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] = {
    underlying.scan(scanRequest).toFuture
  }

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher = {
    underlying.scanPaginator(scanRequest)
  }

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] = {
    underlying.tagResource(tagResourceRequest).toFuture
  }

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] = {
    underlying.transactGetItems(transactGetItemsRequest).toFuture
  }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] = {
    underlying.transactWriteItems(transactWriteItemsRequest).toFuture
  }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] = {
    underlying.untagResource(untagResourceRequest).toFuture
  }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] = {
    underlying.updateContinuousBackups(updateContinuousBackupsRequest).toFuture
  }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] = {
    underlying.updateGlobalTable(updateGlobalTableRequest).toFuture
  }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] = {
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest).toFuture
  }

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] = {
    underlying.updateItem(updateItemRequest).toFuture
  }

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] = {
    underlying.updateTable(updateTableRequest).toFuture
  }

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] = {
    underlying.updateTimeToLive(updateTimeToLiveRequest).toFuture
  }

}
