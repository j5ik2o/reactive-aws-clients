// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb

import java.util.concurrent.CompletableFuture

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

import scala.compat.java8.FutureConverters
import scala.concurrent.{ ExecutionContext, Future }

object DynamoDBAsyncClientV2 {

  def apply(underlying: DynamoDbAsyncClient)(implicit ec: ExecutionContext): DynamoDBAsyncClientV2 =
    new DynamoDBAsyncClientV2Impl(underlying)

  implicit class CompletableFutureOps[A](val cf: CompletableFuture[A]) extends AnyVal {
    def toFuture: Future[A] = FutureConverters.toScala(cf)
  }

}

trait DynamoDBAsyncClientV2 extends DynamoDBClient[Future] {
  val underlying: DynamoDbAsyncClient

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): rs.BatchGetItemPublisher

  def listTablesPaginator(): rs.ListTablesPublisher

  def listTablesPaginator(listTablesRequest: ListTablesRequest): rs.ListTablesPublisher

  def queryPaginator(queryRequest: QueryRequest): rs.QueryPublisher

  def scanPaginator(scanRequest: ScanRequest): rs.ScanPublisher

}
