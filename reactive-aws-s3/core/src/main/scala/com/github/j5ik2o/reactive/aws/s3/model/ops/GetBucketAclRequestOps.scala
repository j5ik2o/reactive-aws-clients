// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketAclRequest => ScalaGetBucketAclRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketAclRequest => JavaGetBucketAclRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketAclRequestOps {

  implicit class ScalaGetBucketAclRequestOps(val self: ScalaGetBucketAclRequest) extends AnyVal {

    def toJava: JavaGetBucketAclRequest = {
      val result = JavaGetBucketAclRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
