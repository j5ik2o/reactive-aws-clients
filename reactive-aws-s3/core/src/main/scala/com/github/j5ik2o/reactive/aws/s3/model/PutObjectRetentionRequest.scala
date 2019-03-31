package com.github.j5ik2o.reactive.aws.s3.model

final case class PutObjectRetentionRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    retention: Option[ObjectLockRetention] = None,
    requestPayer: Option[RequestPayer] = None,
    versionId: Option[String] = None,
    bypassGovernanceRetention: Option[Boolean] = None,
    contentMD5: Option[String] = None
) {
  def withBucket(value: Option[String]): PutObjectRetentionRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): PutObjectRetentionRequest =
    copy(key = value)
  def withRetention(value: Option[ObjectLockRetention]): PutObjectRetentionRequest =
    copy(retention = value)
  def withRequestPayer(value: Option[RequestPayer]): PutObjectRetentionRequest =
    copy(requestPayer = value)
  def withVersionId(value: Option[String]): PutObjectRetentionRequest =
    copy(versionId = value)
  def withBypassGovernanceRetention(value: Option[Boolean]): PutObjectRetentionRequest =
    copy(bypassGovernanceRetention = value)
  def withContentMD5(value: Option[String]): PutObjectRetentionRequest =
    copy(contentMD5 = value)
}
