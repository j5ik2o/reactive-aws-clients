// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  DeleteBucketReplicationRequest => ScalaDeleteBucketReplicationRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ DeleteBucketReplicationRequest => JavaDeleteBucketReplicationRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteBucketReplicationRequestOps {

  implicit class ScalaDeleteBucketReplicationRequestOps(val self: ScalaDeleteBucketReplicationRequest) extends AnyVal {

    def toJava: JavaDeleteBucketReplicationRequest = {
      val result = JavaDeleteBucketReplicationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String

      result.build()
    }

  }

}
