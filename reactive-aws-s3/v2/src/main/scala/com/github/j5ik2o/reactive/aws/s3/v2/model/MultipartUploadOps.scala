// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ MultipartUpload => ScalaMultipartUpload, _ }
import software.amazon.awssdk.services.s3.model.{ MultipartUpload => JavaMultipartUpload }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MultipartUploadOps {

  implicit class ScalaMultipartUploadOps(val self: ScalaMultipartUpload) extends AnyVal {

    def toJava: JavaMultipartUpload = {
      val result = JavaMultipartUpload.builder()
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v)) // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))           // String
      self.initiated.foreach(v => result.initiated(v))                  // Instant
      self.storageClass.foreach { v =>
        import StorageClassOps._; result.storageClass(v.toJava)
      } // String
      self.owner.foreach { v =>
        import OwnerOps._; result.owner(v.toJava)
      } // Owner
      self.initiator.foreach { v =>
        import InitiatorOps._; result.initiator(v.toJava)
      } // Initiator

      result.build()
    }

  }

  implicit class JavaMultipartUploadOps(val self: JavaMultipartUpload) extends AnyVal {

    def toScala: ScalaMultipartUpload = {
      ScalaMultipartUpload()
        .withUploadId(Option(self.uploadId)) // String
        .withKey(Option(self.key)) // String
        .withInitiated(Option(self.initiated)) // Instant
        .withStorageClass(Option(self.storageClass).map { v =>
          import StorageClassOps._; v.toScala
        }) // String
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
        .withInitiator(Option(self.initiator).map { v =>
          import InitiatorOps._; v.toScala
        }) // Initiator
    }

  }

}
