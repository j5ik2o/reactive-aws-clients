// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketMetricsConfigurationRequest => ScalaGetBucketMetricsConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketMetricsConfigurationRequest => JavaGetBucketMetricsConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketMetricsConfigurationRequestOps {

  implicit class ScalaGetBucketMetricsConfigurationRequestOps(val self: ScalaGetBucketMetricsConfigurationRequest)
      extends AnyVal {

    def toJava: JavaGetBucketMetricsConfigurationRequest = {
      val result = JavaGetBucketMetricsConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String

      result.build()
    }

  }

}
