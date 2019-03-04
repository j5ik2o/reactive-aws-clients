package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TransactWriteItemsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    consumedCapacity: Option[Seq[ConsumedCapacity]] = None,
    itemCollectionMetrics: Option[Map[String, Seq[ItemCollectionMetrics]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = TransactWriteItemsResponse
  override def withStatusCode(value: Option[Int]): TransactWriteItemsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): TransactWriteItemsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): TransactWriteItemsResponse =
    copy(httpHeaders = value)
  def withConsumedCapacity(value: Option[Seq[ConsumedCapacity]]): TransactWriteItemsResponse =
    copy(consumedCapacity = value)
  def withItemCollectionMetrics(value: Option[Map[String, Seq[ItemCollectionMetrics]]]): TransactWriteItemsResponse =
    copy(itemCollectionMetrics = value)

}
