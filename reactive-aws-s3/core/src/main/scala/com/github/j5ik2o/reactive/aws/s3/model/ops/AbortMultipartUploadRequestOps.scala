// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AbortMultipartUploadRequestBuilderOps(val self: AbortMultipartUploadRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): AbortMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): AbortMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def uploadIdAsScala(value: Option[String]): AbortMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): AbortMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class AbortMultipartUploadRequestOps(val self: AbortMultipartUploadRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAbortMultipartUploadRequestOps {

  implicit def toAbortMultipartUploadRequestBuilderOps(
      v: AbortMultipartUploadRequest.Builder
  ): AbortMultipartUploadRequestBuilderOps = new AbortMultipartUploadRequestBuilderOps(v)

  implicit def toAbortMultipartUploadRequestOps(v: AbortMultipartUploadRequest): AbortMultipartUploadRequestOps =
    new AbortMultipartUploadRequestOps(v)

}
