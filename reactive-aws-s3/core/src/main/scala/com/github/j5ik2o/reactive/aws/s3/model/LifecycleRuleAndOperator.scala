package com.github.j5ik2o.reactive.aws.s3.model

final case class LifecycleRuleAndOperator(
    prefix: Option[String] = None,
    tags: Option[Seq[Tag]] = None
) {
  def withPrefix(value: Option[String]): LifecycleRuleAndOperator =
    copy(prefix = value)
  def withTags(value: Option[Seq[Tag]]): LifecycleRuleAndOperator =
    copy(tags = value)
}
