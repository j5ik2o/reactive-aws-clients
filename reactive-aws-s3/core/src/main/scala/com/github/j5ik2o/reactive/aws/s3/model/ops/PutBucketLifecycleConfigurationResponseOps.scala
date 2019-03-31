// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketLifecycleConfigurationResponse => ScalaPutBucketLifecycleConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketLifecycleConfigurationResponse => JavaPutBucketLifecycleConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketLifecycleConfigurationResponseOps {

  implicit class JavaPutBucketLifecycleConfigurationResponseOps(val self: JavaPutBucketLifecycleConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaPutBucketLifecycleConfigurationResponse = {
      ScalaPutBucketLifecycleConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
