package com.github.j5ik2o.reactive.aws.kinesis.model

final case class RemoveTagsFromStreamRequest(
    streamName: Option[String] = None, // String
    tagKeys: Option[Seq[String]] = None // Seq[String]
) {
  def withStreamName(value: Option[String]): RemoveTagsFromStreamRequest =
    copy(streamName = value)
  def withTagKeys(value: Option[Seq[String]]): RemoveTagsFromStreamRequest =
    copy(tagKeys = value)
}
