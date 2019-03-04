package com.github.j5ik2o.reactive.dynamodb.model

final case class Update(key: Option[Map[String, AttributeValue]] = None,
                        updateExpression: Option[String] = None,
                        tableName: Option[String] = None,
                        conditionExpression: Option[String] = None,
                        expressionAttributeNames: Option[Map[String, String]] = None,
                        expressionAttributeValues: Option[Map[String, AttributeValue]] = None,
                        returnValuesOnConditionCheckFailure: Option[ReturnValuesOnConditionCheckFailure] = None) {
  def withKey(value: Option[Map[String, AttributeValue]]): Update              = copy(key = value)
  def withUpdateExpression(value: Option[String]): Update                      = copy(updateExpression = value)
  def withTableName(value: Option[String]): Update                             = copy(tableName = value)
  def withConditionExpression(value: Option[String]): Update                   = copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): Update = copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): Update =
    copy(expressionAttributeValues = value)
  def withReturnValuesOnConditionCheckFailure(value: Option[ReturnValuesOnConditionCheckFailure]): Update =
    copy(returnValuesOnConditionCheckFailure = value)
}
