package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StartStreamEncryptionRequest(
    streamName: Option[String] = None, // String
    encryptionType: Option[EncryptionType] = None, // String
    keyId: Option[String] = None // String
) {
  def withStreamName(value: Option[String]): StartStreamEncryptionRequest =
    copy(streamName = value)
  def withEncryptionType(value: Option[EncryptionType]): StartStreamEncryptionRequest =
    copy(encryptionType = value)
  def withKeyId(value: Option[String]): StartStreamEncryptionRequest =
    copy(keyId = value)
}
