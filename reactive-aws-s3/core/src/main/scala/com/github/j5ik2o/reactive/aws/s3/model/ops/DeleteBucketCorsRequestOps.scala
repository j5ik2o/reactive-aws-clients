// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketCorsRequest => ScalaDeleteBucketCorsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketCorsRequest => JavaDeleteBucketCorsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketCorsRequestOps {

  implicit class ScalaDeleteBucketCorsRequestOps(val self: ScalaDeleteBucketCorsRequest) extends AnyVal {

    def toJava: JavaDeleteBucketCorsRequest = {
      val result = JavaDeleteBucketCorsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
