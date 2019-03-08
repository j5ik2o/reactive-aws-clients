package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeStreamRequest(
    streamArn: Option[String] = None,
    limit: Option[Int] = None,
    exclusiveStartShardId: Option[String] = None
) {
  def withStreamArn(value: Option[String]): DescribeStreamRequest =
    copy(streamArn = value)
  def withLimit(value: Option[Int]): DescribeStreamRequest =
    copy(limit = value)
  def withExclusiveStartShardId(value: Option[String]): DescribeStreamRequest =
    copy(exclusiveStartShardId = value)
}
