package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class ConditionCheck(
    key: Option[Map[String, AttributeValue]] = None,
    tableName: Option[String] = None,
    conditionExpression: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None,
    expressionAttributeValues: Option[Map[String, AttributeValue]] = None,
    returnValuesOnConditionCheckFailure: Option[ReturnValuesOnConditionCheckFailure] = None
) {
  def withKey(value: Option[Map[String, AttributeValue]]): ConditionCheck =
    copy(key = value)
  def withTableName(value: Option[String]): ConditionCheck =
    copy(tableName = value)
  def withConditionExpression(value: Option[String]): ConditionCheck =
    copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): ConditionCheck =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): ConditionCheck =
    copy(expressionAttributeValues = value)
  def withReturnValuesOnConditionCheckFailure(value: Option[ReturnValuesOnConditionCheckFailure]): ConditionCheck =
    copy(returnValuesOnConditionCheckFailure = value)
}
