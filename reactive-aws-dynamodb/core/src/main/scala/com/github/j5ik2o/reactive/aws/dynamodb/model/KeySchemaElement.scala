package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class KeySchemaElement(
    attributeName: Option[String] = None,
    keyType: Option[KeyType] = None
) {
  def withAttributeName(value: Option[String]): KeySchemaElement =
    copy(attributeName = value)
  def withKeyType(value: Option[KeyType]): KeySchemaElement =
    copy(keyType = value)
}
