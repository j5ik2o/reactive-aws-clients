// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketInventoryConfigurationRequest => ScalaGetBucketInventoryConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketInventoryConfigurationRequest => JavaGetBucketInventoryConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketInventoryConfigurationRequestOps {

  implicit class ScalaGetBucketInventoryConfigurationRequestOps(val self: ScalaGetBucketInventoryConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetBucketInventoryConfigurationRequest = {
      val result = JavaGetBucketInventoryConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String

      result.build()
    }

  }

}
