// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketReplicationRequest => ScalaPutBucketReplicationRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketReplicationRequest => JavaPutBucketReplicationRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketReplicationRequestOps {

  implicit class ScalaPutBucketReplicationRequestOps(val self: ScalaPutBucketReplicationRequest) extends AnyVal {

    def toJava: JavaPutBucketReplicationRequest = {
      val result = JavaPutBucketReplicationRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.replicationConfiguration.foreach { v =>
        import ReplicationConfigurationOps._; result.replicationConfiguration(v.toJava)
      } // ReplicationConfiguration

      result.build()
    }

  }

}
