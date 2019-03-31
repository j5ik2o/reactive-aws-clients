// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectLegalHoldRequest => ScalaGetObjectLegalHoldRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectLegalHoldRequest => JavaGetObjectLegalHoldRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectLegalHoldRequestOps {

  implicit class ScalaGetObjectLegalHoldRequestOps(val self: ScalaGetObjectLegalHoldRequest) extends AnyVal {

    def toJava: JavaGetObjectLegalHoldRequest = {
      val result = JavaGetObjectLegalHoldRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
