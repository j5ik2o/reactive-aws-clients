// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketPolicyStatusRequest => ScalaGetBucketPolicyStatusRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketPolicyStatusRequest => JavaGetBucketPolicyStatusRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketPolicyStatusRequestOps {

  implicit class ScalaGetBucketPolicyStatusRequestOps(val self: ScalaGetBucketPolicyStatusRequest) extends AnyVal {

    def toJava: JavaGetBucketPolicyStatusRequest = {
      val result = JavaGetBucketPolicyStatusRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
