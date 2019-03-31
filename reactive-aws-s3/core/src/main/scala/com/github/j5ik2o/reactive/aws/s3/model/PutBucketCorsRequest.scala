package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketCorsRequest(
    bucket: Option[String] = None,
    corsConfiguration: Option[CORSConfiguration] = None,
    contentMD5: Option[String] = None
) {
  def withBucket(value: Option[String]): PutBucketCorsRequest =
    copy(bucket = value)
  def withCorsConfiguration(value: Option[CORSConfiguration]): PutBucketCorsRequest =
    copy(corsConfiguration = value)
  def withContentMD5(value: Option[String]): PutBucketCorsRequest =
    copy(contentMD5 = value)
}
