package com.github.j5ik2o.reactive.kinesis.model

final case class DescribeStreamRequest(streamName: Option[String] = None,
                                       limit: Option[Int] = None,
                                       exclusiveStartShardId: Option[String] = None) {

  def withStreamName(value: Option[String]): DescribeStreamRequest            = copy(streamName = value)
  def withLimit(value: Option[Int]): DescribeStreamRequest                    = copy(limit = value)
  def withExclusiveStartShardId(value: Option[String]): DescribeStreamRequest = copy(exclusiveStartShardId = value)

}
