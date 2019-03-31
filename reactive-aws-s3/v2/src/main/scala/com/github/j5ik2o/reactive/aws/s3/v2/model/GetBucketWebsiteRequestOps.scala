// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketWebsiteRequest => ScalaGetBucketWebsiteRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketWebsiteRequest => JavaGetBucketWebsiteRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketWebsiteRequestOps {

  implicit class ScalaGetBucketWebsiteRequestOps(val self: ScalaGetBucketWebsiteRequest) extends AnyVal {

    def toJava: JavaGetBucketWebsiteRequest = {
      val result = JavaGetBucketWebsiteRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
