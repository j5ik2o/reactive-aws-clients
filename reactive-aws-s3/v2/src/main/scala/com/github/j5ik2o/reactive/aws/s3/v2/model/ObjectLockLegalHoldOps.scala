// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ObjectLockLegalHold => ScalaObjectLockLegalHold, _ }
import software.amazon.awssdk.services.s3.model.{ ObjectLockLegalHold => JavaObjectLockLegalHold }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ObjectLockLegalHoldOps {

  implicit class ScalaObjectLockLegalHoldOps(val self: ScalaObjectLockLegalHold) extends AnyVal {

    def toJava: JavaObjectLockLegalHold = {
      val result = JavaObjectLockLegalHold.builder()
      self.status.foreach { v =>
        import ObjectLockLegalHoldStatusOps._; result.status(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaObjectLockLegalHoldOps(val self: JavaObjectLockLegalHold) extends AnyVal {

    def toScala: ScalaObjectLockLegalHold = {
      ScalaObjectLockLegalHold()
        .withStatus(Option(self.status).map { v =>
          import ObjectLockLegalHoldStatusOps._; v.toScala
        }) // String
    }

  }

}
