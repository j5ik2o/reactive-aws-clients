package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketMetricsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None,
    metricsConfiguration: Option[MetricsConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketMetricsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): PutBucketMetricsConfigurationRequest =
    copy(id = value)
  def withMetricsConfiguration(value: Option[MetricsConfiguration]): PutBucketMetricsConfigurationRequest =
    copy(metricsConfiguration = value)
}
