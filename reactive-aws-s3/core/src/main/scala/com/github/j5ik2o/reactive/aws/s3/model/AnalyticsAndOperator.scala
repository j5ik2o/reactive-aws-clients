package com.github.j5ik2o.reactive.aws.s3.model

final case class AnalyticsAndOperator(
    prefix: Option[String] = None,
    tags: Option[Seq[Tag]] = None
) {
  def withPrefix(value: Option[String]): AnalyticsAndOperator =
    copy(prefix = value)
  def withTags(value: Option[Seq[Tag]]): AnalyticsAndOperator =
    copy(tags = value)
}
