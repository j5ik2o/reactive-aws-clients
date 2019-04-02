package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StreamDescription(
    streamName: Option[String] = None, // String
    streamARN: Option[String] = None, // String
    streamStatus: Option[StreamStatus] = None, // String
    shards: Option[Seq[Shard]] = None, // Seq[Shard]
    hasMoreShards: Option[Boolean] = None, // Boolean
    retentionPeriodHours: Option[Int] = None, // Int
    streamCreationTimestamp: Option[java.time.Instant] = None, // Instant
    enhancedMonitoring: Option[Seq[EnhancedMetrics]] = None, // Seq[EnhancedMetrics]
    encryptionType: Option[EncryptionType] = None, // String
    keyId: Option[String] = None // String
) {
  def withStreamName(value: Option[String]): StreamDescription =
    copy(streamName = value)
  def withStreamARN(value: Option[String]): StreamDescription =
    copy(streamARN = value)
  def withStreamStatus(value: Option[StreamStatus]): StreamDescription =
    copy(streamStatus = value)
  def withShards(value: Option[Seq[Shard]]): StreamDescription =
    copy(shards = value)
  def withHasMoreShards(value: Option[Boolean]): StreamDescription =
    copy(hasMoreShards = value)
  def withRetentionPeriodHours(value: Option[Int]): StreamDescription =
    copy(retentionPeriodHours = value)
  def withStreamCreationTimestamp(value: Option[java.time.Instant]): StreamDescription =
    copy(streamCreationTimestamp = value)
  def withEnhancedMonitoring(value: Option[Seq[EnhancedMetrics]]): StreamDescription =
    copy(enhancedMonitoring = value)
  def withEncryptionType(value: Option[EncryptionType]): StreamDescription =
    copy(encryptionType = value)
  def withKeyId(value: Option[String]): StreamDescription =
    copy(keyId = value)
}
