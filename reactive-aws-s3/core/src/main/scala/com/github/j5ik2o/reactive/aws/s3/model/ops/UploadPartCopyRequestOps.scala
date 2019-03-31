// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ UploadPartCopyRequest => ScalaUploadPartCopyRequest, _ }
import software.amazon.awssdk.services.s3.model.{ UploadPartCopyRequest => JavaUploadPartCopyRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UploadPartCopyRequestOps {

  implicit class ScalaUploadPartCopyRequestOps(val self: ScalaUploadPartCopyRequest) extends AnyVal {

    def toJava: JavaUploadPartCopyRequest = {
      val result = JavaUploadPartCopyRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                               // String
      self.copySource.filter(_.nonEmpty).foreach(v => result.copySource(v))                       // String
      self.copySourceIfMatch.filter(_.nonEmpty).foreach(v => result.copySourceIfMatch(v))         // String
      self.copySourceIfModifiedSince.foreach(v => result.copySourceIfModifiedSince(v))            // Instant
      self.copySourceIfNoneMatch.filter(_.nonEmpty).foreach(v => result.copySourceIfNoneMatch(v)) // String
      self.copySourceIfUnmodifiedSince.foreach(v => result.copySourceIfUnmodifiedSince(v))        // Instant
      self.copySourceRange.filter(_.nonEmpty).foreach(v => result.copySourceRange(v))             // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                                     // String
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v))                          // Int
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v))                           // String
      self.sseCustomerAlgorithm.filter(_.nonEmpty).foreach(v => result.sseCustomerAlgorithm(v))   // String
      self.sseCustomerKey.filter(_.nonEmpty).foreach(v => result.sseCustomerKey(v))               // String
      self.sseCustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.sseCustomerKeyMD5(v))         // String
      self.copySourceSSECustomerAlgorithm
        .filter(_.nonEmpty).foreach(v => result.copySourceSSECustomerAlgorithm(v))                            // String
      self.copySourceSSECustomerKey.filter(_.nonEmpty).foreach(v => result.copySourceSSECustomerKey(v))       // String
      self.copySourceSSECustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.copySourceSSECustomerKeyMD5(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
