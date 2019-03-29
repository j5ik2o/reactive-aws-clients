package com.github.j5ik2o.reactive.aws.dynamodb.v2.cats

import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient

private[cats] class DynamoDBReaderTFutureClientImpl(override val underlying: DynamoDBAsyncClient)
    extends DynamoDBReaderTFutureClient
