package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class BatchGetItemResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    responses: Option[Map[String, Seq[Map[String, AttributeValue]]]] = None,
    unprocessedKeys: Option[Map[String, KeysAndAttributes]] = None,
    consumedCapacity: Option[Seq[ConsumedCapacity]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = BatchGetItemResponse
  override def withStatusCode(value: Option[Int]): BatchGetItemResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): BatchGetItemResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): BatchGetItemResponse =
    copy(httpHeaders = value)
  def withResponses(value: Option[Map[String, Seq[Map[String, AttributeValue]]]]): BatchGetItemResponse =
    copy(responses = value)
  def withUnprocessedKeys(value: Option[Map[String, KeysAndAttributes]]): BatchGetItemResponse =
    copy(unprocessedKeys = value)
  def withConsumedCapacity(value: Option[Seq[ConsumedCapacity]]): BatchGetItemResponse =
    copy(consumedCapacity = value)
}
