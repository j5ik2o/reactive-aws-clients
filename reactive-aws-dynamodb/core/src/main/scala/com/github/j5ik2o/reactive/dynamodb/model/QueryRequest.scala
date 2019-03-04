package com.github.j5ik2o.reactive.dynamodb.model

final case class QueryRequest(tableName: Option[String] = None,
                              indexName: Option[String] = None,
                              select: Option[Select] = None,
                              attributesToGet: Option[Seq[String]] = None,
                              limit: Option[Int] = None,
                              consistentRead: Option[Boolean] = None,
                              keyConditions: Option[Map[String, Condition]] = None,
                              queryFilter: Option[Map[String, Condition]] = None,
                              conditionalOperator: Option[ConditionalOperator] = None,
                              scanIndexForward: Option[Boolean] = None,
                              exclusiveStartKey: Option[Map[String, AttributeValue]] = None,
                              returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
                              projectionExpression: Option[String] = None,
                              filterExpression: Option[String] = None,
                              keyConditionExpression: Option[String] = None,
                              expressionAttributeNames: Option[Map[String, String]] = None,
                              expressionAttributeValues: Option[Map[String, AttributeValue]] = None) {

  def withTableName(value: Option[String]): QueryRequest                              = copy(tableName = value)
  def withIndexName(value: Option[String]): QueryRequest                              = copy(indexName = value)
  def withSelect(value: Option[Select]): QueryRequest                                 = copy(select = value)
  def withAttributesToGet(value: Option[Seq[String]]): QueryRequest                   = copy(attributesToGet = value)
  def withLimit(value: Option[Int]): QueryRequest                                     = copy(limit = value)
  def withConsistentRead(value: Option[Boolean]): QueryRequest                        = copy(consistentRead = value)
  def withKeyConditions(value: Option[Map[String, Condition]]): QueryRequest          = copy(keyConditions = value)
  def withQueryFilter(value: Option[Map[String, Condition]]): QueryRequest            = copy(queryFilter = value)
  def withConditionalOperator(value: Option[ConditionalOperator]): QueryRequest       = copy(conditionalOperator = value)
  def withScanIndexForward(value: Option[Boolean]): QueryRequest                      = copy(scanIndexForward = value)
  def withExclusiveStartKey(value: Option[Map[String, AttributeValue]]): QueryRequest = copy(exclusiveStartKey = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): QueryRequest =
    copy(returnConsumedCapacity = value)
  def withProjectionExpression(value: Option[String]): QueryRequest   = copy(projectionExpression = value)
  def withFilterExpression(value: Option[String]): QueryRequest       = copy(filterExpression = value)
  def withKeyConditionExpression(value: Option[String]): QueryRequest = copy(keyConditionExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): QueryRequest =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): QueryRequest =
    copy(expressionAttributeValues = value)

}
