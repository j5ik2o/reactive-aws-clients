package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BatchGetItemRequest(requestItems: Option[Map[String, KeysAndAttributes]] = None,
                                     returnConsumedCapacity: Option[String] = None) {
  def withRequestItems(value: Option[Map[String, KeysAndAttributes]]): BatchGetItemRequest = copy(requestItems = value)
  def withReturnConsumedCapacity(value: Option[String]): BatchGetItemRequest               = copy(returnConsumedCapacity = value)
}
