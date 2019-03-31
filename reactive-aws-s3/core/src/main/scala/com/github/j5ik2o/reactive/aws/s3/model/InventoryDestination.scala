package com.github.j5ik2o.reactive.aws.s3.model

final case class InventoryDestination(
    s3BucketDestination: Option[InventoryS3BucketDestination] = None
) {
  def withS3BucketDestination(value: Option[InventoryS3BucketDestination]): InventoryDestination =
    copy(s3BucketDestination = value)
}
