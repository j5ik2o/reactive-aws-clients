// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  CompleteMultipartUploadResponse => ScalaCompleteMultipartUploadResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  CompleteMultipartUploadResponse => JavaCompleteMultipartUploadResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CompleteMultipartUploadResponseOps {

  implicit class JavaCompleteMultipartUploadResponseOps(val self: JavaCompleteMultipartUploadResponse) extends AnyVal {

    def toScala: ScalaCompleteMultipartUploadResponse = {
      ScalaCompleteMultipartUploadResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withLocation(Option(self.location)) // String
        .withBucket(Option(self.bucket)) // String
        .withKey(Option(self.key)) // String
        .withExpiration(Option(self.expiration)) // String
        .withETag(Option(self.eTag)) // String
        .withServerSideEncryption(Option(self.serverSideEncryption).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withVersionId(Option(self.versionId)) // String
        .withSsekmsKeyId(Option(self.ssekmsKeyId)) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
