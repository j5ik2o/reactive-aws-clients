package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectLockConfiguration(
    objectLockEnabled: Option[ObjectLockEnabled] = None,
    rule: Option[ObjectLockRule] = None
) {
  def withObjectLockEnabled(value: Option[ObjectLockEnabled]): ObjectLockConfiguration =
    copy(objectLockEnabled = value)
  def withRule(value: Option[ObjectLockRule]): ObjectLockConfiguration =
    copy(rule = value)
}
