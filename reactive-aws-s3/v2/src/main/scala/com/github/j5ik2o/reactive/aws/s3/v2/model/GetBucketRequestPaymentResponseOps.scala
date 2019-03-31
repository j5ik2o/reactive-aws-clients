// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketRequestPaymentResponse => ScalaGetBucketRequestPaymentResponse,
  _
}
import software.amazon.awssdk.services.s3.model.{
  GetBucketRequestPaymentResponse => JavaGetBucketRequestPaymentResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketRequestPaymentResponseOps {

  implicit class JavaGetBucketRequestPaymentResponseOps(val self: JavaGetBucketRequestPaymentResponse) extends AnyVal {

    def toScala: ScalaGetBucketRequestPaymentResponse = {
      ScalaGetBucketRequestPaymentResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withPayer(Option(self.payer).map { v =>
          import PayerOps._; v.toScala
        }) // String
    }

  }

}
