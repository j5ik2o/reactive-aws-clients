package com.github.j5ik2o.reactive.aws.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.model._

import scala.concurrent.{ ExecutionContext, Future }

private[dynamodb] class DynamoDBAsyncClientV1Impl(override val underlying: AmazonDynamoDBAsync)(
    implicit ec: ExecutionContext
) extends DynamoDBAsyncClientV1 {
  import DynamoDBAsyncClientV1._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.BatchGetItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.BatchGetItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.BatchWriteItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.BatchWriteItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.CreateTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DeleteTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeEndpointsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeEndpointsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.DescribeTimeToLiveResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.GetItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.GetItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListGlobalTablesRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListGlobalTablesResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListTablesRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListTablesResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListTagsOfResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ListTagsOfResourceResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.PutItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.PutItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.QueryRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.QueryResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.RestoreTableFromBackupRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.RestoreTableFromBackupResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.RestoreTableToPointInTimeRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.RestoreTableToPointInTimeResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ScanRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.ScanResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TagResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TagResourceResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TransactGetItemsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TransactGetItemsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TransactWriteItemsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.TransactWriteItemsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateItemRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateItemResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateTableRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateTableResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UpdateTimeToLiveResponseOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UntagResourceRequestOps._
  import com.github.j5ik2o.reactive.aws.dynamodb.model.v1.UntagResourceResponseOps._

  override def batchGetItem(
      request: BatchGetItemRequest
  ): Future[BatchGetItemResponse] = underlying.batchGetItemAsync(request.toJava).toFuture.map(_.toScala)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] =
    underlying.batchWriteItemAsync(batchWriteItemRequest.toJava).toFuture.map(_.toScala)

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] =
    underlying.createBackupAsync(createBackupRequest.toJava).toFuture.map(_.toScala)

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] =
    underlying.createGlobalTableAsync(createGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] =
    underlying.createTableAsync(createTableRequest.toJava).toFuture.map(_.toScala)

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] =
    underlying.deleteBackupAsync(deleteBackupRequest.toJava).toFuture.map(_.toScala)

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] =
    underlying.deleteItemAsync(deleteItemRequest.toJava).toFuture.map(_.toScala)

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] =
    underlying.deleteTableAsync(deleteTableRequest.toJava).toFuture.map(_.toScala)

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] =
    underlying.describeBackupAsync(describeBackupRequest.toJava).toFuture.map(_.toScala)

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackupsAsync(describeContinuousBackupsRequest.toJava).toFuture.map(_.toScala)

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] =
    underlying.describeEndpointsAsync(describeEndpointsRequest.toJava).toFuture.map(_.toScala)

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] =
    underlying.describeGlobalTableAsync(describeGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettingsAsync(describeGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlying.describeLimitsAsync(describeLimitsRequest.toJava).toFuture.map(_.toScala)

  override def describeTable(describeTableRequest: model.DescribeTableRequest): Future[model.DescribeTableResponse] =
    underlying.describeTableAsync(describeTableRequest.toJava).toFuture.map(_.toScala)

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] =
    underlying.describeTimeToLiveAsync(describeTimeToLiveRequest.toJava).toFuture.map(_.toScala)

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] =
    underlying.getItemAsync(getItemRequest.toJava).toFuture.map(_.toScala)

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] =
    underlying.listBackupsAsync(listBackupsRequest.toJava).toFuture.map(_.toScala)

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTablesAsync(listGlobalTablesRequest.toJava).toFuture.map(_.toScala)

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] =
    underlying.listTablesAsync(listTablesRequest.toJava).toFuture.map(_.toScala)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] =
    underlying.listTagsOfResourceAsync(listTagsOfResourceRequest.toJava).toFuture.map(_.toScala)

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] =
    underlying.putItemAsync(putItemRequest.toJava).toFuture.map(_.toScala)

  override def query(queryRequest: QueryRequest): Future[QueryResponse] =
    underlying.queryAsync(queryRequest.toJava).toFuture.map(_.toScala)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackupAsync(restoreTableFromBackupRequest.toJava).toFuture.map(_.toScala)

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTimeAsync(restoreTableToPointInTimeRequest.toJava).toFuture.map(_.toScala)

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] =
    underlying.scanAsync(scanRequest.toJava).toFuture.map(_.toScala)

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResourceAsync(tagResourceRequest.toJava).toFuture.map(_.toScala)

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] =
    underlying.transactGetItemsAsync(transactGetItemsRequest.toJava).toFuture.map(_.toScala)

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] =
    underlying.transactWriteItemsAsync(transactWriteItemsRequest.toJava).toFuture.map(_.toScala)

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackupsAsync(updateContinuousBackupsRequest.toJava).toFuture.map(_.toScala)

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResourceAsync(untagResourceRequest.toJava).toFuture.map(_.toScala)

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] =
    underlying.updateGlobalTableAsync(updateGlobalTableRequest.toJava).toFuture.map(_.toScala)

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettingsAsync(updateGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] =
    underlying.updateItemAsync(updateItemRequest.toJava).toFuture.map(_.toScala)

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] =
    underlying.updateTableAsync(updateTableRequest.toJava).toFuture.map(_.toScala)

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] =
    underlying.updateTimeToLiveAsync(updateTimeToLiveRequest.toJava).toFuture.map(_.toScala)

}
