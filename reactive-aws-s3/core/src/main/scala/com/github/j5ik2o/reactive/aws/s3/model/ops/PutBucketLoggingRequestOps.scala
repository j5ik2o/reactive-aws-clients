// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketLoggingRequest => ScalaPutBucketLoggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketLoggingRequest => JavaPutBucketLoggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketLoggingRequestOps {

  implicit class ScalaPutBucketLoggingRequestOps(val self: ScalaPutBucketLoggingRequest) extends AnyVal {

    def toJava: JavaPutBucketLoggingRequest = {
      val result = JavaPutBucketLoggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.bucketLoggingStatus.foreach { v =>
        import BucketLoggingStatusOps._; result.bucketLoggingStatus(v.toJava)
      } // BucketLoggingStatus
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String

      result.build()
    }

  }

}
