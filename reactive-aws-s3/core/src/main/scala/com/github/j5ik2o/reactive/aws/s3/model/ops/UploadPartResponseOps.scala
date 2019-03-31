// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ UploadPartResponse => ScalaUploadPartResponse, _ }
import software.amazon.awssdk.services.s3.model.{ UploadPartResponse => JavaUploadPartResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UploadPartResponseOps {

  implicit class JavaUploadPartResponseOps(val self: JavaUploadPartResponse) extends AnyVal {

    def toScala: ScalaUploadPartResponse = {
      ScalaUploadPartResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withServerSideEncryption(Option(self.serverSideEncryption).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withETag(Option(self.eTag)) // String
        .withSseCustomerAlgorithm(Option(self.sseCustomerAlgorithm)) // String
        .withSseCustomerKeyMD5(Option(self.sseCustomerKeyMD5)) // String
        .withSsekmsKeyId(Option(self.ssekmsKeyId)) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
