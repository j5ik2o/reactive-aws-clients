// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketAnalyticsConfigurationResponse => ScalaGetBucketAnalyticsConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketAnalyticsConfigurationResponse => JavaGetBucketAnalyticsConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAnalyticsConfigurationResponseOps {

  implicit class JavaGetBucketAnalyticsConfigurationResponseOps(val self: JavaGetBucketAnalyticsConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetBucketAnalyticsConfigurationResponse = {
      ScalaGetBucketAnalyticsConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAnalyticsConfiguration(Option(self.analyticsConfiguration).map { v =>
          import AnalyticsConfigurationOps._; v.toScala
        }) // AnalyticsConfiguration
    }

  }

}
