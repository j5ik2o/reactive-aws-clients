package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteMarkerEntry(
    owner: Option[Owner] = None,
    key: Option[String] = None,
    versionId: Option[String] = None,
    isLatest: Option[Boolean] = None,
    lastModified: Option[java.time.Instant] = None
) {
  def withOwner(value: Option[Owner]): DeleteMarkerEntry =
    copy(owner = value)
  def withKey(value: Option[String]): DeleteMarkerEntry =
    copy(key = value)
  def withVersionId(value: Option[String]): DeleteMarkerEntry =
    copy(versionId = value)
  def withIsLatest(value: Option[Boolean]): DeleteMarkerEntry =
    copy(isLatest = value)
  def withLastModified(value: Option[java.time.Instant]): DeleteMarkerEntry =
    copy(lastModified = value)
}
