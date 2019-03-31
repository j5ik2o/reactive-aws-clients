// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  CreateMultipartUploadResponse => ScalaCreateMultipartUploadResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{ CreateMultipartUploadResponse => JavaCreateMultipartUploadResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateMultipartUploadResponseOps {

  implicit class JavaCreateMultipartUploadResponseOps(val self: JavaCreateMultipartUploadResponse) extends AnyVal {

    def toScala: ScalaCreateMultipartUploadResponse = {
      ScalaCreateMultipartUploadResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAbortDate(Option(self.abortDate)) // Instant
        .withAbortRuleId(Option(self.abortRuleId)) // String
        .withBucket(Option(self.bucket)) // String
        .withKey(Option(self.key)) // String
        .withUploadId(Option(self.uploadId)) // String
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
