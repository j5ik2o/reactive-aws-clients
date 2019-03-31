// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  StorageClassAnalysisSchemaVersion => ScalaStorageClassAnalysisSchemaVersion,
  _
}
import software.amazon.awssdk.services.s3.model.{
  StorageClassAnalysisSchemaVersion => JavaStorageClassAnalysisSchemaVersion
}

object StorageClassAnalysisSchemaVersionOps {

  implicit class ScalaStorageClassAnalysisSchemaVersionOps(val self: ScalaStorageClassAnalysisSchemaVersion)
      extends AnyVal {

    def toJava: JavaStorageClassAnalysisSchemaVersion = {
      JavaStorageClassAnalysisSchemaVersion.valueOf(self.entryName)
    }

  }

  implicit class JavaStorageClassAnalysisSchemaVersionOps(val self: JavaStorageClassAnalysisSchemaVersion)
      extends AnyVal {

    def toScala: ScalaStorageClassAnalysisSchemaVersion = {
      ScalaStorageClassAnalysisSchemaVersion.withName(self.toString)
    }

  }

}
