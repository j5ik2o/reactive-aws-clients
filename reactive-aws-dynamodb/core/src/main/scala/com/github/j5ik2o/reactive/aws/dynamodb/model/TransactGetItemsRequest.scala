package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TransactGetItemsRequest(transactItems: Option[Seq[TransactGetItem]] = None,
                                         returnConsumedCapacity: Option[ReturnConsumedCapacity] = None) {
  def withTransactItems(value: Option[Seq[TransactGetItem]]): TransactGetItemsRequest = copy(transactItems = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): TransactGetItemsRequest =
    copy(returnConsumedCapacity = value)
}
