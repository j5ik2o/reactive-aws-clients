package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectIdentifier(
    key: Option[String] = None,
    versionId: Option[String] = None
) {
  def withKey(value: Option[String]): ObjectIdentifier =
    copy(key = value)
  def withVersionId(value: Option[String]): ObjectIdentifier =
    copy(versionId = value)
}
