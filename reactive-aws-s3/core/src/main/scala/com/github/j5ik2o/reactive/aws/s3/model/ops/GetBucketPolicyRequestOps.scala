// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketPolicyRequest => ScalaGetBucketPolicyRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketPolicyRequest => JavaGetBucketPolicyRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketPolicyRequestOps {

  implicit class ScalaGetBucketPolicyRequestOps(val self: ScalaGetBucketPolicyRequest) extends AnyVal {

    def toJava: JavaGetBucketPolicyRequest = {
      val result = JavaGetBucketPolicyRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
