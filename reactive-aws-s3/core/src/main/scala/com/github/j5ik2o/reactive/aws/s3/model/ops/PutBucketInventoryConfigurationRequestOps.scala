// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketInventoryConfigurationRequest => ScalaPutBucketInventoryConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketInventoryConfigurationRequest => JavaPutBucketInventoryConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketInventoryConfigurationRequestOps {

  implicit class ScalaPutBucketInventoryConfigurationRequestOps(val self: ScalaPutBucketInventoryConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutBucketInventoryConfigurationRequest = {
      val result = JavaPutBucketInventoryConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String
      self.inventoryConfiguration.foreach { v =>
        import InventoryConfigurationOps._; result.inventoryConfiguration(v.toJava)
      } // InventoryConfiguration

      result.build()
    }

  }

}
