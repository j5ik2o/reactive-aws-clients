package com.github.j5ik2o.reactive.aws.kinesis.model

import java.time.Instant

final case class GetShardIteratorRequest(streamName: Option[String] = None,
                                         shardId: Option[String] = None,
                                         shardIteratorType: Option[ShardIteratorType] = None,
                                         startingSequenceNumber: Option[String] = None,
                                         timestamp: Option[Instant] = None) {

  def withStreamName(value: Option[String]): GetShardIteratorRequest                   = copy(streamName = value)
  def withShardId(value: Option[String]): GetShardIteratorRequest                      = copy(shardId = value)
  def withShardIteratorType(value: Option[ShardIteratorType]): GetShardIteratorRequest = copy(shardIteratorType = value)
  def withStartingSequenceNumber(value: Option[String]): GetShardIteratorRequest       = copy(startingSequenceNumber = value)
  def withTimestamp(value: Option[Instant]): GetShardIteratorRequest                   = copy(timestamp = value)

}
