package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketCorsRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketCorsRequest =
    copy(bucket = value)
}
