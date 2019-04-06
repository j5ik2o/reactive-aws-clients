package com.github.j5ik2o.reactive.aws.sqs.akka

import com.github.j5ik2o.reactive.aws.sqs.SqsAsyncClient

private[sqs] class SqsAkkaClientImpl(override val underlying: SqsAsyncClient) extends SqsAkkaClient
