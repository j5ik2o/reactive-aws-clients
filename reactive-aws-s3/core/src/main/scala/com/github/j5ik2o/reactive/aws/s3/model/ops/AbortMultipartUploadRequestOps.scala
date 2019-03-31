// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ AbortMultipartUploadRequest => ScalaAbortMultipartUploadRequest, _ }
import software.amazon.awssdk.services.s3.model.{ AbortMultipartUploadRequest => JavaAbortMultipartUploadRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AbortMultipartUploadRequestOps {

  implicit class ScalaAbortMultipartUploadRequestOps(val self: ScalaAbortMultipartUploadRequest) extends AnyVal {

    def toJava: JavaAbortMultipartUploadRequest = {
      val result = JavaAbortMultipartUploadRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))     // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))           // String
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
