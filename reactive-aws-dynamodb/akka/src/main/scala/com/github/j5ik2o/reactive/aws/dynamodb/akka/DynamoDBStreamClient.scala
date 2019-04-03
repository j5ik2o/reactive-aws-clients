// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClient
import software.amazon.awssdk.services.dynamodb.model._

import scala.concurrent.Future

object DynamoDBStreamClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

  val DefaultParallelism: Int = 1

}

trait DynamoDBStreamClient extends DynamoDBStreamClientSupport {

  import DynamoDBStreamClient._

  val underlying: DynamoDBAsyncClient

  def batchGetItemSource(batchGetItemRequest: BatchGetItemRequest,
                         parallelism: Int = DefaultParallelism): Source[BatchGetItemResponse, NotUsed] =
    Source.single(batchGetItemRequest).via(batchGetItemFlow(parallelism))

  def batchGetItemFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].mapAsync(parallelism)(underlying.batchGetItem)

  def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.batchGetItemPaginator(request))
    }

  def batchWriteItemSource(batchWriteItemRequest: BatchWriteItemRequest,
                           parallelism: Int = DefaultParallelism): Source[BatchWriteItemResponse, NotUsed] =
    Source.single(batchWriteItemRequest).via(batchWriteItemFlow(parallelism))

  def batchWriteItemFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[BatchWriteItemRequest, BatchWriteItemResponse, NotUsed] =
    Flow[BatchWriteItemRequest].mapAsync(parallelism)(underlying.batchWriteItem)

  def createBackupSource(createBackupRequest: CreateBackupRequest,
                         parallelism: Int = DefaultParallelism): Source[CreateBackupResponse, NotUsed] =
    Source.single(createBackupRequest).via(createBackupFlow(parallelism))

  def createBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateBackupRequest, CreateBackupResponse, NotUsed] =
    Flow[CreateBackupRequest].mapAsync(parallelism)(underlying.createBackup)

  def createGlobalTableSource(createGlobalTableRequest: CreateGlobalTableRequest,
                              parallelism: Int = DefaultParallelism): Source[CreateGlobalTableResponse, NotUsed] =
    Source.single(createGlobalTableRequest).via(createGlobalTableFlow(parallelism))

  def createGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[CreateGlobalTableRequest, CreateGlobalTableResponse, NotUsed] =
    Flow[CreateGlobalTableRequest].mapAsync(parallelism)(underlying.createGlobalTable)

  def createTableSource(createTableRequest: CreateTableRequest,
                        parallelism: Int = DefaultParallelism): Source[CreateTableResponse, NotUsed] =
    Source.single(createTableRequest).via(createTableFlow(parallelism))

  def createTableFlow(parallelism: Int = DefaultParallelism): Flow[CreateTableRequest, CreateTableResponse, NotUsed] =
    Flow[CreateTableRequest].mapAsync(parallelism)(underlying.createTable)

  def deleteBackupSource(deleteBackupRequest: DeleteBackupRequest,
                         parallelism: Int = DefaultParallelism): Source[DeleteBackupResponse, NotUsed] =
    Source.single(deleteBackupRequest).via(deleteBackupFlow(parallelism))

  def deleteBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteBackupRequest, DeleteBackupResponse, NotUsed] =
    Flow[DeleteBackupRequest].mapAsync(parallelism)(underlying.deleteBackup)

  def deleteItemSource(deleteItemRequest: DeleteItemRequest,
                       parallelism: Int = DefaultParallelism): Source[DeleteItemResponse, NotUsed] =
    Source.single(deleteItemRequest).via(deleteItemFlow(parallelism))

  def deleteItemFlow(parallelism: Int = DefaultParallelism): Flow[DeleteItemRequest, DeleteItemResponse, NotUsed] =
    Flow[DeleteItemRequest].mapAsync(parallelism)(underlying.deleteItem)

  def deleteTableSource(deleteTableRequest: DeleteTableRequest,
                        parallelism: Int = DefaultParallelism): Source[DeleteTableResponse, NotUsed] =
    Source.single(deleteTableRequest).via(deleteTableFlow(parallelism))

  def deleteTableFlow(parallelism: Int = DefaultParallelism): Flow[DeleteTableRequest, DeleteTableResponse, NotUsed] =
    Flow[DeleteTableRequest].mapAsync(parallelism)(underlying.deleteTable)

  def describeBackupSource(describeBackupRequest: DescribeBackupRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeBackupResponse, NotUsed] =
    Source.single(describeBackupRequest).via(describeBackupFlow(parallelism))

  def describeBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeBackupRequest, DescribeBackupResponse, NotUsed] =
    Flow[DescribeBackupRequest].mapAsync(parallelism)(underlying.describeBackup)

  def describeContinuousBackupsSource(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeContinuousBackupsResponse, NotUsed] =
    Source.single(describeContinuousBackupsRequest).via(describeContinuousBackupsFlow(parallelism))

  def describeContinuousBackupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeContinuousBackupsRequest, DescribeContinuousBackupsResponse, NotUsed] =
    Flow[DescribeContinuousBackupsRequest].mapAsync(parallelism)(underlying.describeContinuousBackups)

  def describeEndpointsSource(describeEndpointsRequest: DescribeEndpointsRequest,
                              parallelism: Int = DefaultParallelism): Source[DescribeEndpointsResponse, NotUsed] =
    Source.single(describeEndpointsRequest).via(describeEndpointsFlow(parallelism))

  def describeEndpointsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeEndpointsRequest, DescribeEndpointsResponse, NotUsed] =
    Flow[DescribeEndpointsRequest].mapAsync(parallelism)(underlying.describeEndpoints)

  def describeGlobalTableSource(describeGlobalTableRequest: DescribeGlobalTableRequest,
                                parallelism: Int = DefaultParallelism): Source[DescribeGlobalTableResponse, NotUsed] =
    Source.single(describeGlobalTableRequest).via(describeGlobalTableFlow(parallelism))

  def describeGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeGlobalTableRequest, DescribeGlobalTableResponse, NotUsed] =
    Flow[DescribeGlobalTableRequest].mapAsync(parallelism)(underlying.describeGlobalTable)

  def describeGlobalTableSettingsSource(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeGlobalTableSettingsResponse, NotUsed] =
    Source.single(describeGlobalTableSettingsRequest).via(describeGlobalTableSettingsFlow(parallelism))

  def describeGlobalTableSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResponse, NotUsed] =
    Flow[DescribeGlobalTableSettingsRequest].mapAsync(parallelism)(underlying.describeGlobalTableSettings)

  def describeLimitsSource(describeLimitsRequest: DescribeLimitsRequest,
                           parallelism: Int = DefaultParallelism): Source[DescribeLimitsResponse, NotUsed] =
    Source.single(describeLimitsRequest).via(describeLimitsFlow(parallelism))

  def describeLimitsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeLimitsRequest, DescribeLimitsResponse, NotUsed] =
    Flow[DescribeLimitsRequest].mapAsync(parallelism)(underlying.describeLimits)

  def describeTableSource(describeTableRequest: DescribeTableRequest,
                          parallelism: Int = DefaultParallelism): Source[DescribeTableResponse, NotUsed] =
    Source.single(describeTableRequest).via(describeTableFlow(parallelism))

  def describeTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTableRequest, DescribeTableResponse, NotUsed] =
    Flow[DescribeTableRequest].mapAsync(parallelism)(underlying.describeTable)

  def describeTimeToLiveSource(describeTimeToLiveRequest: DescribeTimeToLiveRequest,
                               parallelism: Int = DefaultParallelism): Source[DescribeTimeToLiveResponse, NotUsed] =
    Source.single(describeTimeToLiveRequest).via(describeTimeToLiveFlow(parallelism))

  def describeTimeToLiveFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeTimeToLiveRequest, DescribeTimeToLiveResponse, NotUsed] =
    Flow[DescribeTimeToLiveRequest].mapAsync(parallelism)(underlying.describeTimeToLive)

  def getItemSource(getItemRequest: GetItemRequest,
                    parallelism: Int = DefaultParallelism): Source[GetItemResponse, NotUsed] =
    Source.single(getItemRequest).via(getItemFlow(parallelism))

  def getItemFlow(parallelism: Int = DefaultParallelism): Flow[GetItemRequest, GetItemResponse, NotUsed] =
    Flow[GetItemRequest].mapAsync(parallelism)(underlying.getItem)

  def listBackupsSource(listBackupsRequest: ListBackupsRequest,
                        parallelism: Int = DefaultParallelism): Source[ListBackupsResponse, NotUsed] =
    Source.single(listBackupsRequest).via(listBackupsFlow(parallelism))

  def listBackupsFlow(parallelism: Int = DefaultParallelism): Flow[ListBackupsRequest, ListBackupsResponse, NotUsed] =
    Flow[ListBackupsRequest].mapAsync(parallelism)(underlying.listBackups)

  def listGlobalTablesSource(listGlobalTablesRequest: ListGlobalTablesRequest,
                             parallelism: Int = DefaultParallelism): Source[ListGlobalTablesResponse, NotUsed] =
    Source.single(listGlobalTablesRequest).via(listGlobalTablesFlow(parallelism))

  def listGlobalTablesFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListGlobalTablesRequest, ListGlobalTablesResponse, NotUsed] =
    Flow[ListGlobalTablesRequest].mapAsync(parallelism)(underlying.listGlobalTables)

  def listTablesSource(listTablesRequest: ListTablesRequest,
                       parallelism: Int = DefaultParallelism): Source[ListTablesResponse, NotUsed] =
    Source.single(listTablesRequest).via(listTablesFlow(parallelism))

  def listTablesFlow(parallelism: Int = DefaultParallelism): Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].mapAsync(parallelism)(underlying.listTables)

  def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed] = Flow[ListTablesRequest].flatMapConcat {
    request =>
      Source.fromPublisher(underlying.listTablesPaginator(request))
  }

  def listTagsOfResourceSource(listTagsOfResourceRequest: ListTagsOfResourceRequest,
                               parallelism: Int = DefaultParallelism): Source[ListTagsOfResourceResponse, NotUsed] =
    Source.single(listTagsOfResourceRequest).via(listTagsOfResourceFlow(parallelism))

  def listTagsOfResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsOfResourceRequest, ListTagsOfResourceResponse, NotUsed] =
    Flow[ListTagsOfResourceRequest].mapAsync(parallelism)(underlying.listTagsOfResource)

  def putItemSource(putItemRequest: PutItemRequest,
                    parallelism: Int = DefaultParallelism): Source[PutItemResponse, NotUsed] =
    Source.single(putItemRequest).via(putItemFlow(parallelism))

  def putItemFlow(parallelism: Int = DefaultParallelism): Flow[PutItemRequest, PutItemResponse, NotUsed] =
    Flow[PutItemRequest].mapAsync(parallelism)(underlying.putItem)

  def querySource(queryRequest: QueryRequest, parallelism: Int = DefaultParallelism): Source[QueryResponse, NotUsed] =
    Source.single(queryRequest).via(queryFlow(parallelism))

  def queryFlow(parallelism: Int = DefaultParallelism): Flow[QueryRequest, QueryResponse, NotUsed] =
    Flow[QueryRequest].mapAsync(parallelism)(underlying.query)

  def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed] = Flow[QueryRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.queryPaginator(request))
  }

  def restoreTableFromBackupSource(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestoreTableFromBackupResponse, NotUsed] =
    Source.single(restoreTableFromBackupRequest).via(restoreTableFromBackupFlow(parallelism))

  def restoreTableFromBackupFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreTableFromBackupRequest, RestoreTableFromBackupResponse, NotUsed] =
    Flow[RestoreTableFromBackupRequest].mapAsync(parallelism)(underlying.restoreTableFromBackup)

  def restoreTableToPointInTimeSource(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest,
      parallelism: Int = DefaultParallelism
  ): Source[RestoreTableToPointInTimeResponse, NotUsed] =
    Source.single(restoreTableToPointInTimeRequest).via(restoreTableToPointInTimeFlow(parallelism))

  def restoreTableToPointInTimeFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResponse, NotUsed] =
    Flow[RestoreTableToPointInTimeRequest].mapAsync(parallelism)(underlying.restoreTableToPointInTime)

  def scanSource(scanRequest: ScanRequest, parallelism: Int = DefaultParallelism): Source[ScanResponse, NotUsed] =
    Source.single(scanRequest).via(scanFlow(parallelism))

  def scanFlow(parallelism: Int = DefaultParallelism): Flow[ScanRequest, ScanResponse, NotUsed] =
    Flow[ScanRequest].mapAsync(parallelism)(underlying.scan)

  def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed] = Flow[ScanRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.scanPaginator(request))
  }

  def tagResourceSource(tagResourceRequest: TagResourceRequest,
                        parallelism: Int = DefaultParallelism): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism)(underlying.tagResource)

  def transactGetItemsSource(transactGetItemsRequest: TransactGetItemsRequest,
                             parallelism: Int = DefaultParallelism): Source[TransactGetItemsResponse, NotUsed] =
    Source.single(transactGetItemsRequest).via(transactGetItemsFlow(parallelism))

  def transactGetItemsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TransactGetItemsRequest, TransactGetItemsResponse, NotUsed] =
    Flow[TransactGetItemsRequest].mapAsync(parallelism)(underlying.transactGetItems)

  def transactWriteItemsSource(transactWriteItemsRequest: TransactWriteItemsRequest,
                               parallelism: Int = DefaultParallelism): Source[TransactWriteItemsResponse, NotUsed] =
    Source.single(transactWriteItemsRequest).via(transactWriteItemsFlow(parallelism))

  def transactWriteItemsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[TransactWriteItemsRequest, TransactWriteItemsResponse, NotUsed] =
    Flow[TransactWriteItemsRequest].mapAsync(parallelism)(underlying.transactWriteItems)

  def untagResourceSource(untagResourceRequest: UntagResourceRequest,
                          parallelism: Int = DefaultParallelism): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism)(underlying.untagResource)

  def updateContinuousBackupsSource(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateContinuousBackupsResponse, NotUsed] =
    Source.single(updateContinuousBackupsRequest).via(updateContinuousBackupsFlow(parallelism))

  def updateContinuousBackupsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateContinuousBackupsRequest, UpdateContinuousBackupsResponse, NotUsed] =
    Flow[UpdateContinuousBackupsRequest].mapAsync(parallelism)(underlying.updateContinuousBackups)

  def updateGlobalTableSource(updateGlobalTableRequest: UpdateGlobalTableRequest,
                              parallelism: Int = DefaultParallelism): Source[UpdateGlobalTableResponse, NotUsed] =
    Source.single(updateGlobalTableRequest).via(updateGlobalTableFlow(parallelism))

  def updateGlobalTableFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateGlobalTableRequest, UpdateGlobalTableResponse, NotUsed] =
    Flow[UpdateGlobalTableRequest].mapAsync(parallelism)(underlying.updateGlobalTable)

  def updateGlobalTableSettingsSource(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UpdateGlobalTableSettingsResponse, NotUsed] =
    Source.single(updateGlobalTableSettingsRequest).via(updateGlobalTableSettingsFlow(parallelism))

  def updateGlobalTableSettingsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResponse, NotUsed] =
    Flow[UpdateGlobalTableSettingsRequest].mapAsync(parallelism)(underlying.updateGlobalTableSettings)

  def updateItemSource(updateItemRequest: UpdateItemRequest,
                       parallelism: Int = DefaultParallelism): Source[UpdateItemResponse, NotUsed] =
    Source.single(updateItemRequest).via(updateItemFlow(parallelism))

  def updateItemFlow(parallelism: Int = DefaultParallelism): Flow[UpdateItemRequest, UpdateItemResponse, NotUsed] =
    Flow[UpdateItemRequest].mapAsync(parallelism)(underlying.updateItem)

  def updateTableSource(updateTableRequest: UpdateTableRequest,
                        parallelism: Int = DefaultParallelism): Source[UpdateTableResponse, NotUsed] =
    Source.single(updateTableRequest).via(updateTableFlow(parallelism))

  def updateTableFlow(parallelism: Int = DefaultParallelism): Flow[UpdateTableRequest, UpdateTableResponse, NotUsed] =
    Flow[UpdateTableRequest].mapAsync(parallelism)(underlying.updateTable)

  def updateTimeToLiveSource(updateTimeToLiveRequest: UpdateTimeToLiveRequest,
                             parallelism: Int = DefaultParallelism): Source[UpdateTimeToLiveResponse, NotUsed] =
    Source.single(updateTimeToLiveRequest).via(updateTimeToLiveFlow(parallelism))

  def updateTimeToLiveFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UpdateTimeToLiveRequest, UpdateTimeToLiveResponse, NotUsed] =
    Flow[UpdateTimeToLiveRequest].mapAsync(parallelism)(underlying.updateTimeToLive)

}
