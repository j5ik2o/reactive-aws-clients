package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketNotificationConfigurationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketNotificationConfigurationRequest =
    copy(bucket = value)
}