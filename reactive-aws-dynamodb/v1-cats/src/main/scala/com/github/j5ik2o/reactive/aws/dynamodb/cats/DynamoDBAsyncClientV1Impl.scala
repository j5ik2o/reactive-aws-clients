package com.github.j5ik2o.reactive.aws.dynamodb.cats

import cats.data.ReaderT
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.model._

import scala.concurrent.{ExecutionContext, Future}

private[cats] class DynamoDBAsyncClientV1Impl(override val underlying: AmazonDynamoDBAsync)
    extends DynamoDBAsyncClientV1 {
  import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClientV1._
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

  override def batchGetItem(request: BatchGetItemRequest): ReaderT[Future, ExecutionContext, BatchGetItemResponse] =
    ReaderT { implicit ec =>
      underlying.batchGetItemAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def batchWriteItem(
      request: BatchWriteItemRequest
  ): ReaderT[Future, ExecutionContext, BatchWriteItemResponse] = ReaderT { implicit ec =>
    underlying.batchWriteItemAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def createBackup(request: CreateBackupRequest): ReaderT[Future, ExecutionContext, CreateBackupResponse] =
    ReaderT { implicit ec =>
      underlying.createBackupAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def createGlobalTable(
      request: CreateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, CreateGlobalTableResponse] = ReaderT { implicit ec =>
    underlying.createGlobalTableAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def createTable(request: CreateTableRequest): ReaderT[Future, ExecutionContext, CreateTableResponse] =
    ReaderT { implicit ec =>
      underlying.createTableAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def describeContinuousBackups(
      request: DescribeContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, DescribeContinuousBackupsResponse] = ReaderT { implicit ec =>
    underlying.describeContinuousBackupsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeEndpoints(
      request: DescribeEndpointsRequest
  ): ReaderT[Future, ExecutionContext, DescribeEndpointsResponse] = ReaderT { implicit ec =>
    underlying.describeEndpointsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeBackup(
      request: DescribeBackupRequest
  ): ReaderT[Future, ExecutionContext, DescribeBackupResponse] = ReaderT { implicit ec =>
    underlying.describeBackupAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTable(
      request: DescribeGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableResponse] = ReaderT { implicit ec =>
    underlying.describeGlobalTableAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeGlobalTableSettings(
      request: DescribeGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, DescribeGlobalTableSettingsResponse] = ReaderT { implicit ec =>
    underlying.describeGlobalTableSettingsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeLimits(
      request: DescribeLimitsRequest
  ): ReaderT[Future, ExecutionContext, DescribeLimitsResponse] = ReaderT { implicit ec =>
    underlying.describeLimitsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeTimeToLive(
      request: DescribeTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, DescribeTimeToLiveResponse] = ReaderT { implicit ec =>
    underlying.describeTimeToLiveAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def listGlobalTables(
      request: ListGlobalTablesRequest
  ): ReaderT[Future, ExecutionContext, ListGlobalTablesResponse] = ReaderT { implicit ec =>
    underlying.listGlobalTablesAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def describeTable(request: DescribeTableRequest): ReaderT[Future, ExecutionContext, DescribeTableResponse] =
    ReaderT { implicit ec =>
      underlying.describeTableAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def deleteBackup(request: DeleteBackupRequest): ReaderT[Future, ExecutionContext, DeleteBackupResponse] =
    ReaderT { implicit ec =>
      underlying.deleteBackupAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def deleteItem(request: DeleteItemRequest): ReaderT[Future, ExecutionContext, DeleteItemResponse] = ReaderT {
    implicit ec =>
      underlying.deleteItemAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def deleteTable(request: DeleteTableRequest): ReaderT[Future, ExecutionContext, DeleteTableResponse] =
    ReaderT { implicit ec =>
      underlying.deleteTableAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def listBackups(request: ListBackupsRequest): ReaderT[Future, ExecutionContext, ListBackupsResponse] =
    ReaderT { implicit ec =>
      underlying.listBackupsAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def listTables(request: ListTablesRequest): ReaderT[Future, ExecutionContext, ListTablesResponse] = ReaderT {
    implicit ec =>
      underlying.listTablesAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def listTagsOfResource(
      request: ListTagsOfResourceRequest
  ): ReaderT[Future, ExecutionContext, ListTagsOfResourceResponse] = ReaderT { implicit ec =>
    underlying.listTagsOfResourceAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def putItem(request: PutItemRequest): ReaderT[Future, ExecutionContext, PutItemResponse] = ReaderT {
    implicit ec =>
      underlying.putItemAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def query(request: QueryRequest): ReaderT[Future, ExecutionContext, QueryResponse] = ReaderT { implicit ec =>
    underlying.queryAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableFromBackup(
      request: RestoreTableFromBackupRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableFromBackupResponse] = ReaderT { implicit ec =>
    underlying.restoreTableFromBackupAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def restoreTableToPointInTime(
      request: RestoreTableToPointInTimeRequest
  ): ReaderT[Future, ExecutionContext, RestoreTableToPointInTimeResponse] = ReaderT { implicit ec =>
    underlying.restoreTableToPointInTimeAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def scan(request: ScanRequest): ReaderT[Future, ExecutionContext, ScanResponse] = ReaderT { implicit ec =>
    underlying.scanAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def getItem(request: GetItemRequest): ReaderT[Future, ExecutionContext, GetItemResponse] = ReaderT {
    implicit ec =>
      underlying.getItemAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTableSettings(
      request: UpdateGlobalTableSettingsRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableSettingsResponse] = ReaderT { implicit ec =>
    underlying.updateGlobalTableSettingsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def updateItem(request: UpdateItemRequest): ReaderT[Future, ExecutionContext, UpdateItemResponse] = ReaderT {
    implicit ec =>
      underlying.updateItemAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def updateTable(request: UpdateTableRequest): ReaderT[Future, ExecutionContext, UpdateTableResponse] =
    ReaderT { implicit ec =>
      underlying.updateTableAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def updateTimeToLive(
      request: UpdateTimeToLiveRequest
  ): ReaderT[Future, ExecutionContext, UpdateTimeToLiveResponse] = ReaderT { implicit ec =>
    underlying.updateTimeToLiveAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def tagResource(request: TagResourceRequest): ReaderT[Future, ExecutionContext, TagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.tagResourceAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def transactGetItems(
      request: TransactGetItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactGetItemsResponse] = ReaderT { implicit ec =>
    underlying.transactGetItemsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def transactWriteItems(
      request: TransactWriteItemsRequest
  ): ReaderT[Future, ExecutionContext, TransactWriteItemsResponse] =
    ReaderT { implicit ec =>
      underlying.transactWriteItemsAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def untagResource(request: UntagResourceRequest): ReaderT[Future, ExecutionContext, UntagResourceResponse] =
    ReaderT { implicit ec =>
      underlying.untagResourceAsync(request.toJava).toFuture.map(_.toScala)
    }

  override def updateContinuousBackups(
      request: UpdateContinuousBackupsRequest
  ): ReaderT[Future, ExecutionContext, UpdateContinuousBackupsResponse] = ReaderT { implicit ec =>
    underlying.updateContinuousBackupsAsync(request.toJava).toFuture.map(_.toScala)
  }

  override def updateGlobalTable(
      request: UpdateGlobalTableRequest
  ): ReaderT[Future, ExecutionContext, UpdateGlobalTableResponse] = ReaderT { implicit ec =>
    underlying.updateGlobalTableAsync(request.toJava).toFuture.map(_.toScala)
  }

}
