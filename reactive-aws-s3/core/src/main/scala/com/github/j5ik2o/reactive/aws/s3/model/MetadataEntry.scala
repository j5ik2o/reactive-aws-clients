package com.github.j5ik2o.reactive.aws.s3.model

final case class MetadataEntry(
    name: Option[String] = None,
    value: Option[String] = None
) {
  def withName(value: Option[String]): MetadataEntry =
    copy(name = value)
  def withValue(value: Option[String]): MetadataEntry =
    copy(value = value)
}
