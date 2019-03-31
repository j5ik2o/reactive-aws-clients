package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutObjectRetentionResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutObjectRetentionResponse
  override def withStatusCode(value: Option[Int]): PutObjectRetentionResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutObjectRetentionResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutObjectRetentionResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): PutObjectRetentionResponse =
    copy(requestCharged = value)
}
