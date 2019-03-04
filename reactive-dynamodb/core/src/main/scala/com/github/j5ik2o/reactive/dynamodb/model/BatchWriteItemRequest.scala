package com.github.j5ik2o.reactive.dynamodb.model

final case class BatchWriteItemRequest(requestItems: Option[Map[String, Seq[WriteRequest]]] = None,
                                       returnConsumedCapacity: Option[String] = None,
                                       returnItemCollectionMetrics: Option[String] = None) {
  def withRequestItems(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemRequest =
    copy(requestItems = value)
  def withReturnConsumedCapacity(value: Option[String]): BatchWriteItemRequest = copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[String]): BatchWriteItemRequest =
    copy(returnItemCollectionMetrics = value)
}
