package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateItemResponse(override val statusCode: Option[Int] = None,
                                    override val statusText: Option[String] = None,
                                    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                                    attributes: Option[Map[String, AttributeValue]] = None,
                                    consumedCapacity: Option[ConsumedCapacity] = None,
                                    itemCollectionMetrics: Option[ItemCollectionMetrics] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = UpdateItemResponse
  override def withStatusCode(value: Option[Int]): UpdateItemResponse                       = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateItemResponse                    = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateItemResponse = copy(httpHeaders = value)
  def withAttributes(value: Option[Map[String, AttributeValue]]): UpdateItemResponse        = copy(attributes = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): UpdateItemResponse             = copy(consumedCapacity = value)
  def withItemCollectionMetrics(value: Option[ItemCollectionMetrics]): UpdateItemResponse =
    copy(itemCollectionMetrics = value)

}
