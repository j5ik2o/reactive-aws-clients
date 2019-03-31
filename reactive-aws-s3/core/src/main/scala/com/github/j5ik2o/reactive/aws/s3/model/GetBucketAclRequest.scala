package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketAclRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketAclRequest =
    copy(bucket = value)
}
