package com.github.j5ik2o.reactive.aws.dynamodb.v1.cats

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync
import com.github.j5ik2o.reactive.aws.dynamodb.cats.{ DynamoDBAsyncClient => BaseDynamoDBAsyncClient }

object DynamoDBAsyncClient {

  def apply(underlying: AmazonDynamoDBAsync): DynamoDBAsyncClient =
    new DynamoDBAsyncClientImpl(underlying)

}

trait DynamoDBAsyncClient extends BaseDynamoDBAsyncClient {
  val underlying: AmazonDynamoDBAsync
}
