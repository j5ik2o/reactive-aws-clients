// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.model.rs._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

class DynamoDBSyncClientImpl(override val underlying: DynamoDbClient) extends DynamoDBSyncClient {

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Either[Throwable, BatchGetItemResponse] = {
    import BatchGetItemRequestOps._
    import BatchGetItemResponseOps._
    toEither(underlying.batchGetItem(batchGetItemRequest.toJava)).right.map(_.toScala)
  }

  override def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemIterable = {
    import BatchGetItemRequestOps._
    new BatchGetItemIterableImpl(underlying.batchGetItemPaginator(batchGetItemRequest.toJava))
  }

  override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): Either[Throwable, BatchWriteItemResponse] = {
    import BatchWriteItemRequestOps._
    import BatchWriteItemResponseOps._
    toEither(underlying.batchWriteItem(batchWriteItemRequest.toJava)).right.map(_.toScala)
  }

  override def createBackup(createBackupRequest: CreateBackupRequest): Either[Throwable, CreateBackupResponse] = {
    import CreateBackupRequestOps._
    import CreateBackupResponseOps._
    toEither(underlying.createBackup(createBackupRequest.toJava)).right.map(_.toScala)
  }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Either[Throwable, CreateGlobalTableResponse] = {
    import CreateGlobalTableRequestOps._
    import CreateGlobalTableResponseOps._
    toEither(underlying.createGlobalTable(createGlobalTableRequest.toJava)).right.map(_.toScala)
  }

  override def createTable(createTableRequest: CreateTableRequest): Either[Throwable, CreateTableResponse] = {
    import CreateTableRequestOps._
    import CreateTableResponseOps._
    toEither(underlying.createTable(createTableRequest.toJava)).right.map(_.toScala)
  }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Either[Throwable, DeleteBackupResponse] = {
    import DeleteBackupRequestOps._
    import DeleteBackupResponseOps._
    toEither(underlying.deleteBackup(deleteBackupRequest.toJava)).right.map(_.toScala)
  }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Either[Throwable, DeleteItemResponse] = {
    import DeleteItemRequestOps._
    import DeleteItemResponseOps._
    toEither(underlying.deleteItem(deleteItemRequest.toJava)).right.map(_.toScala)
  }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Either[Throwable, DeleteTableResponse] = {
    import DeleteTableRequestOps._
    import DeleteTableResponseOps._
    toEither(underlying.deleteTable(deleteTableRequest.toJava)).right.map(_.toScala)
  }

  override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): Either[Throwable, DescribeBackupResponse] = {
    import DescribeBackupRequestOps._
    import DescribeBackupResponseOps._
    toEither(underlying.describeBackup(describeBackupRequest.toJava)).right.map(_.toScala)
  }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Either[Throwable, DescribeContinuousBackupsResponse] = {
    import DescribeContinuousBackupsRequestOps._
    import DescribeContinuousBackupsResponseOps._
    toEither(underlying.describeContinuousBackups(describeContinuousBackupsRequest.toJava)).right.map(_.toScala)
  }

  override def describeEndpoints(): Either[Throwable, DescribeEndpointsResponse] = {

    import DescribeEndpointsResponseOps._
    toEither(underlying.describeEndpoints()).right.map(_.toScala)
  }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Either[Throwable, DescribeEndpointsResponse] = {
    import DescribeEndpointsRequestOps._
    import DescribeEndpointsResponseOps._
    toEither(underlying.describeEndpoints(describeEndpointsRequest.toJava)).right.map(_.toScala)
  }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Either[Throwable, DescribeGlobalTableResponse] = {
    import DescribeGlobalTableRequestOps._
    import DescribeGlobalTableResponseOps._
    toEither(underlying.describeGlobalTable(describeGlobalTableRequest.toJava)).right.map(_.toScala)
  }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Either[Throwable, DescribeGlobalTableSettingsResponse] = {
    import DescribeGlobalTableSettingsRequestOps._
    import DescribeGlobalTableSettingsResponseOps._
    toEither(underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava)).right.map(_.toScala)
  }

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] = {

    import DescribeLimitsResponseOps._
    toEither(underlying.describeLimits()).right.map(_.toScala)
  }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): Either[Throwable, DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    toEither(underlying.describeLimits(describeLimitsRequest.toJava)).right.map(_.toScala)
  }

  override def describeTable(describeTableRequest: DescribeTableRequest): Either[Throwable, DescribeTableResponse] = {
    import DescribeTableRequestOps._
    import DescribeTableResponseOps._
    toEither(underlying.describeTable(describeTableRequest.toJava)).right.map(_.toScala)
  }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Either[Throwable, DescribeTimeToLiveResponse] = {
    import DescribeTimeToLiveRequestOps._
    import DescribeTimeToLiveResponseOps._
    toEither(underlying.describeTimeToLive(describeTimeToLiveRequest.toJava)).right.map(_.toScala)
  }

  override def getItem(getItemRequest: GetItemRequest): Either[Throwable, GetItemResponse] = {
    import GetItemRequestOps._
    import GetItemResponseOps._
    toEither(underlying.getItem(getItemRequest.toJava)).right.map(_.toScala)
  }

  override def listBackups(): Either[Throwable, ListBackupsResponse] = {

    import ListBackupsResponseOps._
    toEither(underlying.listBackups()).right.map(_.toScala)
  }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Either[Throwable, ListBackupsResponse] = {
    import ListBackupsRequestOps._
    import ListBackupsResponseOps._
    toEither(underlying.listBackups(listBackupsRequest.toJava)).right.map(_.toScala)
  }

  override def listGlobalTables(): Either[Throwable, ListGlobalTablesResponse] = {

    import ListGlobalTablesResponseOps._
    toEither(underlying.listGlobalTables()).right.map(_.toScala)
  }

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Either[Throwable, ListGlobalTablesResponse] = {
    import ListGlobalTablesRequestOps._
    import ListGlobalTablesResponseOps._
    toEither(underlying.listGlobalTables(listGlobalTablesRequest.toJava)).right.map(_.toScala)
  }

  override def listTables(): Either[Throwable, ListTablesResponse] = {

    import ListTablesResponseOps._
    toEither(underlying.listTables()).right.map(_.toScala)
  }

  override def listTables(listTablesRequest: ListTablesRequest): Either[Throwable, ListTablesResponse] = {
    import ListTablesRequestOps._
    import ListTablesResponseOps._
    toEither(underlying.listTables(listTablesRequest.toJava)).right.map(_.toScala)
  }

  override def listTablesPaginator(): ListTablesIterable = {

    new ListTablesIterableImpl(underlying.listTablesPaginator())
  }

  override def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesIterable = {
    import ListTablesRequestOps._
    new ListTablesIterableImpl(underlying.listTablesPaginator(listTablesRequest.toJava))
  }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Either[Throwable, ListTagsOfResourceResponse] = {
    import ListTagsOfResourceRequestOps._
    import ListTagsOfResourceResponseOps._
    toEither(underlying.listTagsOfResource(listTagsOfResourceRequest.toJava)).right.map(_.toScala)
  }

  override def putItem(putItemRequest: PutItemRequest): Either[Throwable, PutItemResponse] = {
    import PutItemRequestOps._
    import PutItemResponseOps._
    toEither(underlying.putItem(putItemRequest.toJava)).right.map(_.toScala)
  }

  override def query(queryRequest: QueryRequest): Either[Throwable, QueryResponse] = {
    import QueryRequestOps._
    import QueryResponseOps._
    toEither(underlying.query(queryRequest.toJava)).right.map(_.toScala)
  }

  override def queryPaginator(queryRequest: QueryRequest): QueryIterable = {
    import QueryRequestOps._
    new QueryIterableImpl(underlying.queryPaginator(queryRequest.toJava))
  }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Either[Throwable, RestoreTableFromBackupResponse] = {
    import RestoreTableFromBackupRequestOps._
    import RestoreTableFromBackupResponseOps._
    toEither(underlying.restoreTableFromBackup(restoreTableFromBackupRequest.toJava)).right.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Either[Throwable, RestoreTableToPointInTimeResponse] = {
    import RestoreTableToPointInTimeRequestOps._
    import RestoreTableToPointInTimeResponseOps._
    toEither(underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava)).right.map(_.toScala)
  }

  override def scan(scanRequest: ScanRequest): Either[Throwable, ScanResponse] = {
    import ScanRequestOps._
    import ScanResponseOps._
    toEither(underlying.scan(scanRequest.toJava)).right.map(_.toScala)
  }

  override def scanPaginator(scanRequest: ScanRequest): ScanIterable = {
    import ScanRequestOps._
    new ScanIterableImpl(underlying.scanPaginator(scanRequest.toJava))
  }

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] = {
    import TagResourceRequestOps._
    import TagResourceResponseOps._
    toEither(underlying.tagResource(tagResourceRequest.toJava)).right.map(_.toScala)
  }

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Either[Throwable, TransactGetItemsResponse] = {
    import TransactGetItemsRequestOps._
    import TransactGetItemsResponseOps._
    toEither(underlying.transactGetItems(transactGetItemsRequest.toJava)).right.map(_.toScala)
  }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Either[Throwable, TransactWriteItemsResponse] = {
    import TransactWriteItemsRequestOps._
    import TransactWriteItemsResponseOps._
    toEither(underlying.transactWriteItems(transactWriteItemsRequest.toJava)).right.map(_.toScala)
  }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] = {
    import UntagResourceRequestOps._
    import UntagResourceResponseOps._
    toEither(underlying.untagResource(untagResourceRequest.toJava)).right.map(_.toScala)
  }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Either[Throwable, UpdateContinuousBackupsResponse] = {
    import UpdateContinuousBackupsRequestOps._
    import UpdateContinuousBackupsResponseOps._
    toEither(underlying.updateContinuousBackups(updateContinuousBackupsRequest.toJava)).right.map(_.toScala)
  }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Either[Throwable, UpdateGlobalTableResponse] = {
    import UpdateGlobalTableRequestOps._
    import UpdateGlobalTableResponseOps._
    toEither(underlying.updateGlobalTable(updateGlobalTableRequest.toJava)).right.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Either[Throwable, UpdateGlobalTableSettingsResponse] = {
    import UpdateGlobalTableSettingsRequestOps._
    import UpdateGlobalTableSettingsResponseOps._
    toEither(underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava)).right.map(_.toScala)
  }

  override def updateItem(updateItemRequest: UpdateItemRequest): Either[Throwable, UpdateItemResponse] = {
    import UpdateItemRequestOps._
    import UpdateItemResponseOps._
    toEither(underlying.updateItem(updateItemRequest.toJava)).right.map(_.toScala)
  }

  override def updateTable(updateTableRequest: UpdateTableRequest): Either[Throwable, UpdateTableResponse] = {
    import UpdateTableRequestOps._
    import UpdateTableResponseOps._
    toEither(underlying.updateTable(updateTableRequest.toJava)).right.map(_.toScala)
  }

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Either[Throwable, UpdateTimeToLiveResponse] = {
    import UpdateTimeToLiveRequestOps._
    import UpdateTimeToLiveResponseOps._
    toEither(underlying.updateTimeToLive(updateTimeToLiveRequest.toJava)).right.map(_.toScala)
  }

}
