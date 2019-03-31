package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketTaggingRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketTaggingRequest =
    copy(bucket = value)
}
