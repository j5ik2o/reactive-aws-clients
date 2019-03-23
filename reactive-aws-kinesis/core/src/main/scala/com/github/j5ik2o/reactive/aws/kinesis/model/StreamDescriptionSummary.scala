package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StreamDescriptionSummary(
    streamName: Option[String] = None,
    streamARN: Option[String] = None,
    streamStatus: Option[StreamStatus] = None,
    retentionPeriodHours: Option[Int] = None,
    streamCreationTimestamp: Option[java.time.Instant] = None,
    enhancedMonitoring: Option[Seq[EnhancedMetrics]] = None,
    encryptionType: Option[EncryptionType] = None,
    keyId: Option[String] = None,
    openShardCount: Option[Int] = None,
    consumerCount: Option[Int] = None
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
