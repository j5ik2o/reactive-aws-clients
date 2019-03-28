package com.github.j5ik2o.reactive.aws.dynamodb.v1

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.github.j5ik2o.reactive.aws.dynamodb.DynamoDBClient

object DynamoDBSyncClient {

  def apply(underlying: AmazonDynamoDB): DynamoDBSyncClient = new DynamoDBSyncClientImpl(underlying)

}

trait DynamoDBSyncClient extends DynamoDBClient[Either[Throwable, ?]] {
  val underlying: AmazonDynamoDB
}
