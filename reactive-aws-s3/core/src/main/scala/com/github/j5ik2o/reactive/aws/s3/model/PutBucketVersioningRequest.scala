package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketVersioningRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    mfa: Option[String] = None,
    versioningConfiguration: Option[VersioningConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketVersioningRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketVersioningRequest =
    copy(contentMD5 = value)
  def withMfa(value: Option[String]): PutBucketVersioningRequest =
    copy(mfa = value)
  def withVersioningConfiguration(value: Option[VersioningConfiguration]): PutBucketVersioningRequest =
    copy(versioningConfiguration = value)
}
