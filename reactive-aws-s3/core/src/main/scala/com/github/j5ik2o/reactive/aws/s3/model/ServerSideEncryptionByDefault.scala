package com.github.j5ik2o.reactive.aws.s3.model

final case class ServerSideEncryptionByDefault(
    sseAlgorithm: Option[ServerSideEncryption] = None,
    kmsMasterKeyID: Option[String] = None
) {
  def withSseAlgorithm(value: Option[ServerSideEncryption]): ServerSideEncryptionByDefault =
    copy(sseAlgorithm = value)
  def withKmsMasterKeyID(value: Option[String]): ServerSideEncryptionByDefault =
    copy(kmsMasterKeyID = value)
}
