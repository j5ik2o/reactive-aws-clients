package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.rs._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

class DynamoDBSyncClientV2Impl(override val underlying: DynamoDbClient) extends DynamoDBSyncClientV2 {
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

  private def toEither[A](f: => A): Either[Throwable, A] = {
    try {
      Right(f)
    } catch {
      case t: Throwable =>
        Left(t)
    }
  }

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Either[Throwable, BatchGetItemResponse] =
    toEither(underlying.batchGetItem(batchGetItemRequest.toJava)).right.map(_.toScala)

  override def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): rs.BatchGetItemIterable =
    new BatchGetItemIterableImpl(underlying.batchGetItemPaginator(batchGetItemRequest.toJava))

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Either[Throwable, BatchWriteItemResponse] =
    toEither(underlying.batchWriteItem(batchWriteItemRequest.toJava)).right.map(_.toScala)

  override def createBackup(createBackupRequest: CreateBackupRequest): Either[Throwable, CreateBackupResponse] =
    toEither(underlying.createBackup(createBackupRequest.toJava)).right.map(_.toScala)

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Either[Throwable, CreateGlobalTableResponse] =
    toEither(underlying.createGlobalTable(createGlobalTableRequest.toJava)).right.map(_.toScala)

  override def createTable(createTableRequest: CreateTableRequest): Either[Throwable, CreateTableResponse] =
    toEither(underlying.createTable(createTableRequest.toJava)).right.map(_.toScala)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Either[Throwable, DeleteBackupResponse] =
    toEither(underlying.deleteBackup(deleteBackupRequest.toJava)).right.map(_.toScala)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Either[Throwable, DeleteItemResponse] =
    toEither(underlying.deleteItem(deleteItemRequest.toJava)).right.map(_.toScala)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Either[Throwable, DeleteTableResponse] =
    toEither(underlying.deleteTable(deleteTableRequest.toJava)).right.map(_.toScala)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Either[Throwable, DescribeBackupResponse] =
    toEither(underlying.describeBackup(describeBackupRequest.toJava)).right.map(_.toScala)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Either[Throwable, DescribeContinuousBackupsResponse] =
    toEither(underlying.describeContinuousBackups(describeContinuousBackupsRequest.toJava)).right.map(_.toScala)

  override def describeEndpoints(): Either[Throwable, DescribeEndpointsResponse] =
    toEither(underlying.describeEndpoints()).right.map(_.toScala)

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Either[Throwable, DescribeEndpointsResponse] =
    toEither(underlying.describeEndpoints(describeEndpointsRequest.toJava)).right.map(_.toScala)

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Either[Throwable, DescribeGlobalTableResponse] =
    toEither(underlying.describeGlobalTable(describeGlobalTableRequest.toJava)).right.map(_.toScala)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Either[Throwable, DescribeGlobalTableSettingsResponse] =
    toEither(underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava)).right.map(_.toScala)

  override def describeLimits(): Either[Throwable, DescribeLimitsResponse] =
    toEither(underlying.describeLimits()).right.map(_.toScala)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Either[Throwable, DescribeLimitsResponse] =
    toEither(underlying.describeLimits(describeLimitsRequest.toJava)).right.map(_.toScala)

  override def describeTable(describeTableRequest: DescribeTableRequest): Either[Throwable, DescribeTableResponse] =
    toEither(underlying.describeTable(describeTableRequest.toJava)).right.map(_.toScala)

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Either[Throwable, DescribeTimeToLiveResponse] =
    toEither(underlying.describeTimeToLive(describeTimeToLiveRequest.toJava)).right.map(_.toScala)

  override def getItem(getItemRequest: GetItemRequest): Either[Throwable, GetItemResponse] =
    toEither(underlying.getItem(getItemRequest.toJava)).right.map(_.toScala)

  override def listBackups(): Either[Throwable, ListBackupsResponse] =
    toEither(underlying.listBackups()).right.map(_.toScala)

  override def listBackups(listBackupsRequest: ListBackupsRequest): Either[Throwable, ListBackupsResponse] =
    toEither(underlying.listBackups(listBackupsRequest.toJava)).right.map(_.toScala)

  override def listGlobalTables(): Either[Throwable, ListGlobalTablesResponse] =
    toEither(underlying.listGlobalTables()).right.map(_.toScala)

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Either[Throwable, ListGlobalTablesResponse] =
    toEither(underlying.listGlobalTables(listGlobalTablesRequest.toJava)).right.map(_.toScala)

  override def listTables(): Either[Throwable, ListTablesResponse] =
    toEither(underlying.listTables()).right.map(_.toScala)

  override def listTables(listTablesRequest: ListTablesRequest): Either[Throwable, ListTablesResponse] =
    toEither(underlying.listTables(listTablesRequest.toJava)).right.map(_.toScala)

  override def listTablesPaginator(): rs.ListTablesIterable =
    new ListTablesIterableImpl(underlying.listTablesPaginator())

  override def listTablesPaginator(listTablesRequest: ListTablesRequest): rs.ListTablesIterable =
    new ListTablesIterableImpl(underlying.listTablesPaginator(listTablesRequest.toJava))

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Either[Throwable, ListTagsOfResourceResponse] =
    toEither(underlying.listTagsOfResource(listTagsOfResourceRequest.toJava)).right.map(_.toScala)

  override def putItem(putItemRequest: PutItemRequest): Either[Throwable, PutItemResponse] =
    toEither(underlying.putItem(putItemRequest.toJava)).right.map(_.toScala)

  override def query(queryRequest: QueryRequest): Either[Throwable, QueryResponse] =
    toEither(underlying.query(queryRequest.toJava)).right.map(_.toScala)

  override def queryPaginator(queryRequest: QueryRequest): rs.QueryIterable =
    new QueryIterableImpl(underlying.queryPaginator(queryRequest.toJava))

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Either[Throwable, RestoreTableFromBackupResponse] =
    toEither(underlying.restoreTableFromBackup(restoreTableFromBackupRequest.toJava)).right.map(_.toScala)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Either[Throwable, RestoreTableToPointInTimeResponse] =
    toEither(underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava)).right.map(_.toScala)

  override def scan(scanRequest: ScanRequest): Either[Throwable, ScanResponse] =
    toEither(underlying.scan(scanRequest.toJava)).right.map(_.toScala)

  override def scanPaginator(scanRequest: ScanRequest): rs.ScanIterable =
    new ScanIterableImpl(underlying.scanPaginator(scanRequest.toJava))

  override def tagResource(tagResourceRequest: TagResourceRequest): Either[Throwable, TagResourceResponse] =
    toEither(underlying.tagResource(tagResourceRequest.toJava)).right.map(_.toScala)

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Either[Throwable, TransactGetItemsResponse] =
    toEither(underlying.transactGetItems(transactGetItemsRequest.toJava)).right.map(_.toScala)

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Either[Throwable, TransactWriteItemsResponse] =
    toEither(underlying.transactWriteItems(transactWriteItemsRequest.toJava)).right.map(_.toScala)

  override def untagResource(untagResourceRequest: UntagResourceRequest): Either[Throwable, UntagResourceResponse] =
    toEither(underlying.untagResource(untagResourceRequest.toJava)).right.map(_.toScala)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Either[Throwable, UpdateContinuousBackupsResponse] =
    toEither(underlying.updateContinuousBackups(updateContinuousBackupsRequest.toJava)).right.map(_.toScala)

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Either[Throwable, UpdateGlobalTableResponse] =
    toEither(underlying.updateGlobalTable(updateGlobalTableRequest.toJava)).right.map(_.toScala)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Either[Throwable, UpdateGlobalTableSettingsResponse] =
    toEither(underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava)).right.map(_.toScala)

  override def updateItem(updateItemRequest: UpdateItemRequest): Either[Throwable, UpdateItemResponse] =
    toEither(underlying.updateItem(updateItemRequest.toJava)).right.map(_.toScala)

  override def updateTable(updateTableRequest: UpdateTableRequest): Either[Throwable, UpdateTableResponse] =
    toEither(underlying.updateTable(updateTableRequest.toJava)).right.map(_.toScala)

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Either[Throwable, UpdateTimeToLiveResponse] =
    toEither(underlying.updateTimeToLive(updateTimeToLiveRequest.toJava)).right.map(_.toScala)

}
