package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class KeysAndAttributes(keys: Option[Seq[Map[String, AttributeValue]]] = None,
                                   attributesToGet: Option[Seq[String]] = None,
                                   consistentRead: Option[Boolean] = Some(false),
                                   projectionExpression: Option[String] = None,
                                   expressionAttributeNames: Option[Map[String, String]] = None) {
  def withKeys(value: Option[Seq[Map[String, AttributeValue]]]): KeysAndAttributes = copy(keys = value)
  def withAttributesToGet(value: Option[Seq[String]]): KeysAndAttributes           = copy(attributesToGet = value)
  def withConsistentRead(value: Option[Boolean]): KeysAndAttributes                = copy(consistentRead = value)
  def withProjectionExpression(value: Option[String]): KeysAndAttributes           = copy(projectionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): KeysAndAttributes =
    copy(expressionAttributeNames = value)
}
