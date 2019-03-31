package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketPolicyRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    confirmRemoveSelfBucketAccess: Option[Boolean] = None,
    policy: Option[String] = None
) {
  def withBucket(value: Option[String]): PutBucketPolicyRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketPolicyRequest =
    copy(contentMD5 = value)
  def withConfirmRemoveSelfBucketAccess(value: Option[Boolean]): PutBucketPolicyRequest =
    copy(confirmRemoveSelfBucketAccess = value)
  def withPolicy(value: Option[String]): PutBucketPolicyRequest =
    copy(policy = value)
}
