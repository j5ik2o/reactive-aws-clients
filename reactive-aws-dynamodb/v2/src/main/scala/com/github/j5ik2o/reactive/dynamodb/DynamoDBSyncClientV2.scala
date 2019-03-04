package com.github.j5ik2o.reactive.dynamodb

import software.amazon.awssdk.services.dynamodb.DynamoDbClient

object DynamoDBSyncClientV2 {

  def apply(underlying: DynamoDbClient): DynamoDBSyncClientV2 = new DynamoDBSyncClientV2Impl(underlying)

}

trait DynamoDBSyncClientV2 extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: DynamoDbClient
}
