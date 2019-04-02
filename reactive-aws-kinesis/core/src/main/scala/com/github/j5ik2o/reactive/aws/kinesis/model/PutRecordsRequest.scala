package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordsRequest(
    records: Option[Seq[PutRecordsRequestEntry]] = None, // Seq[PutRecordsRequestEntry]
    streamName: Option[String] = None // String
) {
  def withRecords(value: Option[Seq[PutRecordsRequestEntry]]): PutRecordsRequest =
    copy(records = value)
  def withStreamName(value: Option[String]): PutRecordsRequest =
    copy(streamName = value)
}
