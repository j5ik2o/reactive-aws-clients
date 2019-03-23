package com.github.j5ik2o.reactive.aws.kinesis.model

final case class MergeShardsRequest(
    streamName: Option[String] = None,
    shardToMerge: Option[String] = None,
    adjacentShardToMerge: Option[String] = None
) {
  def withStreamName(value: Option[String]): MergeShardsRequest =
    copy(streamName = value)
  def withShardToMerge(value: Option[String]): MergeShardsRequest =
    copy(shardToMerge = value)
  def withAdjacentShardToMerge(value: Option[String]): MergeShardsRequest =
    copy(adjacentShardToMerge = value)
}
