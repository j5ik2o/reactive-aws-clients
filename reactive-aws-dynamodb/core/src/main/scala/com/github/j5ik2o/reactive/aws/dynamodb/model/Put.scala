package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Put(item: Option[Map[String, AttributeValue]] = None,
                     tableName: Option[String] = None,
                     conditionExpression: Option[String] = None,
                     expressionAttributeNames: Option[Map[String, String]] = None,
                     expressionAttributeValues: Option[Map[String, AttributeValue]] = None,
                     returnValuesOnConditionCheckFailure: Option[ReturnValuesOnConditionCheckFailure] = None) {
  def withItem(value: Option[Map[String, AttributeValue]]): Put             = copy(item = value)
  def withTableName(value: Option[String]): Put                             = copy(tableName = value)
  def withConditionExpression(value: Option[String]): Put                   = copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): Put = copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): Put =
    copy(expressionAttributeValues = value)
  def withReturnValuesOnConditionCheckFailure(value: Option[ReturnValuesOnConditionCheckFailure]): Put =
    copy(returnValuesOnConditionCheckFailure = value)
}
