package com.github.j5ik2o.reactive.aws.dynamodb

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

object DynamoDBSyncClientV2 {

  def apply(underlying: DynamoDbClient): DynamoDBSyncClientV2 = new DynamoDBSyncClientV2Impl(underlying)

}

trait DynamoDBSyncClientV2 extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: DynamoDbClient

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): rs.BatchGetItemIterable

  def listTablesPaginator(): rs.ListTablesIterable

  def listTablesPaginator(listTablesRequest: ListTablesRequest): rs.ListTablesIterable

  def queryPaginator(queryRequest: QueryRequest): rs.QueryIterable

  def scanPaginator(scanRequest: ScanRequest): rs.ScanIterable

}
