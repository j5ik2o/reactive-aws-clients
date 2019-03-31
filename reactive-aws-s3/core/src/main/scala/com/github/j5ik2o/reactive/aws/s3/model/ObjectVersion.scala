package com.github.j5ik2o.reactive.aws.s3.model

final case class ObjectVersion(
    eTag: Option[String] = None,
    size: Option[Int] = None,
    storageClass: Option[ObjectVersionStorageClass] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    isLatest: Option[Boolean] = None,
    lastModified: Option[java.time.Instant] = None,
    owner: Option[Owner] = None
) {
  def withETag(value: Option[String]): ObjectVersion =
    copy(eTag = value)
  def withSize(value: Option[Int]): ObjectVersion =
    copy(size = value)
  def withStorageClass(value: Option[ObjectVersionStorageClass]): ObjectVersion =
    copy(storageClass = value)
  def withKey(value: Option[String]): ObjectVersion =
    copy(key = value)
  def withVersionId(value: Option[String]): ObjectVersion =
    copy(versionId = value)
  def withIsLatest(value: Option[Boolean]): ObjectVersion =
    copy(isLatest = value)
  def withLastModified(value: Option[java.time.Instant]): ObjectVersion =
    copy(lastModified = value)
  def withOwner(value: Option[Owner]): ObjectVersion =
    copy(owner = value)
}
