package com.github.j5ik2o.reactive.aws.dynamodb
import java.util.concurrent.Future
import java.{ lang, util }

import com.amazonaws.handlers.AsyncHandler
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.amazonaws.services.dynamodbv2.model._
import com.github.j5ik2o.reactive.aws.dynamodb.metrics.JavaAsyncClientMetricsInterceptorV1
import com.github.j5ik2o.reactive.aws.metrics.MetricsReporter

object JavaAsyncClientDecoratorV1 {

  def ofMetricsCollector(underlying: AmazonDynamoDBAsync, _reporter: MetricsReporter): JavaAsyncClientDecoratorV1 =
    new JavaAsyncClientDecoratorV1Impl(underlying) with JavaAsyncClientMetricsInterceptorV1 {
      override protected val reporter: MetricsReporter = _reporter
    }

}

trait JavaAsyncClientDecoratorV1 extends AmazonDynamoDBAsync with JavaSyncClientDecoratorV1 {

  override val underlying: AmazonDynamoDBAsync

  override def batchGetItemAsync(
      batchGetItemRequest: BatchGetItemRequest
  ): Future[BatchGetItemResult] = underlying.batchGetItemAsync(batchGetItemRequest)

  override def batchGetItemAsync(
      batchGetItemRequest: BatchGetItemRequest,
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] = underlying.batchGetItemAsync(batchGetItemRequest, asyncHandler)

  override def batchGetItemAsync(requestItems: util.Map[String, KeysAndAttributes],
                                 returnConsumedCapacity: String): Future[BatchGetItemResult] =
    underlying.batchGetItemAsync(requestItems, returnConsumedCapacity)

  override def batchGetItemAsync(
      requestItems: util.Map[String, KeysAndAttributes],
      returnConsumedCapacity: String,
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] = underlying.batchGetItemAsync(requestItems, returnConsumedCapacity, asyncHandler)

  override def batchGetItemAsync(requestItems: util.Map[String, KeysAndAttributes]): Future[BatchGetItemResult] =
    underlying.batchGetItemAsync(requestItems)

  override def batchGetItemAsync(
      requestItems: util.Map[String, KeysAndAttributes],
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] = underlying.batchGetItemAsync(requestItems, asyncHandler)

  override def batchWriteItemAsync(batchWriteItemRequest: BatchWriteItemRequest): Future[BatchWriteItemResult] =
    underlying.batchWriteItemAsync(batchWriteItemRequest)

  override def batchWriteItemAsync(
      batchWriteItemRequest: BatchWriteItemRequest,
      asyncHandler: AsyncHandler[BatchWriteItemRequest, BatchWriteItemResult]
  ): Future[BatchWriteItemResult] = underlying.batchWriteItemAsync(batchWriteItemRequest, asyncHandler)

  override def batchWriteItemAsync(
      requestItems: util.Map[String, util.List[WriteRequest]]
  ): Future[BatchWriteItemResult] = underlying.batchWriteItemAsync(requestItems)

  override def batchWriteItemAsync(
      requestItems: util.Map[String, util.List[WriteRequest]],
      asyncHandler: AsyncHandler[BatchWriteItemRequest, BatchWriteItemResult]
  ): Future[BatchWriteItemResult] = underlying.batchWriteItemAsync(requestItems, asyncHandler)

  override def createBackupAsync(createBackupRequest: CreateBackupRequest): Future[CreateBackupResult] =
    underlying.createBackupAsync(createBackupRequest)

  override def createBackupAsync(
      createBackupRequest: CreateBackupRequest,
      asyncHandler: AsyncHandler[CreateBackupRequest, CreateBackupResult]
  ): Future[CreateBackupResult] = underlying.createBackupAsync(createBackupRequest, asyncHandler)

  override def createGlobalTableAsync(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResult] = underlying.createGlobalTableAsync(createGlobalTableRequest)

  override def createGlobalTableAsync(
      createGlobalTableRequest: CreateGlobalTableRequest,
      asyncHandler: AsyncHandler[CreateGlobalTableRequest, CreateGlobalTableResult]
  ): Future[CreateGlobalTableResult] = underlying.createGlobalTableAsync(createGlobalTableRequest, asyncHandler)

