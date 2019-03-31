// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketInventoryConfigurationRequest => ScalaDeleteBucketInventoryConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  DeleteBucketInventoryConfigurationRequest => JavaDeleteBucketInventoryConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketInventoryConfigurationRequestOps {

  implicit class ScalaDeleteBucketInventoryConfigurationRequestOps(
      val self: ScalaDeleteBucketInventoryConfigurationRequest
  ) extends AnyVal {

    def toJava: JavaDeleteBucketInventoryConfigurationRequest = {
      val result = JavaDeleteBucketInventoryConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String

      result.build()
    }

  }

}
