// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.monix

import software.amazon.awssdk.services.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDBAsyncClient, DynamoDBClient }
import monix.eval.Task
import monix.reactive.Observable

object DynamoDBMonixClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends DynamoDBClient[Task] {

  val underlying: DynamoDBAsyncClient

  override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): Task[BatchGetItemResponse] = Task.deferFuture {
    underlying.batchGetItem(batchGetItemRequest)
  }
  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): Observable[BatchGetItemResponse] =
    Observable.fromReactivePublisher(underlying.batchGetItemPaginator(batchGetItemRequest))
  override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): Task[BatchWriteItemResponse] = Task.deferFuture {
    underlying.batchWriteItem(batchWriteItemRequest)
  }
  override def createBackup(
      createBackupRequest: CreateBackupRequest
  ): Task[CreateBackupResponse] = Task.deferFuture {
    underlying.createBackup(createBackupRequest)
  }
  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Task[CreateGlobalTableResponse] = Task.deferFuture {
    underlying.createGlobalTable(createGlobalTableRequest)
  }
  override def createTable(
      createTableRequest: CreateTableRequest
  ): Task[CreateTableResponse] = Task.deferFuture {
    underlying.createTable(createTableRequest)
  }
  override def deleteBackup(
      deleteBackupRequest: DeleteBackupRequest
  ): Task[DeleteBackupResponse] = Task.deferFuture {
    underlying.deleteBackup(deleteBackupRequest)
  }
  override def deleteItem(
      deleteItemRequest: DeleteItemRequest
  ): Task[DeleteItemResponse] = Task.deferFuture {
    underlying.deleteItem(deleteItemRequest)
  }
  override def deleteTable(
      deleteTableRequest: DeleteTableRequest
  ): Task[DeleteTableResponse] = Task.deferFuture {
    underlying.deleteTable(deleteTableRequest)
  }
  override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): Task[DescribeBackupResponse] = Task.deferFuture {
    underlying.describeBackup(describeBackupRequest)
  }
  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Task[DescribeContinuousBackupsResponse] = Task.deferFuture {
    underlying.describeContinuousBackups(describeContinuousBackupsRequest)
  }
  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Task[DescribeEndpointsResponse] = Task.deferFuture {
    underlying.describeEndpoints(describeEndpointsRequest)
  }
  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Task[DescribeGlobalTableResponse] = Task.deferFuture {
    underlying.describeGlobalTable(describeGlobalTableRequest)
  }
  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Task[DescribeGlobalTableSettingsResponse] = Task.deferFuture {
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)
  }
  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Task[DescribeLimitsResponse] = Task.deferFuture {
    underlying.describeLimits(describeLimitsRequest)
  }
  override def describeTable(
      describeTableRequest: DescribeTableRequest
  ): Task[DescribeTableResponse] = Task.deferFuture {
    underlying.describeTable(describeTableRequest)
  }
  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Task[DescribeTimeToLiveResponse] = Task.deferFuture {
    underlying.describeTimeToLive(describeTimeToLiveRequest)
  }
  override def getItem(
      getItemRequest: GetItemRequest
  ): Task[GetItemResponse] = Task.deferFuture {
    underlying.getItem(getItemRequest)
  }
  override def listBackups(
      listBackupsRequest: ListBackupsRequest
  ): Task[ListBackupsResponse] = Task.deferFuture {
    underlying.listBackups(listBackupsRequest)
  }
  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Task[ListGlobalTablesResponse] = Task.deferFuture {
    underlying.listGlobalTables(listGlobalTablesRequest)
  }
  override def listTables(
      listTablesRequest: ListTablesRequest
  ): Task[ListTablesResponse] = Task.deferFuture {
    underlying.listTables(listTablesRequest)
  }
  def listTablesPaginator(listTablesRequest: ListTablesRequest): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator(listTablesRequest))
  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Task[ListTagsOfResourceResponse] = Task.deferFuture {
    underlying.listTagsOfResource(listTagsOfResourceRequest)
  }
  override def putItem(
      putItemRequest: PutItemRequest
  ): Task[PutItemResponse] = Task.deferFuture {
    underlying.putItem(putItemRequest)
  }
  override def query(
      queryRequest: QueryRequest
  ): Task[QueryResponse] = Task.deferFuture {
    underlying.query(queryRequest)
  }
  def queryPaginator(queryRequest: QueryRequest): Observable[QueryResponse] =
    Observable.fromReactivePublisher(underlying.queryPaginator(queryRequest))
  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Task[RestoreTableFromBackupResponse] = Task.deferFuture {
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest)
  }
  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Task[RestoreTableToPointInTimeResponse] = Task.deferFuture {
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)
  }
  override def scan(
      scanRequest: ScanRequest
  ): Task[ScanResponse] = Task.deferFuture {
    underlying.scan(scanRequest)
  }
  def scanPaginator(scanRequest: ScanRequest): Observable[ScanResponse] =
    Observable.fromReactivePublisher(underlying.scanPaginator(scanRequest))
  override def tagResource(
      tagResourceRequest: TagResourceRequest
  ): Task[TagResourceResponse] = Task.deferFuture {
    underlying.tagResource(tagResourceRequest)
  }
  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Task[TransactGetItemsResponse] = Task.deferFuture {
    underlying.transactGetItems(transactGetItemsRequest)
  }
  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Task[TransactWriteItemsResponse] = Task.deferFuture {
    underlying.transactWriteItems(transactWriteItemsRequest)
  }
  override def untagResource(
      untagResourceRequest: UntagResourceRequest
  ): Task[UntagResourceResponse] = Task.deferFuture {
    underlying.untagResource(untagResourceRequest)
  }
  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Task[UpdateContinuousBackupsResponse] = Task.deferFuture {
    underlying.updateContinuousBackups(updateContinuousBackupsRequest)
  }
  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Task[UpdateGlobalTableResponse] = Task.deferFuture {
    underlying.updateGlobalTable(updateGlobalTableRequest)
  }
  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Task[UpdateGlobalTableSettingsResponse] = Task.deferFuture {
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)
  }
  override def updateItem(
      updateItemRequest: UpdateItemRequest
  ): Task[UpdateItemResponse] = Task.deferFuture {
    underlying.updateItem(updateItemRequest)
  }
  override def updateTable(
      updateTableRequest: UpdateTableRequest
  ): Task[UpdateTableResponse] = Task.deferFuture {
    underlying.updateTable(updateTableRequest)
  }
  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Task[UpdateTimeToLiveResponse] = Task.deferFuture {
    underlying.updateTimeToLive(updateTimeToLiveRequest)
  }
}
