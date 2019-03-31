package com.github.j5ik2o.reactive.aws.s3.model

final case class LoggingEnabled(
    targetBucket: Option[String] = None,
    targetGrants: Option[Seq[TargetGrant]] = None,
    targetPrefix: Option[String] = None
) {
  def withTargetBucket(value: Option[String]): LoggingEnabled =
    copy(targetBucket = value)
  def withTargetGrants(value: Option[Seq[TargetGrant]]): LoggingEnabled =
    copy(targetGrants = value)
  def withTargetPrefix(value: Option[String]): LoggingEnabled =
    copy(targetPrefix = value)
}
