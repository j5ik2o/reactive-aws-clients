// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketMetricsConfigurationsRequest => ScalaListBucketMetricsConfigurationsRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketMetricsConfigurationsRequest => JavaListBucketMetricsConfigurationsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketMetricsConfigurationsRequestOps {

  implicit class ScalaListBucketMetricsConfigurationsRequestOps(val self: ScalaListBucketMetricsConfigurationsRequest)
      extends AnyVal {

    def toJava: JavaListBucketMetricsConfigurationsRequest = {
      val result = JavaListBucketMetricsConfigurationsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                       // String
      self.continuationToken.filter(_.nonEmpty).foreach(v => result.continuationToken(v)) // String

      result.build()
    }

  }

}
