// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ExpirationStatus => ScalaExpirationStatus, _ }
import software.amazon.awssdk.services.s3.model.{ ExpirationStatus => JavaExpirationStatus }

object ExpirationStatusOps {

  implicit class ScalaExpirationStatusOps(val self: ScalaExpirationStatus) extends AnyVal {

    def toJava: JavaExpirationStatus = {
      JavaExpirationStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaExpirationStatusOps(val self: JavaExpirationStatus) extends AnyVal {

    def toScala: ScalaExpirationStatus = {
      ScalaExpirationStatus.withName(self.toString)
    }

  }

}
