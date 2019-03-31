package com.github.j5ik2o.reactive.aws.s3.model

final case class MetricsConfiguration(
    id: Option[String] = None,
    filter: Option[MetricsFilter] = None
) {
  def withId(value: Option[String]): MetricsConfiguration =
    copy(id = value)
  def withFilter(value: Option[MetricsFilter]): MetricsConfiguration =
    copy(filter = value)
}
