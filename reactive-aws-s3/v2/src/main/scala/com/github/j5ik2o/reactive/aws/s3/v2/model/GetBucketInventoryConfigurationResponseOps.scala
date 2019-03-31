// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketInventoryConfigurationResponse => ScalaGetBucketInventoryConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketInventoryConfigurationResponse => JavaGetBucketInventoryConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketInventoryConfigurationResponseOps {

  implicit class JavaGetBucketInventoryConfigurationResponseOps(val self: JavaGetBucketInventoryConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetBucketInventoryConfigurationResponse = {
      ScalaGetBucketInventoryConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withInventoryConfiguration(Option(self.inventoryConfiguration).map { v =>
          import InventoryConfigurationOps._; v.toScala
        }) // InventoryConfiguration
    }

  }

}
