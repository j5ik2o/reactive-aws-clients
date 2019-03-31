// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ CopyObjectResponse => ScalaCopyObjectResponse, _ }
import software.amazon.awssdk.services.s3.model.{ CopyObjectResponse => JavaCopyObjectResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CopyObjectResponseOps {

  implicit class JavaCopyObjectResponseOps(val self: JavaCopyObjectResponse) extends AnyVal {

    def toScala: ScalaCopyObjectResponse = {
      ScalaCopyObjectResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withCopyObjectResult(Option(self.copyObjectResult).map { v =>
          import CopyObjectResultOps._; v.toScala
        }) // CopyObjectResult
        .withExpiration(Option(self.expiration)) // String
        .withCopySourceVersionId(Option(self.copySourceVersionId)) // String
        .withVersionId(Option(self.versionId)) // String
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
