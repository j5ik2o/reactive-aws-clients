package com.github.j5ik2o.reactive.kinesis.model

final case class IncreaseStreamRetentionPeriodRequest(streamName: Option[String] = None,
                                                      retentionPeriodHours: Option[Int] = None) {

  def withStreamName(value: Option[String]): IncreaseStreamRetentionPeriodRequest = copy(streamName = value)
  def withRetentionPeriodHours(value: Option[Int]): IncreaseStreamRetentionPeriodRequest =
    copy(retentionPeriodHours = value)

}
