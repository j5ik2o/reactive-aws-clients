package com.github.j5ik2o.reactive.kinesis.model

import java.time.Instant

final case class Consumer(consumerName: Option[String] = None,
                          consumerARN: Option[String] = None,
                          consumerStatus: Option[ConsumerStatus] = None,
                          consumerCreationTimestamp: Option[Instant] = None) {
  def withConsumerName(value: Option[String]): Consumer               = copy(consumerName = value)
  def withConsumerARN(value: Option[String]): Consumer                = copy(consumerARN = value)
  def withConsumerStatus(value: Option[ConsumerStatus]): Consumer     = copy(consumerStatus = value)
  def withConsumerCreationTimestamp(value: Option[Instant]): Consumer = copy(consumerCreationTimestamp = value)
}
