package com.github.j5ik2o.reactive.aws.sqs.akka

import com.github.j5ik2o.reactive.aws.sqs.SQSAsyncClient

private[sqs] class SQSStreamClientImpl(override val underlying: SQSAsyncClient) extends SQSStreamClient
