package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordRequest(
    streamName: Option[String] = None,
    data: Option[Array[Byte]] = None,
    partitionKey: Option[String] = None,
    explicitHashKey: Option[String] = None,
    sequenceNumberForOrdering: Option[String] = None
) {
  def withStreamName(value: Option[String]): PutRecordRequest =
    copy(streamName = value)
  def withData(value: Option[Array[Byte]]): PutRecordRequest =
    copy(data = value)
  def withPartitionKey(value: Option[String]): PutRecordRequest =
    copy(partitionKey = value)
  def withExplicitHashKey(value: Option[String]): PutRecordRequest =
    copy(explicitHashKey = value)
  def withSequenceNumberForOrdering(value: Option[String]): PutRecordRequest =
    copy(sequenceNumberForOrdering = value)
}
