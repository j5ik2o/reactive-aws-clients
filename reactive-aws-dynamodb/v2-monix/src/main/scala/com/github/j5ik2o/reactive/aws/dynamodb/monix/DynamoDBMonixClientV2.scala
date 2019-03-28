package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient
import monix.reactive.Observable

object DynamoDBMonixClientV2 {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClientV2 = new DynamoDBMonixClientV2Impl(underlying)

}

trait DynamoDBMonixClientV2 extends DynamoDBMonixClient {

  def batchGetItemPaginator(request: BatchGetItemRequest): Observable[BatchGetItemResponse]

  def listTablesPaginator: Observable[ListTablesResponse]

  def listTablesPaginator(request: ListTablesRequest): Observable[ListTablesResponse]

  def queryPaginator(request: QueryRequest): Observable[QueryResponse]

  def scanPaginator(request: ScanRequest): Observable[ScanResponse]

}
