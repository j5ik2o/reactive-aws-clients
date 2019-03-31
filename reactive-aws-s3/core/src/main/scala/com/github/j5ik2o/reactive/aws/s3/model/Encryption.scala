package com.github.j5ik2o.reactive.aws.s3.model

final case class Encryption(
    encryptionType: Option[ServerSideEncryption] = None,
    kmsKeyId: Option[String] = None,
    kmsContext: Option[String] = None
) {
  def withEncryptionType(value: Option[ServerSideEncryption]): Encryption =
    copy(encryptionType = value)
  def withKmsKeyId(value: Option[String]): Encryption =
    copy(kmsKeyId = value)
  def withKmsContext(value: Option[String]): Encryption =
    copy(kmsContext = value)
}
