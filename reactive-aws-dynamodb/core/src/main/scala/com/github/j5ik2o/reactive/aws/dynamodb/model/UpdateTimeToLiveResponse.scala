package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UpdateTimeToLiveResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    timeToLiveSpecification: Option[TimeToLiveSpecification] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UpdateTimeToLiveResponse
  override def withStatusCode(value: Option[Int]): UpdateTimeToLiveResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UpdateTimeToLiveResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UpdateTimeToLiveResponse =
    copy(httpHeaders = value)
  def withTimeToLiveSpecification(value: Option[TimeToLiveSpecification]): UpdateTimeToLiveResponse =
    copy(timeToLiveSpecification = value)
}
