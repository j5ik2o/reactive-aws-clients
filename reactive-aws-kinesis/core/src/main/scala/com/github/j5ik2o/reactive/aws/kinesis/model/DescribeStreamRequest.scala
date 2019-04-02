package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DescribeStreamRequest(
    streamName: Option[String] = None, // String
    limit: Option[Int] = None, // Int
    exclusiveStartShardId: Option[String] = None // String
) {
  def withStreamName(value: Option[String]): DescribeStreamRequest =
    copy(streamName = value)
  def withLimit(value: Option[Int]): DescribeStreamRequest =
    copy(limit = value)
  def withExclusiveStartShardId(value: Option[String]): DescribeStreamRequest =
    copy(exclusiveStartShardId = value)
}
