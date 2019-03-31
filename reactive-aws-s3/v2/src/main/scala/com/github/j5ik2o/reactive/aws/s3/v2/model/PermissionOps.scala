// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Permission => ScalaPermission, _ }
import software.amazon.awssdk.services.s3.model.{ Permission => JavaPermission }

object PermissionOps {

  implicit class ScalaPermissionOps(val self: ScalaPermission) extends AnyVal {

    def toJava: JavaPermission = {
      JavaPermission.valueOf(self.entryName)
    }

  }

  implicit class JavaPermissionOps(val self: JavaPermission) extends AnyVal {

    def toScala: ScalaPermission = {
      ScalaPermission.withName(self.toString)
    }

  }

}
