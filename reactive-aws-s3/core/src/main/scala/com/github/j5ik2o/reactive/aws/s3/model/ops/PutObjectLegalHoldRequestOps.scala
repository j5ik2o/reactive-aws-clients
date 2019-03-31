// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectLegalHoldRequest => ScalaPutObjectLegalHoldRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectLegalHoldRequest => JavaPutObjectLegalHoldRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectLegalHoldRequestOps {

  implicit class ScalaPutObjectLegalHoldRequestOps(val self: ScalaPutObjectLegalHoldRequest) extends AnyVal {

    def toJava: JavaPutObjectLegalHoldRequest = {
      val result = JavaPutObjectLegalHoldRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))       // String
      self.legalHold.foreach { v =>
        import ObjectLockLegalHoldOps._; result.legalHold(v.toJava)
      } // ObjectLockLegalHold
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))   // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String

      result.build()
    }

  }

}
