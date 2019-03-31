// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketTaggingRequest => ScalaGetBucketTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketTaggingRequest => JavaGetBucketTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketTaggingRequestOps {

  implicit class ScalaGetBucketTaggingRequestOps(val self: ScalaGetBucketTaggingRequest) extends AnyVal {

    def toJava: JavaGetBucketTaggingRequest = {
      val result = JavaGetBucketTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
