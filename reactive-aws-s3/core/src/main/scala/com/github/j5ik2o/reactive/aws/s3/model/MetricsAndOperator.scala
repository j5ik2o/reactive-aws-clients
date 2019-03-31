package com.github.j5ik2o.reactive.aws.s3.model

final case class MetricsAndOperator(
    prefix: Option[String] = None,
    tags: Option[Seq[Tag]] = None
) {
  def withPrefix(value: Option[String]): MetricsAndOperator =
    copy(prefix = value)
  def withTags(value: Option[Seq[Tag]]): MetricsAndOperator =
    copy(tags = value)
}
