// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockEnabled => ScalaObjectLockEnabled, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockEnabled => JavaObjectLockEnabled }

object ObjectLockEnabledOps {

  implicit class ScalaObjectLockEnabledOps(val self: ScalaObjectLockEnabled) extends AnyVal {

    def toJava: JavaObjectLockEnabled = {
      JavaObjectLockEnabled.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectLockEnabledOps(val self: JavaObjectLockEnabled) extends AnyVal {

    def toScala: ScalaObjectLockEnabled = {
      ScalaObjectLockEnabled.withName(self.toString)
    }

  }

}
