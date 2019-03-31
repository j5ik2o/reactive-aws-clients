// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectsRequest => ScalaDeleteObjectsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectsRequest => JavaDeleteObjectsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectsRequestOps {

  implicit class ScalaDeleteObjectsRequestOps(val self: ScalaDeleteObjectsRequest) extends AnyVal {

    def toJava: JavaDeleteObjectsRequest = {
      val result = JavaDeleteObjectsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.delete.foreach { v =>
        import DeleteOps._; result.delete(v.toJava)
      } // Delete
      self.mfa.filter(_.nonEmpty).foreach(v => result.mfa(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String
      self.bypassGovernanceRetention.map(_.booleanValue).foreach(v => result.bypassGovernanceRetention(v)) // Boolean

      result.build()
    }

  }

}
