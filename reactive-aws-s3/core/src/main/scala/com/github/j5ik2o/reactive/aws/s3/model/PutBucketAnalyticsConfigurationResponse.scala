package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class PutBucketAnalyticsConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = PutBucketAnalyticsConfigurationResponse
  override def withStatusCode(value: Option[Int]): PutBucketAnalyticsConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): PutBucketAnalyticsConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): PutBucketAnalyticsConfigurationResponse =
    copy(httpHeaders = value)
}
