package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DeregisterStreamConsumerRequest(
    streamARN: Option[String] = None,
    consumerName: Option[String] = None,
    consumerARN: Option[String] = None
) {
  def withStreamARN(value: Option[String]): DeregisterStreamConsumerRequest =
    copy(streamARN = value)
  def withConsumerName(value: Option[String]): DeregisterStreamConsumerRequest =
    copy(consumerName = value)
  def withConsumerARN(value: Option[String]): DeregisterStreamConsumerRequest =
    copy(consumerARN = value)
}
