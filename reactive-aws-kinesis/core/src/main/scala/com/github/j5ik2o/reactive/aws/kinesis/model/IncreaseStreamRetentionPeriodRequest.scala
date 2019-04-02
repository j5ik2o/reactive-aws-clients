package com.github.j5ik2o.reactive.aws.kinesis.model

final case class IncreaseStreamRetentionPeriodRequest(
    streamName: Option[String] = None, // String
    retentionPeriodHours: Option[Int] = None // Int
) {
  def withStreamName(value: Option[String]): IncreaseStreamRetentionPeriodRequest =
    copy(streamName = value)
  def withRetentionPeriodHours(value: Option[Int]): IncreaseStreamRetentionPeriodRequest =
    copy(retentionPeriodHours = value)
}
