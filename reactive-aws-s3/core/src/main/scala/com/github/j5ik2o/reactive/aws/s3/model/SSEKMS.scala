package com.github.j5ik2o.reactive.aws.s3.model

final case class SSEKMS(
    keyId: Option[String] = None
) {
  def withKeyId(value: Option[String]): SSEKMS =
    copy(keyId = value)
}
