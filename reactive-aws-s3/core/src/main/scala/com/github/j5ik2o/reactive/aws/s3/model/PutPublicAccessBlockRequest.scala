package com.github.j5ik2o.reactive.aws.s3.model

final case class PutPublicAccessBlockRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    publicAccessBlockConfiguration: Option[PublicAccessBlockConfiguration] = None
) {
  def withBucket(value: Option[String]): PutPublicAccessBlockRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutPublicAccessBlockRequest =
    copy(contentMD5 = value)
  def withPublicAccessBlockConfiguration(value: Option[PublicAccessBlockConfiguration]): PutPublicAccessBlockRequest =
    copy(publicAccessBlockConfiguration = value)
}
