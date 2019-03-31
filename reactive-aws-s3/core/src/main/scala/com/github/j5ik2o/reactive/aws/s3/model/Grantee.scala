package com.github.j5ik2o.reactive.aws.s3.model

final case class Grantee(
    displayName: Option[String] = None,
    emailAddress: Option[String] = None,
    id: Option[String] = None,
    `type`: Option[Type] = None,
    uri: Option[String] = None
) {
  def withDisplayName(value: Option[String]): Grantee =
    copy(displayName = value)
  def withEmailAddress(value: Option[String]): Grantee =
    copy(emailAddress = value)
  def withId(value: Option[String]): Grantee =
    copy(id = value)
  def withType(value: Option[Type]): Grantee =
    copy(`type` = value)
  def withUri(value: Option[String]): Grantee =
    copy(uri = value)
}
