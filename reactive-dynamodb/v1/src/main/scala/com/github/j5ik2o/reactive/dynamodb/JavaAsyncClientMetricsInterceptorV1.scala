package com.github.j5ik2o.reactive.dynamodb
import java.util.concurrent.{ CompletableFuture, Future }
import java.util.function.{ BiConsumer, Supplier }
import java.{ lang, util }

import com.amazonaws.handlers.AsyncHandler
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.amazonaws.services.dynamodbv2.model._

trait JavaAsyncClientMetricsInterceptorV1 extends AmazonDynamoDBAsync with JavaSyncClientMetricsInterceptorV1 {

  abstract override def batchGetItemAsync(
      batchGetItemRequest: BatchGetItemRequest
  ): Future[BatchGetItemResult] = collectJavaFuture("batchGetItemAsync", batchGetItemRequest)(super.batchGetItemAsync)

  abstract override def batchGetItemAsync(
      batchGetItemRequest: BatchGetItemRequest,
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] =
    collectJavaFuture("batchGetItemAsync", (batchGetItemRequest, asyncHandler)) {
      case (p1, p2) => super.batchGetItemAsync(p1, p2)
    }

  abstract override def batchGetItemAsync(requestItems: util.Map[String, KeysAndAttributes],
                                          returnConsumedCapacity: String): Future[BatchGetItemResult] =
    collectJavaFuture("batchGetItemAsync", (requestItems, returnConsumedCapacity)) {
      case (p1, p2) => super.batchGetItemAsync(p1, p2)
    }

  abstract override def batchGetItemAsync(
      requestItems: util.Map[String, KeysAndAttributes],
      returnConsumedCapacity: String,
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] =
    collectJavaFuture("batchGetItemAsync", (requestItems, returnConsumedCapacity, asyncHandler)) {
      case (p1, p2, p3) => super.batchGetItemAsync(p1, p2, p3)
    }

  abstract override def batchGetItemAsync(
      requestItems: util.Map[String, KeysAndAttributes]
  ): Future[BatchGetItemResult] =
    collectJavaFuture("batchGetItemAsync", requestItems)(super.batchGetItemAsync)

  abstract override def batchGetItemAsync(
      requestItems: util.Map[String, KeysAndAttributes],
      asyncHandler: AsyncHandler[BatchGetItemRequest, BatchGetItemResult]
  ): Future[BatchGetItemResult] = collectJavaFuture("batchGetItemAsync", (requestItems, asyncHandler)) {
    case (p1, p2) => super.batchGetItemAsync(p1, p2)
  }

  abstract override def batchWriteItemAsync(
      batchWriteItemRequest: BatchWriteItemRequest
  ): Future[BatchWriteItemResult] =
    collectJavaFuture("batchWriteItemAsync", batchWriteItemRequest)(super.batchWriteItemAsync)

  abstract override def batchWriteItemAsync(
      batchWriteItemRequest: BatchWriteItemRequest,
      asyncHandler: AsyncHandler[BatchWriteItemRequest, BatchWriteItemResult]
  ): Future[BatchWriteItemResult] =
    collectJavaFuture("batchWriteItemAsync", (batchWriteItemRequest, asyncHandler)) {
      case (p1, p2) => super.batchWriteItemAsync(p1, p2)
    }

  abstract override def batchWriteItemAsync(
      requestItems: util.Map[String, util.List[WriteRequest]]
  ): Future[BatchWriteItemResult] = collectJavaFuture("batchWriteItemAsync", requestItems)(super.batchWriteItemAsync)

  abstract override def batchWriteItemAsync(
      requestItems: util.Map[String, util.List[WriteRequest]],
      asyncHandler: AsyncHandler[BatchWriteItemRequest, BatchWriteItemResult]
  ): Future[BatchWriteItemResult] = collectJavaFuture("batchWriteItemAsync", (requestItems, asyncHandler)) {
    case (p1, p2) => super.batchWriteItemAsync(p1, p2)
  }

  abstract override def createBackupAsync(createBackupRequest: CreateBackupRequest): Future[CreateBackupResult] =
    collectJavaFuture("createBackupAsync", createBackupRequest)(super.createBackupAsync)

  abstract override def createBackupAsync(
      createBackupRequest: CreateBackupRequest,
      asyncHandler: AsyncHandler[CreateBackupRequest, CreateBackupResult]
  ): Future[CreateBackupResult] = collectJavaFuture("createBackupAsync", (createBackupRequest, asyncHandler)) {
    case (p1, p2) => super.createBackupAsync(p1, p2)
  }

