// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockRetention => ScalaObjectLockRetention, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockRetention => JavaObjectLockRetention }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectLockRetentionOps {

  implicit class ScalaObjectLockRetentionOps(val self: ScalaObjectLockRetention) extends AnyVal {

    def toJava: JavaObjectLockRetention = {
      val result = JavaObjectLockRetention.builder()
      self.mode.foreach { v =>
        import ObjectLockRetentionModeOps._; result.mode(v.toJava)
      } // String
      self.retainUntilDate.foreach(v => result.retainUntilDate(v)) // Instant

      result.build()
    }

  }

  implicit class JavaObjectLockRetentionOps(val self: JavaObjectLockRetention) extends AnyVal {

    def toScala: ScalaObjectLockRetention = {
      ScalaObjectLockRetention()
        .withMode(Option(self.mode).map { v =>
          import ObjectLockRetentionModeOps._; v.toScala
        }) // String
        .withRetainUntilDate(Option(self.retainUntilDate)) // Instant
    }

  }

}
