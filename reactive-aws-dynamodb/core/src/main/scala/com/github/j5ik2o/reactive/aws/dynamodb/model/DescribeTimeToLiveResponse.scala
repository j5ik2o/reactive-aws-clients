package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class DescribeTimeToLiveResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    timeToLiveDescription: Option[TimeToLiveDescription] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DescribeTimeToLiveResponse
  override def withStatusCode(value: Option[Int]): DescribeTimeToLiveResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DescribeTimeToLiveResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DescribeTimeToLiveResponse =
    copy(httpHeaders = value)
  def withTimeToLiveDescription(value: Option[TimeToLiveDescription]): DescribeTimeToLiveResponse =
    copy(timeToLiveDescription = value)
}