  abstract override def createGlobalTableAsync(
      createGlobalTableRequest: CreateGlobalTableRequest
  ): Future[CreateGlobalTableResult] =
    collectJavaFuture("createGlobalTableAsync", createGlobalTableRequest)(super.createGlobalTableAsync)

  abstract override def createGlobalTableAsync(
      createGlobalTableRequest: CreateGlobalTableRequest,
      asyncHandler: AsyncHandler[CreateGlobalTableRequest, CreateGlobalTableResult]
  ): Future[CreateGlobalTableResult] =
    collectJavaFuture("createGlobalTableAsync", (createGlobalTableRequest, asyncHandler)) {
      case (p1, p2) => super.createGlobalTableAsync(p1, p2)
    }

  abstract override def createTableAsync(createTableRequest: CreateTableRequest): Future[CreateTableResult] =
    collectJavaFuture("createTableAsync", createTableRequest)(super.createTableAsync)

  abstract override def createTableAsync(
      createTableRequest: CreateTableRequest,
      asyncHandler: AsyncHandler[CreateTableRequest, CreateTableResult]
  ): Future[CreateTableResult] = collectJavaFuture("createTableAsync", (createTableRequest, asyncHandler)) {
    case (p1, p2) => super.createTableAsync(p1, p2)
  }

  abstract override def createTableAsync(attributeDefinitions: util.List[AttributeDefinition],
                                         tableName: String,
                                         keySchema: util.List[KeySchemaElement],
                                         provisionedThroughput: ProvisionedThroughput): Future[CreateTableResult] =
    collectJavaFuture("createTableAsync", (attributeDefinitions, tableName, keySchema, provisionedThroughput)) {
      case (p1, p2, p3, p4) => super.createTableAsync(p1, p2, p3, p4)
    }

  abstract override def createTableAsync(
      attributeDefinitions: util.List[AttributeDefinition],
      tableName: String,
      keySchema: util.List[KeySchemaElement],
      provisionedThroughput: ProvisionedThroughput,
      asyncHandler: AsyncHandler[CreateTableRequest, CreateTableResult]
  ): Future[CreateTableResult] =
    collectJavaFuture("createTableAsync",
                      (attributeDefinitions, tableName, keySchema, provisionedThroughput, asyncHandler)) {
      case (p1, p2, p3, p4, p5) =>
        super.createTableAsync(p1, p2, p3, p4, p5)
    }

  abstract override def deleteBackupAsync(deleteBackupRequest: DeleteBackupRequest): Future[DeleteBackupResult] =
    collectJavaFuture("deleteBackupAsync", deleteBackupRequest)(super.deleteBackupAsync)

  abstract override def deleteBackupAsync(
      deleteBackupRequest: DeleteBackupRequest,
      asyncHandler: AsyncHandler[DeleteBackupRequest, DeleteBackupResult]
  ): Future[DeleteBackupResult] = collectJavaFuture("deleteBackupAsync", (deleteBackupRequest, asyncHandler)) {
    case (p1, p2) => super.deleteBackupAsync(p1, p2)
  }

  abstract override def deleteItemAsync(deleteItemRequest: DeleteItemRequest): Future[DeleteItemResult] =
    collectJavaFuture("batchGetItemAsync", deleteItemRequest)(super.deleteItemAsync)

  abstract override def deleteItemAsync(
      deleteItemRequest: DeleteItemRequest,
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = collectJavaFuture("deleteItemAsync", (deleteItemRequest, asyncHandler)) {
    case (p1, p2) =>
      super.deleteItemAsync(p1, p2)
  }

  abstract override def deleteItemAsync(tableName: String,
                                        key: util.Map[String, AttributeValue]): Future[DeleteItemResult] =
    collectJavaFuture("deleteItemAsync", (tableName, key)) { case (p1, p2) => super.deleteItemAsync(p1, p2) }

  abstract override def deleteItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = collectJavaFuture("deleteItemAsync", (tableName, key, asyncHandler)) {
    case (p1, p2, p3) => super.deleteItemAsync(p1, p2, p3)
  }

  abstract override def deleteItemAsync(tableName: String,
                                        key: util.Map[String, AttributeValue],
                                        returnValues: String): Future[DeleteItemResult] =
    collectJavaFuture("deleteItemAsync", (tableName, key, returnValues)) {
      case (p1, p2, p3) => super.deleteItemAsync(p1, p2, p3)
    }

  abstract override def deleteItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      returnValues: String,
      asyncHandler: AsyncHandler[DeleteItemRequest, DeleteItemResult]
  ): Future[DeleteItemResult] = collectJavaFuture("deleteItemAsync", (tableName, key, returnValues, asyncHandler)) {
    case (p1, p2, p3, p4) => super.deleteItemAsync(p1, p2, p3, p4)
  }

