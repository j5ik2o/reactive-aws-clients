// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyRequestBuilderOps(val self: UploadPartCopyRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def copySourceAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySource(v)
    }
  }

  final def copySourceIfMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfMatch(v)
    }
  }

  final def copySourceIfModifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfModifiedSince(v)
    }
  }

  final def copySourceIfNoneMatchAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfNoneMatch(v)
    }
  }

  final def copySourceIfUnmodifiedSinceAsScala(value: Option[java.time.Instant]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceIfUnmodifiedSince(v)
    }
  }

  final def copySourceRangeAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceRange(v)
    }
  }

  final def keyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def partNumberAsScala(value: Option[Int]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def copySourceSSECustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerAlgorithm(v)
    }
  }

  final def copySourceSSECustomerKeyAsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKey(v)
    }
  }

  final def copySourceSSECustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.copySourceSSECustomerKeyMD5(v)
    }
  }

  final def requestPayerAsScala(value: Option[RequestPayer]): UploadPartCopyRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

}

final class UploadPartCopyRequestOps(val self: UploadPartCopyRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def copySourceAsScala: Option[String] = Option(self.copySource)

  final def copySourceIfMatchAsScala: Option[String] = Option(self.copySourceIfMatch)

  final def copySourceIfModifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfModifiedSince)

  final def copySourceIfNoneMatchAsScala: Option[String] = Option(self.copySourceIfNoneMatch)

  final def copySourceIfUnmodifiedSinceAsScala: Option[java.time.Instant] = Option(self.copySourceIfUnmodifiedSince)

  final def copySourceRangeAsScala: Option[String] = Option(self.copySourceRange)

  final def keyAsScala: Option[String] = Option(self.key)

  final def partNumberAsScala: Option[Int] = Option(self.partNumber)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def copySourceSSECustomerAlgorithmAsScala: Option[String] = Option(self.copySourceSSECustomerAlgorithm)

  final def copySourceSSECustomerKeyAsScala: Option[String] = Option(self.copySourceSSECustomerKey)

  final def copySourceSSECustomerKeyMD5AsScala: Option[String] = Option(self.copySourceSSECustomerKeyMD5)

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyRequestOps {

  implicit def toUploadPartCopyRequestBuilderOps(v: UploadPartCopyRequest.Builder): UploadPartCopyRequestBuilderOps =
    new UploadPartCopyRequestBuilderOps(v)

  implicit def toUploadPartCopyRequestOps(v: UploadPartCopyRequest): UploadPartCopyRequestOps =
    new UploadPartCopyRequestOps(v)

}
