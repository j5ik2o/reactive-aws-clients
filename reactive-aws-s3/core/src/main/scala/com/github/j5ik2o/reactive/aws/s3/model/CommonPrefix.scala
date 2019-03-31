package com.github.j5ik2o.reactive.aws.s3.model

final case class CommonPrefix(
    prefix: Option[String] = None
) {
  def withPrefix(value: Option[String]): CommonPrefix =
    copy(prefix = value)
}
