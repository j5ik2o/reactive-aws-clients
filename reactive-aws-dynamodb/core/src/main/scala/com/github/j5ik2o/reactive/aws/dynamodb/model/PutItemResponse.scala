package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class PutItemResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    attributes: Option[Map[String, AttributeValue]] = None,
    consumedCapacity: Option[ConsumedCapacity] = None,
    itemCollectionMetrics: Option[ItemCollectionMetrics] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutItemResponse
  override def withStatusCode(value: Option[Int]): PutItemResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutItemResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutItemResponse =
    copy(httpHeaders = value)
  def withAttributes(value: Option[Map[String, AttributeValue]]): PutItemResponse =
    copy(attributes = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): PutItemResponse =
    copy(consumedCapacity = value)
  def withItemCollectionMetrics(value: Option[ItemCollectionMetrics]): PutItemResponse =
    copy(itemCollectionMetrics = value)
}
