package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TransactWriteItemsRequest(
    transactItems: Option[Seq[TransactWriteItem]] = None,
    returnConsumedCapacity: Option[ReturnConsumedCapacity] = None,
    returnItemCollectionMetrics: Option[ReturnItemCollectionMetrics] = None,
    clientRequestToken: Option[String] = None
) {
  def withTransactItems(value: Option[Seq[TransactWriteItem]]): TransactWriteItemsRequest =
    copy(transactItems = value)
  def withReturnConsumedCapacity(value: Option[ReturnConsumedCapacity]): TransactWriteItemsRequest =
    copy(returnConsumedCapacity = value)
  def withReturnItemCollectionMetrics(value: Option[ReturnItemCollectionMetrics]): TransactWriteItemsRequest =
    copy(returnItemCollectionMetrics = value)
  def withClientRequestToken(value: Option[String]): TransactWriteItemsRequest =
    copy(clientRequestToken = value)
}
