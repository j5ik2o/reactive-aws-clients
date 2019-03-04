package com.github.j5ik2o.reactive.aws.kinesis.model

final case class Shard(shardId: Option[String] = None,
                       parentShardId: Option[String] = None,
                       adjacentParentShardId: Option[String] = None,
                       hashKeyRange: Option[HashKeyRange] = None,
                       sequenceNumberRange: Option[SequenceNumberRange] = None) {

  def withShardId(value: Option[String]): Shard                          = copy(shardId = value)
  def withParentShardId(value: Option[String]): Shard                    = copy(parentShardId = value)
  def withAdjacentParentShardId(value: Option[String]): Shard            = copy(adjacentParentShardId = value)
  def withHashKeyRange(value: Option[HashKeyRange]): Shard               = copy(hashKeyRange = value)
  def withSequenceNumberRange(value: Option[SequenceNumberRange]): Shard = copy(sequenceNumberRange = value)

}
