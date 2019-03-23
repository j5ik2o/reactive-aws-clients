package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Shard(
    shardId: Option[String] = None,
    sequenceNumberRange: Option[SequenceNumberRange] = None,
    parentShardId: Option[String] = None
) {
  def withShardId(value: Option[String]): Shard =
    copy(shardId = value)
  def withSequenceNumberRange(value: Option[SequenceNumberRange]): Shard =
    copy(sequenceNumberRange = value)
  def withParentShardId(value: Option[String]): Shard =
    copy(parentShardId = value)
}
