package com.github.j5ik2o.reactive.aws.s3.model

final case class HeadBucketRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): HeadBucketRequest =
    copy(bucket = value)
}
