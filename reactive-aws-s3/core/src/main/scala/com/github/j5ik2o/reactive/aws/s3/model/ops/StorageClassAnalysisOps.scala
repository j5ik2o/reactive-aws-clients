// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ StorageClassAnalysis => ScalaStorageClassAnalysis, _ }
import software.amazon.awssdk.services.s3.model.{ StorageClassAnalysis => JavaStorageClassAnalysis }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StorageClassAnalysisOps {

  implicit class ScalaStorageClassAnalysisOps(val self: ScalaStorageClassAnalysis) extends AnyVal {

    def toJava: JavaStorageClassAnalysis = {
      val result = JavaStorageClassAnalysis.builder()
      self.dataExport.foreach { v =>
        import StorageClassAnalysisDataExportOps._; result.dataExport(v.toJava)
      } // StorageClassAnalysisDataExport

      result.build()
    }

  }

  implicit class JavaStorageClassAnalysisOps(val self: JavaStorageClassAnalysis) extends AnyVal {

    def toScala: ScalaStorageClassAnalysis = {
      ScalaStorageClassAnalysis()
        .withDataExport(Option(self.dataExport).map { v =>
          import StorageClassAnalysisDataExportOps._; v.toScala
        }) // StorageClassAnalysisDataExport
    }

  }

}
