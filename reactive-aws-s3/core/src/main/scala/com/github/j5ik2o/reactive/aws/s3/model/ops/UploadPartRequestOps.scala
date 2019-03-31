// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ UploadPartRequest => ScalaUploadPartRequest, _ }
import software.amazon.awssdk.services.s3.model.{ UploadPartRequest => JavaUploadPartRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UploadPartRequestOps {

  implicit class ScalaUploadPartRequestOps(val self: ScalaUploadPartRequest) extends AnyVal {

    def toJava: JavaUploadPartRequest = {
      val result = JavaUploadPartRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                             // String
      self.contentLength.map(_.longValue).foreach(v => result.contentLength(v))                 // Long
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v))                     // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                                   // String
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v))                        // Int
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v))                         // String
      self.sseCustomerAlgorithm.filter(_.nonEmpty).foreach(v => result.sseCustomerAlgorithm(v)) // String
      self.sseCustomerKey.filter(_.nonEmpty).foreach(v => result.sseCustomerKey(v))             // String
      self.sseCustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.sseCustomerKeyMD5(v))       // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
