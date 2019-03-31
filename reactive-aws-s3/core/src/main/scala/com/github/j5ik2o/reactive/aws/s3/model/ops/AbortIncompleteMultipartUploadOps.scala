// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  AbortIncompleteMultipartUpload => ScalaAbortIncompleteMultipartUpload,
  _
}
import software.amazon.awssdk.services.s3.model.{ AbortIncompleteMultipartUpload => JavaAbortIncompleteMultipartUpload }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AbortIncompleteMultipartUploadOps {

  implicit class ScalaAbortIncompleteMultipartUploadOps(val self: ScalaAbortIncompleteMultipartUpload) extends AnyVal {

    def toJava: JavaAbortIncompleteMultipartUpload = {
      val result = JavaAbortIncompleteMultipartUpload.builder()
      self.daysAfterInitiation.map(_.intValue).foreach(v => result.daysAfterInitiation(v)) // Int

      result.build()
    }

  }

  implicit class JavaAbortIncompleteMultipartUploadOps(val self: JavaAbortIncompleteMultipartUpload) extends AnyVal {

    def toScala: ScalaAbortIncompleteMultipartUpload = {
      ScalaAbortIncompleteMultipartUpload()
        .withDaysAfterInitiation(Option(self.daysAfterInitiation).map(_.intValue)) // Int
    }

  }

}
