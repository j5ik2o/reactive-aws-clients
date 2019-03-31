// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketPolicyRequest => ScalaPutBucketPolicyRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketPolicyRequest => JavaPutBucketPolicyRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketPolicyRequestOps {

  implicit class ScalaPutBucketPolicyRequestOps(val self: ScalaPutBucketPolicyRequest) extends AnyVal {

    def toJava: JavaPutBucketPolicyRequest = {
      val result = JavaPutBucketPolicyRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.confirmRemoveSelfBucketAccess
        .map(_.booleanValue).foreach(v => result.confirmRemoveSelfBucketAccess(v)) // Boolean
      self.policy.filter(_.nonEmpty).foreach(v => result.policy(v))                // String

      result.build()
    }

  }

}
