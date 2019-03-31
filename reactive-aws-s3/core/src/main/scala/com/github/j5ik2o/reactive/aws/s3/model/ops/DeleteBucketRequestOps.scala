// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketRequest => ScalaDeleteBucketRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketRequest => JavaDeleteBucketRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketRequestOps {

  implicit class ScalaDeleteBucketRequestOps(val self: ScalaDeleteBucketRequest) extends AnyVal {

    def toJava: JavaDeleteBucketRequest = {
      val result = JavaDeleteBucketRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
