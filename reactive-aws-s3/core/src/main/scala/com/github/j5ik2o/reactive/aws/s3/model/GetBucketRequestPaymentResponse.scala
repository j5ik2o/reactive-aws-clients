package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketRequestPaymentResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    payer: Option[Payer] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketRequestPaymentResponse
  override def withStatusCode(value: Option[Int]): GetBucketRequestPaymentResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketRequestPaymentResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketRequestPaymentResponse =
    copy(httpHeaders = value)
  def withPayer(value: Option[Payer]): GetBucketRequestPaymentResponse =
    copy(payer = value)
}
