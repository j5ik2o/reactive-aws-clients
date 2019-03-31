package com.github.j5ik2o.reactive.aws.dynamodb.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ScanResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    items: Option[Seq[Map[String, AttributeValue]]] = None,
    count: Option[Int] = None,
    scannedCount: Option[Int] = None,
    lastEvaluatedKey: Option[Map[String, AttributeValue]] = None,
    consumedCapacity: Option[ConsumedCapacity] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ScanResponse
  override def withStatusCode(value: Option[Int]): ScanResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ScanResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ScanResponse =
    copy(httpHeaders = value)
  def withItems(value: Option[Seq[Map[String, AttributeValue]]]): ScanResponse =
    copy(items = value)
  def withCount(value: Option[Int]): ScanResponse =
    copy(count = value)
  def withScannedCount(value: Option[Int]): ScanResponse =
    copy(scannedCount = value)
  def withLastEvaluatedKey(value: Option[Map[String, AttributeValue]]): ScanResponse =
    copy(lastEvaluatedKey = value)
  def withConsumedCapacity(value: Option[ConsumedCapacity]): ScanResponse =
    copy(consumedCapacity = value)
}
