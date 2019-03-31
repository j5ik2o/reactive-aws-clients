// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketAccelerateConfigurationRequest => ScalaGetBucketAccelerateConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketAccelerateConfigurationRequest => JavaGetBucketAccelerateConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAccelerateConfigurationRequestOps {

  implicit class ScalaGetBucketAccelerateConfigurationRequestOps(val self: ScalaGetBucketAccelerateConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetBucketAccelerateConfigurationRequest = {
      val result = JavaGetBucketAccelerateConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
