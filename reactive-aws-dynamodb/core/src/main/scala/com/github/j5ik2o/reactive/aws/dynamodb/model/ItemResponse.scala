package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ItemResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    item: Option[Map[String, AttributeValue]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ItemResponse
  override def withStatusCode(value: Option[Int]): ItemResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ItemResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ItemResponse =
    copy(httpHeaders = value)
  def withItem(value: Option[Map[String, AttributeValue]]): ItemResponse =
    copy(item = value)
}
