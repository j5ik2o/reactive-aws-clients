// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ ListPartsRequest => ScalaListPartsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ ListPartsRequest => JavaListPartsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListPartsRequestOps {

  implicit class ScalaListPartsRequestOps(val self: ScalaListPartsRequest) extends AnyVal {

    def toJava: JavaListPartsRequest = {
      val result = JavaListPartsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                  // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))                        // String
      self.maxParts.map(_.intValue).foreach(v => result.maxParts(v))                 // Int
      self.partNumberMarker.map(_.intValue).foreach(v => result.partNumberMarker(v)) // Int
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v))              // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
