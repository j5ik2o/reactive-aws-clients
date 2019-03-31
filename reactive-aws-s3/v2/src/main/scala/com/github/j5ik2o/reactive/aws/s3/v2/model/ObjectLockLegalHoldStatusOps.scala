// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockLegalHoldStatus => ScalaObjectLockLegalHoldStatus, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockLegalHoldStatus => JavaObjectLockLegalHoldStatus }

object ObjectLockLegalHoldStatusOps {

  implicit class ScalaObjectLockLegalHoldStatusOps(val self: ScalaObjectLockLegalHoldStatus) extends AnyVal {

    def toJava: JavaObjectLockLegalHoldStatus = {
      JavaObjectLockLegalHoldStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectLockLegalHoldStatusOps(val self: JavaObjectLockLegalHoldStatus) extends AnyVal {

    def toScala: ScalaObjectLockLegalHoldStatus = {
      ScalaObjectLockLegalHoldStatus.withName(self.toString)
    }

  }

}
