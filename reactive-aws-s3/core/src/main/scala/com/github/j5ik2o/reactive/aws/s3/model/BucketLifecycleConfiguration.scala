package com.github.j5ik2o.reactive.aws.s3.model

final case class BucketLifecycleConfiguration(
    rules: Option[Seq[LifecycleRule]] = None
) {
  def withRules(value: Option[Seq[LifecycleRule]]): BucketLifecycleConfiguration =
    copy(rules = value)
}
