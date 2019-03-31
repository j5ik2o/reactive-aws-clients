// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ RestoreObjectRequest => ScalaRestoreObjectRequest, _ }
import software.amazon.awssdk.services.s3.model.{ RestoreObjectRequest => JavaRestoreObjectRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreObjectRequestOps {

  implicit class ScalaRestoreObjectRequestOps(val self: ScalaRestoreObjectRequest) extends AnyVal {

    def toJava: JavaRestoreObjectRequest = {
      val result = JavaRestoreObjectRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String
      self.restoreRequest.foreach { v =>
        import RestoreRequestOps._; result.restoreRequest(v.toJava)
      } // RestoreRequest
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
