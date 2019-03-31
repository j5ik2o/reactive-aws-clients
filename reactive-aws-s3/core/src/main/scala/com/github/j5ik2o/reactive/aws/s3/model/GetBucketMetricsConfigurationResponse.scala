package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class GetBucketMetricsConfigurationResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    metricsConfiguration: Option[MetricsConfiguration] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = GetBucketMetricsConfigurationResponse
  override def withStatusCode(value: Option[Int]): GetBucketMetricsConfigurationResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): GetBucketMetricsConfigurationResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): GetBucketMetricsConfigurationResponse =
    copy(httpHeaders = value)
  def withMetricsConfiguration(value: Option[MetricsConfiguration]): GetBucketMetricsConfigurationResponse =
    copy(metricsConfiguration = value)
}
