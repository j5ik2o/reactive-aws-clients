// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketAnalyticsConfigurationRequest => ScalaPutBucketAnalyticsConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketAnalyticsConfigurationRequest => JavaPutBucketAnalyticsConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketAnalyticsConfigurationRequestOps {

  implicit class ScalaPutBucketAnalyticsConfigurationRequestOps(val self: ScalaPutBucketAnalyticsConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutBucketAnalyticsConfigurationRequest = {
      val result = JavaPutBucketAnalyticsConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String
      self.analyticsConfiguration.foreach { v =>
        import AnalyticsConfigurationOps._; result.analyticsConfiguration(v.toJava)
      } // AnalyticsConfiguration

      result.build()
    }

  }

}
