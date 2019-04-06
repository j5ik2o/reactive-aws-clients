package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.{ SqsAsyncClient => JavaSqsAsyncClient }

private[sqs] class SqsAsyncClientImpl(override val underlying: JavaSqsAsyncClient) extends SqsAsyncClient
