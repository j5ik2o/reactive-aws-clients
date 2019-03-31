package com.github.j5ik2o.reactive.aws.s3.model

final case class AnalyticsConfiguration(
    id: Option[String] = None,
    filter: Option[AnalyticsFilter] = None,
    storageClassAnalysis: Option[StorageClassAnalysis] = None
) {
  def withId(value: Option[String]): AnalyticsConfiguration =
    copy(id = value)
  def withFilter(value: Option[AnalyticsFilter]): AnalyticsConfiguration =
    copy(filter = value)
  def withStorageClassAnalysis(value: Option[StorageClassAnalysis]): AnalyticsConfiguration =
    copy(storageClassAnalysis = value)
}
