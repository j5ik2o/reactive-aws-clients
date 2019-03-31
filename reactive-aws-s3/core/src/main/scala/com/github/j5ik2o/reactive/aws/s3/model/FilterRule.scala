package com.github.j5ik2o.reactive.aws.s3.model

final case class FilterRule(
    name: Option[FilterRuleName] = None,
    value: Option[String] = None
) {
  def withName(value: Option[FilterRuleName]): FilterRule =
    copy(name = value)
  def withValue(value: Option[String]): FilterRule =
    copy(value = value)
}
