// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.ops._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBAsyncClient {

  def apply(underlying: DynamoDbAsyncClient)(implicit ec: ExecutionContext): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait DynamoDBAsyncClient extends DynamoDBClient[Future] {
  implicit val execution: ExecutionContext
  val underlying: DynamoDbAsyncClient
  import DynamoDBAsyncClient._

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] = {
    import BatchGetItemRequestOps._
    import BatchGetItemResponseOps._
    underlying.batchGetItem(batchGetItemRequest.toJava).toFuture.map(_.toScala)
  }

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher = {
    import BatchGetItemRequestOps._
    new BatchGetItemPublisherImpl(underlying.batchGetItemPaginator(batchGetItemRequest.toJava))
  }

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] = {
    import BatchWriteItemRequestOps._
    import BatchWriteItemResponseOps._
    underlying.batchWriteItem(batchWriteItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] = {
    import CreateBackupRequestOps._
    import CreateBackupResponseOps._
    underlying.createBackup(createBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] = {
    import CreateGlobalTableRequestOps._
    import CreateGlobalTableResponseOps._
    underlying.createGlobalTable(createGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] = {
    import CreateTableRequestOps._
    import CreateTableResponseOps._
    underlying.createTable(createTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] = {
    import DeleteBackupRequestOps._
    import DeleteBackupResponseOps._
    underlying.deleteBackup(deleteBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] = {
    import DeleteItemRequestOps._
    import DeleteItemResponseOps._
    underlying.deleteItem(deleteItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] = {
    import DeleteTableRequestOps._
    import DeleteTableResponseOps._
    underlying.deleteTable(deleteTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] = {
    import DescribeBackupRequestOps._
    import DescribeBackupResponseOps._
    underlying.describeBackup(describeBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] = {
    import DescribeContinuousBackupsRequestOps._
    import DescribeContinuousBackupsResponseOps._
    underlying.describeContinuousBackups(describeContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] = {
    import DescribeEndpointsRequestOps._
    import DescribeEndpointsResponseOps._
    underlying.describeEndpoints(describeEndpointsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeEndpoints(): Future[DescribeEndpointsResponse] = {

    import DescribeEndpointsResponseOps._
    underlying.describeEndpoints().toFuture.map(_.toScala)
  }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] = {
    import DescribeGlobalTableRequestOps._
    import DescribeGlobalTableResponseOps._
    underlying.describeGlobalTable(describeGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] = {
    import DescribeGlobalTableSettingsRequestOps._
    import DescribeGlobalTableSettingsResponseOps._
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    underlying.describeLimits(describeLimitsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(): Future[DescribeLimitsResponse] = {

    import DescribeLimitsResponseOps._
    underlying.describeLimits().toFuture.map(_.toScala)
  }

  override def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] = {
    import DescribeTableRequestOps._
    import DescribeTableResponseOps._
    underlying.describeTable(describeTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] = {
    import DescribeTimeToLiveRequestOps._
    import DescribeTimeToLiveResponseOps._
    underlying.describeTimeToLive(describeTimeToLiveRequest.toJava).toFuture.map(_.toScala)
  }

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] = {
    import GetItemRequestOps._
    import GetItemResponseOps._
    underlying.getItem(getItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] = {
    import ListBackupsRequestOps._
    import ListBackupsResponseOps._
    underlying.listBackups(listBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBackups(): Future[ListBackupsResponse] = {

    import ListBackupsResponseOps._
    underlying.listBackups().toFuture.map(_.toScala)
  }

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] = {
    import ListGlobalTablesRequestOps._
    import ListGlobalTablesResponseOps._
    underlying.listGlobalTables(listGlobalTablesRequest.toJava).toFuture.map(_.toScala)
  }

  override def listGlobalTables(): Future[ListGlobalTablesResponse] = {

    import ListGlobalTablesResponseOps._
    underlying.listGlobalTables().toFuture.map(_.toScala)
  }

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] = {
    import ListTablesRequestOps._
    import ListTablesResponseOps._
    underlying.listTables(listTablesRequest.toJava).toFuture.map(_.toScala)
  }

  override def listTables(): Future[ListTablesResponse] = {

    import ListTablesResponseOps._
    underlying.listTables().toFuture.map(_.toScala)
  }

  def listTablesPaginator(): ListTablesPublisher = {

    new ListTablesPublisherImpl(underlying.listTablesPaginator())
  }

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher = {
    import ListTablesRequestOps._
    new ListTablesPublisherImpl(underlying.listTablesPaginator(listTablesRequest.toJava))
  }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] = {
    import ListTagsOfResourceRequestOps._
    import ListTagsOfResourceResponseOps._
    underlying.listTagsOfResource(listTagsOfResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] = {
    import PutItemRequestOps._
    import PutItemResponseOps._
    underlying.putItem(putItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def query(queryRequest: QueryRequest): Future[QueryResponse] = {
    import QueryRequestOps._
    import QueryResponseOps._
    underlying.query(queryRequest.toJava).toFuture.map(_.toScala)
  }

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher = {
    import QueryRequestOps._
    new QueryPublisherImpl(underlying.queryPaginator(queryRequest.toJava))
  }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] = {
    import RestoreTableFromBackupRequestOps._
    import RestoreTableFromBackupResponseOps._
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] = {
    import RestoreTableToPointInTimeRequestOps._
    import RestoreTableToPointInTimeResponseOps._
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava).toFuture.map(_.toScala)
  }

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] = {
    import ScanRequestOps._
    import ScanResponseOps._
    underlying.scan(scanRequest.toJava).toFuture.map(_.toScala)
  }

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher = {
    import ScanRequestOps._
    new ScanPublisherImpl(underlying.scanPaginator(scanRequest.toJava))
  }

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] = {
    import TagResourceRequestOps._
    import TagResourceResponseOps._
    underlying.tagResource(tagResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] = {
    import TransactGetItemsRequestOps._
    import TransactGetItemsResponseOps._
    underlying.transactGetItems(transactGetItemsRequest.toJava).toFuture.map(_.toScala)
  }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] = {
    import TransactWriteItemsRequestOps._
    import TransactWriteItemsResponseOps._
    underlying.transactWriteItems(transactWriteItemsRequest.toJava).toFuture.map(_.toScala)
  }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] = {
    import UntagResourceRequestOps._
    import UntagResourceResponseOps._
    underlying.untagResource(untagResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] = {
    import UpdateContinuousBackupsRequestOps._
    import UpdateContinuousBackupsResponseOps._
    underlying.updateContinuousBackups(updateContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] = {
    import UpdateGlobalTableRequestOps._
    import UpdateGlobalTableResponseOps._
    underlying.updateGlobalTable(updateGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] = {
    import UpdateGlobalTableSettingsRequestOps._
    import UpdateGlobalTableSettingsResponseOps._
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] = {
    import UpdateItemRequestOps._
    import UpdateItemResponseOps._
    underlying.updateItem(updateItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] = {
    import UpdateTableRequestOps._
    import UpdateTableResponseOps._
    underlying.updateTable(updateTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] = {
    import UpdateTimeToLiveRequestOps._
    import UpdateTimeToLiveResponseOps._
    underlying.updateTimeToLive(updateTimeToLiveRequest.toJava).toFuture.map(_.toScala)
  }

}
