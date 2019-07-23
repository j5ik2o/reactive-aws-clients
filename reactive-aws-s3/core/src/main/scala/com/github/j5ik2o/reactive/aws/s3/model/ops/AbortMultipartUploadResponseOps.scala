// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AbortMultipartUploadResponseBuilderOps(val self: AbortMultipartUploadResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): AbortMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class AbortMultipartUploadResponseOps(val self: AbortMultipartUploadResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortMultipartUploadResponseOps {

  implicit def toAbortMultipartUploadResponseBuilderOps(
      v: AbortMultipartUploadResponse.Builder
  ): AbortMultipartUploadResponseBuilderOps = new AbortMultipartUploadResponseBuilderOps(v)

  implicit def toAbortMultipartUploadResponseOps(v: AbortMultipartUploadResponse): AbortMultipartUploadResponseOps =
    new AbortMultipartUploadResponseOps(v)

}
