package com.github.j5ik2o.reactive.aws.kinesis.model

final case class GetShardIteratorRequest(
    streamName: Option[String] = None, // String
    shardId: Option[String] = None, // String
    shardIteratorType: Option[ShardIteratorType] = None, // String
    startingSequenceNumber: Option[String] = None, // String
    timestamp: Option[java.time.Instant] = None // Instant
) {
  def withStreamName(value: Option[String]): GetShardIteratorRequest =
    copy(streamName = value)
  def withShardId(value: Option[String]): GetShardIteratorRequest =
    copy(shardId = value)
  def withShardIteratorType(value: Option[ShardIteratorType]): GetShardIteratorRequest =
    copy(shardIteratorType = value)
  def withStartingSequenceNumber(value: Option[String]): GetShardIteratorRequest =
    copy(startingSequenceNumber = value)
  def withTimestamp(value: Option[java.time.Instant]): GetShardIteratorRequest =
    copy(timestamp = value)
}
