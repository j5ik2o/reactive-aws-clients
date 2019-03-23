package com.github.j5ik2o.reactive.aws.kinesis.model

final case class SubscribeToShardEvent(
    records: Option[Seq[Record]] = None,
    continuationSequenceNumber: Option[String] = None,
    millisBehindLatest: Option[Long] = None
) {
  def withRecords(value: Option[Seq[Record]]): SubscribeToShardEvent =
    copy(records = value)
  def withContinuationSequenceNumber(value: Option[String]): SubscribeToShardEvent =
    copy(continuationSequenceNumber = value)
  def withMillisBehindLatest(value: Option[Long]): SubscribeToShardEvent =
    copy(millisBehindLatest = value)
}
