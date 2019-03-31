// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketLifecycleRequest => ScalaDeleteBucketLifecycleRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketLifecycleRequest => JavaDeleteBucketLifecycleRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketLifecycleRequestOps {

  implicit class ScalaDeleteBucketLifecycleRequestOps(val self: ScalaDeleteBucketLifecycleRequest) extends AnyVal {

    def toJava: JavaDeleteBucketLifecycleRequest = {
      val result = JavaDeleteBucketLifecycleRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
