// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockMode => ScalaObjectLockMode, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockMode => JavaObjectLockMode }

object ObjectLockModeOps {

  implicit class ScalaObjectLockModeOps(val self: ScalaObjectLockMode) extends AnyVal {

    def toJava: JavaObjectLockMode = {
      JavaObjectLockMode.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectLockModeOps(val self: JavaObjectLockMode) extends AnyVal {

    def toScala: ScalaObjectLockMode = {
      ScalaObjectLockMode.withName(self.toString)
    }

  }

}
