// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.effect.{ ContextShift, IO }
import com.github.j5ik2o.reactive.aws.dynamodb.{ DynamoDbAsyncClient, DynamoDbClient }
import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.paginators._

import scala.concurrent.{ ExecutionContext, Future }

object DynamoDbCatsIOClient {

  def apply(asyncClient: DynamoDbAsyncClient)(implicit ec: ExecutionContext): DynamoDbCatsIOClient =
    new DynamoDbCatsIOClient {
      override val executionContext: ExecutionContext = ec
      override val underlying: DynamoDbAsyncClient    = asyncClient
    }

}

trait DynamoDbCatsIOClient extends DynamoDbClient[IO] {

  val underlying: DynamoDbAsyncClient

  def executionContext: ExecutionContext
  implicit def cs: ContextShift[IO] = IO.contextShift(executionContext)

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): IO[BatchGetItemResponse] =
    IO.fromFuture {
      IO(underlying.batchGetItem(batchGetItemRequest))
    }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): IO[BatchWriteItemResponse] =
    IO.fromFuture {
      IO(underlying.batchWriteItem(batchWriteItemRequest))
    }

  override def createBackup(createBackupRequest: CreateBackupRequest): IO[CreateBackupResponse] =
    IO.fromFuture {
      IO(underlying.createBackup(createBackupRequest))
    }

  override def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): IO[CreateGlobalTableResponse] =
    IO.fromFuture {
      IO(underlying.createGlobalTable(createGlobalTableRequest))
    }

  override def createTable(createTableRequest: CreateTableRequest): IO[CreateTableResponse] =
    IO.fromFuture {
      IO(underlying.createTable(createTableRequest))
    }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): IO[DeleteBackupResponse] =
    IO.fromFuture {
      IO(underlying.deleteBackup(deleteBackupRequest))
    }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): IO[DeleteItemResponse] =
    IO.fromFuture {
      IO(underlying.deleteItem(deleteItemRequest))
    }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): IO[DeleteTableResponse] =
    IO.fromFuture {
      IO(underlying.deleteTable(deleteTableRequest))
    }

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): IO[DescribeBackupResponse] =
    IO.fromFuture {
      IO(underlying.describeBackup(describeBackupRequest))
    }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): IO[DescribeContinuousBackupsResponse] =
    IO.fromFuture {
      IO(underlying.describeContinuousBackups(describeContinuousBackupsRequest))
    }

  override def describeContributorInsights(
      describeContributorInsightsRequest: DescribeContributorInsightsRequest
  ): IO[DescribeContributorInsightsResponse] =
    IO.fromFuture {
      IO(underlying.describeContributorInsights(describeContributorInsightsRequest))
    }

  override def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): IO[DescribeEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeEndpoints(describeEndpointsRequest))
    }

  override def describeEndpoints(): IO[DescribeEndpointsResponse] =
    IO.fromFuture {
      IO(underlying.describeEndpoints())
    }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): IO[DescribeGlobalTableResponse] =
    IO.fromFuture {
      IO(underlying.describeGlobalTable(describeGlobalTableRequest))
    }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): IO[DescribeGlobalTableSettingsResponse] =
    IO.fromFuture {
      IO(underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest))
    }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): IO[DescribeLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeLimits(describeLimitsRequest))
    }

  override def describeLimits(): IO[DescribeLimitsResponse] =
    IO.fromFuture {
      IO(underlying.describeLimits())
    }

  override def describeTable(describeTableRequest: DescribeTableRequest): IO[DescribeTableResponse] =
    IO.fromFuture {
      IO(underlying.describeTable(describeTableRequest))
    }

  override def describeTableReplicaAutoScaling(
      describeTableReplicaAutoScalingRequest: DescribeTableReplicaAutoScalingRequest
  ): IO[DescribeTableReplicaAutoScalingResponse] =
    IO.fromFuture {
      IO(underlying.describeTableReplicaAutoScaling(describeTableReplicaAutoScalingRequest))
    }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): IO[DescribeTimeToLiveResponse] =
    IO.fromFuture {
      IO(underlying.describeTimeToLive(describeTimeToLiveRequest))
    }

  override def getItem(getItemRequest: GetItemRequest): IO[GetItemResponse] =
    IO.fromFuture {
      IO(underlying.getItem(getItemRequest))
    }

  override def listBackups(listBackupsRequest: ListBackupsRequest): IO[ListBackupsResponse] =
    IO.fromFuture {
      IO(underlying.listBackups(listBackupsRequest))
    }

  override def listBackups(): IO[ListBackupsResponse] =
    IO.fromFuture {
      IO(underlying.listBackups())
    }

  override def listContributorInsights(
      listContributorInsightsRequest: ListContributorInsightsRequest
  ): IO[ListContributorInsightsResponse] =
    IO.fromFuture {
      IO(underlying.listContributorInsights(listContributorInsightsRequest))
    }

  def listContributorInsightsPaginator(
      listContributorInsightsRequest: ListContributorInsightsRequest
  ): ListContributorInsightsPublisher =
    underlying.listContributorInsightsPaginator(listContributorInsightsRequest)

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): IO[ListGlobalTablesResponse] =
    IO.fromFuture {
      IO(underlying.listGlobalTables(listGlobalTablesRequest))
    }

  override def listGlobalTables(): IO[ListGlobalTablesResponse] =
    IO.fromFuture {
      IO(underlying.listGlobalTables())
    }

  override def listTables(listTablesRequest: ListTablesRequest): IO[ListTablesResponse] =
    IO.fromFuture {
      IO(underlying.listTables(listTablesRequest))
    }

  override def listTables(): IO[ListTablesResponse] =
    IO.fromFuture {
      IO(underlying.listTables())
    }

  def listTablesPaginator(): ListTablesPublisher =
    underlying.listTablesPaginator()

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): IO[ListTagsOfResourceResponse] =
    IO.fromFuture {
      IO(underlying.listTagsOfResource(listTagsOfResourceRequest))
    }

  override def putItem(putItemRequest: PutItemRequest): IO[PutItemResponse] =
    IO.fromFuture {
      IO(underlying.putItem(putItemRequest))
    }

  override def query(queryRequest: QueryRequest): IO[QueryResponse] =
    IO.fromFuture {
      IO(underlying.query(queryRequest))
    }

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher =
    underlying.queryPaginator(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): IO[RestoreTableFromBackupResponse] =
    IO.fromFuture {
      IO(underlying.restoreTableFromBackup(restoreTableFromBackupRequest))
    }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): IO[RestoreTableToPointInTimeResponse] =
    IO.fromFuture {
      IO(underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest))
    }

  override def scan(scanRequest: ScanRequest): IO[ScanResponse] =
    IO.fromFuture {
      IO(underlying.scan(scanRequest))
    }

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher =
    underlying.scanPaginator(scanRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): IO[TagResourceResponse] =
    IO.fromFuture {
      IO(underlying.tagResource(tagResourceRequest))
    }

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): IO[TransactGetItemsResponse] =
    IO.fromFuture {
      IO(underlying.transactGetItems(transactGetItemsRequest))
    }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): IO[TransactWriteItemsResponse] =
    IO.fromFuture {
      IO(underlying.transactWriteItems(transactWriteItemsRequest))
    }

  override def untagResource(untagResourceRequest: UntagResourceRequest): IO[UntagResourceResponse] =
    IO.fromFuture {
      IO(underlying.untagResource(untagResourceRequest))
    }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): IO[UpdateContinuousBackupsResponse] =
    IO.fromFuture {
      IO(underlying.updateContinuousBackups(updateContinuousBackupsRequest))
    }

  override def updateContributorInsights(
      updateContributorInsightsRequest: UpdateContributorInsightsRequest
  ): IO[UpdateContributorInsightsResponse] =
    IO.fromFuture {
      IO(underlying.updateContributorInsights(updateContributorInsightsRequest))
    }

  override def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): IO[UpdateGlobalTableResponse] =
    IO.fromFuture {
      IO(underlying.updateGlobalTable(updateGlobalTableRequest))
    }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): IO[UpdateGlobalTableSettingsResponse] =
    IO.fromFuture {
      IO(underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest))
    }

  override def updateItem(updateItemRequest: UpdateItemRequest): IO[UpdateItemResponse] =
    IO.fromFuture {
      IO(underlying.updateItem(updateItemRequest))
    }

  override def updateTable(updateTableRequest: UpdateTableRequest): IO[UpdateTableResponse] =
    IO.fromFuture {
      IO(underlying.updateTable(updateTableRequest))
    }

  override def updateTableReplicaAutoScaling(
      updateTableReplicaAutoScalingRequest: UpdateTableReplicaAutoScalingRequest
  ): IO[UpdateTableReplicaAutoScalingResponse] =
    IO.fromFuture {
      IO(underlying.updateTableReplicaAutoScaling(updateTableReplicaAutoScalingRequest))
    }

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): IO[UpdateTimeToLiveResponse] =
    IO.fromFuture {
      IO(underlying.updateTimeToLive(updateTimeToLiveRequest))
    }

}
