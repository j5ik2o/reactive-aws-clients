package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteBucketInventoryConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None
) {
  def withBucket(value: Option[String]): DeleteBucketInventoryConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): DeleteBucketInventoryConfigurationRequest =
    copy(id = value)
}
