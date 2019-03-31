// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectsV2Request => ScalaListObjectsV2Request, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectsV2Request => JavaListObjectsV2Request }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectsV2RequestOps {

  implicit class ScalaListObjectsV2RequestOps(val self: ScalaListObjectsV2Request) extends AnyVal {

    def toJava: JavaListObjectsV2Request = {
      val result = JavaListObjectsV2Request.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))       // String
      self.delimiter.filter(_.nonEmpty).foreach(v => result.delimiter(v)) // String
      self.encodingType.foreach { v =>
        import EncodingTypeOps._; result.encodingType(v.toJava)
      } // String
      self.maxKeys.map(_.intValue).foreach(v => result.maxKeys(v))                        // Int
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v))                       // String
      self.continuationToken.filter(_.nonEmpty).foreach(v => result.continuationToken(v)) // String
      self.fetchOwner.map(_.booleanValue).foreach(v => result.fetchOwner(v))              // Boolean
      self.startAfter.filter(_.nonEmpty).foreach(v => result.startAfter(v))               // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
