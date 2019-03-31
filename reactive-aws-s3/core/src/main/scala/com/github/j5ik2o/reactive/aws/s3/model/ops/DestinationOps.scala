// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Destination => ScalaDestination, _ }
import software.amazon.awssdk.services.s3.model.{ Destination => JavaDestination }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DestinationOps {

  implicit class ScalaDestinationOps(val self: ScalaDestination) extends AnyVal {

    def toJava: JavaDestination = {
      val result = JavaDestination.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))   // String
      self.account.filter(_.nonEmpty).foreach(v => result.account(v)) // String
      self.storageClass.foreach { v =>
        import StorageClassOps._; result.storageClass(v.toJava)
      } // String
      self.accessControlTranslation.foreach { v =>
        import AccessControlTranslationOps._; result.accessControlTranslation(v.toJava)
      } // AccessControlTranslation
      self.encryptionConfiguration.foreach { v =>
        import EncryptionConfigurationOps._; result.encryptionConfiguration(v.toJava)
      } // EncryptionConfiguration

      result.build()
    }

  }

  implicit class JavaDestinationOps(val self: JavaDestination) extends AnyVal {

    def toScala: ScalaDestination = {
      ScalaDestination()
        .withBucket(Option(self.bucket)) // String
        .withAccount(Option(self.account)) // String
        .withStorageClass(Option(self.storageClass).map { v =>
          import StorageClassOps._; v.toScala
        }) // String
        .withAccessControlTranslation(Option(self.accessControlTranslation).map { v =>
          import AccessControlTranslationOps._; v.toScala
        }) // AccessControlTranslation
        .withEncryptionConfiguration(Option(self.encryptionConfiguration).map { v =>
          import EncryptionConfigurationOps._; v.toScala
        }) // EncryptionConfiguration
    }

  }

}
