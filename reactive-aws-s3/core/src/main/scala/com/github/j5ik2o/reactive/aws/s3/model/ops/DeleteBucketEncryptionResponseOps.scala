// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketEncryptionResponse => ScalaDeleteBucketEncryptionResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeleteBucketEncryptionResponse => JavaDeleteBucketEncryptionResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketEncryptionResponseOps {

  implicit class JavaDeleteBucketEncryptionResponseOps(val self: JavaDeleteBucketEncryptionResponse) extends AnyVal {

    def toScala: ScalaDeleteBucketEncryptionResponse = {
      ScalaDeleteBucketEncryptionResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
