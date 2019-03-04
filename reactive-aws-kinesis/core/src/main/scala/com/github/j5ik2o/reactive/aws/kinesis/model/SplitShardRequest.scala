package com.github.j5ik2o.reactive.aws.kinesis.model

final case class SplitShardRequest(streamName: Option[String] = None,
                                   shardToSplit: Option[String] = None,
                                   newStartingHashKey: Option[String] = None) {

  def withStreamName(value: Option[String]): SplitShardRequest         = copy(streamName = value)
  def withShardToSplit(value: Option[String]): SplitShardRequest       = copy(shardToSplit = value)
  def withNewStartingHashKey(value: Option[String]): SplitShardRequest = copy(newStartingHashKey = value)

}
