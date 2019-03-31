package com.github.j5ik2o.reactive.aws.s3.model

final case class PutObjectLegalHoldRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    legalHold: Option[ObjectLockLegalHold] = None,
    requestPayer: Option[RequestPayer] = None,
    versionId: Option[String] = None,
    contentMD5: Option[String] = None
) {
  def withBucket(value: Option[String]): PutObjectLegalHoldRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): PutObjectLegalHoldRequest =
    copy(key = value)
  def withLegalHold(value: Option[ObjectLockLegalHold]): PutObjectLegalHoldRequest =
    copy(legalHold = value)
  def withRequestPayer(value: Option[RequestPayer]): PutObjectLegalHoldRequest =
    copy(requestPayer = value)
  def withVersionId(value: Option[String]): PutObjectLegalHoldRequest =
    copy(versionId = value)
  def withContentMD5(value: Option[String]): PutObjectLegalHoldRequest =
    copy(contentMD5 = value)
}
