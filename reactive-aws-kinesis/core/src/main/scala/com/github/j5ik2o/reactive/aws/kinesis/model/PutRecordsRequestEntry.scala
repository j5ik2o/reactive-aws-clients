package com.github.j5ik2o.reactive.aws.kinesis.model

final case class PutRecordsRequestEntry(
    data: Option[Array[Byte]] = None,
    explicitHashKey: Option[String] = None,
    partitionKey: Option[String] = None
) {
  def withData(value: Option[Array[Byte]]): PutRecordsRequestEntry =
    copy(data = value)
  def withExplicitHashKey(value: Option[String]): PutRecordsRequestEntry =
    copy(explicitHashKey = value)
  def withPartitionKey(value: Option[String]): PutRecordsRequestEntry =
    copy(partitionKey = value)
}
