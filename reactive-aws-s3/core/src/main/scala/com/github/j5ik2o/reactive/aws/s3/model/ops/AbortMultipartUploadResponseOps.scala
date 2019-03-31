// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AbortMultipartUploadResponse => ScalaAbortMultipartUploadResponse, _ }
import software.amazon.awssdk.services.s3.model.{ AbortMultipartUploadResponse => JavaAbortMultipartUploadResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AbortMultipartUploadResponseOps {

  implicit class JavaAbortMultipartUploadResponseOps(val self: JavaAbortMultipartUploadResponse) extends AnyVal {

    def toScala: ScalaAbortMultipartUploadResponse = {
      ScalaAbortMultipartUploadResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
