// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketMetricsConfigurationResponse => ScalaDeleteBucketMetricsConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  DeleteBucketMetricsConfigurationResponse => JavaDeleteBucketMetricsConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketMetricsConfigurationResponseOps {

  implicit class JavaDeleteBucketMetricsConfigurationResponseOps(val self: JavaDeleteBucketMetricsConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaDeleteBucketMetricsConfigurationResponse = {
      ScalaDeleteBucketMetricsConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
