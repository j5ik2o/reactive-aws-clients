package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Get(
    key: Option[Map[String, AttributeValue]] = None,
    tableName: Option[String] = None,
    projectionExpression: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None
) {
  def withKey(value: Option[Map[String, AttributeValue]]): Get =
    copy(key = value)
  def withTableName(value: Option[String]): Get =
    copy(tableName = value)
  def withProjectionExpression(value: Option[String]): Get =
    copy(projectionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): Get =
    copy(expressionAttributeNames = value)
}
