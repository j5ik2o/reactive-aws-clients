// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketEncryptionRequest => ScalaGetBucketEncryptionRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketEncryptionRequest => JavaGetBucketEncryptionRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketEncryptionRequestOps {

  implicit class ScalaGetBucketEncryptionRequestOps(val self: ScalaGetBucketEncryptionRequest) extends AnyVal {

    def toJava: JavaGetBucketEncryptionRequest = {
      val result = JavaGetBucketEncryptionRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
