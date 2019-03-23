package com.github.j5ik2o.reactive.aws.kinesis.model

final case class SubscribeToShardRequest(
    consumerARN: Option[String] = None,
    shardId: Option[String] = None,
    startingPosition: Option[StartingPosition] = None
) {
  def withConsumerARN(value: Option[String]): SubscribeToShardRequest =
    copy(consumerARN = value)
  def withShardId(value: Option[String]): SubscribeToShardRequest =
    copy(shardId = value)
  def withStartingPosition(value: Option[StartingPosition]): SubscribeToShardRequest =
    copy(startingPosition = value)
}
