package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketRequest =
    copy(bucket = value)
}
