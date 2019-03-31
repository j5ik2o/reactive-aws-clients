package com.github.j5ik2o.reactive.aws.s3.model

final case class ListBucketMetricsConfigurationsRequest(
    bucket: Option[String] = None,
    continuationToken: Option[String] = None
) {
  def withBucket(value: Option[String]): ListBucketMetricsConfigurationsRequest =
    copy(bucket = value)
  def withContinuationToken(value: Option[String]): ListBucketMetricsConfigurationsRequest =
    copy(continuationToken = value)
}
