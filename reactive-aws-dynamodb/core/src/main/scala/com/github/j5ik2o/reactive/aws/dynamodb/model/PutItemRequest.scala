package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class PutItemRequest(tableName: Option[String] = None,
                                item: Option[Map[String, AttributeValue]] = None,
                                expected: Option[Map[String, ExpectedAttributeValue]] = None,
                                returnValues: Option[ReturnValue] = None,
                                returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
                                returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics] = None,
                                conditionalOperator: Option[ConditionalOperator] = None,
                                conditionExpression: Option[String] = None,
                                expressionAttributeNames: Option[Map[String, String]] = None,
                                expressionAttributeValues: Option[Map[String, AttributeValue]] = None) {
  def withTableName(value: Option[String]): PutItemRequest                             = copy(tableName = value)
  def withItem(value: Option[Map[String, AttributeValue]]): PutItemRequest             = copy(item = value)
  def withExpected(value: Option[Map[String, ExpectedAttributeValue]]): PutItemRequest = copy(expected = value)
  def withReturnValues(value: Option[ReturnValue]): PutItemRequest                     = copy(returnValues = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): PutItemRequest =
    copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[ReturnItemCollectionMetrics]): PutItemRequest =
    copy(returnItemCollectionMetrics = value)
  def withConditionalOperator(value: Option[ConditionalOperator]): PutItemRequest = copy(conditionalOperator = value)
  def withConditionExpression(value: Option[String]): PutItemRequest              = copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): PutItemRequest =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): PutItemRequest =
    copy(expressionAttributeValues = value)
}
