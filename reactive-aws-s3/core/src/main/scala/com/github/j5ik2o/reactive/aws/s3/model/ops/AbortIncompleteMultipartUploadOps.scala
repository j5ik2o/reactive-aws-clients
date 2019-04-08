// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AbortIncompleteMultipartUploadBuilderOps(val self: AbortIncompleteMultipartUpload.Builder) extends AnyVal {

  final def daysAfterInitiationAsScala(value: Option[Int]): AbortIncompleteMultipartUpload.Builder = {
    value.fold(self) { v =>
      self.daysAfterInitiation(v)
    }
  } // Int

}

final class AbortIncompleteMultipartUploadOps(val self: AbortIncompleteMultipartUpload) extends AnyVal {

  final def daysAfterInitiationAsScala: Option[Int] = Option(self.daysAfterInitiation) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortIncompleteMultipartUploadOps {

  implicit def toAbortIncompleteMultipartUploadBuilderOps(
      v: AbortIncompleteMultipartUpload.Builder
  ): AbortIncompleteMultipartUploadBuilderOps = new AbortIncompleteMultipartUploadBuilderOps(v)

  implicit def toAbortIncompleteMultipartUploadOps(
      v: AbortIncompleteMultipartUpload
  ): AbortIncompleteMultipartUploadOps = new AbortIncompleteMultipartUploadOps(v)

}
