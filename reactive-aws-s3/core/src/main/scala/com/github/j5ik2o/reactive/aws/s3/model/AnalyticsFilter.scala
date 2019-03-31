package com.github.j5ik2o.reactive.aws.s3.model

final case class AnalyticsFilter(
    prefix: Option[String] = None,
    tag: Option[Tag] = None,
    and: Option[AnalyticsAndOperator] = None
) {
  def withPrefix(value: Option[String]): AnalyticsFilter =
    copy(prefix = value)
  def withTag(value: Option[Tag]): AnalyticsFilter =
    copy(tag = value)
  def withAnd(value: Option[AnalyticsAndOperator]): AnalyticsFilter =
    copy(and = value)
}
