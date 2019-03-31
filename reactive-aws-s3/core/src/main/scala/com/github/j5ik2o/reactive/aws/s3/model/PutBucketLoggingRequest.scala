package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketLoggingRequest(
    bucket: Option[String] = None,
    bucketLoggingStatus: Option[BucketLoggingStatus] = None,
    contentMD5: Option[String] = None
) {
  def withBucket(value: Option[String]): PutBucketLoggingRequest =
    copy(bucket = value)
  def withBucketLoggingStatus(value: Option[BucketLoggingStatus]): PutBucketLoggingRequest =
    copy(bucketLoggingStatus = value)
  def withContentMD5(value: Option[String]): PutBucketLoggingRequest =
    copy(contentMD5 = value)
}
