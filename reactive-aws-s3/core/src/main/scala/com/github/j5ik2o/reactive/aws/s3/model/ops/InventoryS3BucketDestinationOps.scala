// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryS3BucketDestination => ScalaInventoryS3BucketDestination, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryS3BucketDestination => JavaInventoryS3BucketDestination }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryS3BucketDestinationOps {

  implicit class ScalaInventoryS3BucketDestinationOps(val self: ScalaInventoryS3BucketDestination) extends AnyVal {

    def toJava: JavaInventoryS3BucketDestination = {
      val result = JavaInventoryS3BucketDestination.builder()
      self.accountId.filter(_.nonEmpty).foreach(v => result.accountId(v)) // String
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.format.foreach { v =>
        import InventoryFormatOps._; result.format(v.toJava)
      } // String
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.encryption.foreach { v =>
        import InventoryEncryptionOps._; result.encryption(v.toJava)
      } // InventoryEncryption

      result.build()
    }

  }

  implicit class JavaInventoryS3BucketDestinationOps(val self: JavaInventoryS3BucketDestination) extends AnyVal {

    def toScala: ScalaInventoryS3BucketDestination = {
      ScalaInventoryS3BucketDestination()
        .withAccountId(Option(self.accountId)) // String
        .withBucket(Option(self.bucket)) // String
        .withFormat(Option(self.format).map { v =>
          import InventoryFormatOps._; v.toScala
        }) // String
        .withPrefix(Option(self.prefix)) // String
        .withEncryption(Option(self.encryption).map { v =>
          import InventoryEncryptionOps._; v.toScala
        }) // InventoryEncryption
    }

  }

}
