package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketPolicyRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketPolicyRequest =
    copy(bucket = value)
}
