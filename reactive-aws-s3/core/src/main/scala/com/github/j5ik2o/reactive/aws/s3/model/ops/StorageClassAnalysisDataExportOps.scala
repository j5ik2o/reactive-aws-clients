// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class StorageClassAnalysisDataExportBuilderOps(val self: StorageClassAnalysisDataExport.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputSchemaVersionAsScala(
      value: Option[StorageClassAnalysisSchemaVersion]
  ): StorageClassAnalysisDataExport.Builder = {
    value.fold(self) { v =>
      self.outputSchemaVersion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala(value: Option[AnalyticsExportDestination]): StorageClassAnalysisDataExport.Builder = {
    value.fold(self) { v =>
      self.destination(v)
    }
  }

}

final class StorageClassAnalysisDataExportOps(val self: StorageClassAnalysisDataExport) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputSchemaVersionAsScala: Option[StorageClassAnalysisSchemaVersion] = Option(self.outputSchemaVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationAsScala: Option[AnalyticsExportDestination] = Option(self.destination)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageClassAnalysisDataExportOps {

  implicit def toStorageClassAnalysisDataExportBuilderOps(
      v: StorageClassAnalysisDataExport.Builder
  ): StorageClassAnalysisDataExportBuilderOps = new StorageClassAnalysisDataExportBuilderOps(v)

  implicit def toStorageClassAnalysisDataExportOps(
      v: StorageClassAnalysisDataExport
  ): StorageClassAnalysisDataExportOps = new StorageClassAnalysisDataExportOps(v)

}
