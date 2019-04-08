// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyRequestBuilderOps(val self: UploadPartCopyRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def copySourceAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySource(v)
    }
  } // String

  final def copySourceIfMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfMatch(v)
    }
  } // String

  final def copySourceIfModifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfModifiedSince(v)
    }
  } // java.time.Instant

  final def copySourceIfNoneMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfNoneMatch(v)
    }
  } // String

  final def copySourceIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfUnmodifiedSince(v)
    }
  } // java.time.Instant

  final def copySourceRangeAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceRange(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def partNumberAsScala(value: Option[Int]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

  final def uploadIdAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def copySourceSSECustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerAlgorithm(v)
    }
  } // String

  final def copySourceSSECustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKey(v)
    }
  } // String

  final def copySourceSSECustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKeyMD5(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // RequestPayer

}

final class UploadPartCopyRequestOps(val self: UploadPartCopyRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def copySourceAsScala: Option[String] = Option(self.copySource) // String

  final def copySourceIfMatchAsScala: Option[String] = Option(self.copySourceIfMatch) // String

  final def copySourceIfModifiedSinceAsScala: Option[java.time.Instant] =
    Option(self.copySourceIfModifiedSince) // java.time.Instant

  final def copySourceIfNoneMatchAsScala: Option[String] = Option(self.copySourceIfNoneMatch) // String

  final def copySourceIfUnmodifiedSinceAsScala: Option[java.time.Instant] =
    Option(self.copySourceIfUnmodifiedSince) // java.time.Instant

  final def copySourceRangeAsScala: Option[String] = Option(self.copySourceRange) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def copySourceSSECustomerAlgorithmAsScala: Option[String] =
    Option(self.copySourceSSECustomerAlgorithm) // String

  final def copySourceSSECustomerKeyAsScala: Option[String] = Option(self.copySourceSSECustomerKey) // String

  final def copySourceSSECustomerKeyMD5AsScala: Option[String] = Option(self.copySourceSSECustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // RequestPayer

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyRequestOps {

  implicit def toUploadPartCopyRequestBuilderOps(v: UploadPartCopyRequest.Builder): UploadPartCopyRequestBuilderOps =
    new UploadPartCopyRequestBuilderOps(v)

  implicit def toUploadPartCopyRequestOps(v: UploadPartCopyRequest): UploadPartCopyRequestOps =
    new UploadPartCopyRequestOps(v)

}
