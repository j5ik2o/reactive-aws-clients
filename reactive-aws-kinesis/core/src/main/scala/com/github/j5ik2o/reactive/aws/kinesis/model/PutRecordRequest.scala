package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordRequest(
    streamName: Option[String] = None, // String
    data: Option[software.amazon.awssdk.core.SdkBytes] = None, // SdkBytes
    partitionKey: Option[String] = None, // String
    explicitHashKey: Option[String] = None, // String
    sequenceNumberForOrdering: Option[String] = None // String
) {
  def withStreamName(value: Option[String]): PutRecordRequest =
    copy(streamName = value)
  def withData(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordRequest =
    copy(data = value)
  def withPartitionKey(value: Option[String]): PutRecordRequest =
    copy(partitionKey = value)
  def withExplicitHashKey(value: Option[String]): PutRecordRequest =
    copy(explicitHashKey = value)
  def withSequenceNumberForOrdering(value: Option[String]): PutRecordRequest =
    copy(sequenceNumberForOrdering = value)
}
