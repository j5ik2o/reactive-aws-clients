package com.github.j5ik2o.reactive.aws.s3.model

final case class ReplicationRuleFilter(
    prefix: Option[String] = None,
    tag: Option[Tag] = None,
    and: Option[ReplicationRuleAndOperator] = None
) {
  def withPrefix(value: Option[String]): ReplicationRuleFilter =
    copy(prefix = value)
  def withTag(value: Option[Tag]): ReplicationRuleFilter =
    copy(tag = value)
  def withAnd(value: Option[ReplicationRuleAndOperator]): ReplicationRuleFilter =
    copy(and = value)
}
