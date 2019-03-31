// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClient, DynamoDBClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._

import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBReaderTFutureClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBReaderTFutureClient =
    new DynamoDBReaderTFutureClientImpl(underlying)

}

trait DynamoDBReaderTFutureClient extends DynamoDBClient[ReaderT[Future, ExecutionContext, ?]] {

  val underlying: DynamoDBAsyncClient

  override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): ReaderT[Future, ExecutionContext, BatchGetItemResponse] =
    ReaderT { implicit ec =>
      underlying.batchGetItem(batchGetItemRequest)
    }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): ReaderT[Future, ExecutionContext, BatchWriteItemResponse] =
    ReaderT { implicit ec =>
      underlying.batchWriteItem(batchWriteItemRequest)
    }

  override def createBackup(
      createBackupRequest: CreateBackupRequest
  ): ReaderT[Future, ExecutionContext, CreateBackupResponse] =
    ReaderT { implicit ec =>
      underlying.createBackup(createBackupRequest)
    }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, CreateGlobalTableResponse] =
    ReaderT { implicit ec =>
      underlying.createGlobalTable(createGlobalTableRequest)
    }

  override def createTable(
      createTableRequest: CreateTableRequest
  ): ReaderT[Future, ExecutionContext, CreateTableResponse] =
    ReaderT { implicit ec =>
      underlying.createTable(createTableRequest)
    }

  override def deleteBackup(
      deleteBackupRequest: DeleteBackupRequest
  ): ReaderT[Future, ExecutionContext, DeleteBackupResponse] =
    ReaderT { implicit ec =>
      underlying.deleteBackup(deleteBackupRequest)
    }

  override def deleteItem(
      deleteItemRequest: DeleteItemRequest
  ): ReaderT[Future, ExecutionContext, DeleteItemResponse] =
    ReaderT { implicit ec =>
      underlying.deleteItem(deleteItemRequest)
    }

  override def deleteTable(
      deleteTableRequest: DeleteTableRequest
  ): ReaderT[Future, ExecutionContext, DeleteTableResponse] =
    ReaderT { implicit ec =>
      underlying.deleteTable(deleteTableRequest)
    }

  override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): ReaderT[Future, ExecutionContext, DescribeBackupResponse] =
    ReaderT { implicit ec =>
      underlying.describeBackup(describeBackupRequest)
    }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, DescribeContinuousBackupsResponse] =
    ReaderT { implicit ec =>
      underlying.describeContinuousBackups(describeContinuousBackupsRequest)
    }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): ReaderT[Future, ExecutionContext, DescribeEndpointsResponse] =
    ReaderT { implicit ec =>
      underlying.describeEndpoints(describeEndpointsRequest)
    }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableResponse] =
    ReaderT { implicit ec =>
      underlying.describeGlobalTable(describeGlobalTableRequest)
    }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableSettingsResponse] =
    ReaderT { implicit ec =>
      underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)
    }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] =
    ReaderT { implicit ec =>
      underlying.describeLimits(describeLimitsRequest)
    }

  override def describeTable(
      describeTableRequest: DescribeTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeTableResponse] =
    ReaderT { implicit ec =>
      underlying.describeTable(describeTableRequest)
    }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, DescribeTimeToLiveResponse] =
    ReaderT { implicit ec =>
      underlying.describeTimeToLive(describeTimeToLiveRequest)
    }

  override def getItem(
      getItemRequest: GetItemRequest
  ): ReaderT[Future, ExecutionContext, GetItemResponse] =
    ReaderT { implicit ec =>
      underlying.getItem(getItemRequest)
    }

  override def listBackups(
      listBackupsRequest: ListBackupsRequest
  ): ReaderT[Future, ExecutionContext, ListBackupsResponse] =
    ReaderT { implicit ec =>
      underlying.listBackups(listBackupsRequest)
    }

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): ReaderT[Future, ExecutionContext, ListGlobalTablesResponse] =
    ReaderT { implicit ec =>
      underlying.listGlobalTables(listGlobalTablesRequest)
    }

  override def listTables(
      listTablesRequest: ListTablesRequest
  ): ReaderT[Future, ExecutionContext, ListTablesResponse] =
    ReaderT { implicit ec =>
      underlying.listTables(listTablesRequest)
    }

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): ReaderT[Future, ExecutionContext, ListTagsOfResourceResponse] =
    ReaderT { implicit ec =>
      underlying.listTagsOfResource(listTagsOfResourceRequest)
    }

  override def putItem(
      putItemRequest: PutItemRequest
  ): ReaderT[Future, ExecutionContext, PutItemResponse] =
    ReaderT { implicit ec =>
      underlying.putItem(putItemRequest)
    }

  override def query(
      queryRequest: QueryRequest
  ): ReaderT[Future, ExecutionContext, QueryResponse] =
    ReaderT { implicit ec =>
      underlying.query(queryRequest)
    }

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher =
    underlying.queryPaginator(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableFromBackupResponse] =
    ReaderT { implicit ec =>
      underlying.restoreTableFromBackup(restoreTableFromBackupRequest)
    }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableToPointInTimeResponse] =
    ReaderT { implicit ec =>
      underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)
    }

  override def scan(
      scanRequest: ScanRequest
  ): ReaderT[Future, ExecutionContext, ScanResponse] =
    ReaderT { implicit ec =>
      underlying.scan(scanRequest)
    }

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher =
    underlying.scanPaginator(scanRequest)

  override def tagResource(
      tagResourceRequest: TagResourceRequest
  ): ReaderT[Future, ExecutionContext, TagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.tagResource(tagResourceRequest)
    }

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactGetItemsResponse] =
    ReaderT { implicit ec =>
      underlying.transactGetItems(transactGetItemsRequest)
    }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactWriteItemsResponse] =
    ReaderT { implicit ec =>
      underlying.transactWriteItems(transactWriteItemsRequest)
    }

  override def untagResource(
      untagResourceRequest: UntagResourceRequest
  ): ReaderT[Future, ExecutionContext, UntagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.untagResource(untagResourceRequest)
    }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, UpdateContinuousBackupsResponse] =
    ReaderT { implicit ec =>
      underlying.updateContinuousBackups(updateContinuousBackupsRequest)
    }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableResponse] =
    ReaderT { implicit ec =>
      underlying.updateGlobalTable(updateGlobalTableRequest)
    }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableSettingsResponse] =
    ReaderT { implicit ec =>
      underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)
    }

  override def updateItem(
      updateItemRequest: UpdateItemRequest
  ): ReaderT[Future, ExecutionContext, UpdateItemResponse] =
    ReaderT { implicit ec =>
      underlying.updateItem(updateItemRequest)
    }

  override def updateTable(
      updateTableRequest: UpdateTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateTableResponse] =
    ReaderT { implicit ec =>
      underlying.updateTable(updateTableRequest)
    }

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, UpdateTimeToLiveResponse] =
    ReaderT { implicit ec =>
      underlying.updateTimeToLive(updateTimeToLiveRequest)
    }

}
