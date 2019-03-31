package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectTaggingRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None
) {
  def withBucket(value: Option[String]): GetObjectTaggingRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): GetObjectTaggingRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): GetObjectTaggingRequest =
    copy(versionId = value)
}
