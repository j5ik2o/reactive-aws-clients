// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ListMultipartUploadsRequest => ScalaListMultipartUploadsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ ListMultipartUploadsRequest => JavaListMultipartUploadsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListMultipartUploadsRequestOps {

  implicit class ScalaListMultipartUploadsRequestOps(val self: ScalaListMultipartUploadsRequest) extends AnyVal {

    def toJava: JavaListMultipartUploadsRequest = {
      val result = JavaListMultipartUploadsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.delimiter.filter(_.nonEmpty).foreach(v => result.delimiter(v)) // String
      self.encodingType.foreach { v =>
        import EncodingTypeOps._; result.encodingType(v.toJava)
      } // String
      self.keyMarker.filter(_.nonEmpty).foreach(v => result.keyMarker(v))           // String
      self.maxUploads.map(_.intValue).foreach(v => result.maxUploads(v))            // Int
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))                 // String
      self.uploadIdMarker.filter(_.nonEmpty).foreach(v => result.uploadIdMarker(v)) // String

      result.build()
    }

  }

}
