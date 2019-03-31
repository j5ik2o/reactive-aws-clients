package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BatchWriteItemRequest(
    requestItems: Option[Map[String, Seq[WriteRequest]]] = None,
    returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
    returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics] = None
) {
  def withRequestItems(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemRequest =
    copy(requestItems = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): BatchWriteItemRequest =
    copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[ReturnItemCollectionMetrics]): BatchWriteItemRequest =
    copy(returnItemCollectionMetrics = value)
}
