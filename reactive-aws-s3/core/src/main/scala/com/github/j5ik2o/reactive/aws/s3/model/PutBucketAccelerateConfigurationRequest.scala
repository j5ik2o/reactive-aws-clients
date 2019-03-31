package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketAccelerateConfigurationRequest(
    bucket: Option[String] = None,
    accelerateConfiguration: Option[AccelerateConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketAccelerateConfigurationRequest =
    copy(bucket = value)
  def withAccelerateConfiguration(value: Option[AccelerateConfiguration]): PutBucketAccelerateConfigurationRequest =
    copy(accelerateConfiguration = value)
}
