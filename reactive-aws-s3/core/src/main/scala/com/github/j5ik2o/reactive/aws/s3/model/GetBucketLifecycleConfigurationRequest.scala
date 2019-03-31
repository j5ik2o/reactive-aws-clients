package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketLifecycleConfigurationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketLifecycleConfigurationRequest =
    copy(bucket = value)
}
