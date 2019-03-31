// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetPublicAccessBlockResponse => ScalaGetPublicAccessBlockResponse, _ }
import software.amazon.awssdk.services.s3.model.{ GetPublicAccessBlockResponse => JavaGetPublicAccessBlockResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetPublicAccessBlockResponseOps {

  implicit class JavaGetPublicAccessBlockResponseOps(val self: JavaGetPublicAccessBlockResponse) extends AnyVal {

    def toScala: ScalaGetPublicAccessBlockResponse = {
      ScalaGetPublicAccessBlockResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withPublicAccessBlockConfiguration(Option(self.publicAccessBlockConfiguration).map { v =>
          import PublicAccessBlockConfigurationOps._; v.toScala
        }) // PublicAccessBlockConfiguration
    }

  }

}
