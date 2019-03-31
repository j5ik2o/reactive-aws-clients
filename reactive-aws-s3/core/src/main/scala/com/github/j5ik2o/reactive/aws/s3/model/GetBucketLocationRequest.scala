package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketLocationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketLocationRequest =
    copy(bucket = value)
}
