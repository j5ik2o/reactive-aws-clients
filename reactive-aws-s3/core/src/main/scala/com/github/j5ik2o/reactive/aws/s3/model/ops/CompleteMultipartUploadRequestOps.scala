// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompleteMultipartUploadRequestBuilderOps(val self: CompleteMultipartUploadRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withMultipartUploadAsScala(
      value: Option[CompletedMultipartUpload]
  ): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.multipartUpload(v)
    }
  } // CompletedMultipartUpload

  final def withUploadIdAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class CompleteMultipartUploadRequestOps(val self: CompleteMultipartUploadRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def multipartUploadAsScala: Option[CompletedMultipartUpload] =
    Option(self.multipartUpload) // CompletedMultipartUpload

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompleteMultipartUploadRequestOps {

  implicit def toCompleteMultipartUploadRequestBuilderOps(
      v: CompleteMultipartUploadRequest.Builder
  ): CompleteMultipartUploadRequestBuilderOps = new CompleteMultipartUploadRequestBuilderOps(v)

  implicit def toCompleteMultipartUploadRequestOps(
      v: CompleteMultipartUploadRequest
  ): CompleteMultipartUploadRequestOps = new CompleteMultipartUploadRequestOps(v)

}
