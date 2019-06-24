// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyRequestBuilderOps(val self: UploadPartCopyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySource(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfMatch(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfModifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfModifiedSince(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfNoneMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfNoneMatch(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfUnmodifiedSince(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceRangeAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceRange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala(value: Option[Int]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerAlgorithm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKeyMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class UploadPartCopyRequestOps(val self: UploadPartCopyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceAsScala: Option[String] = Option(self.copySource)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfMatchAsScala: Option[String] = Option(self.copySourceIfMatch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfModifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfModifiedSince)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfNoneMatchAsScala: Option[String] = Option(self.copySourceIfNoneMatch)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceIfUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfUnmodifiedSince)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceRangeAsScala: Option[String] = Option(self.copySourceRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerAlgorithmAsScala: Option[String] = Option(self.copySourceSSECustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerKeyAsScala: Option[String] = Option(self.copySourceSSECustomerKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceSSECustomerKeyMD5AsScala: Option[String] = Option(self.copySourceSSECustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyRequestOps {

  implicit def toUploadPartCopyRequestBuilderOps(v: UploadPartCopyRequest.Builder): UploadPartCopyRequestBuilderOps =
    new UploadPartCopyRequestBuilderOps(v)

  implicit def toUploadPartCopyRequestOps(v: UploadPartCopyRequest): UploadPartCopyRequestOps =
    new UploadPartCopyRequestOps(v)

}
