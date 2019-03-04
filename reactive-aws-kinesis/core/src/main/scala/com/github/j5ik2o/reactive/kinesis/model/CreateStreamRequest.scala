package com.github.j5ik2o.reactive.kinesis.model

final case class CreateStreamRequest(streamName: Option[String] = None, shardCount: Option[Int] = None) {
  def withStreamName(value: Option[String]): CreateStreamRequest = copy(streamName = value)
  def withShardCount(value: Option[Int]): CreateStreamRequest    = copy(shardCount = value)
}
