// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ SseKmsEncryptedObjects => ScalaSseKmsEncryptedObjects, _ }
import software.amazon.awssdk.services.s3.model.{ SseKmsEncryptedObjects => JavaSseKmsEncryptedObjects }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SseKmsEncryptedObjectsOps {

  implicit class ScalaSseKmsEncryptedObjectsOps(val self: ScalaSseKmsEncryptedObjects) extends AnyVal {

    def toJava: JavaSseKmsEncryptedObjects = {
      val result = JavaSseKmsEncryptedObjects.builder()
      self.status.foreach { v =>
        import SseKmsEncryptedObjectsStatusOps._; result.status(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaSseKmsEncryptedObjectsOps(val self: JavaSseKmsEncryptedObjects) extends AnyVal {

    def toScala: ScalaSseKmsEncryptedObjects = {
      ScalaSseKmsEncryptedObjects()
        .withStatus(Option(self.status).map { v =>
          import SseKmsEncryptedObjectsStatusOps._; v.toScala
        }) // String
    }

  }

}
