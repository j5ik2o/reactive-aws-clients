package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketRequestPaymentRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketRequestPaymentRequest =
    copy(bucket = value)
}
