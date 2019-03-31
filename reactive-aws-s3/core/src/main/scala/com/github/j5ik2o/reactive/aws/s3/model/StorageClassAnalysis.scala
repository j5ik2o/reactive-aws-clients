package com.github.j5ik2o.reactive.aws.s3.model

final case class StorageClassAnalysis(
    dataExport: Option[StorageClassAnalysisDataExport] = None
) {
  def withDataExport(value: Option[StorageClassAnalysisDataExport]): StorageClassAnalysis =
    copy(dataExport = value)
}
