package com.github.j5ik2o.reactive.aws.s3.model

final case class ListBucketInventoryConfigurationsRequest(
    bucket: Option[String] = None,
    continuationToken: Option[String] = None
) {
  def withBucket(value: Option[String]): ListBucketInventoryConfigurationsRequest =
    copy(bucket = value)
  def withContinuationToken(value: Option[String]): ListBucketInventoryConfigurationsRequest =
    copy(continuationToken = value)
}
