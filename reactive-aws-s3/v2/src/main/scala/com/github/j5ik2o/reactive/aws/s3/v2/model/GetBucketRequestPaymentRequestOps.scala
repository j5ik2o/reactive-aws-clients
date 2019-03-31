// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  GetBucketRequestPaymentRequest => ScalaGetBucketRequestPaymentRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ GetBucketRequestPaymentRequest => JavaGetBucketRequestPaymentRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketRequestPaymentRequestOps {

  implicit class ScalaGetBucketRequestPaymentRequestOps(val self: ScalaGetBucketRequestPaymentRequest) extends AnyVal {

    def toJava: JavaGetBucketRequestPaymentRequest = {
      val result = JavaGetBucketRequestPaymentRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
