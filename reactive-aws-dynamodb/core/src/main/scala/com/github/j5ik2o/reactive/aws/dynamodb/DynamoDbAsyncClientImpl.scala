package com.github.j5ik2o.reactive.aws.dynamodb

import software.amazon.awssdk.services.dynamodb.{ DynamoDbAsyncClient => JavaDynamoDbAsyncClient }

private[dynamodb] class DynamoDbAsyncClientImpl(override val underlying: JavaDynamoDbAsyncClient)
    extends DynamoDbAsyncClient
