package com.github.j5ik2o.reactive.dynamodb.model

final case class Delete(key: Option[Map[String, AttributeValue]] = None,
                        tableName: Option[String] = None,
                        conditionExpression: Option[String] = None,
                        expressionAttributeNames: Option[Map[String, String]] = None,
                        expressionAttributeValues: Option[Map[String, AttributeValue]] = None,
                        returnValuesOnConditionCheckFailure: Option[ReturnValuesOnConditionCheckFailure] = None) {
  def withKey(value: Option[Map[String, AttributeValue]]): Delete              = copy(key = value)
  def withTableName(value: Option[String]): Delete                             = copy(tableName = value)
  def withConditionExpression(value: Option[String]): Delete                   = copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): Delete = copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): Delete =
    copy(expressionAttributeValues = value)
  def withReturnValuesOnConditionCheckFailure(value: Option[ReturnValuesOnConditionCheckFailure]): Delete =
    copy(returnValuesOnConditionCheckFailure = value)
}
