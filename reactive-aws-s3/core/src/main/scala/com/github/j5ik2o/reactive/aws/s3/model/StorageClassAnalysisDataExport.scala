package com.github.j5ik2o.reactive.aws.s3.model

final case class StorageClassAnalysisDataExport(
    outputSchemaVersion: Option[StorageClassAnalysisSchemaVersion] = None,
    destination: Option[AnalyticsExportDestination] = None
) {
  def withOutputSchemaVersion(value: Option[StorageClassAnalysisSchemaVersion]): StorageClassAnalysisDataExport =
    copy(outputSchemaVersion = value)
  def withDestination(value: Option[AnalyticsExportDestination]): StorageClassAnalysisDataExport =
    copy(destination = value)
}
