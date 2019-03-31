package com.github.j5ik2o.reactive.aws.s3.model

final case class ReplicationConfiguration(
    role: Option[String] = None,
    rules: Option[Seq[ReplicationRule]] = None
) {
  def withRole(value: Option[String]): ReplicationConfiguration =
    copy(role = value)
  def withRules(value: Option[Seq[ReplicationRule]]): ReplicationConfiguration =
    copy(rules = value)
}
