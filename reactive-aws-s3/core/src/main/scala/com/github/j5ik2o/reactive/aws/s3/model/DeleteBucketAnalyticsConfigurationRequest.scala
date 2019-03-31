package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketAnalyticsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketAnalyticsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): DeleteBucketAnalyticsConfigurationRequest =
    copy(id = value)
}
