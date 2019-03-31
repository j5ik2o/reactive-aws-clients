// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetPublicAccessBlockRequest => ScalaGetPublicAccessBlockRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetPublicAccessBlockRequest => JavaGetPublicAccessBlockRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetPublicAccessBlockRequestOps {

  implicit class ScalaGetPublicAccessBlockRequestOps(val self: ScalaGetPublicAccessBlockRequest) extends AnyVal {

    def toJava: JavaGetPublicAccessBlockRequest = {
      val result = JavaGetPublicAccessBlockRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
