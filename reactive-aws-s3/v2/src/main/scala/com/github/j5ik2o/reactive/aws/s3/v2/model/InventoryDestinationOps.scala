// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryDestination => ScalaInventoryDestination, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryDestination => JavaInventoryDestination }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryDestinationOps {

  implicit class ScalaInventoryDestinationOps(val self: ScalaInventoryDestination) extends AnyVal {

    def toJava: JavaInventoryDestination = {
      val result = JavaInventoryDestination.builder()
      self.s3BucketDestination.foreach { v =>
        import InventoryS3BucketDestinationOps._; result.s3BucketDestination(v.toJava)
      } // InventoryS3BucketDestination

      result.build()
    }

  }

  implicit class JavaInventoryDestinationOps(val self: JavaInventoryDestination) extends AnyVal {

    def toScala: ScalaInventoryDestination = {
      ScalaInventoryDestination()
        .withS3BucketDestination(Option(self.s3BucketDestination).map { v =>
          import InventoryS3BucketDestinationOps._; v.toScala
        }) // InventoryS3BucketDestination
    }

  }

}
