// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.akka

import akka.NotUsed
import akka.stream.scaladsl.Flow
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBStreamClientV2 {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClientV2 = new DynamoDBStreamClientV2Impl(underlying)

}

trait DynamoDBStreamClientV2 extends DynamoDBStreamClient with DynamoDBStreamClientV2Support {

  def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed]

  def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed]

  def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed]

  def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed]

}
