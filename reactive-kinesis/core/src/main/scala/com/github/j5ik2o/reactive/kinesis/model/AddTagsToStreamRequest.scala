package com.github.j5ik2o.reactive.kinesis.model

final case class AddTagsToStreamRequest(streamName: Option[String] = None, tags: Option[Map[String, String]] = None) {

  def withStreamName(value: Option[String]): AddTagsToStreamRequest        = copy(streamName = value)
  def withTags(value: Option[Map[String, String]]): AddTagsToStreamRequest = copy(tags = value)

}
