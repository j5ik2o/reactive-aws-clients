package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class UntagResourceResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = UntagResourceResponse
  override def withStatusCode(value: Option[Int]): UntagResourceResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): UntagResourceResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): UntagResourceResponse =
    copy(httpHeaders = value)
}
