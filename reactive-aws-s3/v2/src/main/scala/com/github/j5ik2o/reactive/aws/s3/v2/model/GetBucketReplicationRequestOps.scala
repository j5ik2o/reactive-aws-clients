// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ GetBucketReplicationRequest => ScalaGetBucketReplicationRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetBucketReplicationRequest => JavaGetBucketReplicationRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetBucketReplicationRequestOps {

  implicit class ScalaGetBucketReplicationRequestOps(val self: ScalaGetBucketReplicationRequest) extends AnyVal {

    def toJava: JavaGetBucketReplicationRequest = {
      val result = JavaGetBucketReplicationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