  override def createTableAsync(createTableRequest: CreateTableRequest): Future[CreateTableResult] =
    underlying.createTableAsync(createTableRequest)

  override def createTableAsync(
      createTableRequest: CreateTableRequest,
      asyncHandler: AsyncHandler[CreateTableRequest, CreateTableResult]
  ): Future[CreateTableResult] = underlying.createTableAsync(createTableRequest, asyncHandler)

  override def createTableAsync(attributeDefinitions: util.List[AttributeDefinition],
                                tableName: String,
                                keySchema: util.List[KeySchemaElement],
                                provisionedThroughput: ProvisionedThroughput): Future[CreateTableResult] =
    underlying.createTableAsync(attributeDefinitions, tableName, keySchema, provisionedThroughput)

  override def createTableAsync(
      attributeDefinitions: util.List[AttributeDefinition],
      tableName: String,
      keySchema: util.List[KeySchemaElement],
      provisionedThroughput: ProvisionedThroughput,
      asyncHandler: AsyncHandler[CreateTableRequest, CreateTableResult]
  ): Future[CreateTableResult] =
    underlying.createTableAsync(attributeDefinitions, tableName, keySchema, provisionedThroughput, asyncHandler)

  override def deleteBackupAsync(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResult] =
    underlying.deleteBackupAsync(deleteBackupRequest)

  override def deleteBackupAsync(
      deleteBackupRequest: DeleteBackupRequest,
      asyncHandler: AsyncHandler[DeleteBackupRequest, DeleteBackupResult]
  ): Future[DeleteBackupResult] = underlying.deleteBackupAsync(deleteBackupRequest, asyncHandler)

  override def deleteItemAsync(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResult] =
    underlying.deleteItemAsync(deleteItemRequest)

