// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

private[dynamodb] class DynamoDBStreamClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBStreamClient {

  override def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed] =
    Flow[BatchGetItemRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.batchGetItemPaginator(request))
    }

  override def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed] =
    Flow[ListTablesRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listTablesPaginator(request))
    }

  override def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed] = Flow[QueryRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.queryPaginator(request))
  }

  override def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed] = Flow[ScanRequest].flatMapConcat { request =>
    Source.fromPublisher(underlying.scanPaginator(request))
  }

}
