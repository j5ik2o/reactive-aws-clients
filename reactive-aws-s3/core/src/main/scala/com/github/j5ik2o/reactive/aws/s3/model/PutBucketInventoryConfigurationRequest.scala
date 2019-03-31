package com.github.j5ik2o.reactive.aws.s3.model

final case class PutBucketInventoryConfigurationRequest(
    bucket: Option[String] = None,
    id: Option[String] = None,
    inventoryConfiguration: Option[InventoryConfiguration] = None
) {
  def withBucket(value: Option[String]): PutBucketInventoryConfigurationRequest =
    copy(bucket = value)
  def withId(value: Option[String]): PutBucketInventoryConfigurationRequest =
    copy(id = value)
  def withInventoryConfiguration(value: Option[InventoryConfiguration]): PutBucketInventoryConfigurationRequest =
    copy(inventoryConfiguration = value)
}
