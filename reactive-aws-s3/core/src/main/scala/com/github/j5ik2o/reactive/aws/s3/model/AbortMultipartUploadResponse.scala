package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class AbortMultipartUploadResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = AbortMultipartUploadResponse
  override def withStatusCode(value: Option[Int]): AbortMultipartUploadResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): AbortMultipartUploadResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): AbortMultipartUploadResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): AbortMultipartUploadResponse =
    copy(requestCharged = value)
}
