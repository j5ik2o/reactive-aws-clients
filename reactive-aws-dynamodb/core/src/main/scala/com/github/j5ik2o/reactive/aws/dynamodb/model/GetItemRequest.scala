package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class GetItemRequest(
    tableName: Option[String] = None,
    key: Option[Map[String, AttributeValue]] = None,
    attributesToGet: Option[Seq[String]] = None,
    consistentRead: Option[Boolean] = None,
    returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
    projectionExpression: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None
) {
  def withTableName(value: Option[String]): GetItemRequest =
    copy(tableName = value)
  def withKey(value: Option[Map[String, AttributeValue]]): GetItemRequest =
    copy(key = value)
  def withAttributesToGet(value: Option[Seq[String]]): GetItemRequest =
    copy(attributesToGet = value)
  def withConsistentRead(value: Option[Boolean]): GetItemRequest =
    copy(consistentRead = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): GetItemRequest =
    copy(returnConsumedCapacity = value)
  def withProjectionExpression(value: Option[String]): GetItemRequest =
    copy(projectionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): GetItemRequest =
    copy(expressionAttributeNames = value)
}
