package com.github.j5ik2o.reactive.aws.sqs.cats

import com.github.j5ik2o.reactive.aws.sqs.SqsAsyncClient

private[sqs] class SqsCatsIOClientImpl(override val underlying: SqsAsyncClient) extends SqsCatsIOClient
