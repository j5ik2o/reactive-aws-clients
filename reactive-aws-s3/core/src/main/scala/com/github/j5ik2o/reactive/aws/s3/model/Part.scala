package com.github.j5ik2o.reactive.aws.s3.model

final case class Part(
    partNumber: Option[Int] = None,
    lastModified: Option[java.time.Instant] = None,
    eTag: Option[String] = None,
    size: Option[Int] = None
) {
  def withPartNumber(value: Option[Int]): Part =
    copy(partNumber = value)
  def withLastModified(value: Option[java.time.Instant]): Part =
    copy(lastModified = value)
  def withETag(value: Option[String]): Part =
    copy(eTag = value)
  def withSize(value: Option[Int]): Part =
    copy(size = value)
}
