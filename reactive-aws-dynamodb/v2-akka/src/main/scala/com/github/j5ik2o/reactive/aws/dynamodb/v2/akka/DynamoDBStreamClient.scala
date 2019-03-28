// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.akka.{ DynamoDBStreamClient => BaseDynamoDBStreamClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBStreamClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

}

trait DynamoDBStreamClient extends BaseDynamoDBStreamClient with DynamoDBStreamClientSupport {
  override val underlying: DynamoDBAsyncClient
  def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.batchGetItemPaginator(request))
    }

  def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed] = Flow[ListTablesRequest].flatMapConcat {
    request =>
      Source.fromPublisher(underlying.listTablesPaginator(request))
  }

  def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed] = Flow[QueryRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.queryPaginator(request))
  }

  def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed] = Flow[ScanRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.scanPaginator(request))
  }

}
