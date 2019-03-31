package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketPolicyRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketPolicyRequest =
    copy(bucket = value)
}
