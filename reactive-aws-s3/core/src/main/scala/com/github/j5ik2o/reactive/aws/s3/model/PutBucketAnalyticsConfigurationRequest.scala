package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketAnalyticsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None,
    analyticsConfiguration: Option[AnalyticsConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketAnalyticsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): PutBucketAnalyticsConfigurationRequest =
    copy(id = value)
  def withAnalyticsConfiguration(value: Option[AnalyticsConfiguration]): PutBucketAnalyticsConfigurationRequest =
    copy(analyticsConfiguration = value)
}
