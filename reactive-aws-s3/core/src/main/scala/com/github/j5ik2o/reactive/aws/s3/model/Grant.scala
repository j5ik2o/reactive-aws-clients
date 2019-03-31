package com.github.j5ik2o.reactive.aws.s3.model

final case class Grant(
    grantee: Option[Grantee] = None,
    permission: Option[Permission] = None
) {
  def withGrantee(value: Option[Grantee]): Grant =
    copy(grantee = value)
  def withPermission(value: Option[Permission]): Grant =
    copy(permission = value)
}
