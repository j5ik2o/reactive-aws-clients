package com.github.j5ik2o.reactive.dynamodb.model

final case class UpdateItemRequest(tableName: Option[String] = None,
                                   key: Option[Map[String, AttributeValue]] = None,
                                   attributeUpdates: Option[Map[String, AttributeValueUpdate]] = None,
                                   expected: Option[Map[String, ExpectedAttributeValue]] = None,
                                   conditionalOperator: Option[ConditionalOperator] = None,
                                   returnValues: Option[ReturnValue] = None,
                                   returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
                                   returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics] = None,
                                   updateExpression: Option[String] = None,
                                   conditionExpression: Option[String] = None,
                                   expressionAttributeNames: Option[Map[String, String]] = None,
                                   expressionAttributeValues: Option[Map[String, AttributeValue]] = None) {
  def withTableName(value: Option[String]): UpdateItemRequest                = copy(tableName = value)
  def withKey(value: Option[Map[String, AttributeValue]]): UpdateItemRequest = copy(key = value)
  def withAttributeUpdates(value: Option[Map[String, AttributeValueUpdate]]): UpdateItemRequest =
    copy(attributeUpdates = value)
  def withExpected(value: Option[Map[String, ExpectedAttributeValue]]): UpdateItemRequest = copy(expected = value)
  def withConditionalOperator(value: Option[ConditionalOperator]): UpdateItemRequest      = copy(conditionalOperator = value)
  def withReturnValues(value: Option[ReturnValue]): UpdateItemRequest                     = copy(returnValues = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): UpdateItemRequest =
    copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[ReturnItemCollectionMetrics]): UpdateItemRequest =
    copy(returnItemCollectionMetrics = value)
  def withUpdateExpression(value: Option[String]): UpdateItemRequest    = copy(updateExpression = value)
  def withConditionExpression(value: Option[String]): UpdateItemRequest = copy(conditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): UpdateItemRequest =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): UpdateItemRequest =
    copy(expressionAttributeValues = value)

}
