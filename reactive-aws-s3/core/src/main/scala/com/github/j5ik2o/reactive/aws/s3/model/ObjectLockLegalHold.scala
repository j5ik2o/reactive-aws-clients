package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectLockLegalHold(
    status: Option[ObjectLockLegalHoldStatus] = None
) {
  def withStatus(value: Option[ObjectLockLegalHoldStatus]): ObjectLockLegalHold =
    copy(status = value)
}
