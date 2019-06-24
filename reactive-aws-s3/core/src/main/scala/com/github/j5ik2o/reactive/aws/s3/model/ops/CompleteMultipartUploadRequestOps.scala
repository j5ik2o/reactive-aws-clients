// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CompleteMultipartUploadRequestBuilderOps(val self: CompleteMultipartUploadRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multipartUploadAsScala(value: Option[CompletedMultipartUpload]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.multipartUpload(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): CompleteMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class CompleteMultipartUploadRequestOps(val self: CompleteMultipartUploadRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def multipartUploadAsScala: Option[CompletedMultipartUpload] = Option(self.multipartUpload)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

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
