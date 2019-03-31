package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketAnalyticsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketAnalyticsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): GetBucketAnalyticsConfigurationRequest =
    copy(id = value)
}
