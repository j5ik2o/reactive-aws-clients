package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketReplicationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketReplicationRequest =
    copy(bucket = value)
}
