package com.github.j5ik2o.reactive.aws.s3.model

final case class ErrorDocument(
    key: Option[String] = None
) {
  def withKey(value: Option[String]): ErrorDocument =
    copy(key = value)
}
