package com.github.j5ik2o.reactive.aws.s3.model

final case class TargetGrant(
    grantee: Option[Grantee] = None,
    permission: Option[BucketLogsPermission] = None
) {
  def withGrantee(value: Option[Grantee]): TargetGrant =
    copy(grantee = value)
  def withPermission(value: Option[BucketLogsPermission]): TargetGrant =
    copy(permission = value)
}
