package com.github.j5ik2o.reactive.aws.kinesis.model

final case class StopStreamEncryptionRequest(
    streamName: Option[String] = None, // String
    encryptionType: Option[EncryptionType] = None, // String
    keyId: Option[String] = None // String
) {
  def withStreamName(value: Option[String]): StopStreamEncryptionRequest =
    copy(streamName = value)
  def withEncryptionType(value: Option[EncryptionType]): StopStreamEncryptionRequest =
    copy(encryptionType = value)
  def withKeyId(value: Option[String]): StopStreamEncryptionRequest =
    copy(keyId = value)
}
