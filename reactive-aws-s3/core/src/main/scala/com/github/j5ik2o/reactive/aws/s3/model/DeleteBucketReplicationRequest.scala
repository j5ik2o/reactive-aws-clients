package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketReplicationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketReplicationRequest =
    copy(bucket = value)
}
