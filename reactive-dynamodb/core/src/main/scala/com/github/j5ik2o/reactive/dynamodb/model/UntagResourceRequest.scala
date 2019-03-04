package com.github.j5ik2o.reactive.dynamodb.model

final case class UntagResourceRequest(resourceArn: Option[String] = None, tagKeys: Option[Seq[String]] = None) {
  def withResourceArn(value: Option[String]): UntagResourceRequest  = copy(resourceArn = value)
  def withTagKeys(value: Option[Seq[String]]): UntagResourceRequest = copy(tagKeys = value)
}
