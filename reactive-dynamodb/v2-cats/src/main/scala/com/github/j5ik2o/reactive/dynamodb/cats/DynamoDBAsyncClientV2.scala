package com.github.j5ik2o.reactive.dynamodb.cats

import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

object DynamoDBAsyncClientV2 {

  def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClientV2 =
    new DynamoDBAsyncClientV2Impl(underlying)

}

trait DynamoDBAsyncClientV2 extends DynamoDBAsyncClient {
  val underlying: DynamoDbAsyncClient
}
