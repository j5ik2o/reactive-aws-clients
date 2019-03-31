// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ AnalyticsS3ExportFileFormat => ScalaAnalyticsS3ExportFileFormat, _ }
import software.amazon.awssdk.services.s3.model.{ AnalyticsS3ExportFileFormat => JavaAnalyticsS3ExportFileFormat }

object AnalyticsS3ExportFileFormatOps {

  implicit class ScalaAnalyticsS3ExportFileFormatOps(val self: ScalaAnalyticsS3ExportFileFormat) extends AnyVal {

    def toJava: JavaAnalyticsS3ExportFileFormat = {
      JavaAnalyticsS3ExportFileFormat.valueOf(self.entryName)
    }

  }

  implicit class JavaAnalyticsS3ExportFileFormatOps(val self: JavaAnalyticsS3ExportFileFormat) extends AnyVal {

    def toScala: ScalaAnalyticsS3ExportFileFormat = {
      ScalaAnalyticsS3ExportFileFormat.withName(self.toString)
    }

  }

}
