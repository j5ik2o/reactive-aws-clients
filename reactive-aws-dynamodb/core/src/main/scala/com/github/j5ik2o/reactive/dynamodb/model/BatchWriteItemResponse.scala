package com.github.j5ik2o.reactive.dynamodb.model

final case class BatchWriteItemResponse(override val statusCode: Option[Int] = None,
                                        override val statusText: Option[String] = None,
                                        override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                        unprocessedItems: Option[Map[String, Seq[WriteRequest]]] = None,
                                        itemCollectionMetrics: Option[Map[String, Seq[ItemCollectionMetrics]]] = None,
                                        consumedCapacity: Option[Seq[ConsumedCapacity]] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = BatchWriteItemResponse
  override def withStatusCode(value: Option[Int]): BatchWriteItemResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): BatchWriteItemResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): BatchWriteItemResponse =
    copy(httpHeaders = value)
  def withUnprocessedItems(value: Option[Map[String, Seq[WriteRequest]]]): BatchWriteItemResponse =
    copy(unprocessedItems = value)
  def withItemCollectionMetrics(value: Option[Map[String, Seq[ItemCollectionMetrics]]]): BatchWriteItemResponse =
    copy(itemCollectionMetrics = value)
  def withConsumedCapacity(value: Option[Seq[ConsumedCapacity]]): BatchWriteItemResponse =
    copy(consumedCapacity = value)

}
