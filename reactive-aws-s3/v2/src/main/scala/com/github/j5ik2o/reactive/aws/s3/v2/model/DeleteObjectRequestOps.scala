// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectRequest => ScalaDeleteObjectRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectRequest => JavaDeleteObjectRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectRequestOps {

  implicit class ScalaDeleteObjectRequestOps(val self: ScalaDeleteObjectRequest) extends AnyVal {

    def toJava: JavaDeleteObjectRequest = {
      val result = JavaDeleteObjectRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.mfa.filter(_.nonEmpty).foreach(v => result.mfa(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.bypassGovernanceRetention.map(_.booleanValue).foreach(v => result.bypassGovernanceRetention(v)) // Boolean

      result.build()
    }

  }

}
