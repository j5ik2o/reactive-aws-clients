package com.github.j5ik2o.reactive.aws.s3.model

final case class InventoryS3BucketDestination(
    accountId: Option[String] = None,
    bucket: Option[String] = None,
    format: Option[InventoryFormat] = None,
    prefix: Option[String] = None,
    encryption: Option[InventoryEncryption] = None
) {
  def withAccountId(value: Option[String]): InventoryS3BucketDestination =
    copy(accountId = value)
  def withBucket(value: Option[String]): InventoryS3BucketDestination =
    copy(bucket = value)
  def withFormat(value: Option[InventoryFormat]): InventoryS3BucketDestination =
    copy(format = value)
  def withPrefix(value: Option[String]): InventoryS3BucketDestination =
    copy(prefix = value)
  def withEncryption(value: Option[InventoryEncryption]): InventoryS3BucketDestination =
    copy(encryption = value)
}
