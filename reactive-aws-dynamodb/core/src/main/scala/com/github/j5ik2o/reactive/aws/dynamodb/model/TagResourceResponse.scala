package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class TagResourceResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = TagResourceResponse
  override def withStatusCode(value: Option[Int]): TagResourceResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): TagResourceResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): TagResourceResponse =
    copy(httpHeaders = value)
}
