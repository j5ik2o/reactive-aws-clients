package com.github.j5ik2o.reactive.dynamodb.cats

import cats.data.ReaderT
import com.github.j5ik2o.reactive.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.concurrent.{ ExecutionContext, Future }

private[cats] class DynamoDBAsyncClientV2Impl(override val underlying: DynamoDbAsyncClient)
    extends DynamoDBAsyncClientV2 {
  import com.github.j5ik2o.reactive.dynamodb.DynamoDBAsyncClientV2._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchGetItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchGetItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchWriteItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.BatchWriteItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.CreateTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DeleteTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeEndpointsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeEndpointsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeLimitsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeLimitsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.DescribeTimeToLiveResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.GetItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.GetItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListGlobalTablesRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListGlobalTablesResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTablesRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTablesResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTagsOfResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ListTagsOfResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.PutItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.PutItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.QueryRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.QueryResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableFromBackupRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableFromBackupResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableToPointInTimeRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.RestoreTableToPointInTimeResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ScanRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.ScanResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TagResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TagResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactGetItemsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactGetItemsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactWriteItemsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.TransactWriteItemsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UntagResourceRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UntagResourceResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateContinuousBackupsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateContinuousBackupsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableSettingsRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateGlobalTableSettingsResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateItemRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateItemResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTableRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTableResponseOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTimeToLiveRequestOps._
  import com.github.j5ik2o.reactive.dynamodb.model.v2.UpdateTimeToLiveResponseOps._

  override def batchGetItem(request: BatchGetItemRequest): ReaderT[Future, ExecutionContext, BatchGetItemResponse] =
    ReaderT { implicit ec =>
      underlying.batchGetItem(request.toJava).toFuture.map(_.toScala)
    }

  override def batchWriteItem(
      request: BatchWriteItemRequest
  ): ReaderT[Future, ExecutionContext, BatchWriteItemResponse] =
    ReaderT { implicit ec =>
      underlying.batchWriteItem(request.toJava).toFuture.map(_.toScala)
    }

  override def createBackup(request: CreateBackupRequest): ReaderT[Future, ExecutionContext, CreateBackupResponse] =
    ReaderT { implicit ec =>
      underlying.createBackup(request.toJava).toFuture.map(_.toScala)
    }

  override def createGlobalTable(
      request: CreateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, CreateGlobalTableResponse] = ReaderT { implicit ec =>
    underlying.createGlobalTable(request.toJava).toFuture.map(_.toScala)
  }

  override def createTable(request: CreateTableRequest): ReaderT[Future, ExecutionContext, CreateTableResponse] =
    ReaderT { implicit ec =>
      underlying.createTable(request.toJava).toFuture.map(_.toScala)
    }

  override def describeContinuousBackups(
      request: DescribeContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, DescribeContinuousBackupsResponse] = ReaderT { implicit ec =>
    underlying.describeContinuousBackups(request.toJava).toFuture.map(_.toScala)
  }

  override def describeEndpoints(
      request: DescribeEndpointsRequest
  ): ReaderT[Future, ExecutionContext, DescribeEndpointsResponse] = ReaderT { implicit ec =>
    underlying.describeEndpoints(request.toJava).toFuture.map(_.toScala)
  }

  override def describeBackup(
      request: DescribeBackupRequest
  ): ReaderT[Future, ExecutionContext, DescribeBackupResponse] = ReaderT { implicit ec =>
    underlying.describeBackup(request.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTable(
      request: DescribeGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableResponse] =
    ReaderT { implicit ec =>
      underlying.describeGlobalTable(request.toJava).toFuture.map(_.toScala)
    }

  override def describeGlobalTableSettings(
      request: DescribeGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableSettingsResponse] = ReaderT { implicit ec =>
    underlying.describeGlobalTableSettings(request.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(
      request: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ReaderT { implicit ec =>
    underlying.describeLimits(request.toJava).toFuture.map(_.toScala)
  }

  override def describeTimeToLive(
      request: DescribeTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, DescribeTimeToLiveResponse] =
    ReaderT { implicit ec =>
      underlying.describeTimeToLive(request.toJava).toFuture.map(_.toScala)
    }

  override def listGlobalTables(
      request: ListGlobalTablesRequest
  ): ReaderT[Future, ExecutionContext, ListGlobalTablesResponse] = ReaderT { implicit ec =>
    underlying.listGlobalTables(request.toJava).toFuture.map(_.toScala)
  }

  override def describeTable(request: DescribeTableRequest): ReaderT[Future, ExecutionContext, DescribeTableResponse] =
    ReaderT { implicit ec =>
      underlying.describeTable(request.toJava).toFuture.map(_.toScala)
    }

  override def deleteBackup(request: DeleteBackupRequest): ReaderT[Future, ExecutionContext, DeleteBackupResponse] =
    ReaderT { implicit ec =>
      underlying.deleteBackup(request.toJava).toFuture.map(_.toScala)
    }

  override def deleteItem(request: DeleteItemRequest): ReaderT[Future, ExecutionContext, DeleteItemResponse] = ReaderT {
    implicit ec =>
      underlying.deleteItem(request.toJava).toFuture.map(_.toScala)
  }

  override def deleteTable(request: DeleteTableRequest): ReaderT[Future, ExecutionContext, DeleteTableResponse] =
    ReaderT { implicit ec =>
      underlying.deleteTable(request.toJava).toFuture.map(_.toScala)
    }

  override def listBackups(request: ListBackupsRequest): ReaderT[Future, ExecutionContext, ListBackupsResponse] =
    ReaderT { implicit ec =>
      underlying.listBackups(request.toJava).toFuture.map(_.toScala)
    }

  override def listTables(request: ListTablesRequest): ReaderT[Future, ExecutionContext, ListTablesResponse] = ReaderT {
    implicit ec =>
      underlying.listTables(request.toJava).toFuture.map(_.toScala)
  }

  override def listTagsOfResource(
      request: ListTagsOfResourceRequest
  ): ReaderT[Future, ExecutionContext, ListTagsOfResourceResponse] =
    ReaderT { implicit ec =>
      underlying.listTagsOfResource(request.toJava).toFuture.map(_.toScala)
    }

  override def putItem(request: PutItemRequest): ReaderT[Future, ExecutionContext, PutItemResponse] = ReaderT {
    implicit ec =>
      underlying.putItem(request.toJava).toFuture.map(_.toScala)
  }

  override def query(request: QueryRequest): ReaderT[Future, ExecutionContext, QueryResponse] = ReaderT { implicit ec =>
    underlying.query(request.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableFromBackup(
      request: RestoreTableFromBackupRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableFromBackupResponse] = ReaderT { implicit ec =>
    underlying.restoreTableFromBackup(request.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      request: RestoreTableToPointInTimeRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableToPointInTimeResponse] = ReaderT { implicit ec =>
    underlying.restoreTableToPointInTime(request.toJava).toFuture.map(_.toScala)
  }

  override def scan(request: ScanRequest): ReaderT[Future, ExecutionContext, ScanResponse] = ReaderT { implicit ec =>
    underlying.scan(request.toJava).toFuture.map(_.toScala)
  }

  override def getItem(request: GetItemRequest): ReaderT[Future, ExecutionContext, GetItemResponse] = ReaderT {
    implicit ec =>
      underlying.getItem(request.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      request: UpdateGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableSettingsResponse] = ReaderT { implicit ec =>
    underlying.updateGlobalTableSettings(request.toJava).toFuture.map(_.toScala)
  }

  override def updateItem(request: UpdateItemRequest): ReaderT[Future, ExecutionContext, UpdateItemResponse] = ReaderT {
    implicit ec =>
      underlying.updateItem(request.toJava).toFuture.map(_.toScala)
  }

  override def updateTable(request: UpdateTableRequest): ReaderT[Future, ExecutionContext, UpdateTableResponse] =
    ReaderT { implicit ec =>
      underlying.updateTable(request.toJava).toFuture.map(_.toScala)
    }

  override def updateTimeToLive(
      request: UpdateTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, UpdateTimeToLiveResponse] = ReaderT { implicit ec =>
    underlying.updateTimeToLive(request.toJava).toFuture.map(_.toScala)
  }

  override def tagResource(request: TagResourceRequest): ReaderT[Future, ExecutionContext, TagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.tagResource(request.toJava).toFuture.map(_.toScala)
    }

  override def transactGetItems(
      request: TransactGetItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactGetItemsResponse] = ReaderT { implicit ec =>
    underlying.transactGetItems(request.toJava).toFuture.map(_.toScala)
  }

  override def transactWriteItems(
      request: TransactWriteItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactWriteItemsResponse] =
    ReaderT { implicit ec =>
      underlying.transactWriteItems(request.toJava).toFuture.map(_.toScala)
    }

  override def untagResource(request: UntagResourceRequest): ReaderT[Future, ExecutionContext, UntagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.untagResource(request.toJava).toFuture.map(_.toScala)
    }

  override def updateContinuousBackups(
      request: UpdateContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, UpdateContinuousBackupsResponse] = ReaderT { implicit ec =>
    underlying.updateContinuousBackups(request.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTable(
      request: UpdateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableResponse] = ReaderT { implicit ec =>
    underlying.updateGlobalTable(request.toJava).toFuture.map(_.toScala)
  }

}
