package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectLockRule(
    defaultRetention: Option[DefaultRetention] = None
) {
  def withDefaultRetention(value: Option[DefaultRetention]): ObjectLockRule =
    copy(defaultRetention = value)
}
