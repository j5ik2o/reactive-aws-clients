// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  StorageClassAnalysisDataExport => ScalaStorageClassAnalysisDataExport,
  _
}
import software.amazon.awssdk.services.s3.model.{ StorageClassAnalysisDataExport => JavaStorageClassAnalysisDataExport }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StorageClassAnalysisDataExportOps {

  implicit class ScalaStorageClassAnalysisDataExportOps(val self: ScalaStorageClassAnalysisDataExport) extends AnyVal {

    def toJava: JavaStorageClassAnalysisDataExport = {
      val result = JavaStorageClassAnalysisDataExport.builder()
      self.outputSchemaVersion.foreach { v =>
        import StorageClassAnalysisSchemaVersionOps._; result.outputSchemaVersion(v.toJava)
      } // String
      self.destination.foreach { v =>
        import AnalyticsExportDestinationOps._; result.destination(v.toJava)
      } // AnalyticsExportDestination

      result.build()
    }

  }

  implicit class JavaStorageClassAnalysisDataExportOps(val self: JavaStorageClassAnalysisDataExport) extends AnyVal {

    def toScala: ScalaStorageClassAnalysisDataExport = {
      ScalaStorageClassAnalysisDataExport()
        .withOutputSchemaVersion(Option(self.outputSchemaVersion).map { v =>
          import StorageClassAnalysisSchemaVersionOps._; v.toScala
        }) // String
        .withDestination(Option(self.destination).map { v =>
          import AnalyticsExportDestinationOps._; v.toScala
        }) // AnalyticsExportDestination
    }

  }

}
