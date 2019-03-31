package com.github.j5ik2o.reactive.aws.s3.model

final case class DeletedObject(
    key: Option[String] = None,
    versionId: Option[String] = None,
    deleteMarker: Option[Boolean] = None,
    deleteMarkerVersionId: Option[String] = None
) {
  def withKey(value: Option[String]): DeletedObject =
    copy(key = value)
  def withVersionId(value: Option[String]): DeletedObject =
    copy(versionId = value)
  def withDeleteMarker(value: Option[Boolean]): DeletedObject =
    copy(deleteMarker = value)
  def withDeleteMarkerVersionId(value: Option[String]): DeletedObject =
    copy(deleteMarkerVersionId = value)
}
