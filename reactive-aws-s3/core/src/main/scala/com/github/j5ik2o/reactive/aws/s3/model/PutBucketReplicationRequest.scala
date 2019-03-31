package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketReplicationRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    replicationConfiguration: Option[ReplicationConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketReplicationRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketReplicationRequest =
    copy(contentMD5 = value)
  def withReplicationConfiguration(value: Option[ReplicationConfiguration]): PutBucketReplicationRequest =
    copy(replicationConfiguration = value)
}
