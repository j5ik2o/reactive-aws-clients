// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  CompleteMultipartUploadRequest => ScalaCompleteMultipartUploadRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{ CompleteMultipartUploadRequest => JavaCompleteMultipartUploadRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CompleteMultipartUploadRequestOps {

  implicit class ScalaCompleteMultipartUploadRequestOps(val self: ScalaCompleteMultipartUploadRequest) extends AnyVal {

    def toJava: JavaCompleteMultipartUploadRequest = {
      val result = JavaCompleteMultipartUploadRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v)) // String
      self.key.filter(_.nonEmpty).foreach(v => result.key(v))       // String
      self.multipartUpload.foreach { v =>
        import CompletedMultipartUploadOps._; result.multipartUpload(v.toJava)
      } // CompletedMultipartUpload
      self.uploadId.filter(_.nonEmpty).foreach(v => result.uploadId(v)) // String
      self.requestPayer.foreach { v =>
        import RequestPayerOps._; result.requestPayer(v.toJava)
      } // String

      result.build()
    }

  }

}
