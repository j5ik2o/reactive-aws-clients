package com.github.j5ik2o.reactive.kinesis.model

final case class StopStreamEncryptionRequest(streamName: Option[String] = None,
                                             encryptionType: Option[EncryptionType] = None,
                                             keyId: Option[String] = None) {

  def withStreamName(value: Option[String]): StopStreamEncryptionRequest             = copy(streamName = value)
  def withEncryptionType(value: Option[EncryptionType]): StopStreamEncryptionRequest = copy(encryptionType = value)
  def withKeyId(value: Option[String]): StopStreamEncryptionRequest                  = copy(keyId = value)

}
