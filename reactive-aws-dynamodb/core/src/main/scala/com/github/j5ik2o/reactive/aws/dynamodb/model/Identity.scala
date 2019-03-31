package com.github.j5ik2o.reactive.aws.dynamodb.model

final case class Identity(
    principalId: Option[String] = None,
    `type`: Option[String] = None
) {
  def withPrincipalId(value: Option[String]): Identity =
    copy(principalId = value)
  def withType(value: Option[String]): Identity =
    copy(`type` = value)
}
