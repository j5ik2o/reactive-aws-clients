package com.github.j5ik2o.reactive.aws.s3.model

final case class ServerSideEncryptionRule(
    applyServerSideEncryptionByDefault: Option[ServerSideEncryptionByDefault] = None
) {
  def withApplyServerSideEncryptionByDefault(value: Option[ServerSideEncryptionByDefault]): ServerSideEncryptionRule =
    copy(applyServerSideEncryptionByDefault = value)
}
