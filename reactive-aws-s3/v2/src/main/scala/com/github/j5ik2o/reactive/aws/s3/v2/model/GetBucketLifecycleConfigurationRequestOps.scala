// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketLifecycleConfigurationRequest => ScalaGetBucketLifecycleConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketLifecycleConfigurationRequest => JavaGetBucketLifecycleConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLifecycleConfigurationRequestOps {

  implicit class ScalaGetBucketLifecycleConfigurationRequestOps(val self: ScalaGetBucketLifecycleConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetBucketLifecycleConfigurationRequest = {
      val result = JavaGetBucketLifecycleConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
