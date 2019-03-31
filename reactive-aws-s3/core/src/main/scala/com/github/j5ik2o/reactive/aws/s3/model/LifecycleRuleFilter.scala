package com.github.j5ik2o.reactive.aws.s3.model

final case class LifecycleRuleFilter(
    prefix: Option[String] = None,
    tag: Option[Tag] = None,
    and: Option[LifecycleRuleAndOperator] = None
) {
  def withPrefix(value: Option[String]): LifecycleRuleFilter =
    copy(prefix = value)
  def withTag(value: Option[Tag]): LifecycleRuleFilter =
    copy(tag = value)
  def withAnd(value: Option[LifecycleRuleAndOperator]): LifecycleRuleFilter =
    copy(and = value)
}
