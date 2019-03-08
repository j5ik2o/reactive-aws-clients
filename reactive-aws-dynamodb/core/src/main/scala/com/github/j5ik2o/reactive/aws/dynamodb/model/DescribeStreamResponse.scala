package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeStreamResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    streamDescription: Option[StreamDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeStreamResponse
  override def withStatusCode(value: Option[Int]): DescribeStreamResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeStreamResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeStreamResponse =
    copy(httpHeaders = value)
  def withStreamDescription(value: Option[StreamDescription]): DescribeStreamResponse =
    copy(streamDescription = value)
}
