package com.github.j5ik2o.reactive.aws.kinesis.model

final case class IncreaseStreamRetentionPeriodResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = IncreaseStreamRetentionPeriodResponse
  override def withStatusCode(value: Option[Int]): IncreaseStreamRetentionPeriodResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): IncreaseStreamRetentionPeriodResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): IncreaseStreamRetentionPeriodResponse =
    copy(httpHeaders = value)
}
