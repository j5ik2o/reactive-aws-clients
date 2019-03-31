package com.github.j5ik2o.reactive.aws.s3.model

final case class Owner(
    displayName: Option[String] = None,
    id: Option[String] = None
) {
  def withDisplayName(value: Option[String]): Owner =
    copy(displayName = value)
  def withId(value: Option[String]): Owner =
    copy(id = value)
}
