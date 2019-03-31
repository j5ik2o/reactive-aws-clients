// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketLoggingRequest => ScalaGetBucketLoggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketLoggingRequest => JavaGetBucketLoggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLoggingRequestOps {

  implicit class ScalaGetBucketLoggingRequestOps(val self: ScalaGetBucketLoggingRequest) extends AnyVal {

    def toJava: JavaGetBucketLoggingRequest = {
      val result = JavaGetBucketLoggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
