// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketMetricsConfigurationRequest => ScalaPutBucketMetricsConfigurationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketMetricsConfigurationRequest => JavaPutBucketMetricsConfigurationRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketMetricsConfigurationRequestOps {

  implicit class ScalaPutBucketMetricsConfigurationRequestOps(val self: ScalaPutBucketMetricsConfigurationRequest)
      extends AnyVal {

    def toJava: JavaPutBucketMetricsConfigurationRequest = {
      val result = JavaPutBucketMetricsConfigurationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.id.filter(_.nonEmpty).foreach(v => result.id(v))         // String
      self.metricsConfiguration.foreach { v =>
        import MetricsConfigurationOps._; result.metricsConfiguration(v.toJava)
      } // MetricsConfiguration

      result.build()
    }

  }

}
