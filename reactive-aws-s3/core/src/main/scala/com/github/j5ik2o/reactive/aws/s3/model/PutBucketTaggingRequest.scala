package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketTaggingRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    tagging: Option[Tagging] = None
) {
  def withBucket(value: Option[String]): PutBucketTaggingRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketTaggingRequest =
    copy(contentMD5 = value)
  def withTagging(value: Option[Tagging]): PutBucketTaggingRequest =
    copy(tagging = value)
}
