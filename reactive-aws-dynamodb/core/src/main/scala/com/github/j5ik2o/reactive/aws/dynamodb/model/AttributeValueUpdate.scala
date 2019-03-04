package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AttributeValueUpdate(value: Option[AttributeValue] = None, action: Option[AttributeAction] = None) {
  def withValue(otherValue: Option[AttributeValue]): AttributeValueUpdate = copy(value = otherValue)
  def withAction(value: Option[AttributeAction]): AttributeValueUpdate    = copy(action = value)
}
