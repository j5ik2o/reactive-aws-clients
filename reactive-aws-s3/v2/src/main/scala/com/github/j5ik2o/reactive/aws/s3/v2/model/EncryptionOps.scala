// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Encryption => ScalaEncryption, _ }
import software.amazon.awssdk.services.s3.model.{ Encryption => JavaEncryption }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EncryptionOps {

  implicit class ScalaEncryptionOps(val self: ScalaEncryption) extends AnyVal {

    def toJava: JavaEncryption = {
      val result = JavaEncryption.builder()
      self.encryptionType.foreach { v =>
        import ServerSideEncryptionOps._; result.encryptionType(v.toJava)
      } // String
      self.kmsKeyId.filter(_.nonEmpty).foreach(v => result.kmsKeyId(v))     // String
      self.kmsContext.filter(_.nonEmpty).foreach(v => result.kmsContext(v)) // String

      result.build()
    }

  }

  implicit class JavaEncryptionOps(val self: JavaEncryption) extends AnyVal {

    def toScala: ScalaEncryption = {
      ScalaEncryption()
        .withEncryptionType(Option(self.encryptionType).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withKmsKeyId(Option(self.kmsKeyId)) // String
        .withKmsContext(Option(self.kmsContext)) // String
    }

  }

}
