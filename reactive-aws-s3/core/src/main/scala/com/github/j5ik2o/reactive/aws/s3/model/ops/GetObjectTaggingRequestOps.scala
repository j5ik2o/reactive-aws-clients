// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectTaggingRequest => ScalaGetObjectTaggingRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectTaggingRequest => JavaGetObjectTaggingRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectTaggingRequestOps {

  implicit class ScalaGetObjectTaggingRequestOps(val self: ScalaGetObjectTaggingRequest) extends AnyVal {

    def toJava: JavaGetObjectTaggingRequest = {
      val result = JavaGetObjectTaggingRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))             // String
      self.versionId.filter(_.nonEmpty).foreach(v => result.versionId(v)) // String

      result.build()
    }

  }

}
