package com.github.j5ik2o.reactive.aws.s3.model

final case class VersioningConfiguration(
    mfaDelete: Option[MFADelete] = None,
    status: Option[BucketVersioningStatus] = None
) {
  def withMfaDelete(value: Option[MFADelete]): VersioningConfiguration =
    copy(mfaDelete = value)
  def withStatus(value: Option[BucketVersioningStatus]): VersioningConfiguration =
    copy(status = value)
}
