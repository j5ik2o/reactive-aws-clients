package com.github.j5ik2o.reactive.aws.s3.model

final case class MetricsFilter(
    prefix: Option[String] = None,
    tag: Option[Tag] = None,
    and: Option[MetricsAndOperator] = None
) {
  def withPrefix(value: Option[String]): MetricsFilter =
    copy(prefix = value)
  def withTag(value: Option[Tag]): MetricsFilter =
    copy(tag = value)
  def withAnd(value: Option[MetricsAndOperator]): MetricsFilter =
    copy(and = value)
}
