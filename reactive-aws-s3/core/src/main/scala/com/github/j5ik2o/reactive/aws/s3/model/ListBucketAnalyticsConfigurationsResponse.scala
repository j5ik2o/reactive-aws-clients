package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class ListBucketAnalyticsConfigurationsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None,
    isTruncated: Option[Boolean] = None,
    continuationToken: Option[String] = None,
    nextContinuationToken: Option[String] = None,
    analyticsConfigurationList: Option[Seq[AnalyticsConfiguration]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = ListBucketAnalyticsConfigurationsResponse
  override def withStatusCode(value: Option[Int]): ListBucketAnalyticsConfigurationsResponse = copy(statusCode = value)
  override def withStatusText(value: Option[String]): ListBucketAnalyticsConfigurationsResponse =
    copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): ListBucketAnalyticsConfigurationsResponse =
    copy(httpHeaders = value)
  def withIsTruncated(value: Option[Boolean]): ListBucketAnalyticsConfigurationsResponse =
    copy(isTruncated = value)
  def withContinuationToken(value: Option[String]): ListBucketAnalyticsConfigurationsResponse =
    copy(continuationToken = value)
  def withNextContinuationToken(value: Option[String]): ListBucketAnalyticsConfigurationsResponse =
    copy(nextContinuationToken = value)
  def withAnalyticsConfigurationList(
      value: Option[Seq[AnalyticsConfiguration]]
  ): ListBucketAnalyticsConfigurationsResponse =
    copy(analyticsConfigurationList = value)
}
