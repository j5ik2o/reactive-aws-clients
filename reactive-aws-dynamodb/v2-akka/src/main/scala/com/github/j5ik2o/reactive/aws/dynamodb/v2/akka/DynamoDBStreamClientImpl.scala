package com.github.j5ik2o.reactive.aws.dynamodb.v2.akka

import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

private[dynamodb] class DynamoDBStreamClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBStreamClient
