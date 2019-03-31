// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ SourceSelectionCriteria => ScalaSourceSelectionCriteria, _ }
import software.amazon.awssdk.services.s3.model.{ SourceSelectionCriteria => JavaSourceSelectionCriteria }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceSelectionCriteriaOps {

  implicit class ScalaSourceSelectionCriteriaOps(val self: ScalaSourceSelectionCriteria) extends AnyVal {

    def toJava: JavaSourceSelectionCriteria = {
      val result = JavaSourceSelectionCriteria.builder()
      self.sseKmsEncryptedObjects.foreach { v =>
        import SseKmsEncryptedObjectsOps._; result.sseKmsEncryptedObjects(v.toJava)
      } // SseKmsEncryptedObjects

      result.build()
    }

  }

  implicit class JavaSourceSelectionCriteriaOps(val self: JavaSourceSelectionCriteria) extends AnyVal {

    def toScala: ScalaSourceSelectionCriteria = {
      ScalaSourceSelectionCriteria()
        .withSseKmsEncryptedObjects(Option(self.sseKmsEncryptedObjects).map { v =>
          import SseKmsEncryptedObjectsOps._; v.toScala
        }) // SseKmsEncryptedObjects
    }

  }

}
