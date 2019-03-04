package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class QueryResponse(override val statusCode: Option[Int] = None,
                               override val statusText: Option[String] = None,
                               override val httpHeaders: Option[Map[String, Seq[String]]] = None,
                               items: Option[Seq[Map[String, AttributeValue]]] = None,
                               count: Option[Integer] = None,
                               scannedCount: Option[Integer] = None,
                               lastEvaluatedKey: Option[Map[String, AttributeValue]] = None,
                               consumedCapacity: Option[ConsumedCapacity] = None)
    extends AbstractResponse(statusCode, statusText, httpHeaders) {

  override type ThisType = QueryResponse
  override def withStatusCode(value: Option[Int]): QueryResponse                       = copy(statusCode = value)
  override def withStatusText(value: Option[String]): QueryResponse                    = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): QueryResponse = copy(httpHeaders = value)
  def withItems(value: Option[Seq[Map[String, AttributeValue]]]): QueryResponse        = copy(items = value)
  def withCount(value: Option[Integer]): QueryResponse                                 = copy(count = value)
  def withScannedCount(value: Option[Integer]): QueryResponse                          = copy(scannedCount = value)
  def withLastEvaluatedKey(value: Option[Map[String, AttributeValue]]): QueryResponse  = copy(lastEvaluatedKey = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): QueryResponse             = copy(consumedCapacity = value)

}
