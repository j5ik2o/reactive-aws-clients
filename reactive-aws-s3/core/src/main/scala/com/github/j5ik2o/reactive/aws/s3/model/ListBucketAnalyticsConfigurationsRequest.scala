package com.github.j5ik2o.reactive.aws.s3.model

final case class ListBucketAnalyticsConfigurationsRequest(
    bucket: Option[String] = None,
    continuationToken: Option[String] = None
) {
  def withBucket(value: Option[String]): ListBucketAnalyticsConfigurationsRequest =
    copy(bucket = value)
  def withContinuationToken(value: Option[String]): ListBucketAnalyticsConfigurationsRequest =
    copy(continuationToken = value)
}
