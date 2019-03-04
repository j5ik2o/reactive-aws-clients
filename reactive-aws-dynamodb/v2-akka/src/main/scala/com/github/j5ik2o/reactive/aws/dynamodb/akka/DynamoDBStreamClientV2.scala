package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBAsyncClientV2
import com.github.j5ik2o.reactive.aws.dynamodb.model._

object DynamoDBStreamClientV2 {

  def apply(underlying: DynamoDBAsyncClientV2): DynamoDBStreamClientV2 = new DynamoDBStreamClientV2Impl(underlying)

}
trait DynamoDBStreamClientV2 extends DynamoDBStreamClient {

  def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed]

  def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed]

  def listTablesSource: Source[ListTablesResponse, NotUsed]

  def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed]

  def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed]

}
