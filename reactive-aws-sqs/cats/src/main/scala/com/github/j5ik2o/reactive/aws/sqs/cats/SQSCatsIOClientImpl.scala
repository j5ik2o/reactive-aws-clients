package com.github.j5ik2o.reactive.aws.sqs.cats

import com.github.j5ik2o.reactive.aws.sqs.SQSAsyncClient

private[sqs] class SQSCatsIOClientImpl(override val underlying: SQSAsyncClient) extends SQSCatsIOClient
