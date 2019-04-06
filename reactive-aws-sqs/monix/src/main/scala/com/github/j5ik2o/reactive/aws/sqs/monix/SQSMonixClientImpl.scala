package com.github.j5ik2o.reactive.aws.sqs.monix

import com.github.j5ik2o.reactive.aws.sqs.SQSAsyncClient
import monix.eval.Task
import software.amazon.awssdk.services.sqs.model.ListQueuesResponse

private[sqs] class SQSMonixClientImpl(override val underlying: SQSAsyncClient) extends SQSMonixClient {}
