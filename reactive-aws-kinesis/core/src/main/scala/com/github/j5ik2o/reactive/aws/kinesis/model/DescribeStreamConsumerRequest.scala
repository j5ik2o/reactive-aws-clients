package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DescribeStreamConsumerRequest(
    streamARN: Option[String] = None, // String
    consumerName: Option[String] = None, // String
    consumerARN: Option[String] = None // String
) {
  def withStreamARN(value: Option[String]): DescribeStreamConsumerRequest =
    copy(streamARN = value)
  def withConsumerName(value: Option[String]): DescribeStreamConsumerRequest =
    copy(consumerName = value)
  def withConsumerARN(value: Option[String]): DescribeStreamConsumerRequest =
    copy(consumerARN = value)
}
