// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ HeadObjectRequest => ScalaHeadObjectRequest, _ }
import software.amazon.awssdk.services.s3.model.{ HeadObjectRequest => JavaHeadObjectRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HeadObjectRequestOps {

  implicit class ScalaHeadObjectRequestOps(val self: ScalaHeadObjectRequest) extends AnyVal {

    def toJava: JavaHeadObjectRequest = {
      val result = JavaHeadObjectRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                             // String
      self.ifMatch.filter(_.nonEmpty).foreach(v => result.ifMatch(v))                           // String
      self.ifModifiedSince.foreach(v => result.ifModifiedSince(v))                              // Instant
      self.ifNoneMatch.filter(_.nonEmpty).foreach(v => result.ifNoneMatch(v))                   // String
      self.ifUnmodifiedSince.foreach(v => result.ifUnmodifiedSince(v))                          // Instant
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                                   // String
      self.range.filter(_.nonEmpty).foreach(v => result.range(v))                               // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))                       // String
      self.sseCustomerAlgorithm.filter(_.nonEmpty).foreach(v => result.sseCustomerAlgorithm(v)) // String
      self.sseCustomerKey.filter(_.nonEmpty).foreach(v => result.sseCustomerKey(v))             // String
      self.sseCustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.sseCustomerKeyMD5(v))       // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v)) // Int

      result.build()
    }

  }

}
