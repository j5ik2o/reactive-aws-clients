package com.github.j5ik2o.reactive.dynamodb.model

final case class TagResourceRequest(resourceArn: Option[String] = None, tags: Option[Seq[Tag]] = None) {
  def withResourceArn(value: Option[String]): TagResourceRequest = copy(resourceArn = value)
  def withTags(value: Option[Seq[Tag]]): TagResourceRequest      = copy(tags = value)
}
