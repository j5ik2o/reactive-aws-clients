package com.github.j5ik2o.reactive.aws.dynamodb.cats

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync

object DynamoDBAsyncClientV1 {

  def apply(underlying: AmazonDynamoDBAsync): DynamoDBAsyncClientV1 =
    new DynamoDBAsyncClientV1Impl(underlying)

}

trait DynamoDBAsyncClientV1 extends DynamoDBAsyncClient {
  val underlying: AmazonDynamoDBAsync
}
