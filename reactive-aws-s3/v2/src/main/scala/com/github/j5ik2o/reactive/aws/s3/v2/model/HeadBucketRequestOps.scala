// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ HeadBucketRequest => ScalaHeadBucketRequest, _ }
import software.amazon.awssdk.services.s3.model.{ HeadBucketRequest => JavaHeadBucketRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object HeadBucketRequestOps {

  implicit class ScalaHeadBucketRequestOps(val self: ScalaHeadBucketRequest) extends AnyVal {

    def toJava: JavaHeadBucketRequest = {
      val result = JavaHeadBucketRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
