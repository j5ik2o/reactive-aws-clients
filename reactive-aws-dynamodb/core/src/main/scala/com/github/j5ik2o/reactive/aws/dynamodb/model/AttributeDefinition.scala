package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class AttributeDefinition(
    attributeName: Option[String] = None,
    attributeType: Option[ScalarAttributeType] = None
) {
  def withAttributeName(value: Option[String]): AttributeDefinition =
    copy(attributeName = value)
  def withAttributeType(value: Option[ScalarAttributeType]): AttributeDefinition =
    copy(attributeType = value)
}
