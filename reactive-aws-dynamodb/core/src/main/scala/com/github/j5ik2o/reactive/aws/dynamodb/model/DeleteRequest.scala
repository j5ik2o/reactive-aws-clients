package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteRequest(
    key: Option[Map[String, AttributeValue]] = None
) {
  def withKey(value: Option[Map[String, AttributeValue]]): DeleteRequest =
    copy(key = value)
}
