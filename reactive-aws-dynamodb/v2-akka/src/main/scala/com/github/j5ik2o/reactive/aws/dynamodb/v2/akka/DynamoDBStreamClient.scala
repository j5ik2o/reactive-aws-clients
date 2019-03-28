// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import akka.NotUsed
import akka.stream.scaladsl.Flow
import com.github.j5ik2o.reactive.aws.dynamodb.akka
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

object DynamoDBStreamClient {

  def apply(underlying: DynamoDBAsyncClient): DynamoDBStreamClient = new DynamoDBStreamClientImpl(underlying)

}

trait DynamoDBStreamClient extends akka.DynamoDBStreamClient with DynamoDBStreamClientSupport {

  def batchGetItemFlow: Flow[BatchGetItemRequest, BatchGetItemResponse, NotUsed]

  def listTablesFlow: Flow[ListTablesRequest, ListTablesResponse, NotUsed]

  def queryFlow: Flow[QueryRequest, QueryResponse, NotUsed]

  def scanFlow: Flow[ScanRequest, ScanResponse, NotUsed]

}
