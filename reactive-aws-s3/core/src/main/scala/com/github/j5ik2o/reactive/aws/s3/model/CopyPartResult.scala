package com.github.j5ik2o.reactive.aws.s3.model

final case class CopyPartResult(
    eTag: Option[String] = None,
    lastModified: Option[java.time.Instant] = None
) {
  def withETag(value: Option[String]): CopyPartResult =
    copy(eTag = value)
  def withLastModified(value: Option[java.time.Instant]): CopyPartResult =
    copy(lastModified = value)
}
