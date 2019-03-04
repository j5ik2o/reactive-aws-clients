package com.github.j5ik2o.reactive.dynamodb.model

final case class ListTagsOfResourceRequest(resourceArn: Option[String] = None, nextToken: Option[String] = None) {
  def withResourceArn(value: Option[String]): ListTagsOfResourceRequest = copy(resourceArn = value)
  def withNextToken(value: Option[String]): ListTagsOfResourceRequest   = copy(nextToken = value)
}
