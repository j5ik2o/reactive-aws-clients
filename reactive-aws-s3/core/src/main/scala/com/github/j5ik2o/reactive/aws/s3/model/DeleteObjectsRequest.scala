package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteObjectsRequest(
    bucket: Option[String] = None,
    delete: Option[Delete] = None,
    mfa: Option[String] = None,
    requestPayer: Option[RequestPayer] = None,
    bypassGovernanceRetention: Option[Boolean] = None
) {
  def withBucket(value: Option[String]): DeleteObjectsRequest =
    copy(bucket = value)
  def withDelete(value: Option[Delete]): DeleteObjectsRequest =
    copy(delete = value)
  def withMfa(value: Option[String]): DeleteObjectsRequest =
    copy(mfa = value)
  def withRequestPayer(value: Option[RequestPayer]): DeleteObjectsRequest =
    copy(requestPayer = value)
  def withBypassGovernanceRetention(value: Option[Boolean]): DeleteObjectsRequest =
    copy(bypassGovernanceRetention = value)
}
