// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectAclRequest => ScalaGetObjectAclRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectAclRequest => JavaGetObjectAclRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectAclRequestOps {

  implicit class ScalaGetObjectAclRequestOps(val self: ScalaGetObjectAclRequest) extends AnyVal {

    def toJava: JavaGetObjectAclRequest = {
      val result = JavaGetObjectAclRequest.builder()
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
