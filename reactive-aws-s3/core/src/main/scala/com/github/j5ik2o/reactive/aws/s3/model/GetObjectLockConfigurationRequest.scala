package com.github.j5ik2o.reactive.aws.s3.model

final case class GetObjectLockConfigurationRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetObjectLockConfigurationRequest =
    copy(bucket = value)
}
