package com.github.j5ik2o.reactive.aws.s3.model

final case class PutObjectTaggingRequest(
    bucket: Option[String] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    contentMD5: Option[String] = None,
    tagging: Option[Tagging] = None
) {
  def withBucket(value: Option[String]): PutObjectTaggingRequest =
    copy(bucket = value)
  def withKey(value: Option[String]): PutObjectTaggingRequest =
    copy(key = value)
  def withVersionId(value: Option[String]): PutObjectTaggingRequest =
    copy(versionId = value)
  def withContentMD5(value: Option[String]): PutObjectTaggingRequest =
    copy(contentMD5 = value)
  def withTagging(value: Option[Tagging]): PutObjectTaggingRequest =
    copy(tagging = value)
}
