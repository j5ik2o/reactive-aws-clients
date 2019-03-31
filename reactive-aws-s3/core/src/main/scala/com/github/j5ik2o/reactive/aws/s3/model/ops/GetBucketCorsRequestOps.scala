// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketCorsRequest => ScalaGetBucketCorsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketCorsRequest => JavaGetBucketCorsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketCorsRequestOps {

  implicit class ScalaGetBucketCorsRequestOps(val self: ScalaGetBucketCorsRequest) extends AnyVal {

    def toJava: JavaGetBucketCorsRequest = {
      val result = JavaGetBucketCorsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
