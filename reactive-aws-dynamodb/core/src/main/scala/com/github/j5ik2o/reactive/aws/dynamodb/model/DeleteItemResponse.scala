package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DeleteItemResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    attributes: Option[Map[String, AttributeValue]] = None,
    consumedCapacity: Option[ConsumedCapacity] = None,
    itemCollectionMetrics: Option[ItemCollectionMetrics] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteItemResponse
  override def withStatusCode(value: Option[Int]): DeleteItemResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteItemResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteItemResponse =
    copy(httpHeaders = value)
  def withAttributes(value: Option[Map[String, AttributeValue]]): DeleteItemResponse =
    copy(attributes = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): DeleteItemResponse =
    copy(consumedCapacity = value)
  def withItemCollectionMetrics(value: Option[ItemCollectionMetrics]): DeleteItemResponse =
    copy(itemCollectionMetrics = value)
}
