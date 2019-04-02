// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketNotificationConfigurationResponse => ScalaPutBucketNotificationConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketNotificationConfigurationResponse => JavaPutBucketNotificationConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketNotificationConfigurationResponseOps {

  implicit class JavaPutBucketNotificationConfigurationResponseOps(
      val self: JavaPutBucketNotificationConfigurationResponse
  ) extends AnyVal {

    def toScala: ScalaPutBucketNotificationConfigurationResponse = {
      ScalaPutBucketNotificationConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}