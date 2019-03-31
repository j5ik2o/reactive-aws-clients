package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetObjectLegalHoldResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    legalHold: Option[ObjectLockLegalHold] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetObjectLegalHoldResponse
  override def withStatusCode(value: Option[Int]): GetObjectLegalHoldResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetObjectLegalHoldResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetObjectLegalHoldResponse =
    copy(httpHeaders = value)
  def withLegalHold(value: Option[ObjectLockLegalHold]): GetObjectLegalHoldResponse =
    copy(legalHold = value)
}
