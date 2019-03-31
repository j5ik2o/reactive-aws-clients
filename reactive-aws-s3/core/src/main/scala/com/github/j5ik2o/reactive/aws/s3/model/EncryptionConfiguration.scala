package com.github.j5ik2o.reactive.aws.s3.model

final case class EncryptionConfiguration(
    replicaKmsKeyID: Option[String] = None
) {
  def withReplicaKmsKeyID(value: Option[String]): EncryptionConfiguration =
    copy(replicaKmsKeyID = value)
}
