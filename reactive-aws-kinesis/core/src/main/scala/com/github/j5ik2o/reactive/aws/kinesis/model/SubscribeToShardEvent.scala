package com.github.j5ik2o.reactive.aws.kinesis.model

final case class SubscribeToShardEvent(
    records: Option[Seq[Record]] = None, // Seq[Record]
    continuationSequenceNumber: Option[String] = None, // String
    millisBehindLatest: Option[Long] = None // Long
) {
  def withRecords(value: Option[Seq[Record]]): SubscribeToShardEvent =
    copy(records = value)
  def withContinuationSequenceNumber(value: Option[String]): SubscribeToShardEvent =
    copy(continuationSequenceNumber = value)
  def withMillisBehindLatest(value: Option[Long]): SubscribeToShardEvent =
    copy(millisBehindLatest = value)
}
