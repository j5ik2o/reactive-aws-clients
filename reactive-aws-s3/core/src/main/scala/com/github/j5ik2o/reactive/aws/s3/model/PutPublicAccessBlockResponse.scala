package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutPublicAccessBlockResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutPublicAccessBlockResponse
  override def withStatusCode(value: Option[Int]): PutPublicAccessBlockResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutPublicAccessBlockResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutPublicAccessBlockResponse =
    copy(httpHeaders = value)
}