  abstract override def deleteTableAsync(deleteTableRequest: DeleteTableRequest): Future[DeleteTableResult] =
    collectJavaFuture("deleteTableAsync", deleteTableRequest)(super.deleteTableAsync)

  abstract override def deleteTableAsync(
      deleteTableRequest: DeleteTableRequest,
      asyncHandler: AsyncHandler[DeleteTableRequest, DeleteTableResult]
  ): Future[DeleteTableResult] = collectJavaFuture("deleteTableAsync", (deleteTableRequest, asyncHandler)) {
    case (p1, p2) => super.deleteTableAsync(p1, p2)
  }

  abstract override def deleteTableAsync(tableName: String): Future[DeleteTableResult] =
    collectJavaFuture("deleteTableAsync", tableName)(super.deleteTableAsync)

  abstract override def deleteTableAsync(
      tableName: String,
      asyncHandler: AsyncHandler[DeleteTableRequest, DeleteTableResult]
  ): Future[DeleteTableResult] = collectJavaFuture("deleteTableAsync", (tableName, asyncHandler)) {
    case (p1, p2) => super.deleteTableAsync(p1, p2)
  }

  abstract override def describeBackupAsync(
      describeBackupRequest: DescribeBackupRequest
  ): Future[DescribeBackupResult] =
    collectJavaFuture("describeBackupAsync", describeBackupRequest)(super.describeBackupAsync)

  abstract override def describeBackupAsync(
      describeBackupRequest: DescribeBackupRequest,
      asyncHandler: AsyncHandler[DescribeBackupRequest, DescribeBackupResult]
  ): Future[DescribeBackupResult] = collectJavaFuture("describeBackupAsync", (describeBackupRequest, asyncHandler)) {
    case (p1, p2) => super.describeBackupAsync(p1, p2)
  }

  abstract override def describeContinuousBackupsAsync(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest
  ): Future[DescribeContinuousBackupsResult] =
    collectJavaFuture("describeContinuousBackupsAsync", describeContinuousBackupsRequest)(
      super.describeContinuousBackupsAsync
    )

  abstract override def describeContinuousBackupsAsync(
      describeContinuousBackupsRequest: DescribeContinuousBackupsRequest,
      asyncHandler: AsyncHandler[DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult]
  ): Future[DescribeContinuousBackupsResult] =
    collectJavaFuture("describeContinuousBackupsAsync", (describeContinuousBackupsRequest, asyncHandler)) {
      case (p1, p2) => super.describeContinuousBackupsAsync(p1, p2)
    }

  abstract override def describeEndpointsAsync(
      describeEndpointsRequest: DescribeEndpointsRequest
  ): Future[DescribeEndpointsResult] =
    collectJavaFuture("describeEndpointsAsync", describeEndpointsRequest)(super.describeEndpointsAsync)

  abstract override def describeEndpointsAsync(
      describeEndpointsRequest: DescribeEndpointsRequest,
      asyncHandler: AsyncHandler[DescribeEndpointsRequest, DescribeEndpointsResult]
  ): Future[DescribeEndpointsResult] =
    collectJavaFuture("describeEndpointsAsync", (describeEndpointsRequest, asyncHandler)) {
      case (p1, p2) => super.describeEndpointsAsync(p1, p2)
    }

  abstract override def describeGlobalTableAsync(
      describeGlobalTableRequest: DescribeGlobalTableRequest
  ): Future[DescribeGlobalTableResult] =
    collectJavaFuture("describeGlobalTableAsync", describeGlobalTableRequest)(super.describeGlobalTableAsync)

  abstract override def describeGlobalTableAsync(
      describeGlobalTableRequest: DescribeGlobalTableRequest,
      asyncHandler: AsyncHandler[DescribeGlobalTableRequest, DescribeGlobalTableResult]
  ): Future[DescribeGlobalTableResult] =
    collectJavaFuture("describeGlobalTableAsync", (describeGlobalTableRequest, asyncHandler)) {
      case (p1, p2) => super.describeGlobalTableAsync(p1, p2)
    }

  abstract override def describeGlobalTableSettingsAsync(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest
  ): Future[DescribeGlobalTableSettingsResult] =
    collectJavaFuture("describeGlobalTableSettingsAsync", describeGlobalTableSettingsRequest)(
      super.describeGlobalTableSettingsAsync
    )

  abstract override def describeGlobalTableSettingsAsync(
      describeGlobalTableSettingsRequest: DescribeGlobalTableSettingsRequest,
      asyncHandler: AsyncHandler[DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult]
  ): Future[DescribeGlobalTableSettingsResult] =
    collectJavaFuture("describeGlobalTableSettingsAsync", (describeGlobalTableSettingsRequest, asyncHandler)) {
      case (p1, p2) => super.describeGlobalTableSettingsAsync(p1, p2)
    }

