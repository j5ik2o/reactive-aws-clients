// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ SseKmsEncryptedObjectsStatus => ScalaSseKmsEncryptedObjectsStatus, _ }
import software.amazon.awssdk.services.s3.model.{ SseKmsEncryptedObjectsStatus => JavaSseKmsEncryptedObjectsStatus }

object SseKmsEncryptedObjectsStatusOps {

  implicit class ScalaSseKmsEncryptedObjectsStatusOps(val self: ScalaSseKmsEncryptedObjectsStatus) extends AnyVal {

    def toJava: JavaSseKmsEncryptedObjectsStatus = {
      JavaSseKmsEncryptedObjectsStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaSseKmsEncryptedObjectsStatusOps(val self: JavaSseKmsEncryptedObjectsStatus) extends AnyVal {

    def toScala: ScalaSseKmsEncryptedObjectsStatus = {
      ScalaSseKmsEncryptedObjectsStatus.withName(self.toString)
    }

  }

}
