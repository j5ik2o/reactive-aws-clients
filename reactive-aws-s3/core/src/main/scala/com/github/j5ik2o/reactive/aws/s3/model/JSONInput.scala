package com.github.j5ik2o.reactive.aws.s3.model

final case class JSONInput(
    `type`: Option[JSONType] = None
) {
  def withType(value: Option[JSONType]): JSONInput =
    copy(`type` = value)
}
