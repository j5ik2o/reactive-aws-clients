package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListBucketMetricsConfigurationsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    isTruncated: Option[Boolean] = None,
    continuationToken: Option[String] = None,
    nextContinuationToken: Option[String] = None,
    metricsConfigurationList: Option[Seq[MetricsConfiguration]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListBucketMetricsConfigurationsResponse
  override def withStatusCode(value: Option[Int]): ListBucketMetricsConfigurationsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListBucketMetricsConfigurationsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListBucketMetricsConfigurationsResponse =
    copy(httpHeaders = value)
  def withIsTruncated(value: Option[Boolean]): ListBucketMetricsConfigurationsResponse =
    copy(isTruncated = value)
  def withContinuationToken(value: Option[String]): ListBucketMetricsConfigurationsResponse =
    copy(continuationToken = value)
  def withNextContinuationToken(value: Option[String]): ListBucketMetricsConfigurationsResponse =
    copy(nextContinuationToken = value)
  def withMetricsConfigurationList(value: Option[Seq[MetricsConfiguration]]): ListBucketMetricsConfigurationsResponse =
    copy(metricsConfigurationList = value)
}
