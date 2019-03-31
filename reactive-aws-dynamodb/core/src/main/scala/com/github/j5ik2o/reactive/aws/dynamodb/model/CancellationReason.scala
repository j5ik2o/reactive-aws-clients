package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class CancellationReason(
    item: Option[Map[String, AttributeValue]] = None,
    code: Option[String] = None,
    message: Option[String] = None
) {
  def withItem(value: Option[Map[String, AttributeValue]]): CancellationReason =
    copy(item = value)
  def withCode(value: Option[String]): CancellationReason =
    copy(code = value)
  def withMessage(value: Option[String]): CancellationReason =
    copy(message = value)
}