  override def deleteItemAsync(
      deleteItemRequest: DeleteItemRequest,
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = underlying.deleteItemAsync(deleteItemRequest, asyncHandler)

  override def deleteItemAsync(tableName: String, key: util.Map[String, AttributeValue]): Future[DeleteItemResult] =
    underlying.deleteItemAsync(tableName, key)

  override def deleteItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = underlying.deleteItemAsync(tableName, key, asyncHandler)

  override def deleteItemAsync(tableName: String,
                               key: util.Map[String, AttributeValue],
                               returnValues: String): Future[DeleteItemResult] =
    underlying.deleteItemAsync(tableName, key, returnValues)

  override def deleteItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      returnValues: String,
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = underlying.deleteItemAsync(tableName, key, returnValues, asyncHandler)

  override def deleteTableAsync(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResult] =
    underlying.deleteTableAsync(deleteTableRequest)

  override def deleteTableAsync(
      deleteTableRequest: DeleteTableRequest,
      asyncHandler: AsyncHandler[DeleteTableRequest, DeleteTableResult]
  ): Future[DeleteTableResult] = underlying.deleteTableAsync(deleteTableRequest, asyncHandler)

  override def deleteTableAsync(tableName: String): Future[DeleteTableResult] =
    underlying.deleteTableAsync(tableName)

  override def deleteTableAsync(
      tableName: String,
      asyncHandler: AsyncHandler[DeleteTableRequest, DeleteTableResult]
  ): Future[DeleteTableResult] = underlying.deleteTableAsync(tableName, asyncHandler)

  override def describeBackupAsync(describeBackupRequest: DescribeBackupRequest): Future[DescribeBackupResult] =
    underlying.describeBackupAsync(describeBackupRequest)

  override def describeBackupAsync(
      describeBackupRequest: DescribeBackupRequest,
      asyncHandler: AsyncHandler[DescribeBackupRequest, DescribeBackupResult]
  ): Future[DescribeBackupResult] = underlying.describeBackupAsync(describeBackupRequest, asyncHandler)

  override def describeContinuousBackupsAsync(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResult] =
    underlying.describeContinuousBackupsAsync(describeContinuousBackupsRequest)

  override def describeContinuousBackupsAsync(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest,
      asyncHandler: AsyncHandler[DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult]
  ): Future[DescribeContinuousBackupsResult] =
    underlying.describeContinuousBackupsAsync(describeContinuousBackupsRequest, asyncHandler)

  override def describeEndpointsAsync(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResult] = underlying.describeEndpointsAsync(describeEndpointsRequest)

  override def describeEndpointsAsync(
      describeEndpointsRequest: DescribeEndpointsRequest,
      asyncHandler: AsyncHandler[DescribeEndpointsRequest, DescribeEndpointsResult]
  ): Future[DescribeEndpointsResult] = underlying.describeEndpointsAsync(describeEndpointsRequest, asyncHandler)

  override def describeGlobalTableAsync(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResult] = underlying.describeGlobalTableAsync(describeGlobalTableRequest)

  override def describeGlobalTableAsync(
      describeGlobalTableRequest: DescribeGlobalTableRequest,
      asyncHandler: AsyncHandler[DescribeGlobalTableRequest, DescribeGlobalTableResult]
  ): Future[DescribeGlobalTableResult] = underlying.describeGlobalTableAsync(describeGlobalTableRequest, asyncHandler)

  override def describeGlobalTableSettingsAsync(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResult] =
    underlying.describeGlobalTableSettingsAsync(describeGlobalTableSettingsRequest)

  override def describeGlobalTableSettingsAsync(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest,
      asyncHandler: AsyncHandler[DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult]
  ): Future[DescribeGlobalTableSettingsResult] =
    underlying.describeGlobalTableSettingsAsync(describeGlobalTableSettingsRequest, asyncHandler)

  override def describeLimitsAsync(describeLimitsRequest: DescribeLimitsRequest): Future[DescribeLimitsResult] =
    underlying.describeLimitsAsync(describeLimitsRequest)

  override def describeLimitsAsync(
      describeLimitsRequest: DescribeLimitsRequest,
      asyncHandler: AsyncHandler[DescribeLimitsRequest, DescribeLimitsResult]
  ): Future[DescribeLimitsResult] = underlying.describeLimitsAsync(describeLimitsRequest, asyncHandler)

  override def describeTableAsync(describeTableRequest: DescribeTableRequest): Future[DescribeTableResult] =
    underlying.describeTableAsync(describeTableRequest)

  override def describeTableAsync(
      describeTableRequest: DescribeTableRequest,
      asyncHandler: AsyncHandler[DescribeTableRequest, DescribeTableResult]
  ): Future[DescribeTableResult] = underlying.describeTableAsync(describeTableRequest, asyncHandler)

  override def describeTableAsync(tableName: String): Future[DescribeTableResult] =
    underlying.describeTableAsync(tableName)

  override def describeTableAsync(
      tableName: String,
      asyncHandler: AsyncHandler[DescribeTableRequest, DescribeTableResult]
  ): Future[DescribeTableResult] = underlying.describeTableAsync(tableName, asyncHandler)

  override def describeTimeToLiveAsync(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResult] = underlying.describeTimeToLiveAsync(describeTimeToLiveRequest)

  override def describeTimeToLiveAsync(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest,
      asyncHandler: AsyncHandler[DescribeTimeToLiveRequest, DescribeTimeToLiveResult]
  ): Future[DescribeTimeToLiveResult] = underlying.describeTimeToLiveAsync(describeTimeToLiveRequest, asyncHandler)

  override def getItemAsync(getItemRequest: GetItemRequest): Future[GetItemResult] =
    underlying.getItemAsync(getItemRequest)

  override def getItemAsync(getItemRequest: GetItemRequest,
                            asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    underlying.getItemAsync(getItemRequest, asyncHandler)

  override def getItemAsync(tableName: String, key: util.Map[String, AttributeValue]): Future[GetItemResult] =
    underlying.getItemAsync(tableName, key)

  override def getItemAsync(tableName: String,
                            key: util.Map[String, AttributeValue],
                            asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    underlying.getItemAsync(tableName, key, asyncHandler)

  override def getItemAsync(tableName: String,
                            key: util.Map[String, AttributeValue],
                            consistentRead: lang.Boolean): Future[GetItemResult] =
    underlying.getItemAsync(tableName, key, consistentRead)

  override def getItemAsync(tableName: String,
                            key: util.Map[String, AttributeValue],
                            consistentRead: lang.Boolean,
                            asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    underlying.getItemAsync(tableName, key, consistentRead, asyncHandler)

  override def listBackupsAsync(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResult] =
    underlying.listBackupsAsync(listBackupsRequest)

  override def listBackupsAsync(
      listBackupsRequest: ListBackupsRequest,
      asyncHandler: AsyncHandler[ListBackupsRequest, ListBackupsResult]
  ): Future[ListBackupsResult] = underlying.listBackupsAsync(listBackupsRequest, asyncHandler)

  override def listGlobalTablesAsync(listGlobalTablesRequest: ListGlobalTablesRequest): Future[ListGlobalTablesResult] =
    underlying.listGlobalTablesAsync(listGlobalTablesRequest)

  override def listGlobalTablesAsync(
      listGlobalTablesRequest: ListGlobalTablesRequest,
      asyncHandler: AsyncHandler[ListGlobalTablesRequest, ListGlobalTablesResult]
  ): Future[ListGlobalTablesResult] = underlying.listGlobalTablesAsync(listGlobalTablesRequest, asyncHandler)

  override def listTablesAsync(listTablesRequest: ListTablesRequest): Future[ListTablesResult] =
    underlying.listTablesAsync(listTablesRequest)

  override def listTablesAsync(
      listTablesRequest: ListTablesRequest,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = underlying.listTablesAsync(listTablesRequest, asyncHandler)

  override def listTablesAsync(): Future[ListTablesResult] = underlying.listTablesAsync()

  override def listTablesAsync(
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = underlying.listTablesAsync(asyncHandler)

  override def listTablesAsync(exclusiveStartTableName: String): Future[ListTablesResult] =
    underlying.listTablesAsync(exclusiveStartTableName)

  override def listTablesAsync(
      exclusiveStartTableName: String,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = underlying.listTablesAsync(exclusiveStartTableName, asyncHandler)

  override def listTablesAsync(exclusiveStartTableName: String, limit: Integer): Future[ListTablesResult] =
    underlying.listTablesAsync(exclusiveStartTableName, limit)

  override def listTablesAsync(
      exclusiveStartTableName: String,
      limit: Integer,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = underlying.listTablesAsync(exclusiveStartTableName, limit, asyncHandler)

  override def listTablesAsync(limit: Integer): Future[ListTablesResult] =
    underlying.listTablesAsync(limit)

  override def listTablesAsync(
      limit: Integer,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = underlying.listTablesAsync(limit, asyncHandler)

  override def listTagsOfResourceAsync(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResult] = underlying.listTagsOfResourceAsync(listTagsOfResourceRequest)

  override def listTagsOfResourceAsync(
      listTagsOfResourceRequest: ListTagsOfResourceRequest,
      asyncHandler: AsyncHandler[ListTagsOfResourceRequest, ListTagsOfResourceResult]
  ): Future[ListTagsOfResourceResult] = underlying.listTagsOfResourceAsync(listTagsOfResourceRequest, asyncHandler)

  override def putItemAsync(putItemRequest: PutItemRequest): Future[PutItemResult] =
    underlying.putItemAsync(putItemRequest)

  override def putItemAsync(putItemRequest: PutItemRequest,
                            asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    underlying.putItemAsync(putItemRequest, asyncHandler)

  override def putItemAsync(tableName: String, item: util.Map[String, AttributeValue]): Future[PutItemResult] =
    underlying.putItemAsync(tableName, item)

  override def putItemAsync(tableName: String,
                            item: util.Map[String, AttributeValue],
                            asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    underlying.putItemAsync(tableName, item, asyncHandler)

  override def putItemAsync(tableName: String,
                            item: util.Map[String, AttributeValue],
                            returnValues: String): Future[PutItemResult] =
    underlying.putItemAsync(tableName, item, returnValues)

  override def putItemAsync(tableName: String,
                            item: util.Map[String, AttributeValue],
                            returnValues: String,
                            asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    underlying.putItemAsync(tableName, item, returnValues, asyncHandler)

  override def queryAsync(queryRequest: QueryRequest): Future[QueryResult] =
    underlying.queryAsync(queryRequest)

  override def queryAsync(queryRequest: QueryRequest,
                          asyncHandler: AsyncHandler[QueryRequest, QueryResult]): Future[QueryResult] =
    underlying.queryAsync(queryRequest, asyncHandler)

  override def restoreTableFromBackupAsync(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResult] = underlying.restoreTableFromBackupAsync(restoreTableFromBackupRequest)

  override def restoreTableFromBackupAsync(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest,
      asyncHandler: AsyncHandler[RestoreTableFromBackupRequest, RestoreTableFromBackupResult]
  ): Future[RestoreTableFromBackupResult] =
    underlying.restoreTableFromBackupAsync(restoreTableFromBackupRequest, asyncHandler)

  override def restoreTableToPointInTimeAsync(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResult] =
    underlying.restoreTableToPointInTimeAsync(restoreTableToPointInTimeRequest)

  override def restoreTableToPointInTimeAsync(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest,
      asyncHandler: AsyncHandler[RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult]
  ): Future[RestoreTableToPointInTimeResult] =
    underlying.restoreTableToPointInTimeAsync(restoreTableToPointInTimeRequest, asyncHandler)

  override def scanAsync(scanRequest: ScanRequest): Future[ScanResult] =
    underlying.scanAsync(scanRequest)

  override def scanAsync(scanRequest: ScanRequest,
                         asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    underlying.scanAsync(scanRequest, asyncHandler)

  override def scanAsync(tableName: String, attributesToGet: util.List[String]): Future[ScanResult] =
    underlying.scanAsync(tableName, attributesToGet)

  override def scanAsync(tableName: String,
                         attributesToGet: util.List[String],
                         asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    underlying.scanAsync(tableName, attributesToGet, asyncHandler)

  override def scanAsync(tableName: String, scanFilter: util.Map[String, Condition]): Future[ScanResult] =
    underlying.scanAsync(tableName, scanFilter)

  override def scanAsync(tableName: String,
                         scanFilter: util.Map[String, Condition],
                         asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    underlying.scanAsync(tableName, scanFilter, asyncHandler)

  override def scanAsync(tableName: String,
                         attributesToGet: util.List[String],
                         scanFilter: util.Map[String, Condition]): Future[ScanResult] =
    underlying.scanAsync(tableName, attributesToGet, scanFilter)

  override def scanAsync(tableName: String,
                         attributesToGet: util.List[String],
                         scanFilter: util.Map[String, Condition],
                         asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    underlying.scanAsync(tableName, attributesToGet, scanFilter, asyncHandler)

  override def tagResourceAsync(tagResourceRequest: TagResourceRequest): Future[TagResourceResult] =
    underlying.tagResourceAsync(tagResourceRequest)

  override def tagResourceAsync(
      tagResourceRequest: TagResourceRequest,
      asyncHandler: AsyncHandler[TagResourceRequest, TagResourceResult]
  ): Future[TagResourceResult] = underlying.tagResourceAsync(tagResourceRequest, asyncHandler)

  override def transactGetItemsAsync(transactGetItemsRequest: TransactGetItemsRequest): Future[TransactGetItemsResult] =
    underlying.transactGetItemsAsync(transactGetItemsRequest)

  override def transactGetItemsAsync(
      transactGetItemsRequest: TransactGetItemsRequest,
      asyncHandler: AsyncHandler[TransactGetItemsRequest, TransactGetItemsResult]
  ): Future[TransactGetItemsResult] = underlying.transactGetItemsAsync(transactGetItemsRequest, asyncHandler)

  override def transactWriteItemsAsync(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResult] = underlying.transactWriteItemsAsync(transactWriteItemsRequest)

  override def transactWriteItemsAsync(
      transactWriteItemsRequest: TransactWriteItemsRequest,
      asyncHandler: AsyncHandler[TransactWriteItemsRequest, TransactWriteItemsResult]
  ): Future[TransactWriteItemsResult] = underlying.transactWriteItemsAsync(transactWriteItemsRequest, asyncHandler)

  override def untagResourceAsync(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResult] =
    underlying.untagResourceAsync(untagResourceRequest)

  override def untagResourceAsync(
      untagResourceRequest: UntagResourceRequest,
      asyncHandler: AsyncHandler[UntagResourceRequest, UntagResourceResult]
  ): Future[UntagResourceResult] = underlying.untagResourceAsync(untagResourceRequest, asyncHandler)

  override def updateContinuousBackupsAsync(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResult] = underlying.updateContinuousBackupsAsync(updateContinuousBackupsRequest)

  override def updateContinuousBackupsAsync(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest,
      asyncHandler: AsyncHandler[UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult]
  ): Future[UpdateContinuousBackupsResult] =
    underlying.updateContinuousBackupsAsync(updateContinuousBackupsRequest, asyncHandler)

  override def updateGlobalTableAsync(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResult] = underlying.updateGlobalTableAsync(updateGlobalTableRequest)

  override def updateGlobalTableAsync(
      updateGlobalTableRequest: UpdateGlobalTableRequest,
      asyncHandler: AsyncHandler[UpdateGlobalTableRequest, UpdateGlobalTableResult]
  ): Future[UpdateGlobalTableResult] = underlying.updateGlobalTableAsync(updateGlobalTableRequest, asyncHandler)

  override def updateGlobalTableSettingsAsync(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResult] =
    underlying.updateGlobalTableSettingsAsync(updateGlobalTableSettingsRequest)

  override def updateGlobalTableSettingsAsync(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest,
      asyncHandler: AsyncHandler[UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult]
  ): Future[UpdateGlobalTableSettingsResult] =
    underlying.updateGlobalTableSettingsAsync(updateGlobalTableSettingsRequest, asyncHandler)

  override def updateItemAsync(updateItemRequest: UpdateItemRequest): Future[UpdateItemResult] =
    underlying.updateItemAsync(updateItemRequest)

  override def updateItemAsync(
      updateItemRequest: UpdateItemRequest,
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] = underlying.updateItemAsync(updateItemRequest, asyncHandler)

  override def updateItemAsync(tableName: String,
                               key: util.Map[String, AttributeValue],
                               attributeUpdates: util.Map[String, AttributeValueUpdate]): Future[UpdateItemResult] =
    underlying.updateItemAsync(tableName, key, attributeUpdates)

  override def updateItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      attributeUpdates: util.Map[String, AttributeValueUpdate],
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] = underlying.updateItemAsync(tableName, key, attributeUpdates, asyncHandler)

  override def updateItemAsync(tableName: String,
                               key: util.Map[String, AttributeValue],
                               attributeUpdates: util.Map[String, AttributeValueUpdate],
                               returnValues: String): Future[UpdateItemResult] =
    underlying.updateItemAsync(tableName, key, attributeUpdates, returnValues)

  override def updateItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      attributeUpdates: util.Map[String, AttributeValueUpdate],
      returnValues: String,
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] = underlying.updateItemAsync(tableName, key, attributeUpdates, returnValues, asyncHandler)

  override def updateTableAsync(updateTableRequest: UpdateTableRequest): Future[UpdateTableResult] =
    underlying.updateTableAsync(updateTableRequest)

  override def updateTableAsync(
      updateTableRequest: UpdateTableRequest,
      asyncHandler: AsyncHandler[UpdateTableRequest, UpdateTableResult]
  ): Future[UpdateTableResult] = underlying.updateTableAsync(updateTableRequest, asyncHandler)

  override def updateTableAsync(tableName: String,
                                provisionedThroughput: ProvisionedThroughput): Future[UpdateTableResult] =
    underlying.updateTableAsync(tableName, provisionedThroughput)

  override def updateTableAsync(
      tableName: String,
      provisionedThroughput: ProvisionedThroughput,
      asyncHandler: AsyncHandler[UpdateTableRequest, UpdateTableResult]
  ): Future[UpdateTableResult] = underlying.updateTableAsync(tableName, provisionedThroughput, asyncHandler)

  override def updateTimeToLiveAsync(updateTimeToLiveRequest: UpdateTimeToLiveRequest): Future[UpdateTimeToLiveResult] =
    underlying.updateTimeToLiveAsync(updateTimeToLiveRequest)

  override def updateTimeToLiveAsync(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest,
      asyncHandler: AsyncHandler[UpdateTimeToLiveRequest, UpdateTimeToLiveResult]
  ): Future[UpdateTimeToLiveResult] = underlying.updateTimeToLiveAsync(updateTimeToLiveRequest, asyncHandler)

}

class JavaAsyncClientDecoratorV1Impl(override val underlying: AmazonDynamoDBAsync) extends JavaAsyncClientDecoratorV1
