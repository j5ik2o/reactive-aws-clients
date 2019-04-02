package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StreamDescriptionSummary(
    streamName: Option[String] = None, // String
    streamARN: Option[String] = None, // String
    streamStatus: Option[StreamStatus] = None, // String
    retentionPeriodHours: Option[Int] = None, // Int
    streamCreationTimestamp: Option[java.time.Instant] = None, // Instant
    enhancedMonitoring: Option[Seq[EnhancedMetrics]] = None, // Seq[EnhancedMetrics]
    encryptionType: Option[EncryptionType] = None, // String
    keyId: Option[String] = None, // String
    openShardCount: Option[Int] = None, // Int
    consumerCount: Option[Int] = None // Int
) {
  def withStreamName(value: Option[String]): StreamDescriptionSummary =
    copy(streamName = value)
  def withStreamARN(value: Option[String]): StreamDescriptionSummary =
    copy(streamARN = value)
  def withStreamStatus(value: Option[StreamStatus]): StreamDescriptionSummary =
    copy(streamStatus = value)
  def withRetentionPeriodHours(value: Option[Int]): StreamDescriptionSummary =
    copy(retentionPeriodHours = value)
  def withStreamCreationTimestamp(value: Option[java.time.Instant]): StreamDescriptionSummary =
    copy(streamCreationTimestamp = value)
  def withEnhancedMonitoring(value: Option[Seq[EnhancedMetrics]]): StreamDescriptionSummary =
    copy(enhancedMonitoring = value)
  def withEncryptionType(value: Option[EncryptionType]): StreamDescriptionSummary =
    copy(encryptionType = value)
  def withKeyId(value: Option[String]): StreamDescriptionSummary =
    copy(keyId = value)
  def withOpenShardCount(value: Option[Int]): StreamDescriptionSummary =
    copy(openShardCount = value)
  def withConsumerCount(value: Option[Int]): StreamDescriptionSummary =
    copy(consumerCount = value)
}
