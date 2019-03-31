// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketAnalyticsConfigurationRequest => ScalaDeleteBucketAnalyticsConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  DeleteBucketAnalyticsConfigurationRequest => JavaDeleteBucketAnalyticsConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketAnalyticsConfigurationRequestOps {

  implicit class ScalaDeleteBucketAnalyticsConfigurationRequestOps(
      val self: ScalaDeleteBucketAnalyticsConfigurationRequest
  ) extends AnyVal {

    def toJava: JavaDeleteBucketAnalyticsConfigurationRequest = {
      val result = JavaDeleteBucketAnalyticsConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String

      result.build()
    }

  }

}
