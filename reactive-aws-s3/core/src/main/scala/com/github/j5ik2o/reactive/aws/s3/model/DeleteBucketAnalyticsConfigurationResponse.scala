package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteBucketAnalyticsConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteBucketAnalyticsConfigurationResponse
  override def withStatusCode(value: Option[Int]): DeleteBucketAnalyticsConfigurationResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteBucketAnalyticsConfigurationResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteBucketAnalyticsConfigurationResponse =
    copy(httpHeaders = value)
}
