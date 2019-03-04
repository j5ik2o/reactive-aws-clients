package com.github.j5ik2o.reactive.kinesis.model

final case class DeleteStreamRequest(streamName: Option[String] = None,
                                     enforceConsumerDeletion: Option[Boolean] = None) {
  def withStreamName(value: Option[String]): DeleteStreamRequest               = copy(streamName = value)
  def withEnforceConsumerDeletion(value: Option[Boolean]): DeleteStreamRequest = copy(enforceConsumerDeletion = value)
}
