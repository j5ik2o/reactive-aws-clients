package com.github.j5ik2o.reactive.kinesis.model

final case class DecreaseStreamRetentionPeriodRequest(streamName: Option[String] = None,
                                                      retentionPeriodHours: Option[Int] = None) {
  def withStreamName(value: Option[String]): DecreaseStreamRetentionPeriodRequest = copy(streamName = value)
  def withRetentionPeriodHours(value: Option[Int]): DecreaseStreamRetentionPeriodRequest =
    copy(retentionPeriodHours = value)
}
