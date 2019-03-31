package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class PutRequest(
    item: Option[Map[String, AttributeValue]] = None
) {
  def withItem(value: Option[Map[String, AttributeValue]]): PutRequest =
    copy(item = value)
}
