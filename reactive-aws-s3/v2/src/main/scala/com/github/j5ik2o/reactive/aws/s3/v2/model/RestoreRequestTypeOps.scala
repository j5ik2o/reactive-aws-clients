// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ RestoreRequestType => ScalaRestoreRequestType, _ }
import software.amazon.awssdk.services.s3.model.{ RestoreRequestType => JavaRestoreRequestType }

object RestoreRequestTypeOps {

  implicit class ScalaRestoreRequestTypeOps(val self: ScalaRestoreRequestType) extends AnyVal {

    def toJava: JavaRestoreRequestType = {
      JavaRestoreRequestType.valueOf(self.entryName)
    }

  }

  implicit class JavaRestoreRequestTypeOps(val self: JavaRestoreRequestType) extends AnyVal {

    def toScala: ScalaRestoreRequestType = {
      ScalaRestoreRequestType.withName(self.toString)
    }

  }

}
