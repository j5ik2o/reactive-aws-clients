package com.github.j5ik2o.reactive.aws.s3.model

final case class IndexDocument(
    suffix: Option[String] = None
) {
  def withSuffix(value: Option[String]): IndexDocument =
    copy(suffix = value)
}
