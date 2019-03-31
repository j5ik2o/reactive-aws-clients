// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketVersioningRequest => ScalaGetBucketVersioningRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketVersioningRequest => JavaGetBucketVersioningRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketVersioningRequestOps {

  implicit class ScalaGetBucketVersioningRequestOps(val self: ScalaGetBucketVersioningRequest) extends AnyVal {

    def toJava: JavaGetBucketVersioningRequest = {
      val result = JavaGetBucketVersioningRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
