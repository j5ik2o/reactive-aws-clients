package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketPolicyStatusRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketPolicyStatusRequest =
    copy(bucket = value)
}
