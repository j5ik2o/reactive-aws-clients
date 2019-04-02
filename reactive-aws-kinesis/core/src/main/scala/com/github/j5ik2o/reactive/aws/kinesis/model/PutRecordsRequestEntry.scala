package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordsRequestEntry(
    data: Option[software.amazon.awssdk.core.SdkBytes] = None, // SdkBytes
    explicitHashKey: Option[String] = None, // String
    partitionKey: Option[String] = None // String
) {
  def withData(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordsRequestEntry =
    copy(data = value)
  def withExplicitHashKey(value: Option[String]): PutRecordsRequestEntry =
    copy(explicitHashKey = value)
  def withPartitionKey(value: Option[String]): PutRecordsRequestEntry =
    copy(partitionKey = value)
}
