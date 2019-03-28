// Auto-Generated
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

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): Observable[BatchGetItemResponse] =
    Observable.fromReactivePublisher(underlying.batchGetItemPaginator(batchGetItemRequest))

  def listTablesPaginator(listTablesRequest: ListTablesRequest): Observable[ListTablesResponse] =
    Observable.fromReactivePublisher(underlying.listTablesPaginator(listTablesRequest))

  def queryPaginator(queryRequest: QueryRequest): Observable[QueryResponse] =
    Observable.fromReactivePublisher(underlying.queryPaginator(queryRequest))

  def scanPaginator(scanRequest: ScanRequest): Observable[ScanResponse] =
    Observable.fromReactivePublisher(underlying.scanPaginator(scanRequest))

}
