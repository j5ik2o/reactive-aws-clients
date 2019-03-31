// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ UploadPartCopyResponse => ScalaUploadPartCopyResponse, _ }
import software.amazon.awssdk.services.s3.model.{ UploadPartCopyResponse => JavaUploadPartCopyResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UploadPartCopyResponseOps {

  implicit class JavaUploadPartCopyResponseOps(val self: JavaUploadPartCopyResponse) extends AnyVal {

    def toScala: ScalaUploadPartCopyResponse = {
      ScalaUploadPartCopyResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withCopySourceVersionId(Option(self.copySourceVersionId)) // String
        .withCopyPartResult(Option(self.copyPartResult).map { v =>
          import CopyPartResultOps._; v.toScala
        }) // CopyPartResult
        .withServerSideEncryption(Option(self.serverSideEncryption).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withSseCustomerAlgorithm(Option(self.sseCustomerAlgorithm)) // String
        .withSseCustomerKeyMD5(Option(self.sseCustomerKeyMD5)) // String
        .withSsekmsKeyId(Option(self.ssekmsKeyId)) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
