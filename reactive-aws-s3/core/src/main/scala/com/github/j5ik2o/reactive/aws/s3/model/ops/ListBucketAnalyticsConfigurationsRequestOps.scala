// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketAnalyticsConfigurationsRequest => ScalaListBucketAnalyticsConfigurationsRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketAnalyticsConfigurationsRequest => JavaListBucketAnalyticsConfigurationsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketAnalyticsConfigurationsRequestOps {

  implicit class ScalaListBucketAnalyticsConfigurationsRequestOps(
      val self: ScalaListBucketAnalyticsConfigurationsRequest
  ) extends AnyVal {

    def toJava: JavaListBucketAnalyticsConfigurationsRequest = {
      val result = JavaListBucketAnalyticsConfigurationsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                       // String
      self.continuationToken.filter(_.nonEmpty).foreach(v => result.continuationToken(v)) // String

      result.build()
    }

  }

}
