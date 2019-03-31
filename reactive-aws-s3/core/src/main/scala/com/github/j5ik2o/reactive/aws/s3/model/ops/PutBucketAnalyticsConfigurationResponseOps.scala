// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketAnalyticsConfigurationResponse => ScalaPutBucketAnalyticsConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketAnalyticsConfigurationResponse => JavaPutBucketAnalyticsConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketAnalyticsConfigurationResponseOps {

  implicit class JavaPutBucketAnalyticsConfigurationResponseOps(val self: JavaPutBucketAnalyticsConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaPutBucketAnalyticsConfigurationResponse = {
      ScalaPutBucketAnalyticsConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
