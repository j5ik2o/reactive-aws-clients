package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs.{
  BatchGetItemPublisherImpl,
  ListTablesPublisherImpl,
  QueryPublisherImpl,
  ScanPublisherImpl
}
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.{ ExecutionContext, Future }

private[dynamodb] class DynamoDBAsyncClientV2Impl(override val underlying: DynamoDbAsyncClient)(
    implicit execution: ExecutionContext
) extends DynamoDBAsyncClientV2 {
  import DynamoDBAsyncClientV2._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchGetItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchGetItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchWriteItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchWriteItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeEndpointsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeEndpointsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTimeToLiveResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GetItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GetItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListGlobalTablesRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListGlobalTablesResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTablesRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTablesResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTagsOfResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTagsOfResourceResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.QueryRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.QueryResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableFromBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableFromBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableToPointInTimeRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableToPointInTimeResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ScanRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ScanResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TagResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TagResourceResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UntagResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UntagResourceResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTimeToLiveResponseOps._

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] =
    underlying.batchGetItem(batchGetItemRequest.toJava).toFuture.map(_.toScala)

  override def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): rs.BatchGetItemPublisher =
    new BatchGetItemPublisherImpl(underlying.batchGetItemPaginator(batchGetItemRequest.toJava))

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] =
    underlying.batchWriteItem(batchWriteItemRequest.toJava).toFuture.map(_.toScala)

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] =
    underlying.createBackup(createBackupRequest.toJava).toFuture.map(_.toScala)

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] =
    underlying.createGlobalTable(createGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] =
    underlying.createTable(createTableRequest.toJava).toFuture.map(_.toScala)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] =
    underlying.deleteBackup(deleteBackupRequest.toJava).toFuture.map(_.toScala)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] =
    underlying.deleteItem(deleteItemRequest.toJava).toFuture.map(_.toScala)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] =
    underlying.deleteTable(deleteTableRequest.toJava).toFuture.map(_.toScala)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] =
    underlying.describeBackup(describeBackupRequest.toJava).toFuture.map(_.toScala)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest.toJava).toFuture.map(_.toScala)

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] =
    underlying.describeEndpoints(describeEndpointsRequest.toJava).toFuture.map(_.toScala)

  override def describeEndpoints(): Future[DescribeEndpointsResponse] =
    underlying.describeEndpoints().toFuture.map(_.toScala)

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] =
    underlying.describeGlobalTable(describeGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlying.describeLimits(describeLimitsRequest.toJava).toFuture.map(_.toScala)

  override def describeLimits(): Future[DescribeLimitsResponse] =
    underlying.describeLimits().toFuture.map(_.toScala)

  override def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] =
    underlying.describeTable(describeTableRequest.toJava).toFuture.map(_.toScala)

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] =
    underlying.describeTimeToLive(describeTimeToLiveRequest.toJava).toFuture.map(_.toScala)

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] =
    underlying.getItem(getItemRequest.toJava).toFuture.map(_.toScala)

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] =
    underlying.listBackups(listBackupsRequest.toJava).toFuture.map(_.toScala)

  override def listBackups(): Future[ListBackupsResponse] =
    underlying.listBackups().toFuture.map(_.toScala)

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTables(listGlobalTablesRequest.toJava).toFuture.map(_.toScala)

  override def listGlobalTables(): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTables().toFuture.map(_.toScala)

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] =
    underlying.listTables(listTablesRequest.toJava).toFuture.map(_.toScala)

  override def listTables(): Future[ListTablesResponse] =
    underlying.listTables().toFuture.map(_.toScala)

  override def listTablesPaginator(): rs.ListTablesPublisher =
    new ListTablesPublisherImpl(underlying.listTablesPaginator())

  override def listTablesPaginator(listTablesRequest: ListTablesRequest): rs.ListTablesPublisher =
    new ListTablesPublisherImpl(underlying.listTablesPaginator(listTablesRequest.toJava))

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] =
    underlying.listTagsOfResource(listTagsOfResourceRequest.toJava).toFuture.map(_.toScala)

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] =
    underlying.putItem(putItemRequest.toJava).toFuture.map(_.toScala)

  override def query(queryRequest: QueryRequest): Future[QueryResponse] =
    underlying.query(queryRequest.toJava).toFuture.map(_.toScala)

  override def queryPaginator(queryRequest: QueryRequest): rs.QueryPublisher =
    new QueryPublisherImpl(underlying.queryPaginator(queryRequest.toJava))

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest.toJava).toFuture.map(_.toScala)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava).toFuture.map(_.toScala)

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] =
    underlying.scan(scanRequest.toJava).toFuture.map(_.toScala)

  override def scanPaginator(scanRequest: ScanRequest): rs.ScanPublisher =
    new ScanPublisherImpl(underlying.scanPaginator(scanRequest.toJava))

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest.toJava).toFuture.map(_.toScala)

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] =
    underlying.transactGetItems(transactGetItemsRequest.toJava).toFuture.map(_.toScala)

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] =
    underlying.transactWriteItems(transactWriteItemsRequest.toJava).toFuture.map(_.toScala)

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest.toJava).toFuture.map(_.toScala)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest.toJava).toFuture.map(_.toScala)

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] =
    underlying.updateGlobalTable(updateGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] =
    underlying.updateItem(updateItemRequest.toJava).toFuture.map(_.toScala)

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] =
    underlying.updateTable(updateTableRequest.toJava).toFuture.map(_.toScala)

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] =
    underlying.updateTimeToLive(updateTimeToLiveRequest.toJava).toFuture.map(_.toScala)

}
