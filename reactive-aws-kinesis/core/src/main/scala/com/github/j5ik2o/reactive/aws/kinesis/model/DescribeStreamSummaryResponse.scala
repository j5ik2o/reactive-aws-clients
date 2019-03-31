package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DescribeStreamSummaryResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamDescriptionSummary: Option[StreamDescriptionSummary] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeStreamSummaryResponse
  override def withStatusCode(value: Option[Int]): DescribeStreamSummaryResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeStreamSummaryResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeStreamSummaryResponse =
    copy(httpHeaders = value)
  def withStreamDescriptionSummary(value: Option[StreamDescriptionSummary]): DescribeStreamSummaryResponse =
    copy(streamDescriptionSummary = value)
}
