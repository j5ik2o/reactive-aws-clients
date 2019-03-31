// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketMetricsConfigurationResponse => ScalaGetBucketMetricsConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketMetricsConfigurationResponse => JavaGetBucketMetricsConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketMetricsConfigurationResponseOps {

  implicit class JavaGetBucketMetricsConfigurationResponseOps(val self: JavaGetBucketMetricsConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetBucketMetricsConfigurationResponse = {
      ScalaGetBucketMetricsConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withMetricsConfiguration(Option(self.metricsConfiguration).map { v =>
          import MetricsConfigurationOps._; v.toScala
        }) // MetricsConfiguration
    }

  }

}
