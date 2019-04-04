// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AbortMultipartUploadResponseBuilderOps(val self: AbortMultipartUploadResponse.Builder) extends AnyVal {

  final def withRequestChargedAsScala(value: Option[RequestCharged]): AbortMultipartUploadResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class AbortMultipartUploadResponseOps(val self: AbortMultipartUploadResponse) extends AnyVal {

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortMultipartUploadResponseOps {

  implicit def toAbortMultipartUploadResponseBuilderOps(
      v: AbortMultipartUploadResponse.Builder
  ): AbortMultipartUploadResponseBuilderOps = new AbortMultipartUploadResponseBuilderOps(v)

  implicit def toAbortMultipartUploadResponseOps(v: AbortMultipartUploadResponse): AbortMultipartUploadResponseOps =
    new AbortMultipartUploadResponseOps(v)

}
