package com.github.j5ik2o.reactive.aws.s3.model

final case class CreateBucketConfiguration(
    locationConstraint: Option[BucketLocationConstraint] = None
) {
  def withLocationConstraint(value: Option[BucketLocationConstraint]): CreateBucketConfiguration =
    copy(locationConstraint = value)
}
