package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketEncryptionRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketEncryptionRequest =
    copy(bucket = value)
}
