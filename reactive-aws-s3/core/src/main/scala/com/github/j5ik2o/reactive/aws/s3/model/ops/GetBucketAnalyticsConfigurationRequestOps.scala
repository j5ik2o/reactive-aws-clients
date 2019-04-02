// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketAnalyticsConfigurationRequest => ScalaGetBucketAnalyticsConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketAnalyticsConfigurationRequest => JavaGetBucketAnalyticsConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAnalyticsConfigurationRequestOps {

  implicit class ScalaGetBucketAnalyticsConfigurationRequestOps(val self: ScalaGetBucketAnalyticsConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetBucketAnalyticsConfigurationRequest = {
      val result = JavaGetBucketAnalyticsConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String

      result.build()
    }

  }

}