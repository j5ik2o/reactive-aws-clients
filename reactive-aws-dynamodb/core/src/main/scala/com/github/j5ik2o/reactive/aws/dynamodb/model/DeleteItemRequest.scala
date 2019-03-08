package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteItemRequest(
    tableName: Option[String] = None,
    key: Option[Map[String, AttributeValue]] = None,
    expected: Option[Map[String, ExpectedAttributeValue]] = None,
    conditionalOperator: Option[ConditionalOperator] = None,
    returnValues: Option[ReturnValue] = None,
    returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
    returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics] = None,
    conditionExpression: Option[String] = None,
    expressionAttributeNames: Option[Map[String, String]] = None,
    expressionAttributeValues: Option[Map[String, AttributeValue]] = None
) {
  def withTableName(value: Option[String]): DeleteItemRequest =
    copy(tableName = value)
  def withKey(value: Option[Map[String, AttributeValue]]): DeleteItemRequest =
    copy(key = value)
  def withExpected(value: Option[Map[String, ExpectedAttributeValue]]): DeleteItemRequest =
    copy(expected = value)
  def withConditionalOperator(value: Option[ConditionalOperator]): DeleteItemRequest =
    copy(conditionalOperator = value)
  def withReturnValues(value: Option[ReturnValue]): DeleteItemRequest =
    copy(returnValues = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): DeleteItemRequest =
    copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[ReturnItemCollectionMetrics]): DeleteItemRequest =
    copy(returnItemCollectionMetrics = value)
  def withConditionExpression(value: Option[String]): DeleteItemRequest =
    copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): DeleteItemRequest =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): DeleteItemRequest =
    copy(expressionAttributeValues = value)
}