  abstract override def describeLimitsAsync(
      describeLimitsRequest: DescribeLimitsRequest
  ): Future[DescribeLimitsResult] =
    collectJavaFuture("describeLimitsAsync", describeLimitsRequest)(super.describeLimitsAsync)

  abstract override def describeLimitsAsync(
      describeLimitsRequest: DescribeLimitsRequest,
      asyncHandler: AsyncHandler[DescribeLimitsRequest, DescribeLimitsResult]
  ): Future[DescribeLimitsResult] = collectJavaFuture("describeLimitsAsync", (describeLimitsRequest, asyncHandler)) {
    case (p1, p2) => super.describeLimitsAsync(p1, p2)
  }

  abstract override def describeTableAsync(describeTableRequest: DescribeTableRequest): Future[DescribeTableResult] =
    collectJavaFuture("describeTableAsync", describeTableRequest)(super.describeTableAsync)

  abstract override def describeTableAsync(
      describeTableRequest: DescribeTableRequest,
      asyncHandler: AsyncHandler[DescribeTableRequest, DescribeTableResult]
  ): Future[DescribeTableResult] = collectJavaFuture("describeTableAsync", (describeTableRequest, asyncHandler)) {
    case (p1, p2) => super.describeTableAsync(p1, p2)
  }

  abstract override def describeTableAsync(tableName: String): Future[DescribeTableResult] =
    collectJavaFuture("describeTableAsync", tableName)(super.describeTableAsync)

  abstract override def describeTableAsync(
      tableName: String,
      asyncHandler: AsyncHandler[DescribeTableRequest, DescribeTableResult]
  ): Future[DescribeTableResult] = collectJavaFuture("describeTableAsync", (tableName, asyncHandler)) {
    case (p1, p2) => super.describeTableAsync(p1, p2)
  }

  abstract override def describeTimeToLiveAsync(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest
  ): Future[DescribeTimeToLiveResult] =
    collectJavaFuture("describeTimeToLiveAsync", describeTimeToLiveRequest)(super.describeTimeToLiveAsync)

  abstract override def describeTimeToLiveAsync(
      describeTimeToLiveRequest: DescribeTimeToLiveRequest,
      asyncHandler: AsyncHandler[DescribeTimeToLiveRequest, DescribeTimeToLiveResult]
  ): Future[DescribeTimeToLiveResult] =
    collectJavaFuture("describeTimeToLiveAsync", (describeTimeToLiveRequest, asyncHandler)) {
      case (p1, p2) => super.describeTimeToLiveAsync(p1, p2)
    }

  abstract override def getItemAsync(getItemRequest: GetItemRequest): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", getItemRequest)(super.getItemAsync)

  abstract override def getItemAsync(getItemRequest: GetItemRequest,
                                     asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", (getItemRequest, asyncHandler)) { case (p1, p2) => super.getItemAsync(p1, p2) }

  abstract override def getItemAsync(tableName: String, key: util.Map[String, AttributeValue]): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", (tableName, key)) { case (p1, p2) => super.getItemAsync(p1, p2) }

  abstract override def getItemAsync(tableName: String,
                                     key: util.Map[String, AttributeValue],
                                     asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", (tableName, key, asyncHandler)) {
      case (p1, p2, p3) => super.getItemAsync(p1, p2, p3)
    }

  abstract override def getItemAsync(tableName: String,
                                     key: util.Map[String, AttributeValue],
                                     consistentRead: lang.Boolean): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", (tableName, key, consistentRead)) {
      case (p1, p2, p3) => super.getItemAsync(p1, p2, p3)
    }

  abstract override def getItemAsync(tableName: String,
                                     key: util.Map[String, AttributeValue],
                                     consistentRead: lang.Boolean,
                                     asyncHandler: AsyncHandler[GetItemRequest, GetItemResult]): Future[GetItemResult] =
    collectJavaFuture("getItemAsync", (tableName, key, consistentRead, asyncHandler)) {
      case (p1, p2, p3, p4) => super.getItemAsync(p1, p2, p3, p4)
    }

  abstract override def listBackupsAsync(listBackupsRequest: ListBackupsRequest): Future[ListBackupsResult] =
    collectJavaFuture("listBackupsAsync", listBackupsRequest)(super.listBackupsAsync)

  abstract override def listBackupsAsync(
      listBackupsRequest: ListBackupsRequest,
      asyncHandler: AsyncHandler[ListBackupsRequest, ListBackupsResult]
  ): Future[ListBackupsResult] = collectJavaFuture("listBackupsAsync", (listBackupsRequest, asyncHandler)) {
    case (p1, p2) => super.listBackupsAsync(p1, p2)
  }

