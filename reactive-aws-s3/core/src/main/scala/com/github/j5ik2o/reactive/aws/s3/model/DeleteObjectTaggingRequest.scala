package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteObjectTaggingRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteObjectTaggingRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): DeleteObjectTaggingRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): DeleteObjectTaggingRequest =
    copy(versionId = value)
}
