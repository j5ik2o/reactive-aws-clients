package com.github.j5ik2o.reactive.aws.dynamodb.monix

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClientV2
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import monix.reactive.Observable

private[dynamodb] class DynamoDBTaskClientV2Impl(override val underlying: DynamoDBAsyncClientV2)
    extends DynamoDBTaskClientV2 {

  override def batchGetItemPaginator(request: BatchGetItemRequest): Observable[BatchGetItemResponse] =
    Observable.fromReactivePublisher(underlying.batchGetItemPaginator(request))

  override def listTablesPaginator: Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator())

  override def listTablesPaginator(request: ListTablesRequest): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator(request))

  override def queryPaginator(request: QueryRequest): Observable[QueryResponse] =
    Observable.fromReactivePublisher(underlying.queryPaginator(request))

  override def scanPaginator(request: ScanRequest): Observable[ScanResponse] =
    Observable.fromReactivePublisher(underlying.scanPaginator(request))

}
