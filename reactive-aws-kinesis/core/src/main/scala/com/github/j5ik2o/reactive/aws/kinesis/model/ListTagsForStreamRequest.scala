package com.github.j5ik2o.reactive.aws.kinesis.model

final case class ListTagsForStreamRequest(
    streamName: Option[String] = None, // String
    exclusiveStartTagKey: Option[String] = None, // String
    limit: Option[Int] = None // Int
) {
  def withStreamName(value: Option[String]): ListTagsForStreamRequest =
    copy(streamName = value)
  def withExclusiveStartTagKey(value: Option[String]): ListTagsForStreamRequest =
    copy(exclusiveStartTagKey = value)
  def withLimit(value: Option[Int]): ListTagsForStreamRequest =
    copy(limit = value)
}
