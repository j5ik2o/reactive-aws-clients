package com.github.j5ik2o.reactive.dynamodb.model

final case class TransactGetItemsResponse(override val statusCode: Option[Int] = None,
                                          override val statusText: Option[String] = None,
                                          override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                          consumedCapacity: Option[Seq[ConsumedCapacity]] = None,
                                          responses: Option[Seq[ItemResponse]] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = TransactGetItemsResponse
  override def withStatusCode(value: Option[Int]): TransactGetItemsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): TransactGetItemsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): TransactGetItemsResponse =
    copy(httpHeaders = value)
  def withConsumedCapacity(value: Option[Seq[ConsumedCapacity]]): TransactGetItemsResponse =
    copy(consumedCapacity = value)
  def withResponses(value: Option[Seq[ItemResponse]]): TransactGetItemsResponse = copy(responses = value)

}
