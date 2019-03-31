// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutBucketTaggingRequest => ScalaPutBucketTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutBucketTaggingRequest => JavaPutBucketTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutBucketTaggingRequestOps {

  implicit class ScalaPutBucketTaggingRequestOps(val self: ScalaPutBucketTaggingRequest) extends AnyVal {

    def toJava: JavaPutBucketTaggingRequest = {
      val result = JavaPutBucketTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.tagging.foreach { v =>
        import TaggingOps._; result.tagging(v.toJava)
      } // Tagging

      result.build()
    }

  }

}
