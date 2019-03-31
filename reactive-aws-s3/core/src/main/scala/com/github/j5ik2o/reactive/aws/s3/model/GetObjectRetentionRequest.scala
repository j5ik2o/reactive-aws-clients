package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectRetentionRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None
) {
  def withBucket(value: Option[String]): GetObjectRetentionRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): GetObjectRetentionRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): GetObjectRetentionRequest =
    copy(versionId = value)
  def withRequestPayer(value: Option[RequestPayer]): GetObjectRetentionRequest =
    copy(requestPayer = value)
}
