// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeletePublicAccessBlockRequest => ScalaDeletePublicAccessBlockRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeletePublicAccessBlockRequest => JavaDeletePublicAccessBlockRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeletePublicAccessBlockRequestOps {

  implicit class ScalaDeletePublicAccessBlockRequestOps(val self: ScalaDeletePublicAccessBlockRequest) extends AnyVal {

    def toJava: JavaDeletePublicAccessBlockRequest = {
      val result = JavaDeletePublicAccessBlockRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
