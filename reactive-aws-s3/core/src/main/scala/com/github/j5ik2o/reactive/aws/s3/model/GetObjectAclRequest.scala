package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectAclRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): GetObjectAclRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): GetObjectAclRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): GetObjectAclRequest =
    copy(versionId = value)
  def withRequestPayer(value: Option[RequestPayer]): GetObjectAclRequest =
    copy(requestPayer = value)
}
