package com.github.j5ik2o.reactive.aws.s3.model

final case class ReplicationRuleAndOperator(
    prefix: Option[String] = None,
    tags: Option[Seq[Tag]] = None
) {
  def withPrefix(value: Option[String]): ReplicationRuleAndOperator =
    copy(prefix = value)
  def withTags(value: Option[Seq[Tag]]): ReplicationRuleAndOperator =
    copy(tags = value)
}
