package com.github.j5ik2o.reactive.aws.s3.model

final case class ServerSideEncryptionConfiguration(
    rules: Option[Seq[ServerSideEncryptionRule]] = None
) {
  def withRules(value: Option[Seq[ServerSideEncryptionRule]]): ServerSideEncryptionConfiguration =
    copy(rules = value)
}
