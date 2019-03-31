// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketAccelerateConfigurationResponse => ScalaGetBucketAccelerateConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketAccelerateConfigurationResponse => JavaGetBucketAccelerateConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAccelerateConfigurationResponseOps {

  implicit class JavaGetBucketAccelerateConfigurationResponseOps(val self: JavaGetBucketAccelerateConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetBucketAccelerateConfigurationResponse = {
      ScalaGetBucketAccelerateConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStatus(Option(self.status).map { v =>
          import BucketAccelerateStatusOps._; v.toScala
        }) // String
    }

  }

}
