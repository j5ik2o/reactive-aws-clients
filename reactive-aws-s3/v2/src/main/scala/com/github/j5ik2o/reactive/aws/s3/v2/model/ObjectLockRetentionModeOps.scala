// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockRetentionMode => ScalaObjectLockRetentionMode, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockRetentionMode => JavaObjectLockRetentionMode }

object ObjectLockRetentionModeOps {

  implicit class ScalaObjectLockRetentionModeOps(val self: ScalaObjectLockRetentionMode) extends AnyVal {

    def toJava: JavaObjectLockRetentionMode = {
      JavaObjectLockRetentionMode.valueOf(self.entryName)
    }

  }

  implicit class JavaObjectLockRetentionModeOps(val self: JavaObjectLockRetentionMode) extends AnyVal {

    def toScala: ScalaObjectLockRetentionMode = {
      ScalaObjectLockRetentionMode.withName(self.toString)
    }

  }

}
