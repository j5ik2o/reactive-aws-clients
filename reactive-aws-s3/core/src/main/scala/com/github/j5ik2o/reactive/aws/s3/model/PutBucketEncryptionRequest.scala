package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketEncryptionRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    serverSideEncryptionConfiguration: Option[ServerSideEncryptionConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketEncryptionRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketEncryptionRequest =
    copy(contentMD5 = value)
  def withServerSideEncryptionConfiguration(
      value: Option[ServerSideEncryptionConfiguration]
  ): PutBucketEncryptionRequest =
    copy(serverSideEncryptionConfiguration = value)
}
