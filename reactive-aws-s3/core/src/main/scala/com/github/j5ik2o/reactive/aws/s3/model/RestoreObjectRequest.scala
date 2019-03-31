package com.github.j5ik2o.reactive.aws.s3.model

final case class RestoreObjectRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    restoreRequest: Option[RestoreRequest] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): RestoreObjectRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): RestoreObjectRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): RestoreObjectRequest =
    copy(versionId = value)
  def withRestoreRequest(value: Option[RestoreRequest]): RestoreObjectRequest =
    copy(restoreRequest = value)
  def withRequestPayer(value: Option[RequestPayer]): RestoreObjectRequest =
    copy(requestPayer = value)
}
