// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectRequest => ScalaGetObjectRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectRequest => JavaGetObjectRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectRequestOps {

  implicit class ScalaGetObjectRequestOps(val self: ScalaGetObjectRequest) extends AnyVal {

    def toJava: JavaGetObjectRequest = {
      val result = JavaGetObjectRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                                         // String
      self.ifMatch.filter(_.nonEmpty).foreach(v => result.ifMatch(v))                                       // String
      self.ifModifiedSince.foreach(v => result.ifModifiedSince(v))                                          // Instant
      self.ifNoneMatch.filter(_.nonEmpty).foreach(v => result.ifNoneMatch(v))                               // String
      self.ifUnmodifiedSince.foreach(v => result.ifUnmodifiedSince(v))                                      // Instant
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                                               // String
      self.range.filter(_.nonEmpty).foreach(v => result.range(v))                                           // String
      self.responseCacheControl.filter(_.nonEmpty).foreach(v => result.responseCacheControl(v))             // String
      self.responseContentDisposition.filter(_.nonEmpty).foreach(v => result.responseContentDisposition(v)) // String
      self.responseContentEncoding.filter(_.nonEmpty).foreach(v => result.responseContentEncoding(v))       // String
      self.responseContentLanguage.filter(_.nonEmpty).foreach(v => result.responseContentLanguage(v))       // String
      self.responseContentType.filter(_.nonEmpty).foreach(v => result.responseContentType(v))               // String
      self.responseExpires.foreach(v => result.responseExpires(v))                                          // Instant
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))                                   // String
      self.sseCustomerAlgorithm.filter(_.nonEmpty).foreach(v => result.sseCustomerAlgorithm(v))             // String
      self.sseCustomerKey.filter(_.nonEmpty).foreach(v => result.sseCustomerKey(v))                         // String
      self.sseCustomerKeyMD5.filter(_.nonEmpty).foreach(v => result.sseCustomerKeyMD5(v))                   // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.partNumber.map(_.intValue).foreach(v => result.partNumber(v)) // Int

      result.build()
    }

  }

}
