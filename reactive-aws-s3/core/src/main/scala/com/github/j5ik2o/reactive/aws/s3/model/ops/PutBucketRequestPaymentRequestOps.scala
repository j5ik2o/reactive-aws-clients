// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  PutBucketRequestPaymentRequest => ScalaPutBucketRequestPaymentRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ PutBucketRequestPaymentRequest => JavaPutBucketRequestPaymentRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketRequestPaymentRequestOps {

  implicit class ScalaPutBucketRequestPaymentRequestOps(val self: ScalaPutBucketRequestPaymentRequest) extends AnyVal {

    def toJava: JavaPutBucketRequestPaymentRequest = {
      val result = JavaPutBucketRequestPaymentRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.requestPaymentConfiguration.foreach { v =>
        import RequestPaymentConfigurationOps._; result.requestPaymentConfiguration(v.toJava)
      } // RequestPaymentConfiguration

      result.build()
    }

  }

}
