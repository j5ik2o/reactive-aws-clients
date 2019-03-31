package com.github.j5ik2o.reactive.aws.s3.model

final case class DeleteMarkerReplication(
    status: Option[DeleteMarkerReplicationStatus] = None
) {
  def withStatus(value: Option[DeleteMarkerReplicationStatus]): DeleteMarkerReplication =
    copy(status = value)
}
