// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteBucketPolicyRequest => ScalaDeleteBucketPolicyRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteBucketPolicyRequest => JavaDeleteBucketPolicyRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketPolicyRequestOps {

  implicit class ScalaDeleteBucketPolicyRequestOps(val self: ScalaDeleteBucketPolicyRequest) extends AnyVal {

    def toJava: JavaDeleteBucketPolicyRequest = {
      val result = JavaDeleteBucketPolicyRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
