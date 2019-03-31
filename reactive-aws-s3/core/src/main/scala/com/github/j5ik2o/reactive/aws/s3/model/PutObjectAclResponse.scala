package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutObjectAclResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    requestCharged: Option[RequestCharged] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutObjectAclResponse
  override def withStatusCode(value: Option[Int]): PutObjectAclResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutObjectAclResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutObjectAclResponse =
    copy(httpHeaders = value)
  def withRequestCharged(value: Option[RequestCharged]): PutObjectAclResponse =
    copy(requestCharged = value)
}
