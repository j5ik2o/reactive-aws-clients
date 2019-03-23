package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GetShardIteratorRequest(
    streamArn: Option[String] = None,
    shardId: Option[String] = None,
    shardIteratorType: Option[ShardIteratorType] = None,
    sequenceNumber: Option[String] = None
) {
  def withStreamArn(value: Option[String]): GetShardIteratorRequest =
    copy(streamArn = value)
  def withShardId(value: Option[String]): GetShardIteratorRequest =
    copy(shardId = value)
  def withShardIteratorType(value: Option[ShardIteratorType]): GetShardIteratorRequest =
    copy(shardIteratorType = value)
  def withSequenceNumber(value: Option[String]): GetShardIteratorRequest =
    copy(sequenceNumber = value)
}
