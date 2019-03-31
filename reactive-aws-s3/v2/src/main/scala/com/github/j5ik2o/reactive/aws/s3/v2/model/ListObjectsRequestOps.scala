// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectsRequest => ScalaListObjectsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectsRequest => JavaListObjectsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectsRequestOps {

  implicit class ScalaListObjectsRequestOps(val self: ScalaListObjectsRequest) extends AnyVal {

    def toJava: JavaListObjectsRequest = {
      val result = JavaListObjectsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.delimiter.filter(_.nonEmpty).foreach(v => result.delimiter(v)) // String
      self.encodingType.foreach { v =>
        import EncodingTypeOps._; result.encodingType(v.toJava)
      } // String
      self.marker.filter(_.nonEmpty).foreach(v => result.marker(v)) // String
      self.maxKeys.map(_.intValue).foreach(v => result.maxKeys(v))  // Int
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
