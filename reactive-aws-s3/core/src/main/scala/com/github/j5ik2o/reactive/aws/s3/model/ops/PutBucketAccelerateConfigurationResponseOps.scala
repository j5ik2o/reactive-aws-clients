// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketAccelerateConfigurationResponse => ScalaPutBucketAccelerateConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketAccelerateConfigurationResponse => JavaPutBucketAccelerateConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketAccelerateConfigurationResponseOps {

  implicit class JavaPutBucketAccelerateConfigurationResponseOps(val self: JavaPutBucketAccelerateConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaPutBucketAccelerateConfigurationResponse = {
      ScalaPutBucketAccelerateConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
