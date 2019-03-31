// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketLocationRequest => ScalaGetBucketLocationRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketLocationRequest => JavaGetBucketLocationRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketLocationRequestOps {

  implicit class ScalaGetBucketLocationRequestOps(val self: ScalaGetBucketLocationRequest) extends AnyVal {

    def toJava: JavaGetBucketLocationRequest = {
      val result = JavaGetBucketLocationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
