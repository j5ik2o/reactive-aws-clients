package com.github.j5ik2o.reactive.aws.s3.model

final case class SseKmsEncryptedObjects(
    status: Option[SseKmsEncryptedObjectsStatus] = None
) {
  def withStatus(value: Option[SseKmsEncryptedObjectsStatus]): SseKmsEncryptedObjects =
    copy(status = value)
}
