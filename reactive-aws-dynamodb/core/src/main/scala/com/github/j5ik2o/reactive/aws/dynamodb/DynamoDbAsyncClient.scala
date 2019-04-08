// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }
import software.amazon.awssdk.services.dynamodb.paginators._

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object DynamoDbAsyncClient {

  def apply(javaClient: JavaDynamoDbAsyncClient): DynamoDbAsyncClient =
    new DynamoDbAsyncClient {
      override val underlying: JavaDynamoDbAsyncClient = javaClient
    }

}

trait DynamoDbAsyncClient extends DynamoDbClient[Future] {
  val underlying: JavaDynamoDbAsyncClient

  override def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] =
    underlying.batchGetItem(batchGetItemRequest).toScala

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  override def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] =
    underlying.batchWriteItem(batchWriteItemRequest).toScala

  override def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] =
    underlying.createBackup(createBackupRequest).toScala

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResponse] =
    underlying.createGlobalTable(createGlobalTableRequest).toScala

  override def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] =
    underlying.createTable(createTableRequest).toScala

  override def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] =
    underlying.deleteBackup(deleteBackupRequest).toScala

  override def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] =
    underlying.deleteItem(deleteItemRequest).toScala

  override def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] =
    underlying.deleteTable(deleteTableRequest).toScala

  override def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] =
    underlying.describeBackup(describeBackupRequest).toScala

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] =
    underlying.describeContinuousBackups(describeContinuousBackupsRequest).toScala

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResponse] =
    underlying.describeEndpoints(describeEndpointsRequest).toScala

  override def describeEndpoints(): Future[DescribeEndpointsResponse] =
    underlying.describeEndpoints().toScala

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResponse] =
    underlying.describeGlobalTable(describeGlobalTableRequest).toScala

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] =
    underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest).toScala

  override def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlying.describeLimits(describeLimitsRequest).toScala

  override def describeLimits(): Future[DescribeLimitsResponse] =
    underlying.describeLimits().toScala

  override def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] =
    underlying.describeTable(describeTableRequest).toScala

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResponse] =
    underlying.describeTimeToLive(describeTimeToLiveRequest).toScala

  override def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] =
    underlying.getItem(getItemRequest).toScala

  override def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] =
    underlying.listBackups(listBackupsRequest).toScala

  override def listBackups(): Future[ListBackupsResponse] =
    underlying.listBackups().toScala

  override def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTables(listGlobalTablesRequest).toScala

  override def listGlobalTables(): Future[ListGlobalTablesResponse] =
    underlying.listGlobalTables().toScala

  override def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] =
    underlying.listTables(listTablesRequest).toScala

  override def listTables(): Future[ListTablesResponse] =
    underlying.listTables().toScala

  def listTablesPaginator(): ListTablesPublisher =
    underlying.listTablesPaginator()

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResponse] =
    underlying.listTagsOfResource(listTagsOfResourceRequest).toScala

  override def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] =
    underlying.putItem(putItemRequest).toScala

  override def query(queryRequest: QueryRequest): Future[QueryResponse] =
    underlying.query(queryRequest).toScala

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher =
    underlying.queryPaginator(queryRequest)

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] =
    underlying.restoreTableFromBackup(restoreTableFromBackupRequest).toScala

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] =
    underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest).toScala

  override def scan(scanRequest: ScanRequest): Future[ScanResponse] =
    underlying.scan(scanRequest).toScala

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher =
    underlying.scanPaginator(scanRequest)

  override def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlying.tagResource(tagResourceRequest).toScala

  override def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] =
    underlying.transactGetItems(transactGetItemsRequest).toScala

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResponse] =
    underlying.transactWriteItems(transactWriteItemsRequest).toScala

  override def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlying.untagResource(untagResourceRequest).toScala

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] =
    underlying.updateContinuousBackups(updateContinuousBackupsRequest).toScala

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResponse] =
    underlying.updateGlobalTable(updateGlobalTableRequest).toScala

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] =
    underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest).toScala

  override def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] =
    underlying.updateItem(updateItemRequest).toScala

  override def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] =
    underlying.updateTable(updateTableRequest).toScala

  override def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] =
    underlying.updateTimeToLive(updateTimeToLiveRequest).toScala

}
