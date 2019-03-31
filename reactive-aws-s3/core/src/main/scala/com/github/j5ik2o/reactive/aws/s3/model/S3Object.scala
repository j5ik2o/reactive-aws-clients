package com.github.j5ik2o.reactive.aws.s3.model

final case class S3Object(
    key: Option[String] = None,
    lastModified: Option[java.time.Instant] = None,
    eTag: Option[String] = None,
    size: Option[Long] = None,
    storageClass: Option[ObjectStorageClass] = None,
    owner: Option[Owner] = None
) {
  def withKey(value: Option[String]): S3Object =
    copy(key = value)
  def withLastModified(value: Option[java.time.Instant]): S3Object =
    copy(lastModified = value)
  def withETag(value: Option[String]): S3Object =
    copy(eTag = value)
  def withSize(value: Option[Long]): S3Object =
    copy(size = value)
  def withStorageClass(value: Option[ObjectStorageClass]): S3Object =
    copy(storageClass = value)
  def withOwner(value: Option[Owner]): S3Object =
    copy(owner = value)
}
