package com.github.j5ik2o.reactive.aws.kinesis.model

final case class AddTagsToStreamRequest(
    streamName: Option[String] = None, // String
    tags: Option[Map[String, String]] = None // Map[String, String]
) {
  def withStreamName(value: Option[String]): AddTagsToStreamRequest =
    copy(streamName = value)
  def withTags(value: Option[Map[String, String]]): AddTagsToStreamRequest =
    copy(tags = value)
}
