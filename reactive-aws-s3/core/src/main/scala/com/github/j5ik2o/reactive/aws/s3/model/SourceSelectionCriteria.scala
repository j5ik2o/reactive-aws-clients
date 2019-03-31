package com.github.j5ik2o.reactive.aws.s3.model

final case class SourceSelectionCriteria(
    sseKmsEncryptedObjects: Option[SseKmsEncryptedObjects] = None
) {
  def withSseKmsEncryptedObjects(value: Option[SseKmsEncryptedObjects]): SourceSelectionCriteria =
    copy(sseKmsEncryptedObjects = value)
}
