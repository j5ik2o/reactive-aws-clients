package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketRequestPaymentRequest(
    bucket: Option[String] = None,
    contentMD5: Option[String] = None,
    requestPaymentConfiguration: Option[RequestPaymentConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketRequestPaymentRequest =
    copy(bucket = value)
  def withContentMD5(value: Option[String]): PutBucketRequestPaymentRequest =
    copy(contentMD5 = value)
  def withRequestPaymentConfiguration(value: Option[RequestPaymentConfiguration]): PutBucketRequestPaymentRequest =
    copy(requestPaymentConfiguration = value)
}
