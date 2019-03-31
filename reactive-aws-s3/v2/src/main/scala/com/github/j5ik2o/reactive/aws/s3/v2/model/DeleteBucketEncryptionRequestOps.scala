// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketEncryptionRequest => ScalaDeleteBucketEncryptionRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeleteBucketEncryptionRequest => JavaDeleteBucketEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketEncryptionRequestOps {

  implicit class ScalaDeleteBucketEncryptionRequestOps(val self: ScalaDeleteBucketEncryptionRequest) extends AnyVal {

    def toJava: JavaDeleteBucketEncryptionRequest = {
      val result = JavaDeleteBucketEncryptionRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
