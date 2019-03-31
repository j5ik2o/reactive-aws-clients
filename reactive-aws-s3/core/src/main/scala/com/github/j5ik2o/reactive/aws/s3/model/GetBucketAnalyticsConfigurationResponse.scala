package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketAnalyticsConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    analyticsConfiguration: Option[AnalyticsConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketAnalyticsConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketAnalyticsConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketAnalyticsConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketAnalyticsConfigurationResponse =
    copy(httpHeaders = value)
  def withAnalyticsConfiguration(value: Option[AnalyticsConfiguration]): GetBucketAnalyticsConfigurationResponse =
    copy(analyticsConfiguration = value)
}
