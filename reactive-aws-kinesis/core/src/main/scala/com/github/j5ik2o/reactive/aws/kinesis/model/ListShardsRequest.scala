package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListShardsRequest(
    streamName: Option[String] = None,
    nextToken: Option[String] = None,
    exclusiveStartShardId: Option[String] = None,
    maxResults: Option[Int] = None,
    streamCreationTimestamp: Option[java.time.Instant] = None
) {
  def withStreamName(value: Option[String]): ListShardsRequest =
    copy(streamName = value)
  def withNextToken(value: Option[String]): ListShardsRequest =
    copy(nextToken = value)
  def withExclusiveStartShardId(value: Option[String]): ListShardsRequest =
    copy(exclusiveStartShardId = value)
  def withMaxResults(value: Option[Int]): ListShardsRequest =
    copy(maxResults = value)
  def withStreamCreationTimestamp(value: Option[java.time.Instant]): ListShardsRequest =
    copy(streamCreationTimestamp = value)
}
