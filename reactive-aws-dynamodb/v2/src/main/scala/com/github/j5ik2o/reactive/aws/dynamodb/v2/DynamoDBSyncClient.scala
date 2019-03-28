// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2

import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient
import com.github.j5ik2o.reactive.aws.dynamodb.model._
import software.amazon.awssdk.services.dynamodb.DynamoDbClient

object DynamoDBSyncClient {

  def apply(underlying: DynamoDbClient): DynamoDBSyncClient = new DynamoDBSyncClientImpl(underlying)

}

trait DynamoDBSyncClient extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: DynamoDbClient

  def batchGetItemPaginator(batchGetItemRequest: BatchGetItemRequest): rs.BatchGetItemIterable

  def listTablesPaginator(): rs.ListTablesIterable

  def listTablesPaginator(listTablesRequest: ListTablesRequest): rs.ListTablesIterable

  def queryPaginator(queryRequest: QueryRequest): rs.QueryIterable

  def scanPaginator(scanRequest: ScanRequest): rs.ScanIterable

}
