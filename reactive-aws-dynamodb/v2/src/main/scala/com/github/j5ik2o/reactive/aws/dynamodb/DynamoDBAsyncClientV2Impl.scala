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

  override def batchGetItem(
      request: BatchGetItemRequest
  ): Future[BatchGetItemResponse] =
    underlying.batchGetItem(request.toJava).toFuture.map(_.toScala)

  override def batchGetItemPaginator(
      request: BatchGetItemRequest
  ): rs.BatchGetItemPublisher =
    new BatchGetItemPublisherImpl(underlying.batchGetItemPaginator(request.toJava))

  override def batchWriteItem(
      request: BatchWriteItemRequest
  ): Future[BatchWriteItemResponse] =
    underlying.batchWriteItem(request.toJava).toFuture.map(_.toScala)

  override def createBackup(request: CreateBackupRequest): Future[CreateBackupResponse] =
    underlying.createBackup(request.toJava).toFuture.map(_.toScala)

  override def createGlobalTable(
      request: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] =
    underlying.createGlobalTable(request.toJava).toFuture.map(_.toScala)

  override def createTable(request: CreateTableRequest): Future[CreateTableResponse] =
    underlying.createTable(request.toJava).toFuture.map(_.toScala)

  override def deleteBackup(request: DeleteBackupRequest): Future[DeleteBackupResponse] =
    underlying.deleteBackup(request.toJava).toFuture.map(_.toScala)

  override def deleteItem(request: DeleteItemRequest): Future[DeleteItemResponse] =
    underlying.deleteItem(request.toJava).toFuture.map(_.toScala)

  override def deleteTable(request: DeleteTableRequest): Future[DeleteTableResponse] =
    underlying.deleteTable(request.toJava).toFuture.map(_.toScala)

  override def describeBackup(
      request: DescribeBackupRequest
  ): Future[DescribeBackupResponse] = underlying.describeBackup(request.toJava).toFuture.map(_.toScala)

  override def describeContinuousBackups(
      request: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(request.toJava).toFuture.map(_.toScala)

  override def describeEndpoints(
      request: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] =
    underlying.describeEndpoints(request.toJava).toFuture.map(_.toScala)

  override def describeGlobalTable(
      request: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] =
    underlying.describeGlobalTable(request.toJava).toFuture.map(_.toScala)

  override def describeGlobalTableSettings(
      request: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(request.toJava).toFuture.map(_.toScala)

  override def describeLimits(
      request: DescribeLimitsRequest
  ): Future[DescribeLimitsResponse] =
    underlying.describeLimits(request.toJava).toFuture.map(_.toScala)

  override def describeTable(
      request: DescribeTableRequest
  ): Future[DescribeTableResponse] = underlying.describeTable(request.toJava).toFuture.map(_.toScala)

  override def describeTimeToLive(
      request: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] =
    underlying.describeTimeToLive(request.toJava).toFuture.map(_.toScala)

  override def getItem(request: GetItemRequest): Future[GetItemResponse] =
    underlying.getItem(request.toJava).toFuture.map(_.toScala)

  override def listBackups(request: ListBackupsRequest): Future[ListBackupsResponse] =
    underlying.listBackups(request.toJava).toFuture.map(_.toScala)

  override def listGlobalTables(
      request: ListGlobalTablesRequest
  ): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTables(request.toJava).toFuture.map(_.toScala)

  override def listTables(request: ListTablesRequest): Future[ListTablesResponse] =
    underlying.listTables(request.toJava).toFuture.map(_.toScala)

  override def listTablesPaginator: rs.ListTablesPublisher =
    new ListTablesPublisherImpl(underlying.listTablesPaginator)

  override def listTablesPaginator(request: ListTablesRequest): rs.ListTablesPublisher =
    new ListTablesPublisherImpl(underlying.listTablesPaginator(request.toJava))

  override def listTagsOfResource(
      request: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] =
    underlying.listTagsOfResource(request.toJava).toFuture.map(_.toScala)

  override def putItem(request: PutItemRequest): Future[PutItemResponse] =
    underlying.putItem(request.toJava).toFuture.map(_.toScala)

  override def query(request: QueryRequest): Future[QueryResponse] =
    underlying.query(request.toJava).toFuture.map(_.toScala)

  override def queryPaginator(request: QueryRequest): rs.QueryPublisher =
    new QueryPublisherImpl(underlying.queryPaginator(request.toJava))

  override def restoreTableFromBackup(
      request: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(request.toJava).toFuture.map(_.toScala)

  override def restoreTableToPointInTime(
      request: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(request.toJava).toFuture.map(_.toScala)

  override def scan(request: ScanRequest): Future[ScanResponse] =
    underlying.scan(request.toJava).toFuture.map(_.toScala)

  override def scanPaginator(request: ScanRequest): rs.ScanPublisher =
    new ScanPublisherImpl(underlying.scanPaginator(request.toJava))

  override def tagResource(request: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(request.toJava).toFuture.map(_.toScala)

  override def transactGetItems(
      request: TransactGetItemsRequest
  ): Future[TransactGetItemsResponse] =
    underlying.transactGetItems(request.toJava).toFuture.map(_.toScala)

  override def transactWriteItems(
      request: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] =
    underlying.transactWriteItems(request.toJava).toFuture.map(_.toScala)

  override def untagResource(
      request: UntagResourceRequest
  ): Future[UntagResourceResponse] =
    underlying.untagResource(request.toJava).toFuture.map(_.toScala)

  override def updateContinuousBackups(
      request: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(request.toJava).toFuture.map(_.toScala)

  override def updateGlobalTable(
      request: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] =
    underlying.updateGlobalTable(request.toJava).toFuture.map(_.toScala)

  override def updateGlobalTableSettings(
      request: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(request.toJava).toFuture.map(_.toScala)

  override def updateItem(request: UpdateItemRequest): Future[UpdateItemResponse] =
    underlying.updateItem(request.toJava).toFuture.map(_.toScala)

  override def updateTable(request: UpdateTableRequest): Future[UpdateTableResponse] =
    underlying.updateTable(request.toJava).toFuture.map(_.toScala)

  override def updateTimeToLive(
      request: UpdateTimeToLiveRequest
  ): Future[UpdateTimeToLiveResponse] =
    underlying.updateTimeToLive(request.toJava).toFuture.map(_.toScala)
}
