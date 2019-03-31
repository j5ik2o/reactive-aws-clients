// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectVersionsRequest => ScalaListObjectVersionsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectVersionsRequest => JavaListObjectVersionsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectVersionsRequestOps {

  implicit class ScalaListObjectVersionsRequestOps(val self: ScalaListObjectVersionsRequest) extends AnyVal {

    def toJava: JavaListObjectVersionsRequest = {
      val result = JavaListObjectVersionsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.delimiter.filter(_.nonEmpty).foreach(v => result.delimiter(v)) // String
      self.encodingType.foreach { v =>
        import EncodingTypeOps._; result.encodingType(v.toJava)
      } // String
      self.keyMarker.filter(_.nonEmpty).foreach(v => result.keyMarker(v))             // String
      self.maxKeys.map(_.intValue).foreach(v => result.maxKeys(v))                    // Int
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))                   // String
      self.versionIdMarker.filter(_.nonEmpty).foreach(v => result.versionIdMarker(v)) // String

      result.build()
    }

  }

}
