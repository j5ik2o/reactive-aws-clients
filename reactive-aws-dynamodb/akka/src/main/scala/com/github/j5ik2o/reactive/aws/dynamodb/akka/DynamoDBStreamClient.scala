package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Flow
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient
import com.github.j5ik2o.reactive.aws.dynamodb.model._

import scala.concurrent.Future

object DynamoDBStreamClient {

  def apply(underlying: DynamoDBClient[Future]): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

}
trait DynamoDBStreamClient {

  val underlying: DynamoDBClient[Future]

  def batchGetItemFlow(
      parallelism: Int = 1
  ): Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].mapAsync(parallelism) { request =>
      underlying.batchGetItem(request)
    }

  def batchWriteItemFlow(
      parallelism: Int = 1
  ): Flow[BatchWriteItemRequest, BatchWriteItemResponse, NotUsed] =
    Flow[BatchWriteItemRequest].mapAsync(parallelism) { request =>
      underlying.batchWriteItem(request)
    }

  def createBackupFlow(
      parallelism: Int = 1
  ): Flow[CreateBackupRequest, CreateBackupResponse, NotUsed] =
    Flow[CreateBackupRequest].mapAsync(parallelism) { request =>
      underlying.createBackup(request)
    }

  def createGlobalTableFlow(
      parallelism: Int = 1
  ): Flow[CreateGlobalTableRequest, CreateGlobalTableResponse, NotUsed] =
    Flow[CreateGlobalTableRequest].mapAsync(parallelism) { request =>
      underlying.createGlobalTable(request)
    }

  def createTableFlow(
      parallelism: Int = 1
  ): Flow[CreateTableRequest, CreateTableResponse, NotUsed] =
    Flow[CreateTableRequest].mapAsync(parallelism) { request =>
      underlying.createTable(request)
    }

  def deleteBackupFlow(
      parallelism: Int = 1
  ): Flow[DeleteBackupRequest, DeleteBackupResponse, NotUsed] =
    Flow[DeleteBackupRequest].mapAsync(parallelism) { request =>
      underlying.deleteBackup(request)
    }

  def deleteItemFlow(
      parallelism: Int = 1
  ): Flow[DeleteItemRequest, DeleteItemResponse, NotUsed] =
    Flow[DeleteItemRequest].mapAsync(parallelism) { request =>
      underlying.deleteItem(request)
    }

  def deleteTableFlow(
      parallelism: Int = 1
  ): Flow[DeleteTableRequest, DeleteTableResponse, NotUsed] =
    Flow[DeleteTableRequest].mapAsync(parallelism) { request =>
      underlying.deleteTable(request)
    }

  def describeBackupFlow(
      parallelism: Int = 1
  ): Flow[DescribeBackupRequest, DescribeBackupResponse, NotUsed] =
    Flow[DescribeBackupRequest].mapAsync(parallelism) { request =>
      underlying.describeBackup(request)
    }

  def describeContinuousBackupsFlow(
      parallelism: Int = 1
  ): Flow[DescribeContinuousBackupsRequest, DescribeContinuousBackupsResponse, NotUsed] =
    Flow[DescribeContinuousBackupsRequest].mapAsync(parallelism) { request =>
      underlying.describeContinuousBackups(request)
    }

  def describeEndpointsFlow(
      parallelism: Int = 1
  ): Flow[DescribeEndpointsRequest, DescribeEndpointsResponse, NotUsed] =
    Flow[DescribeEndpointsRequest].mapAsync(parallelism) { request =>
      underlying.describeEndpoints(request)
    }

  def describeGlobalTableFlow(
      parallelism: Int = 1
  ): Flow[DescribeGlobalTableRequest, DescribeGlobalTableResponse, NotUsed] =
    Flow[DescribeGlobalTableRequest].mapAsync(parallelism) { request =>
      underlying.describeGlobalTable(request)
    }

  def describeGlobalTableSettingsFlow(
      parallelism: Int = 1
  ): Flow[DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResponse, NotUsed] =
    Flow[DescribeGlobalTableSettingsRequest].mapAsync(parallelism) { request =>
      underlying.describeGlobalTableSettings(request)
    }

  def describeLimitsFlow(parallelism: Int = 1): Flow[DescribeLimitsRequest, DescribeLimitsResponse, NotUsed] =
    Flow[DescribeLimitsRequest].mapAsync(parallelism) { request =>
      underlying.describeLimits(request)
    }

  def describeTableFlow(parallelism: Int = 1): Flow[DescribeTableRequest, DescribeTableResponse, NotUsed] =
    Flow[DescribeTableRequest].mapAsync(parallelism) { request =>
      underlying.describeTable(request)
    }

  def describeTimeToLiveFlow(
      parallelism: Int = 1
  ): Flow[DescribeTimeToLiveRequest, DescribeTimeToLiveResponse, NotUsed] =
    Flow[DescribeTimeToLiveRequest].mapAsync(parallelism) { request =>
      underlying.describeTimeToLive(request)
    }

  def getItemFlow(parallelism: Int = 1): Flow[GetItemRequest, GetItemResponse, NotUsed] =
    Flow[GetItemRequest].mapAsync(parallelism) { request =>
      underlying.getItem(request)
    }

  def listBackupsFlow(parallelism: Int = 1): Flow[ListBackupsRequest, ListBackupsResponse, NotUsed] =
    Flow[ListBackupsRequest].mapAsync(parallelism) { request =>
      underlying.listBackups(request)
    }

  def listGlobalTablesFlow(parallelism: Int = 1): Flow[ListGlobalTablesRequest, ListGlobalTablesResponse, NotUsed] =
    Flow[ListGlobalTablesRequest].mapAsync(parallelism) { request =>
      underlying.listGlobalTables(request)
    }

  def listTablesFlow(parallelism: Int = 1): Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].mapAsync(parallelism) { request =>
      underlying.listTables(request)
    }

  def listTagsOfResourceFlow(
      parallelism: Int = 1
  ): Flow[ListTagsOfResourceRequest, ListTagsOfResourceResponse, NotUsed] =
    Flow[ListTagsOfResourceRequest].mapAsync(parallelism) { request =>
      underlying.listTagsOfResource(request)
    }

  def putItemFlow(parallelism: Int = 1): Flow[PutItemRequest, PutItemResponse, NotUsed] =
    Flow[PutItemRequest].mapAsync(parallelism) { request =>
      underlying.putItem(request)
    }

  def queryFlow(parallelism: Int = 1): Flow[QueryRequest, QueryResponse, NotUsed] =
    Flow[QueryRequest].mapAsync(parallelism) { request =>
      underlying.query(request)
    }

  def restoreTableFromBackupFlow(
      parallelism: Int = 1
  ): Flow[RestoreTableFromBackupRequest, RestoreTableFromBackupResponse, NotUsed] =
    Flow[RestoreTableFromBackupRequest].mapAsync(parallelism) { request =>
      underlying.restoreTableFromBackup(request)
    }

  def restoreTableToPointInTimeFlow(
      parallelism: Int = 1
  ): Flow[RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResponse, NotUsed] =
    Flow[RestoreTableToPointInTimeRequest].mapAsync(parallelism) { request =>
      underlying.restoreTableToPointInTime(request)
    }

  def scanFlow(parallelism: Int = 1): Flow[ScanRequest, ScanResponse, NotUsed] =
    Flow[ScanRequest].mapAsync(parallelism) { request =>
      underlying.scan(request)
    }

  def tagResourceFlow(parallelism: Int = 1): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { request =>
      underlying.tagResource(request)
    }

  def transactGetItemsFlow(parallelism: Int = 1): Flow[TransactGetItemsRequest, TransactGetItemsResponse, NotUsed] =
    Flow[TransactGetItemsRequest].mapAsync(parallelism) { request =>
      underlying.transactGetItems(request)
    }

  def transactWriteItemsFlow(
      parallelism: Int = 1
  ): Flow[TransactWriteItemsRequest, TransactWriteItemsResponse, NotUsed] =
    Flow[TransactWriteItemsRequest].mapAsync(parallelism) { request =>
      underlying.transactWriteItems(request)
    }

  def untagResourceFlow(parallelism: Int = 1): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { request =>
      underlying.untagResource(request)
    }

  def updateContinuousBackupsFlow(
      parallelism: Int = 1
  ): Flow[UpdateContinuousBackupsRequest, UpdateContinuousBackupsResponse, NotUsed] =
    Flow[UpdateContinuousBackupsRequest].mapAsync(parallelism) { request =>
      underlying.updateContinuousBackups(request)
    }

  def updateGlobalTableFlow(parallelism: Int = 1): Flow[UpdateGlobalTableRequest, UpdateGlobalTableResponse, NotUsed] =
    Flow[UpdateGlobalTableRequest].mapAsync(parallelism) { request =>
      underlying.updateGlobalTable(request)
    }

  def updateGlobalTableSettingsFlow(
      parallelism: Int = 1
  ): Flow[UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResponse, NotUsed] =
    Flow[UpdateGlobalTableSettingsRequest].mapAsync(parallelism) { request =>
      underlying.updateGlobalTableSettings(request)
    }

  def updateItemFlow(parallelism: Int = 1): Flow[UpdateItemRequest, UpdateItemResponse, NotUsed] =
    Flow[UpdateItemRequest].mapAsync(parallelism) { request =>
      underlying.updateItem(request)
    }

  def updateTimeToLive(parallelism: Int = 1): Flow[UpdateTimeToLiveRequest, UpdateTimeToLiveResponse, NotUsed] =
    Flow[UpdateTimeToLiveRequest].mapAsync(parallelism) { request =>
      underlying.updateTimeToLive(request)
    }

}
