package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketLifecycleRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketLifecycleRequest =
    copy(bucket = value)
}
