package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DeleteStreamRequest(
    streamName: Option[String] = None, // String
    enforceConsumerDeletion: Option[Boolean] = None // Boolean
) {
  def withStreamName(value: Option[String]): DeleteStreamRequest =
    copy(streamName = value)
  def withEnforceConsumerDeletion(value: Option[Boolean]): DeleteStreamRequest =
    copy(enforceConsumerDeletion = value)
}
