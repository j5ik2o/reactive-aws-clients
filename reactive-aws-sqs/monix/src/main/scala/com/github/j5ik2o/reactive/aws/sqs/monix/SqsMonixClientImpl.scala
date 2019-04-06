package com.github.j5ik2o.reactive.aws.sqs.monix

import com.github.j5ik2o.reactive.aws.sqs.SqsAsyncClient

private[sqs] class SqsMonixClientImpl(override val underlying: SqsAsyncClient) extends SqsMonixClient
