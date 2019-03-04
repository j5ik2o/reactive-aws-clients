package com.github.j5ik2o.reactive.kinesis.model

import java.time.Instant

final case class StreamDescription(streamName: Option[String] = None,
                                   streamARN: Option[String] = None,
                                   streamStatus: Option[StreamStatus] = None,
                                   shards: Option[Seq[Shard]] = None,
                                   hasMoreShards: Option[Boolean] = None,
                                   retentionPeriodHours: Option[Int] = None,
                                   streamCreationTimestamp: Option[Instant] = None,
                                   enhancedMonitoring: Option[Seq[EnhancedMetrics]] = None,
                                   encryptionType: Option[EncryptionType] = None,
                                   keyId: Option[String] = None) {

  def withStreamName(value: Option[String]): StreamDescription         = copy(streamName = value)
  def withStreamARN(value: Option[String]): StreamDescription          = copy(streamARN = value)
  def withStreamStatus(value: Option[StreamStatus]): StreamDescription = copy(streamStatus = value)
  def withShards(value: Option[Seq[Shard]]): StreamDescription         = copy(shards = value)
  def withHasMoreShards(value: Option[Boolean]): StreamDescription     = copy(hasMoreShards = value)
  def withRetentionPeriodHours(value: Option[Int]): StreamDescription  = copy(retentionPeriodHours = value)
  def withStreamCreationTimestamp(value: Option[Instant]): StreamDescription =
    copy(streamCreationTimestamp = value)
  def withEnhancedMonitoring(value: Option[Seq[EnhancedMetrics]]): StreamDescription =
    copy(enhancedMonitoring = value)
  def withEncryptionType(value: Option[EncryptionType]): StreamDescription = copy(encryptionType = value)
  def withKeyId(value: Option[String]): StreamDescription                  = copy(keyId = value)

}
