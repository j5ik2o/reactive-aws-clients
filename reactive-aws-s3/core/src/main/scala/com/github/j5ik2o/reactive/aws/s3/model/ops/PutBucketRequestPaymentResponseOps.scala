// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketRequestPaymentResponse => ScalaPutBucketRequestPaymentResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  PutBucketRequestPaymentResponse => JavaPutBucketRequestPaymentResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketRequestPaymentResponseOps {

  implicit class JavaPutBucketRequestPaymentResponseOps(val self: JavaPutBucketRequestPaymentResponse) extends AnyVal {

    def toScala: ScalaPutBucketRequestPaymentResponse = {
      ScalaPutBucketRequestPaymentResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}
