package com.github.j5ik2o.reactive.dynamodb.model

final case class GetItemResponse(override val statusCode: Option[Int] = None,
                                 override val statusText: Option[String] = None,
                                 override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                 item: Option[Map[String, AttributeValue]] = None,
                                 consumedCapacity: Option[ConsumedCapacity] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = GetItemResponse
  override def withStatusCode(value: Option[Int]): GetItemResponse                       = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetItemResponse                    = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetItemResponse = copy(httpHeaders = value)
  def withItem(value: Option[Map[String, AttributeValue]]): GetItemResponse              = copy(item = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): GetItemResponse             = copy(consumedCapacity = value)

}
