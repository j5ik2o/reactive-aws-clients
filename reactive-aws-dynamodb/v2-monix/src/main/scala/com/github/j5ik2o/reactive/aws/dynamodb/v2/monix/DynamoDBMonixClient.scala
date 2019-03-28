package com.github.j5ik2o.reactive.aws.dynamodb.v2.monix

import com.github.j5ik2o.reactive.aws.dynamodb.monix.{ DynamoDBMonixClient => BaseDynamoDBMonixClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient
import monix.reactive.Observable

object DynamoDBMonixClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends BaseDynamoDBMonixClient {

  def batchGetItemPaginator(request: BatchGetItemRequest): Observable[BatchGetItemResponse]

  def listTablesPaginator: Observable[ListTablesResponse]

  def listTablesPaginator(request: ListTablesRequest): Observable[ListTablesResponse]

  def queryPaginator(request: QueryRequest): Observable[QueryResponse]

  def scanPaginator(request: ScanRequest): Observable[ScanResponse]

}
