package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketLifecycleConfigurationRequest(
    bucket: Option[String] = None,
    lifecycleConfiguration: Option[BucketLifecycleConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketLifecycleConfigurationRequest =
    copy(bucket = value)
  def withLifecycleConfiguration(value: Option[BucketLifecycleConfiguration]): PutBucketLifecycleConfigurationRequest =
    copy(lifecycleConfiguration = value)
}
