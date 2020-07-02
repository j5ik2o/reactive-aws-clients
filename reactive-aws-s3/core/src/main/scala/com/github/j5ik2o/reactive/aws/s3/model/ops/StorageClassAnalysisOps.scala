// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class StorageClassAnalysisBuilderOps(val self: StorageClassAnalysis.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataExportAsScala(value: Option[StorageClassAnalysisDataExport]): StorageClassAnalysis.Builder = {
    value.fold(self) { v => self.dataExport(v) }
  }

}

final class StorageClassAnalysisOps(val self: StorageClassAnalysis) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataExportAsScala: Option[StorageClassAnalysisDataExport] = Option(self.dataExport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageClassAnalysisOps {

  implicit def toStorageClassAnalysisBuilderOps(v: StorageClassAnalysis.Builder): StorageClassAnalysisBuilderOps =
    new StorageClassAnalysisBuilderOps(v)

  implicit def toStorageClassAnalysisOps(v: StorageClassAnalysis): StorageClassAnalysisOps =
    new StorageClassAnalysisOps(v)

}