  abstract override def listGlobalTablesAsync(
      listGlobalTablesRequest: ListGlobalTablesRequest
  ): Future[ListGlobalTablesResult] =
    collectJavaFuture("listGlobalTablesAsync", listGlobalTablesRequest)(super.listGlobalTablesAsync)

  abstract override def listGlobalTablesAsync(
      listGlobalTablesRequest: ListGlobalTablesRequest,
      asyncHandler: AsyncHandler[ListGlobalTablesRequest, ListGlobalTablesResult]
  ): Future[ListGlobalTablesResult] =
    collectJavaFuture("listGlobalTablesAsync", (listGlobalTablesRequest, asyncHandler)) {
      case (p1, p2) => super.listGlobalTablesAsync(p1, p2)
    }

  abstract override def listTablesAsync(listTablesRequest: ListTablesRequest): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", listTablesRequest)(super.listTablesAsync)

  abstract override def listTablesAsync(
      listTablesRequest: ListTablesRequest,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = collectJavaFuture("listTablesAsync", (listTablesRequest, asyncHandler)) {
    case (p1, p2) => super.listTablesAsync(p1, p2)
  }

  abstract override def listTablesAsync(): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", ())(_ => super.listTablesAsync)

  abstract override def listTablesAsync(
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = collectJavaFuture("listTablesAsync", asyncHandler)(super.listTablesAsync)

  abstract override def listTablesAsync(exclusiveStartTableName: String): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", exclusiveStartTableName)(super.listTablesAsync)

  abstract override def listTablesAsync(
      exclusiveStartTableName: String,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = collectJavaFuture("listTablesAsync", (exclusiveStartTableName, asyncHandler)) {
    case (p1, p2) => super.listTablesAsync(p1, p2)
  }

  abstract override def listTablesAsync(exclusiveStartTableName: String, limit: Integer): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", (exclusiveStartTableName, limit)) {
      case (p1, p2) => super.listTablesAsync(p1, p2)
    }

  abstract override def listTablesAsync(
      exclusiveStartTableName: String,
      limit: Integer,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", (exclusiveStartTableName, limit, asyncHandler)) {
      case (p1, p2, p3) => super.listTablesAsync(p1, p2, p3)
    }

  abstract override def listTablesAsync(limit: Integer): Future[ListTablesResult] =
    collectJavaFuture("listTablesAsync", limit)(super.listTablesAsync)

  abstract override def listTablesAsync(
      limit: Integer,
      asyncHandler: AsyncHandler[ListTablesRequest, ListTablesResult]
  ): Future[ListTablesResult] = collectJavaFuture("listTablesAsync", (limit, asyncHandler)) {
    case (p1, p2) => super.listTablesAsync(p1, p2)
  }

  abstract override def listTagsOfResourceAsync(
      listTagsOfResourceRequest: ListTagsOfResourceRequest
  ): Future[ListTagsOfResourceResult] =
    collectJavaFuture("listTagsOfResourceAsync", listTagsOfResourceRequest)(super.listTagsOfResourceAsync)

  abstract override def listTagsOfResourceAsync(
      listTagsOfResourceRequest: ListTagsOfResourceRequest,
      asyncHandler: AsyncHandler[ListTagsOfResourceRequest, ListTagsOfResourceResult]
  ): Future[ListTagsOfResourceResult] =
    collectJavaFuture("listTagsOfResourceAsync", (listTagsOfResourceRequest, asyncHandler)) {
      case (p1, p2) => super.listTagsOfResourceAsync(p1, p2)
    }

  abstract override def putItemAsync(putItemRequest: PutItemRequest): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", putItemRequest)(super.putItemAsync)

  protected def collectJavaFuture[A, B](name: String, request: A)(f: A => Future[B]): Future[B] = {
    val start = currentTime
    CompletableFuture
      .supplyAsync(new Supplier[B] { override def get: B = f(request).get }).whenComplete(
        new BiConsumer[B, Throwable] {
          override def accept(t: B, u: Throwable): Unit = {
            reporter.record(name, currentTime - start)
            reporter.increment(name)
          }
        }
      )
  }

  abstract override def putItemAsync(putItemRequest: PutItemRequest,
                                     asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", (putItemRequest, asyncHandler)) { case (p1, p2) => super.putItemAsync(p1, p2) }

  abstract override def putItemAsync(tableName: String, item: util.Map[String, AttributeValue]): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", (tableName, item)) { case (p1, p2) => super.putItemAsync(p1, p2) }

  abstract override def putItemAsync(tableName: String,
                                     item: util.Map[String, AttributeValue],
                                     asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", (tableName, item, asyncHandler)) {
      case (p1, p2, p3) => super.putItemAsync(p1, p2, p3)
    }

  abstract override def putItemAsync(tableName: String,
                                     item: util.Map[String, AttributeValue],
                                     returnValues: String): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", (tableName, item, returnValues)) {
      case (p1, p2, p3) => super.putItemAsync(p1, p2, p3)
    }

  abstract override def putItemAsync(tableName: String,
                                     item: util.Map[String, AttributeValue],
                                     returnValues: String,
                                     asyncHandler: AsyncHandler[PutItemRequest, PutItemResult]): Future[PutItemResult] =
    collectJavaFuture("putItemAsync", (tableName, item, returnValues, asyncHandler)) {
      case (p1, p2, p3, p4) => super.putItemAsync(p1, p2, p3, p4)
    }

  abstract override def queryAsync(queryRequest: QueryRequest): Future[QueryResult] =
    collectJavaFuture("queryAsync", queryRequest)(super.queryAsync)

  abstract override def queryAsync(queryRequest: QueryRequest,
                                   asyncHandler: AsyncHandler[QueryRequest, QueryResult]): Future[QueryResult] =
    collectJavaFuture("queryAsync", (queryRequest, asyncHandler)) { case (p1, p2) => super.queryAsync(p1, p2) }

  abstract override def restoreTableFromBackupAsync(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest
  ): Future[RestoreTableFromBackupResult] =
    collectJavaFuture("restoreTableFromBackupAsync", restoreTableFromBackupRequest)(super.restoreTableFromBackupAsync)

  abstract override def restoreTableFromBackupAsync(
      restoreTableFromBackupRequest: RestoreTableFromBackupRequest,
      asyncHandler: AsyncHandler[RestoreTableFromBackupRequest, RestoreTableFromBackupResult]
  ): Future[RestoreTableFromBackupResult] =
    collectJavaFuture("restoreTableFromBackupAsync", (restoreTableFromBackupRequest, asyncHandler)) {
      case (p1, p2) => super.restoreTableFromBackupAsync(p1, p2)
    }

  abstract override def restoreTableToPointInTimeAsync(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest
  ): Future[RestoreTableToPointInTimeResult] =
    collectJavaFuture("restoreTableToPointInTimeAsync", restoreTableToPointInTimeRequest)(
      super.restoreTableToPointInTimeAsync
    )

  abstract override def restoreTableToPointInTimeAsync(
      restoreTableToPointInTimeRequest: RestoreTableToPointInTimeRequest,
      asyncHandler: AsyncHandler[RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult]
  ): Future[RestoreTableToPointInTimeResult] =
    collectJavaFuture("restoreTableToPointInTimeAsync", (restoreTableToPointInTimeRequest, asyncHandler)) {
      case (p1, p2) => super.restoreTableToPointInTimeAsync(p1, p2)
    }

  abstract override def scanAsync(scanRequest: ScanRequest): Future[ScanResult] =
    collectJavaFuture("scanAsync", scanRequest)(super.scanAsync)

  abstract override def scanAsync(scanRequest: ScanRequest,
                                  asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (scanRequest, asyncHandler)) { case (p1, p2) => super.scanAsync(p1, p2) }

  abstract override def scanAsync(tableName: String, attributesToGet: util.List[String]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, attributesToGet)) { case (p1, p2) => super.scanAsync(p1, p2) }

  abstract override def scanAsync(tableName: String,
                                  attributesToGet: util.List[String],
                                  asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, attributesToGet, asyncHandler)) {
      case (p1, p2, p3) => super.scanAsync(p1, p2, p3)
    }

