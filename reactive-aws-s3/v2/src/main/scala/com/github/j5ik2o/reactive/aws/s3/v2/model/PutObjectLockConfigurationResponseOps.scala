// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutObjectLockConfigurationResponse => ScalaPutObjectLockConfigurationResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutObjectLockConfigurationResponse => JavaPutObjectLockConfigurationResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectLockConfigurationResponseOps {

  implicit class JavaPutObjectLockConfigurationResponseOps(val self: JavaPutObjectLockConfigurationResponse)
      extends AnyVal {

    def toScala: ScalaPutObjectLockConfigurationResponse = {
      ScalaPutObjectLockConfigurationResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
