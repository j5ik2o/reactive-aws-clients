// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ EncryptionConfiguration => ScalaEncryptionConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ EncryptionConfiguration => JavaEncryptionConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object EncryptionConfigurationOps {

  implicit class ScalaEncryptionConfigurationOps(val self: ScalaEncryptionConfiguration) extends AnyVal {

    def toJava: JavaEncryptionConfiguration = {
      val result = JavaEncryptionConfiguration.builder()
      self.replicaKmsKeyID.filter(_.nonEmpty).foreach(v => result.replicaKmsKeyID(v)) // String

      result.build()
    }

  }

  implicit class JavaEncryptionConfigurationOps(val self: JavaEncryptionConfiguration) extends AnyVal {

    def toScala: ScalaEncryptionConfiguration = {
      ScalaEncryptionConfiguration()
        .withReplicaKmsKeyID(Option(self.replicaKmsKeyID)) // String
    }

  }

}
