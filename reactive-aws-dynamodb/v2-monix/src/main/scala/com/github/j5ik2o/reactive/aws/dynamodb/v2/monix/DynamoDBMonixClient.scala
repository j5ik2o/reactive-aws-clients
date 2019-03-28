package com.github.j5ik2o.reactive.aws.dynamodb.v2.monix

import com.github.j5ik2o.reactive.aws.dynamodb.monix.{ DynamoDBMonixClient => BaseDynamoDBMonixClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient
import monix.reactive.Observable

object DynamoDBMonixClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends BaseDynamoDBMonixClient {

  override val underlying: DynamoDBAsyncClient

  def batchGetItemPaginator(request: BatchGetItemRequest): Observable[BatchGetItemResponse] =
    Observable.fromReactivePublisher(underlying.batchGetItemPaginator(request))

  def listTablesPaginator: Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator())

  def listTablesPaginator(request: ListTablesRequest): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator(request))

  def queryPaginator(request: QueryRequest): Observable[QueryResponse] =
    Observable.fromReactivePublisher(underlying.queryPaginator(request))

  def scanPaginator(request: ScanRequest): Observable[ScanResponse] =
    Observable.fromReactivePublisher(underlying.scanPaginator(request))

}
