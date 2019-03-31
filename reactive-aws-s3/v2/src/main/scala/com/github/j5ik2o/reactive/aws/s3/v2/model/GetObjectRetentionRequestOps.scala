// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectRetentionRequest => ScalaGetObjectRetentionRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectRetentionRequest => JavaGetObjectRetentionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectRetentionRequestOps {

  implicit class ScalaGetObjectRetentionRequestOps(val self: ScalaGetObjectRetentionRequest) extends AnyVal {

    def toJava: JavaGetObjectRetentionRequest = {
      val result = JavaGetObjectRetentionRequest.builder()
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
