package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketTaggingRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketTaggingRequest =
    copy(bucket = value)
}
