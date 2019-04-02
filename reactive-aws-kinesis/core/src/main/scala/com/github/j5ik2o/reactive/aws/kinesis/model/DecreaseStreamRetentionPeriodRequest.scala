package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DecreaseStreamRetentionPeriodRequest(
    streamName: Option[String] = None, // String
    retentionPeriodHours: Option[Int] = None // Int
) {
  def withStreamName(value: Option[String]): DecreaseStreamRetentionPeriodRequest =
    copy(streamName = value)
  def withRetentionPeriodHours(value: Option[Int]): DecreaseStreamRetentionPeriodRequest =
    copy(retentionPeriodHours = value)
}
