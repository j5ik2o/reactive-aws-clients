package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketCorsRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketCorsRequest =
    copy(bucket = value)
}
