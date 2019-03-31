// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutObjectTaggingRequest => ScalaPutObjectTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutObjectTaggingRequest => JavaPutObjectTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutObjectTaggingRequestOps {

  implicit class ScalaPutObjectTaggingRequestOps(val self: ScalaPutObjectTaggingRequest) extends AnyVal {

    def toJava: JavaPutObjectTaggingRequest = {
      val result = JavaPutObjectTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))               // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v))   // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.tagging.foreach { v =>
        import TaggingOps._; result.tagging(v.toJava)
      } // Tagging

      result.build()
    }

  }

}
