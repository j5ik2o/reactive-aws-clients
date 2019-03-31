package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketCorsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    corsRules: Option[Seq[CORSRule]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketCorsResponse
  override def withStatusCode(value: Option[Int]): GetBucketCorsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketCorsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketCorsResponse =
    copy(httpHeaders = value)
  def withCorsRules(value: Option[Seq[CORSRule]]): GetBucketCorsResponse =
    copy(corsRules = value)
}
