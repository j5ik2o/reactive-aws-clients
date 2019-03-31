// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GetObjectTorrentRequest => ScalaGetObjectTorrentRequest, _ }
import software.amazon.awssdk.services.s3.model.{ GetObjectTorrentRequest => JavaGetObjectTorrentRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetObjectTorrentRequestOps {

  implicit class ScalaGetObjectTorrentRequestOps(val self: ScalaGetObjectTorrentRequest) extends AnyVal {

    def toJava: JavaGetObjectTorrentRequest = {
      val result = JavaGetObjectTorrentRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))       // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
