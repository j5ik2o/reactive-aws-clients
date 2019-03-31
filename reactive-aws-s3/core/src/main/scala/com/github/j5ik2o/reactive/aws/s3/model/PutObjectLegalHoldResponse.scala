package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutObjectLegalHoldResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutObjectLegalHoldResponse
  override def withStatusCode(value: Option[Int]): PutObjectLegalHoldResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutObjectLegalHoldResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutObjectLegalHoldResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): PutObjectLegalHoldResponse =
    copy(requestCharged = value)
}
