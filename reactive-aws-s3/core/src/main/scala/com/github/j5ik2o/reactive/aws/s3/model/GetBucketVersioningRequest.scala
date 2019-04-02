package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketVersioningRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketVersioningRequest =
    copy(bucket = value)
}