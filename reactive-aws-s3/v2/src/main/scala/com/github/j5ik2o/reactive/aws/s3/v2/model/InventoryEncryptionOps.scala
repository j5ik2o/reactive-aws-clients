// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryEncryption => ScalaInventoryEncryption, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryEncryption => JavaInventoryEncryption }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryEncryptionOps {

  implicit class ScalaInventoryEncryptionOps(val self: ScalaInventoryEncryption) extends AnyVal {

    def toJava: JavaInventoryEncryption = {
      val result = JavaInventoryEncryption.builder()
      self.sses3.foreach { v =>
        import SSES3Ops._; result.sses3(v.toJava)
      } // SSES3
      self.ssekms.foreach { v =>
        import SSEKMSOps._; result.ssekms(v.toJava)
      } // SSEKMS

      result.build()
    }

  }

  implicit class JavaInventoryEncryptionOps(val self: JavaInventoryEncryption) extends AnyVal {

    def toScala: ScalaInventoryEncryption = {
      ScalaInventoryEncryption()
        .withSses3(Option(self.sses3).map { v =>
          import SSES3Ops._; v.toScala
        }) // SSES3
        .withSsekms(Option(self.ssekms).map { v =>
          import SSEKMSOps._; v.toScala
        }) // SSEKMS
    }

  }

}
