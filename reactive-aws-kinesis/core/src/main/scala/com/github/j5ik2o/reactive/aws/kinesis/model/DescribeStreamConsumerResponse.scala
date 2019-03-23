package com.github.j5ik2o.reactive.aws.kinesis.model

final case class DescribeStreamConsumerResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    consumerDescription: Option[ConsumerDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeStreamConsumerResponse
  override def withStatusCode(value: Option[Int]): DescribeStreamConsumerResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeStreamConsumerResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeStreamConsumerResponse =
    copy(httpHeaders = value)
  def withConsumerDescription(value: Option[ConsumerDescription]): DescribeStreamConsumerResponse =
    copy(consumerDescription = value)
}
