package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketInventoryConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketInventoryConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): GetBucketInventoryConfigurationRequest =
    copy(id = value)
}
