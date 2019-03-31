package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectLockRetention(
    mode: Option[ObjectLockRetentionMode] = None,
    retainUntilDate: Option[java.time.Instant] = None
) {
  def withMode(value: Option[ObjectLockRetentionMode]): ObjectLockRetention =
    copy(mode = value)
  def withRetainUntilDate(value: Option[java.time.Instant]): ObjectLockRetention =
    copy(retainUntilDate = value)
}
