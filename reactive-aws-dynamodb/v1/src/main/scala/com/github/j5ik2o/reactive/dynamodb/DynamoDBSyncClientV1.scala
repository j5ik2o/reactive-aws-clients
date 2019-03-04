package com.github.j5ik2o.reactive.dynamodb

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB

object DynamoDBSyncClientV1 {

  def apply(underlying: AmazonDynamoDB): DynamoDBSyncClientV1 = new DynamoDBSyncClientV1Impl(underlying)

}

trait DynamoDBSyncClientV1 extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: AmazonDynamoDB
}
