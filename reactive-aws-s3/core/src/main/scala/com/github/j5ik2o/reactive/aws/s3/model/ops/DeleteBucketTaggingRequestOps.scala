// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketTaggingRequest => ScalaDeleteBucketTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketTaggingRequest => JavaDeleteBucketTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketTaggingRequestOps {

  implicit class ScalaDeleteBucketTaggingRequestOps(val self: ScalaDeleteBucketTaggingRequest) extends AnyVal {

    def toJava: JavaDeleteBucketTaggingRequest = {
      val result = JavaDeleteBucketTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
