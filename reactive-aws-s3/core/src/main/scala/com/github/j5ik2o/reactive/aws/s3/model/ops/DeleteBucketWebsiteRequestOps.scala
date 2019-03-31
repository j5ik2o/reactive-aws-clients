// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketWebsiteRequest => ScalaDeleteBucketWebsiteRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketWebsiteRequest => JavaDeleteBucketWebsiteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketWebsiteRequestOps {

  implicit class ScalaDeleteBucketWebsiteRequestOps(val self: ScalaDeleteBucketWebsiteRequest) extends AnyVal {

    def toJava: JavaDeleteBucketWebsiteRequest = {
      val result = JavaDeleteBucketWebsiteRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
