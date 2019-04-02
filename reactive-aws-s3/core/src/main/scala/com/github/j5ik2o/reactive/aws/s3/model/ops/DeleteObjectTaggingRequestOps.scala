// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DeleteObjectTaggingRequest => ScalaDeleteObjectTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ DeleteObjectTaggingRequest => JavaDeleteObjectTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteObjectTaggingRequestOps {

  implicit class ScalaDeleteObjectTaggingRequestOps(val self: ScalaDeleteObjectTaggingRequest) extends AnyVal {

    def toJava: JavaDeleteObjectTaggingRequest = {
      val result = JavaDeleteObjectTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String

      result.build()
    }

  }

}