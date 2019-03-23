package com.github.j5ik2o.reactive.aws.kinesis.model

final case class Consumer(
    consumerName: Option[String] = None,
    consumerARN: Option[String] = None,
    consumerStatus: Option[ConsumerStatus] = None,
    consumerCreationTimestamp: Option[java.time.Instant] = None
) {
  def withConsumerName(value: Option[String]): Consumer =
    copy(consumerName = value)
  def withConsumerARN(value: Option[String]): Consumer =
    copy(consumerARN = value)
  def withConsumerStatus(value: Option[ConsumerStatus]): Consumer =
    copy(consumerStatus = value)
  def withConsumerCreationTimestamp(value: Option[java.time.Instant]): Consumer =
    copy(consumerCreationTimestamp = value)
}
