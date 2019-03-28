// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v1.model._

import scala.concurrent.{ ExecutionContext, Future }

private[dynamodb] class DynamoDBAsyncClientImpl(override val underlying: AmazonDynamoDBAsync)(
    implicit ec: ExecutionContext
) extends DynamoDBAsyncClient {
  import DynamoDBAsyncClient._

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] = {
    import BatchGetItemRequestOps._
    import BatchGetItemResponseOps._
    underlying.batchGetItemAsync(batchGetItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] = {
    import BatchWriteItemRequestOps._
    import BatchWriteItemResponseOps._
    underlying.batchWriteItemAsync(batchWriteItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] = {
    import CreateBackupRequestOps._
    import CreateBackupResponseOps._
    underlying.createBackupAsync(createBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] = {
    import CreateGlobalTableRequestOps._
    import CreateGlobalTableResponseOps._
    underlying.createGlobalTableAsync(createGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] = {
    import CreateTableRequestOps._
    import CreateTableResponseOps._
    underlying.createTableAsync(createTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] = {
    import DeleteBackupRequestOps._
    import DeleteBackupResponseOps._
    underlying.deleteBackupAsync(deleteBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] = {
    import DeleteItemRequestOps._
    import DeleteItemResponseOps._
    underlying.deleteItemAsync(deleteItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] = {
    import DeleteTableRequestOps._
    import DeleteTableResponseOps._
    underlying.deleteTableAsync(deleteTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] = {
    import DescribeBackupRequestOps._
    import DescribeBackupResponseOps._
    underlying.describeBackupAsync(describeBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] = {
    import DescribeContinuousBackupsRequestOps._
    import DescribeContinuousBackupsResponseOps._
    underlying.describeContinuousBackupsAsync(describeContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] = {
    import DescribeEndpointsRequestOps._
    import DescribeEndpointsResponseOps._
    underlying.describeEndpointsAsync(describeEndpointsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] = {
    import DescribeGlobalTableRequestOps._
    import DescribeGlobalTableResponseOps._
    underlying.describeGlobalTableAsync(describeGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] = {
    import DescribeGlobalTableSettingsRequestOps._
    import DescribeGlobalTableSettingsResponseOps._
    underlying.describeGlobalTableSettingsAsync(describeGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] = {
    import DescribeLimitsRequestOps._
    import DescribeLimitsResponseOps._
    underlying.describeLimitsAsync(describeLimitsRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] = {
    import DescribeTableRequestOps._
    import DescribeTableResponseOps._
    underlying.describeTableAsync(describeTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] = {
    import DescribeTimeToLiveRequestOps._
    import DescribeTimeToLiveResponseOps._
    underlying.describeTimeToLiveAsync(describeTimeToLiveRequest.toJava).toFuture.map(_.toScala)
  }

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] = {
    import GetItemRequestOps._
    import GetItemResponseOps._
    underlying.getItemAsync(getItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] = {
    import ListBackupsRequestOps._
    import ListBackupsResponseOps._
    underlying.listBackupsAsync(listBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] = {
    import ListGlobalTablesRequestOps._
    import ListGlobalTablesResponseOps._
    underlying.listGlobalTablesAsync(listGlobalTablesRequest.toJava).toFuture.map(_.toScala)
  }

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] = {
    import ListTablesRequestOps._
    import ListTablesResponseOps._
    underlying.listTablesAsync(listTablesRequest.toJava).toFuture.map(_.toScala)
  }

  override def listTables(): Future[ListTablesResponse] = {

    import ListTablesResponseOps._
    underlying.listTablesAsync().toFuture.map(_.toScala)
  }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] = {
    import ListTagsOfResourceRequestOps._
    import ListTagsOfResourceResponseOps._
    underlying.listTagsOfResourceAsync(listTagsOfResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] = {
    import PutItemRequestOps._
    import PutItemResponseOps._
    underlying.putItemAsync(putItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def query(queryRequest: QueryRequest): Future[QueryResponse] = {
    import QueryRequestOps._
    import QueryResponseOps._
    underlying.queryAsync(queryRequest.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] = {
    import RestoreTableFromBackupRequestOps._
    import RestoreTableFromBackupResponseOps._
    underlying.restoreTableFromBackupAsync(restoreTableFromBackupRequest.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] = {
    import RestoreTableToPointInTimeRequestOps._
    import RestoreTableToPointInTimeResponseOps._
    underlying.restoreTableToPointInTimeAsync(restoreTableToPointInTimeRequest.toJava).toFuture.map(_.toScala)
  }

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] = {
    import ScanRequestOps._
    import ScanResponseOps._
    underlying.scanAsync(scanRequest.toJava).toFuture.map(_.toScala)
  }

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] = {
    import TagResourceRequestOps._
    import TagResourceResponseOps._
    underlying.tagResourceAsync(tagResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] = {
    import TransactGetItemsRequestOps._
    import TransactGetItemsResponseOps._
    underlying.transactGetItemsAsync(transactGetItemsRequest.toJava).toFuture.map(_.toScala)
  }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] = {
    import TransactWriteItemsRequestOps._
    import TransactWriteItemsResponseOps._
    underlying.transactWriteItemsAsync(transactWriteItemsRequest.toJava).toFuture.map(_.toScala)
  }

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] = {
    import UntagResourceRequestOps._
    import UntagResourceResponseOps._
    underlying.untagResourceAsync(untagResourceRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] = {
    import UpdateContinuousBackupsRequestOps._
    import UpdateContinuousBackupsResponseOps._
    underlying.updateContinuousBackupsAsync(updateContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] = {
    import UpdateGlobalTableRequestOps._
    import UpdateGlobalTableResponseOps._
    underlying.updateGlobalTableAsync(updateGlobalTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] = {
    import UpdateGlobalTableSettingsRequestOps._
    import UpdateGlobalTableSettingsResponseOps._
    underlying.updateGlobalTableSettingsAsync(updateGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] = {
    import UpdateItemRequestOps._
    import UpdateItemResponseOps._
    underlying.updateItemAsync(updateItemRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] = {
    import UpdateTableRequestOps._
    import UpdateTableResponseOps._
    underlying.updateTableAsync(updateTableRequest.toJava).toFuture.map(_.toScala)
  }

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] = {
    import UpdateTimeToLiveRequestOps._
    import UpdateTimeToLiveResponseOps._
    underlying.updateTimeToLiveAsync(updateTimeToLiveRequest.toJava).toFuture.map(_.toScala)
  }

}
