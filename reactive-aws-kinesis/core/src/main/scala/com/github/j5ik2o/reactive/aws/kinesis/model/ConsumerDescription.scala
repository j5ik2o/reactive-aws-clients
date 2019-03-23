package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ConsumerDescription(
    consumerName: Option[String] = None,
    consumerARN: Option[String] = None,
    consumerStatus: Option[ConsumerStatus] = None,
    consumerCreationTimestamp: Option[java.time.Instant] = None,
    streamARN: Option[String] = None
) {
  def withConsumerName(value: Option[String]): ConsumerDescription =
    copy(consumerName = value)
  def withConsumerARN(value: Option[String]): ConsumerDescription =
    copy(consumerARN = value)
  def withConsumerStatus(value: Option[ConsumerStatus]): ConsumerDescription =
    copy(consumerStatus = value)
  def withConsumerCreationTimestamp(value: Option[java.time.Instant]): ConsumerDescription =
    copy(consumerCreationTimestamp = value)
  def withStreamARN(value: Option[String]): ConsumerDescription =
    copy(streamARN = value)
}
