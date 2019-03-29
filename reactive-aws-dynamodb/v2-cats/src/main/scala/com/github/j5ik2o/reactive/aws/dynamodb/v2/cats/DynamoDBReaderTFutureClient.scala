// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import com.github.j5ik2o.reactive.aws.dynamodb.cats.{ DynamoDBReaderTFutureClient => BaseDynamoDBReaderTFutureClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.model.rs._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBReaderTFutureClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBReaderTFutureClient =
    new DynamoDBReaderTFutureClientImpl(underlying)

}

trait DynamoDBReaderTFutureClient extends BaseDynamoDBReaderTFutureClient {

  val underlying: DynamoDBAsyncClient

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): BatchGetItemPublisher =
    underlying.batchGetItemPaginator(batchGetItemRequest)

  def listTablesPaginator(listTablesRequest: ListTablesRequest): ListTablesPublisher =
    underlying.listTablesPaginator(listTablesRequest)

  def queryPaginator(queryRequest: QueryRequest): QueryPublisher =
    underlying.queryPaginator(queryRequest)

  def scanPaginator(scanRequest: ScanRequest): ScanPublisher =
    underlying.scanPaginator(scanRequest)

}
