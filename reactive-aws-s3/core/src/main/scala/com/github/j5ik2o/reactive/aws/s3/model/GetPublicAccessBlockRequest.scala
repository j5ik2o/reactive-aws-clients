package com.github.j5ik2o.reactive.aws.s3.model

final case class GetPublicAccessBlockRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetPublicAccessBlockRequest =
    copy(bucket = value)
}
