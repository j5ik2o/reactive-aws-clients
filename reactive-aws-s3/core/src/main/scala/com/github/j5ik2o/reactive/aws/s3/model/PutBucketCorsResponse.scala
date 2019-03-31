package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutBucketCorsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutBucketCorsResponse
  override def withStatusCode(value: Option[Int]): PutBucketCorsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutBucketCorsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutBucketCorsResponse =
    copy(httpHeaders = value)
}
