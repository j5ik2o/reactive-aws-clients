package com.github.j5ik2o.reactive.aws.sqs

import software.amazon.awssdk.services.sqs.{ SqsClient => JavaSQSSyncClient }

private[sqs] class SqsSyncClientImpl(override val underlying: JavaSQSSyncClient) extends SqsSyncClient
