package com.github.j5ik2o.reactive.aws.kinesis.model

final case class CreateStreamRequest(
    streamName: Option[String] = None, // String
    shardCount: Option[Int] = None // Int
) {
  def withStreamName(value: Option[String]): CreateStreamRequest =
    copy(streamName = value)
  def withShardCount(value: Option[Int]): CreateStreamRequest =
    copy(shardCount = value)
}
