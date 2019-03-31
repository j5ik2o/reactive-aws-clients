// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetObjectLockConfigurationResponse => ScalaGetObjectLockConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetObjectLockConfigurationResponse => JavaGetObjectLockConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectLockConfigurationResponseOps {

  implicit class JavaGetObjectLockConfigurationResponseOps(val self: JavaGetObjectLockConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaGetObjectLockConfigurationResponse = {
      ScalaGetObjectLockConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withObjectLockConfiguration(Option(self.objectLockConfiguration).map { v =>
          import ObjectLockConfigurationOps._; v.toScala
        }) // ObjectLockConfiguration
    }

  }

}
