package com.github.j5ik2o.reactive.aws.kinesis.model

final case class RegisterStreamConsumerRequest(
    streamARN: Option[String] = None,
    consumerName: Option[String] = None
) {
  def withStreamARN(value: Option[String]): RegisterStreamConsumerRequest =
    copy(streamARN = value)
  def withConsumerName(value: Option[String]): RegisterStreamConsumerRequest =
    copy(consumerName = value)
}
