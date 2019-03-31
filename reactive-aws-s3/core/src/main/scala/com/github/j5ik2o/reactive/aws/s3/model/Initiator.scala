package com.github.j5ik2o.reactive.aws.s3.model

final case class Initiator(
    id: Option[String] = None,
    displayName: Option[String] = None
) {
  def withId(value: Option[String]): Initiator =
    copy(id = value)
  def withDisplayName(value: Option[String]): Initiator =
    copy(displayName = value)
}
