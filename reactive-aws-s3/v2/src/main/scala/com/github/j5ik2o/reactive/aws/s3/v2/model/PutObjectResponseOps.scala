// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectResponse => ScalaPutObjectResponse, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectResponse => JavaPutObjectResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectResponseOps {

  implicit class JavaPutObjectResponseOps(val self: JavaPutObjectResponse) extends AnyVal {

    def toScala: ScalaPutObjectResponse = {
      ScalaPutObjectResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withExpiration(Option(self.expiration)) // String
        .withETag(Option(self.eTag)) // String
        .withServerSideEncryption(Option(self.serverSideEncryption).map { v =>
          import ServerSideEncryptionOps._; v.toScala
        }) // String
        .withVersionId(Option(self.versionId)) // String
        .withSseCustomerAlgorithm(Option(self.sseCustomerAlgorithm)) // String
        .withSseCustomerKeyMD5(Option(self.sseCustomerKeyMD5)) // String
        .withSsekmsKeyId(Option(self.ssekmsKeyId)) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
