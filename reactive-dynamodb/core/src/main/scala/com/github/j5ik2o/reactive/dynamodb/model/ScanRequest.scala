package com.github.j5ik2o.reactive.dynamodb.model

final case class ScanRequest(tableName: Option[String] = None,
                             indexName: Option[String] = None,
                             attributesToGet: Option[Seq[String]] = None,
                             limit: Option[Int] = None,
                             select: Option[Select] = None,
                             scanFilter: Option[Map[String, Condition]] = None,
                             conditionalOperator: Option[ConditionalOperator] = None,
                             exclusiveStartKey: Option[Map[String, AttributeValue]] = None,
                             returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
                             totalSegments: Option[Int] = None,
                             segment: Option[Int] = None,
                             projectionExpression: Option[String] = None,
                             filterExpression: Option[String] = None,
                             expressionAttributeNames: Option[Map[String, String]] = None,
                             expressionAttributeValues: Option[Map[String, AttributeValue]] = None,
                             consistentRead: Option[Boolean] = None) {

  def withTableName(value: Option[String]): ScanRequest                              = copy(tableName = value)
  def withIndexName(value: Option[String]): ScanRequest                              = copy(indexName = value)
  def withAttributesToGet(value: Option[Seq[String]]): ScanRequest                   = copy(attributesToGet = value)
  def withLimit(value: Option[Int]): ScanRequest                                     = copy(limit = value)
  def withSelect(value: Option[Select]): ScanRequest                                 = copy(select = value)
  def withScanFilter(value: Option[Map[String, Condition]]): ScanRequest             = copy(scanFilter = value)
  def withConditionalOperator(value: Option[ConditionalOperator]): ScanRequest       = copy(conditionalOperator = value)
  def withExclusiveStartKey(value: Option[Map[String, AttributeValue]]): ScanRequest = copy(exclusiveStartKey = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): ScanRequest =
    copy(returnConsumedCapacity = value)
  def withTotalSegments(value: Option[Int]): ScanRequest           = copy(totalSegments = value)
  def withSegment(value: Option[Int]): ScanRequest                 = copy(segment = value)
  def withProjectionExpression(value: Option[String]): ScanRequest = copy(projectionExpression = value)
  def withFilterExpression(value: Option[String]): ScanRequest     = copy(filterExpression = value)
  def withExpressionAttributeNames(value: Option[Map[String, String]]): ScanRequest =
    copy(expressionAttributeNames = value)
  def withExpressionAttributeValues(value: Option[Map[String, AttributeValue]]): ScanRequest =
    copy(expressionAttributeValues = value)
  def withConsistentRead(value: Option[Boolean]): ScanRequest = copy(consistentRead = value)

}