  abstract override def scanAsync(tableName: String, scanFilter: util.Map[String, Condition]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, scanFilter)) { case (p1, p2) => super.scanAsync(p1, p2) }

  abstract override def scanAsync(tableName: String,
                                  scanFilter: util.Map[String, Condition],
                                  asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, scanFilter, asyncHandler)) {
      case (p1, p2, p3) => super.scanAsync(p1, p2, p3)
    }

  abstract override def scanAsync(tableName: String,
                                  attributesToGet: util.List[String],
                                  scanFilter: util.Map[String, Condition]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, attributesToGet, scanFilter)) {
      case (p1, p2, p3) => super.scanAsync(p1, p2, p3)
    }

  abstract override def scanAsync(tableName: String,
                                  attributesToGet: util.List[String],
                                  scanFilter: util.Map[String, Condition],
                                  asyncHandler: AsyncHandler[ScanRequest, ScanResult]): Future[ScanResult] =
    collectJavaFuture("scanAsync", (tableName, attributesToGet, scanFilter, asyncHandler)) {
      case (p1, p2, p3, p4) => super.scanAsync(p1, p2, p3, p4)
    }

  abstract override def tagResourceAsync(tagResourceRequest: TagResourceRequest): Future[TagResourceResult] =
    collectJavaFuture("tagResourceAsync", tagResourceRequest)(super.tagResourceAsync)

  abstract override def tagResourceAsync(
      tagResourceRequest: TagResourceRequest,
      asyncHandler: AsyncHandler[TagResourceRequest, TagResourceResult]
  ): Future[TagResourceResult] = collectJavaFuture("tagResourceAsync", (tagResourceRequest, asyncHandler)) {
    case (p1, p2) => super.tagResourceAsync(p1, p2)
  }

  abstract override def transactGetItemsAsync(
      transactGetItemsRequest: TransactGetItemsRequest
  ): Future[TransactGetItemsResult] =
    collectJavaFuture("transactGetItemsAsync", transactGetItemsRequest)(super.transactGetItemsAsync)

  abstract override def transactGetItemsAsync(
      transactGetItemsRequest: TransactGetItemsRequest,
      asyncHandler: AsyncHandler[TransactGetItemsRequest, TransactGetItemsResult]
  ): Future[TransactGetItemsResult] =
    collectJavaFuture("transactGetItemsAsync", (transactGetItemsRequest, asyncHandler)) {
      case (p1, p2) => super.transactGetItemsAsync(p1, p2)
    }

  abstract override def transactWriteItemsAsync(
      transactWriteItemsRequest: TransactWriteItemsRequest
  ): Future[TransactWriteItemsResult] =
    collectJavaFuture("transactWriteItemsAsync", transactWriteItemsRequest)(super.transactWriteItemsAsync)

  abstract override def transactWriteItemsAsync(
      transactWriteItemsRequest: TransactWriteItemsRequest,
      asyncHandler: AsyncHandler[TransactWriteItemsRequest, TransactWriteItemsResult]
  ): Future[TransactWriteItemsResult] =
    collectJavaFuture("transactWriteItemsAsync", (transactWriteItemsRequest, asyncHandler)) {
      case (p1, p2) => super.transactWriteItemsAsync(p1, p2)
    }

  abstract override def untagResourceAsync(untagResourceRequest: UntagResourceRequest): Future[UntagResourceResult] =
    collectJavaFuture("untagResourceRequest", untagResourceRequest)(super.untagResourceAsync)

  abstract override def untagResourceAsync(
      untagResourceRequest: UntagResourceRequest,
      asyncHandler: AsyncHandler[UntagResourceRequest, UntagResourceResult]
  ): Future[UntagResourceResult] =
    collectJavaFuture("untagResourceAsync", (untagResourceRequest, asyncHandler)) {
      case (p1, p2) => super.untagResourceAsync(p1, p2)
    }

  abstract override def updateContinuousBackupsAsync(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest
  ): Future[UpdateContinuousBackupsResult] =
    collectJavaFuture("updateContinuousBackupsAsync", updateContinuousBackupsRequest)(
      super.updateContinuousBackupsAsync
    )

  abstract override def updateContinuousBackupsAsync(
      updateContinuousBackupsRequest: UpdateContinuousBackupsRequest,
      asyncHandler: AsyncHandler[UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult]
  ): Future[UpdateContinuousBackupsResult] =
    collectJavaFuture("updateContinuousBackupsAsync", (updateContinuousBackupsRequest, asyncHandler)) {
      case (p1, p2) => super.updateContinuousBackupsAsync(p1, p2)
    }

  abstract override def updateGlobalTableAsync(
      updateGlobalTableRequest: UpdateGlobalTableRequest
  ): Future[UpdateGlobalTableResult] =
    collectJavaFuture("updateGlobalTableAsync", updateGlobalTableRequest)(super.updateGlobalTableAsync)

  abstract override def updateGlobalTableAsync(
      updateGlobalTableRequest: UpdateGlobalTableRequest,
      asyncHandler: AsyncHandler[UpdateGlobalTableRequest, UpdateGlobalTableResult]
  ): Future[UpdateGlobalTableResult] =
    collectJavaFuture("updateGlobalTableAsync", (updateGlobalTableRequest, asyncHandler)) {
      case (p1, p2) => super.updateGlobalTableAsync(p1, p2)
    }

  abstract override def updateGlobalTableSettingsAsync(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest
  ): Future[UpdateGlobalTableSettingsResult] =
    collectJavaFuture("updateGlobalTableSettingsAsync", updateGlobalTableSettingsRequest)(
      super.updateGlobalTableSettingsAsync
    )

  abstract override def updateGlobalTableSettingsAsync(
      updateGlobalTableSettingsRequest: UpdateGlobalTableSettingsRequest,
      asyncHandler: AsyncHandler[UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult]
  ): Future[UpdateGlobalTableSettingsResult] =
    collectJavaFuture("updateGlobalTableSettingsAsync", (updateGlobalTableSettingsRequest, asyncHandler)) {
      case (p1, p2) => super.updateGlobalTableSettingsAsync(p1, p2)
    }

  abstract override def updateItemAsync(updateItemRequest: UpdateItemRequest): Future[UpdateItemResult] =
    collectJavaFuture("updateItemAsync", updateItemRequest)(super.updateItemAsync)

  abstract override def updateItemAsync(
      updateItemRequest: UpdateItemRequest,
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] = collectJavaFuture("updateItemAsync", (updateItemRequest, asyncHandler)) {
    case (p1, p2) => super.updateItemAsync(p1, p2)
  }

  abstract override def updateItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      attributeUpdates: util.Map[String, AttributeValueUpdate]
  ): Future[UpdateItemResult] =
    collectJavaFuture("updateItemAsync", (tableName, key, attributeUpdates)) {
      case (p1, p2, p3) => super.updateItemAsync(p1, p2, p3)
    }

  abstract override def updateItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      attributeUpdates: util.Map[String, AttributeValueUpdate],
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] = collectJavaFuture("updateItemAsync", (tableName, key, attributeUpdates, asyncHandler)) {
    case (p1, p2, p3, p4) => super.updateItemAsync(p1, p2, p3, p4)
  }

  abstract override def updateItemAsync(tableName: String,
                                        key: util.Map[String, AttributeValue],
                                        attributeUpdates: util.Map[String, AttributeValueUpdate],
                                        returnValues: String): Future[UpdateItemResult] =
    collectJavaFuture("updateItemAsync", (tableName, key, attributeUpdates, returnValues)) {
      case (p1, p2, p3, p4) => super.updateItemAsync(p1, p2, p3, p4)
    }

  abstract override def updateItemAsync(
      tableName: String,
      key: util.Map[String, AttributeValue],
      attributeUpdates: util.Map[String, AttributeValueUpdate],
      returnValues: String,
      asyncHandler: AsyncHandler[UpdateItemRequest, UpdateItemResult]
  ): Future[UpdateItemResult] =
    collectJavaFuture("updateItemAsync", (tableName, key, attributeUpdates, returnValues, asyncHandler)) {
      case (p1, p2, p3, p4, p5) => super.updateItemAsync(p1, p2, p3, p4, p5)
    }

  abstract override def updateTableAsync(updateTableRequest: UpdateTableRequest): Future[UpdateTableResult] =
    collectJavaFuture("updateTableAsync", updateTableRequest)(super.updateTableAsync)

  abstract override def updateTableAsync(
      updateTableRequest: UpdateTableRequest,
      asyncHandler: AsyncHandler[UpdateTableRequest, UpdateTableResult]
  ): Future[UpdateTableResult] = collectJavaFuture("updateTableAsync", (updateTableRequest, asyncHandler)) {
    case (p1, p2) => super.updateTableAsync(p1, p2)
  }

  abstract override def updateTableAsync(tableName: String,
                                         provisionedThroughput: ProvisionedThroughput): Future[UpdateTableResult] =
    collectJavaFuture("updateTableAsync", (tableName, provisionedThroughput)) {
      case (p1, p2) => super.updateTableAsync(p1, p2)
    }

  abstract override def updateTableAsync(
      tableName: String,
      provisionedThroughput: ProvisionedThroughput,
      asyncHandler: AsyncHandler[UpdateTableRequest, UpdateTableResult]
  ): Future[UpdateTableResult] =
    collectJavaFuture("updateTableAsync", (tableName, provisionedThroughput, asyncHandler)) {
      case (p1, p2, p3) => super.updateTableAsync(p1, p2, p3)
    }

  abstract override def updateTimeToLiveAsync(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest
  ): Future[UpdateTimeToLiveResult] =
    collectJavaFuture("updateTimeToLiveAsync", updateTimeToLiveRequest)(super.updateTimeToLiveAsync)

  abstract override def updateTimeToLiveAsync(
      updateTimeToLiveRequest: UpdateTimeToLiveRequest,
      asyncHandler: AsyncHandler[UpdateTimeToLiveRequest, UpdateTimeToLiveResult]
  ): Future[UpdateTimeToLiveResult] =
    collectJavaFuture("updateTimeToLiveAsync", (updateTimeToLiveRequest, asyncHandler)) {
      case (p1, p2) => super.updateTimeToLiveAsync(p1, p2)
    }
}
