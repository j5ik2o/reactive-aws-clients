// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketInventoryConfigurationResponse => ScalaDeleteBucketInventoryConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  DeleteBucketInventoryConfigurationResponse => JavaDeleteBucketInventoryConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketInventoryConfigurationResponseOps {

  implicit class JavaDeleteBucketInventoryConfigurationResponseOps(
      val self: JavaDeleteBucketInventoryConfigurationResponse
  ) extends AnyVal {

    def toScala: ScalaDeleteBucketInventoryConfigurationResponse = {
      ScalaDeleteBucketInventoryConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
