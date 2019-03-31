package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketMetricsConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketMetricsConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): DeleteBucketMetricsConfigurationRequest =
    copy(id = value)
}
