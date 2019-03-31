package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteObjectRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    mfa: Option[String] = None,
    versionId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None,
    bypassGovernanceRetention: Option[Boolean] = None
) {
  def withBucket(value: Option[String]): DeleteObjectRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): DeleteObjectRequest =
    copy(key = value)
  def withMfa(value: Option[String]): DeleteObjectRequest =
    copy(mfa = value)
  def withVersionId(value: Option[String]): DeleteObjectRequest =
    copy(versionId = value)
  def withRequestPayer(value: Option[RequestPayer]): DeleteObjectRequest =
    copy(requestPayer = value)
  def withBypassGovernanceRetention(value: Option[Boolean]): DeleteObjectRequest =
    copy(bypassGovernanceRetention = value)
}
