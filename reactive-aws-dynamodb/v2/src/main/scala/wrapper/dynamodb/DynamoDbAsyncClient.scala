package wrapper.dynamodbGen

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb
import software.amazon.awssdk.services.dynamodb._
import scala.concurrent.{ ExecutionContext, Future }
import scala.compat.java8.FutureConverters._

trait ScalaDynamoDbAsyncClient {
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

  implicit val ec: ExecutionContext

  val underlyingDynamoDbAsyncClient: dynamodb.DynamoDbAsyncClient

  def batchGetItem(batchGetItemRequest: BatchGetItemRequest): Future[BatchGetItemResponse] =
    underlyingDynamoDbAsyncClient.batchGetItem(batchGetItemRequest.toJava).toScala.map(_.toScala)
  def batchWriteItem(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResponse] =
    underlyingDynamoDbAsyncClient.batchWriteItem(batchWriteItemRequest.toJava).toScala.map(_.toScala)
  def createBackup(createBackupRequest: CreateBackupRequest): Future[CreateBackupResponse] =
    underlyingDynamoDbAsyncClient.createBackup(createBackupRequest.toJava).toScala.map(_.toScala)
  def createGlobalTable(createGlobalTableRequest: CreateGlobalTableRequest): Future[CreateGlobalTableResponse] =
    underlyingDynamoDbAsyncClient.createGlobalTable(createGlobalTableRequest.toJava).toScala.map(_.toScala)
  def createTable(createTableRequest: CreateTableRequest): Future[CreateTableResponse] =
    underlyingDynamoDbAsyncClient.createTable(createTableRequest.toJava).toScala.map(_.toScala)
  def deleteBackup(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResponse] =
    underlyingDynamoDbAsyncClient.deleteBackup(deleteBackupRequest.toJava).toScala.map(_.toScala)
  def deleteItem(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResponse] =
    underlyingDynamoDbAsyncClient.deleteItem(deleteItemRequest.toJava).toScala.map(_.toScala)
  def deleteTable(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResponse] =
    underlyingDynamoDbAsyncClient.deleteTable(deleteTableRequest.toJava).toScala.map(_.toScala)
  def describeBackup(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResponse] =
    underlyingDynamoDbAsyncClient.describeBackup(describeBackupRequest.toJava).toScala.map(_.toScala)
  def describeContinuousBackups(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResponse] =
    underlyingDynamoDbAsyncClient
      .describeContinuousBackups(describeContinuousBackupsRequest.toJava).toScala.map(_.toScala)
  def describeEndpoints(describeEndpointsRequest: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] =
    underlyingDynamoDbAsyncClient.describeEndpoints(describeEndpointsRequest.toJava).toScala.map(_.toScala)
  def describeEndpoints(): Future[DescribeEndpointsResponse] =
    underlyingDynamoDbAsyncClient.describeEndpoints().toScala.map(_.toScala)
  def describeGlobalTable(describeGlobalTableRequest: DescribeGlobalTableRequest): Future[DescribeGlobalTableResponse] =
    underlyingDynamoDbAsyncClient.describeGlobalTable(describeGlobalTableRequest.toJava).toScala.map(_.toScala)
  def describeGlobalTableSettings(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResponse] =
    underlyingDynamoDbAsyncClient
      .describeGlobalTableSettings(describeGlobalTableSettingsRequest.toJava).toScala.map(_.toScala)
  def describeLimits(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResponse] =
    underlyingDynamoDbAsyncClient.describeLimits(describeLimitsRequest.toJava).toScala.map(_.toScala)
  def describeLimits(): Future[DescribeLimitsResponse] =
    underlyingDynamoDbAsyncClient.describeLimits().toScala.map(_.toScala)
  def describeTable(describeTableRequest: DescribeTableRequest): Future[DescribeTableResponse] =
    underlyingDynamoDbAsyncClient.describeTable(describeTableRequest.toJava).toScala.map(_.toScala)
  def describeTimeToLive(describeTimeToLiveRequest: DescribeTimeToLiveRequest): Future[DescribeTimeToLiveResponse] =
    underlyingDynamoDbAsyncClient.describeTimeToLive(describeTimeToLiveRequest.toJava).toScala.map(_.toScala)
  def getItem(getItemRequest: GetItemRequest): Future[GetItemResponse] =
    underlyingDynamoDbAsyncClient.getItem(getItemRequest.toJava).toScala.map(_.toScala)
  def listBackups(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResponse] =
    underlyingDynamoDbAsyncClient.listBackups(listBackupsRequest.toJava).toScala.map(_.toScala)
  def listBackups(): Future[ListBackupsResponse] =
    underlyingDynamoDbAsyncClient.listBackups().toScala.map(_.toScala)
  def listGlobalTables(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResponse] =
    underlyingDynamoDbAsyncClient.listGlobalTables(listGlobalTablesRequest.toJava).toScala.map(_.toScala)
  def listGlobalTables(): Future[ListGlobalTablesResponse] =
    underlyingDynamoDbAsyncClient.listGlobalTables().toScala.map(_.toScala)
  def listTables(listTablesRequest: ListTablesRequest): Future[ListTablesResponse] =
    underlyingDynamoDbAsyncClient.listTables(listTablesRequest.toJava).toScala.map(_.toScala)
  def listTables(): Future[ListTablesResponse] =
    underlyingDynamoDbAsyncClient.listTables().toScala.map(_.toScala)
  def listTagsOfResource(listTagsOfResourceRequest: ListTagsOfResourceRequest): Future[ListTagsOfResourceResponse] =
    underlyingDynamoDbAsyncClient.listTagsOfResource(listTagsOfResourceRequest.toJava).toScala.map(_.toScala)
  def putItem(putItemRequest: PutItemRequest): Future[PutItemResponse] =
    underlyingDynamoDbAsyncClient.putItem(putItemRequest.toJava).toScala.map(_.toScala)
  def query(queryRequest: QueryRequest): Future[QueryResponse] =
    underlyingDynamoDbAsyncClient.query(queryRequest.toJava).toScala.map(_.toScala)
  def restoreTableFromBackup(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResponse] =
    underlyingDynamoDbAsyncClient.restoreTableFromBackup(restoreTableFromBackupRequest.toJava).toScala.map(_.toScala)
  def restoreTableToPointInTime(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResponse] =
    underlyingDynamoDbAsyncClient
      .restoreTableToPointInTime(restoreTableToPointInTimeRequest.toJava).toScala.map(_.toScala)
  def scan(scanRequest: ScanRequest): Future[ScanResponse] =
    underlyingDynamoDbAsyncClient.scan(scanRequest.toJava).toScala.map(_.toScala)
  def tagResource(tagResourceRequest: TagResourceRequest): Future[TagResourceResponse] =
    underlyingDynamoDbAsyncClient.tagResource(tagResourceRequest.toJava).toScala.map(_.toScala)
  def transactGetItems(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResponse] =
    underlyingDynamoDbAsyncClient.transactGetItems(transactGetItemsRequest.toJava).toScala.map(_.toScala)
  def transactWriteItems(transactWriteItemsRequest: TransactWriteItemsRequest): Future[TransactWriteItemsResponse] =
    underlyingDynamoDbAsyncClient.transactWriteItems(transactWriteItemsRequest.toJava).toScala.map(_.toScala)
  def untagResource(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResponse] =
    underlyingDynamoDbAsyncClient.untagResource(untagResourceRequest.toJava).toScala.map(_.toScala)
  def updateContinuousBackups(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResponse] =
    underlyingDynamoDbAsyncClient.updateContinuousBackups(updateContinuousBackupsRequest.toJava).toScala.map(_.toScala)
  def updateGlobalTable(updateGlobalTableRequest: UpdateGlobalTableRequest): Future[UpdateGlobalTableResponse] =
    underlyingDynamoDbAsyncClient.updateGlobalTable(updateGlobalTableRequest.toJava).toScala.map(_.toScala)
  def updateGlobalTableSettings(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResponse] =
    underlyingDynamoDbAsyncClient
      .updateGlobalTableSettings(updateGlobalTableSettingsRequest.toJava).toScala.map(_.toScala)
  def updateItem(updateItemRequest: UpdateItemRequest): Future[UpdateItemResponse] =
    underlyingDynamoDbAsyncClient.updateItem(updateItemRequest.toJava).toScala.map(_.toScala)
  def updateTable(updateTableRequest: UpdateTableRequest): Future[UpdateTableResponse] =
    underlyingDynamoDbAsyncClient.updateTable(updateTableRequest.toJava).toScala.map(_.toScala)
  def updateTimeToLive(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResponse] =
    underlyingDynamoDbAsyncClient.updateTimeToLive(updateTimeToLiveRequest.toJava).toScala.map(_.toScala)

}
