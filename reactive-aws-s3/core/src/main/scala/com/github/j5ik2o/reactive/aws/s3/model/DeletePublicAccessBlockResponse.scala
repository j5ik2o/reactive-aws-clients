package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeletePublicAccessBlockResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeletePublicAccessBlockResponse
  override def withStatusCode(value: Option[Int]): DeletePublicAccessBlockResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeletePublicAccessBlockResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeletePublicAccessBlockResponse =
    copy(httpHeaders = value)
}
