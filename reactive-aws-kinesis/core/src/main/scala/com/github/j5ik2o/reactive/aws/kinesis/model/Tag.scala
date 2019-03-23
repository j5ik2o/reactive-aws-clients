package com.github.j5ik2o.reactive.aws.kinesis.model

final case class Tag(
    key: Option[String] = None,
    value: Option[String] = None
) {
  def withKey(value: Option[String]): Tag =
    copy(key = value)
  def withValue(value: Option[String]): Tag =
    copy(value = value)
}
