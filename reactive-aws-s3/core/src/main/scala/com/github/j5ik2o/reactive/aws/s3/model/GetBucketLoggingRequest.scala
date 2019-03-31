package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketLoggingRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketLoggingRequest =
    copy(bucket = value)
}
