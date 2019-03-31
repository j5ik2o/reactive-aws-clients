package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketMetricsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketMetricsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): GetBucketMetricsConfigurationRequest =
    copy(id = value)
}
