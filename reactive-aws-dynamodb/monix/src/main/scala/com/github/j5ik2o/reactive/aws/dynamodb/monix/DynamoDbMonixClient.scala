// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.monix

import software.amazon.awssdk.services.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDbAsyncClient, DynamoDbClient }
import monix.eval.Task
import monix.reactive.Observable

object DynamoDbMonixClient {

  def apply(underlying: DynamoDbAsyncClient): DynamoDbMonixClient = new DynamoDbMonixClientImpl(underlying)

}

trait DynamoDbMonixClient extends DynamoDbClient[Task] {

  val underlying: DynamoDbAsyncClient

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Task[BatchGetItemResponse] =
    Task.deferFuture {
      underlying.batchGetItem(batchGetItemRequest)
    }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): Observable[BatchGetItemResponse] =
    Observable.fromReactivePublisher(underlying.batchGetItemPaginator(batchGetItemRequest))

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Task[BatchWriteItemResponse] =
    Task.deferFuture {
      underlying.batchWriteItem(batchWriteItemRequest)
    }

  override def createBackup(createBackupRequest: CreateBackupRequest): Task[CreateBackupResponse] =
    Task.deferFuture {
      underlying.createBackup(createBackupRequest)
    }

  override def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): Task[CreateGlobalTableResponse] =
    Task.deferFuture {
      underlying.createGlobalTable(createGlobalTableRequest)
    }

  override def createTable(createTableRequest: CreateTableRequest): Task[CreateTableResponse] =
    Task.deferFuture {
      underlying.createTable(createTableRequest)
    }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Task[DeleteBackupResponse] =
    Task.deferFuture {
      underlying.deleteBackup(deleteBackupRequest)
    }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Task[DeleteItemResponse] =
    Task.deferFuture {
      underlying.deleteItem(deleteItemRequest)
    }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Task[DeleteTableResponse] =
    Task.deferFuture {
      underlying.deleteTable(deleteTableRequest)
    }

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Task[DescribeBackupResponse] =
    Task.deferFuture {
      underlying.describeBackup(describeBackupRequest)
    }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Task[DescribeContinuousBackupsResponse] =
    Task.deferFuture {
      underlying.describeContinuousBackups(describeContinuousBackupsRequest)
    }

  override def describeContributorInsights(
      describeContributorInsightsRequest: DescribeContributorInsightsRequest
  ): Task[DescribeContributorInsightsResponse] =
    Task.deferFuture {
      underlying.describeContributorInsights(describeContributorInsightsRequest)
    }

  override def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): Task[DescribeEndpointsResponse] =
    Task.deferFuture {
      underlying.describeEndpoints(describeEndpointsRequest)
    }

  override def describeEndpoints(): Task[DescribeEndpointsResponse] =
    Task.deferFuture {
      underlying.describeEndpoints()
    }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Task[DescribeGlobalTableResponse] =
    Task.deferFuture {
      underlying.describeGlobalTable(describeGlobalTableRequest)
    }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Task[DescribeGlobalTableSettingsResponse] =
    Task.deferFuture {
      underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest)
    }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Task[DescribeLimitsResponse] =
    Task.deferFuture {
      underlying.describeLimits(describeLimitsRequest)
    }

  override def describeLimits(): Task[DescribeLimitsResponse] =
    Task.deferFuture {
      underlying.describeLimits()
    }

  override def describeTable(describeTableRequest: DescribeTableRequest): Task[DescribeTableResponse] =
    Task.deferFuture {
      underlying.describeTable(describeTableRequest)
    }

  override def describeTableReplicaAutoScaling(
      describeTableReplicaAutoScalingRequest: DescribeTableReplicaAutoScalingRequest
  ): Task[DescribeTableReplicaAutoScalingResponse] =
    Task.deferFuture {
      underlying.describeTableReplicaAutoScaling(describeTableReplicaAutoScalingRequest)
    }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Task[DescribeTimeToLiveResponse] =
    Task.deferFuture {
      underlying.describeTimeToLive(describeTimeToLiveRequest)
    }

  override def getItem(getItemRequest: GetItemRequest): Task[GetItemResponse] =
    Task.deferFuture {
      underlying.getItem(getItemRequest)
    }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Task[ListBackupsResponse] =
    Task.deferFuture {
      underlying.listBackups(listBackupsRequest)
    }

  override def listBackups(): Task[ListBackupsResponse] =
    Task.deferFuture {
      underlying.listBackups()
    }

  override def listContributorInsights(
      listContributorInsightsRequest: ListContributorInsightsRequest
  ): Task[ListContributorInsightsResponse] =
    Task.deferFuture {
      underlying.listContributorInsights(listContributorInsightsRequest)
    }

  def listContributorInsightsPaginator(
      listContributorInsightsRequest: ListContributorInsightsRequest
  ): Observable[ListContributorInsightsResponse] =
    Observable.fromReactivePublisher(underlying.listContributorInsightsPaginator(listContributorInsightsRequest))

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Task[ListGlobalTablesResponse] =
    Task.deferFuture {
      underlying.listGlobalTables(listGlobalTablesRequest)
    }

  override def listGlobalTables(): Task[ListGlobalTablesResponse] =
    Task.deferFuture {
      underlying.listGlobalTables()
    }

  override def listTables(listTablesRequest: ListTablesRequest): Task[ListTablesResponse] =
    Task.deferFuture {
      underlying.listTables(listTablesRequest)
    }

  override def listTables(): Task[ListTablesResponse] =
    Task.deferFuture {
      underlying.listTables()
    }

  def listTablesPaginator(): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator())

  def listTablesPaginator(listTablesRequest: ListTablesRequest): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator(listTablesRequest))

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Task[ListTagsOfResourceResponse] =
    Task.deferFuture {
      underlying.listTagsOfResource(listTagsOfResourceRequest)
    }

  override def putItem(putItemRequest: PutItemRequest): Task[PutItemResponse] =
    Task.deferFuture {
      underlying.putItem(putItemRequest)
    }

  override def query(queryRequest: QueryRequest): Task[QueryResponse] =
    Task.deferFuture {
      underlying.query(queryRequest)
    }

  def queryPaginator(queryRequest: QueryRequest): Observable[QueryResponse] =
    Observable.fromReactivePublisher(underlying.queryPaginator(queryRequest))

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Task[RestoreTableFromBackupResponse] =
    Task.deferFuture {
      underlying.restoreTableFromBackup(restoreTableFromBackupRequest)
    }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Task[RestoreTableToPointInTimeResponse] =
    Task.deferFuture {
      underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest)
    }

  override def scan(scanRequest: ScanRequest): Task[ScanResponse] =
    Task.deferFuture {
      underlying.scan(scanRequest)
    }

  def scanPaginator(scanRequest: ScanRequest): Observable[ScanResponse] =
    Observable.fromReactivePublisher(underlying.scanPaginator(scanRequest))

  override def tagResource(tagResourceRequest: TagResourceRequest): Task[TagResourceResponse] =
    Task.deferFuture {
      underlying.tagResource(tagResourceRequest)
    }

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Task[TransactGetItemsResponse] =
    Task.deferFuture {
      underlying.transactGetItems(transactGetItemsRequest)
    }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Task[TransactWriteItemsResponse] =
    Task.deferFuture {
      underlying.transactWriteItems(transactWriteItemsRequest)
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Task[UntagResourceResponse] =
    Task.deferFuture {
      underlying.untagResource(untagResourceRequest)
    }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Task[UpdateContinuousBackupsResponse] =
    Task.deferFuture {
      underlying.updateContinuousBackups(updateContinuousBackupsRequest)
    }

  override def updateContributorInsights(
      updateContributorInsightsRequest: UpdateContributorInsightsRequest
  ): Task[UpdateContributorInsightsResponse] =
    Task.deferFuture {
      underlying.updateContributorInsights(updateContributorInsightsRequest)
    }

  override def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): Task[UpdateGlobalTableResponse] =
    Task.deferFuture {
      underlying.updateGlobalTable(updateGlobalTableRequest)
    }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Task[UpdateGlobalTableSettingsResponse] =
    Task.deferFuture {
      underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest)
    }

  override def updateItem(updateItemRequest: UpdateItemRequest): Task[UpdateItemResponse] =
    Task.deferFuture {
      underlying.updateItem(updateItemRequest)
    }

  override def updateTable(updateTableRequest: UpdateTableRequest): Task[UpdateTableResponse] =
    Task.deferFuture {
      underlying.updateTable(updateTableRequest)
    }

  override def updateTableReplicaAutoScaling(
      updateTableReplicaAutoScalingRequest: UpdateTableReplicaAutoScalingRequest
  ): Task[UpdateTableReplicaAutoScalingResponse] =
    Task.deferFuture {
      underlying.updateTableReplicaAutoScaling(updateTableReplicaAutoScalingRequest)
    }

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Task[UpdateTimeToLiveResponse] =
    Task.deferFuture {
      underlying.updateTimeToLive(updateTimeToLiveRequest)
    }

}
