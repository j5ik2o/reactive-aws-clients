// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.aws.dynamodb.cats.{ DynamoDBAsyncClient => BaseDynamoDBAsyncClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.{ ExecutionContext, Future }
object DynamoDBAsyncClient {

  def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends BaseDynamoDBAsyncClient {
  val underlying: DynamoDbAsyncClient

  import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient._

  override def batchGetItem(
      batchGetItemRequest: BatchGetItemRequest
  ): ReaderT[Future, ExecutionContext, BatchGetItemResponse] =
    ReaderT { implicit ec =>
      import BatchGetItemRequestOps._
      import BatchGetItemResponseOps._
      underlying.batchGetItem(batchGetItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def batchWriteItem(
      batchWriteItemRequest: BatchWriteItemRequest
  ): ReaderT[Future, ExecutionContext, BatchWriteItemResponse] =
    ReaderT { implicit ec =>
      import BatchWriteItemRequestOps._
      import BatchWriteItemResponseOps._
      underlying.batchWriteItem(batchWriteItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def createBackup(
      createBackupRequest: CreateBackupRequest
  ): ReaderT[Future, ExecutionContext, CreateBackupResponse] =
    ReaderT { implicit ec =>
      import CreateBackupRequestOps._
      import CreateBackupResponseOps._
      underlying.createBackup(createBackupRequest.toJava).toFuture.map(_.toScala)
    }

  override def createGlobalTable(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, CreateGlobalTableResponse] =
    ReaderT { implicit ec =>
      import CreateGlobalTableRequestOps._
      import CreateGlobalTableResponseOps._
      underlying.createGlobalTable(createGlobalTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def createTable(
      createTableRequest: CreateTableRequest
  ): ReaderT[Future, ExecutionContext, CreateTableResponse] =
    ReaderT { implicit ec =>
      import CreateTableRequestOps._
      import CreateTableResponseOps._
      underlying.createTable(createTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def deleteBackup(
      deleteBackupRequest: DeleteBackupRequest
  ): ReaderT[Future, ExecutionContext, DeleteBackupResponse] =
    ReaderT { implicit ec =>
      import DeleteBackupRequestOps._
      import DeleteBackupResponseOps._
      underlying.deleteBackup(deleteBackupRequest.toJava).toFuture.map(_.toScala)
    }

  override def deleteItem(deleteItemRequest: DeleteItemRequest): ReaderT[Future, ExecutionContext, DeleteItemResponse] =
    ReaderT { implicit ec =>
      import DeleteItemRequestOps._
      import DeleteItemResponseOps._
      underlying.deleteItem(deleteItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def deleteTable(
      deleteTableRequest: DeleteTableRequest
  ): ReaderT[Future, ExecutionContext, DeleteTableResponse] =
    ReaderT { implicit ec =>
      import DeleteTableRequestOps._
      import DeleteTableResponseOps._
      underlying.deleteTable(deleteTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeBackup(
      describeBackupRequest: DescribeBackupRequest
  ): ReaderT[Future, ExecutionContext, DescribeBackupResponse] =
    ReaderT { implicit ec =>
      import DescribeBackupRequestOps._
      import DescribeBackupResponseOps._
      underlying.describeBackup(describeBackupRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, DescribeContinuousBackupsResponse] =
    ReaderT { implicit ec =>
      import DescribeContinuousBackupsRequestOps._
      import DescribeContinuousBackupsResponseOps._
      underlying.describeContinuousBackups(describeContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeEndpoints(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): ReaderT[Future, ExecutionContext, DescribeEndpointsResponse] =
    ReaderT { implicit ec =>
      import DescribeEndpointsRequestOps._
      import DescribeEndpointsResponseOps._
      underlying.describeEndpoints(describeEndpointsRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeGlobalTable(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableResponse] =
    ReaderT { implicit ec =>
      import DescribeGlobalTableRequestOps._
      import DescribeGlobalTableResponseOps._
      underlying.describeGlobalTable(describeGlobalTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableSettingsResponse] =
    ReaderT { implicit ec =>
      import DescribeGlobalTableSettingsRequestOps._
      import DescribeGlobalTableSettingsResponseOps._
      underlying.describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeLimits(
      describeLimitsRequest: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] =
    ReaderT { implicit ec =>
      import DescribeLimitsRequestOps._
      import DescribeLimitsResponseOps._
      underlying.describeLimits(describeLimitsRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeTable(
      describeTableRequest: DescribeTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeTableResponse] =
    ReaderT { implicit ec =>
      import DescribeTableRequestOps._
      import DescribeTableResponseOps._
      underlying.describeTable(describeTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def describeTimeToLive(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, DescribeTimeToLiveResponse] =
    ReaderT { implicit ec =>
      import DescribeTimeToLiveRequestOps._
      import DescribeTimeToLiveResponseOps._
      underlying.describeTimeToLive(describeTimeToLiveRequest.toJava).toFuture.map(_.toScala)
    }

  override def getItem(getItemRequest: GetItemRequest): ReaderT[Future, ExecutionContext, GetItemResponse] =
    ReaderT { implicit ec =>
      import GetItemRequestOps._
      import GetItemResponseOps._
      underlying.getItem(getItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def listBackups(
      listBackupsRequest: ListBackupsRequest
  ): ReaderT[Future, ExecutionContext, ListBackupsResponse] =
    ReaderT { implicit ec =>
      import ListBackupsRequestOps._
      import ListBackupsResponseOps._
      underlying.listBackups(listBackupsRequest.toJava).toFuture.map(_.toScala)
    }

  override def listGlobalTables(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): ReaderT[Future, ExecutionContext, ListGlobalTablesResponse] =
    ReaderT { implicit ec =>
      import ListGlobalTablesRequestOps._
      import ListGlobalTablesResponseOps._
      underlying.listGlobalTables(listGlobalTablesRequest.toJava).toFuture.map(_.toScala)
    }

  override def listTables(listTablesRequest: ListTablesRequest): ReaderT[Future, ExecutionContext, ListTablesResponse] =
    ReaderT { implicit ec =>
      import ListTablesRequestOps._
      import ListTablesResponseOps._
      underlying.listTables(listTablesRequest.toJava).toFuture.map(_.toScala)
    }

  override def listTagsOfResource(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): ReaderT[Future, ExecutionContext, ListTagsOfResourceResponse] =
    ReaderT { implicit ec =>
      import ListTagsOfResourceRequestOps._
      import ListTagsOfResourceResponseOps._
      underlying.listTagsOfResource(listTagsOfResourceRequest.toJava).toFuture.map(_.toScala)
    }

  override def putItem(putItemRequest: PutItemRequest): ReaderT[Future, ExecutionContext, PutItemResponse] =
    ReaderT { implicit ec =>
      import PutItemRequestOps._
      import PutItemResponseOps._
      underlying.putItem(putItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def query(queryRequest: QueryRequest): ReaderT[Future, ExecutionContext, QueryResponse] =
    ReaderT { implicit ec =>
      import QueryRequestOps._
      import QueryResponseOps._
      underlying.query(queryRequest.toJava).toFuture.map(_.toScala)
    }

  override def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableFromBackupResponse] =
    ReaderT { implicit ec =>
      import RestoreTableFromBackupRequestOps._
      import RestoreTableFromBackupResponseOps._
      underlying.restoreTableFromBackup(restoreTableFromBackupRequest.toJava).toFuture.map(_.toScala)
    }

  override def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableToPointInTimeResponse] =
    ReaderT { implicit ec =>
      import RestoreTableToPointInTimeRequestOps._
      import RestoreTableToPointInTimeResponseOps._
      underlying.restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava).toFuture.map(_.toScala)
    }

  override def scan(scanRequest: ScanRequest): ReaderT[Future, ExecutionContext, ScanResponse] =
    ReaderT { implicit ec =>
      import ScanRequestOps._
      import ScanResponseOps._
      underlying.scan(scanRequest.toJava).toFuture.map(_.toScala)
    }

  override def tagResource(
      tagResourceRequest: TagResourceRequest
  ): ReaderT[Future, ExecutionContext, TagResourceResponse] =
    ReaderT { implicit ec =>
      import TagResourceRequestOps._
      import TagResourceResponseOps._
      underlying.tagResource(tagResourceRequest.toJava).toFuture.map(_.toScala)
    }

  override def transactGetItems(
      transactGetItemsRequest: TransactGetItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactGetItemsResponse] =
    ReaderT { implicit ec =>
      import TransactGetItemsRequestOps._
      import TransactGetItemsResponseOps._
      underlying.transactGetItems(transactGetItemsRequest.toJava).toFuture.map(_.toScala)
    }

  override def transactWriteItems(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactWriteItemsResponse] =
    ReaderT { implicit ec =>
      import TransactWriteItemsRequestOps._
      import TransactWriteItemsResponseOps._
      underlying.transactWriteItems(transactWriteItemsRequest.toJava).toFuture.map(_.toScala)
    }

  override def untagResource(
      untagResourceRequest: UntagResourceRequest
  ): ReaderT[Future, ExecutionContext, UntagResourceResponse] =
    ReaderT { implicit ec =>
      import UntagResourceRequestOps._
      import UntagResourceResponseOps._
      underlying.untagResource(untagResourceRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, UpdateContinuousBackupsResponse] =
    ReaderT { implicit ec =>
      import UpdateContinuousBackupsRequestOps._
      import UpdateContinuousBackupsResponseOps._
      underlying.updateContinuousBackups(updateContinuousBackupsRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateGlobalTable(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableResponse] =
    ReaderT { implicit ec =>
      import UpdateGlobalTableRequestOps._
      import UpdateGlobalTableResponseOps._
      underlying.updateGlobalTable(updateGlobalTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableSettingsResponse] =
    ReaderT { implicit ec =>
      import UpdateGlobalTableSettingsRequestOps._
      import UpdateGlobalTableSettingsResponseOps._
      underlying.updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateItem(updateItemRequest: UpdateItemRequest): ReaderT[Future, ExecutionContext, UpdateItemResponse] =
    ReaderT { implicit ec =>
      import UpdateItemRequestOps._
      import UpdateItemResponseOps._
      underlying.updateItem(updateItemRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateTable(
      updateTableRequest: UpdateTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateTableResponse] =
    ReaderT { implicit ec =>
      import UpdateTableRequestOps._
      import UpdateTableResponseOps._
      underlying.updateTable(updateTableRequest.toJava).toFuture.map(_.toScala)
    }

  override def updateTimeToLive(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, UpdateTimeToLiveResponse] =
    ReaderT { implicit ec =>
      import UpdateTimeToLiveRequestOps._
      import UpdateTimeToLiveResponseOps._
      underlying.updateTimeToLive(updateTimeToLiveRequest.toJava).toFuture.map(_.toScala)
    }

}
