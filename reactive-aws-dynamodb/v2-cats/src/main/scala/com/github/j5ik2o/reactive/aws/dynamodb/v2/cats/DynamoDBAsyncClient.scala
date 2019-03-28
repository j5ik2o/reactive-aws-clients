package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import com.github.j5ik2o.reactive.aws.dynamodb.cats.{ DynamoDBAsyncClient => BaseDynamoDBAsyncClient }
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

object DynamoDBAsyncClient {

  def apply(underlying: DynamoDbAsyncClient): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends BaseDynamoDBAsyncClient {
  val underlying: DynamoDbAsyncClient
}
