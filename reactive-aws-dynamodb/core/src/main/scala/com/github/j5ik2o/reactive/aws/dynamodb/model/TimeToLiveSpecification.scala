package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TimeToLiveSpecification(
    enabled: Option[Boolean] = None,
    attributeName: Option[String] = None
) {
  def withEnabled(value: Option[Boolean]): TimeToLiveSpecification =
    copy(enabled = value)
  def withAttributeName(value: Option[String]): TimeToLiveSpecification =
    copy(attributeName = value)
}
