package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectLegalHoldRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): GetObjectLegalHoldRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): GetObjectLegalHoldRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): GetObjectLegalHoldRequest =
    copy(versionId = value)
  def withRequestPayer(value: Option[RequestPayer]): GetObjectLegalHoldRequest =
    copy(requestPayer = value)
}
