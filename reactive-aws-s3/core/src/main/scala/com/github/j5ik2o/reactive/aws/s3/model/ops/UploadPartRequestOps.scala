// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartRequestBuilderOps(val self: UploadPartRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def contentLengthAsScala(value: Option[Long]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.contentLength(v)
    }
  } // Long

  final def contentMD5AsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def keyAsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def partNumberAsScala(value: Option[Int]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.partNumber(v)
    }
  } // Int

  final def uploadIdAsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyAsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def requestPayerAsScala(value: Option[RequestPayer]): UploadPartRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class UploadPartRequestOps(val self: UploadPartRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentLengthAsScala: Option[Long] = Option(self.contentLength) // Long

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def partNumberAsScala: Option[Int] = Option(self.partNumber) // Int

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartRequestOps {

  implicit def toUploadPartRequestBuilderOps(v: UploadPartRequest.Builder): UploadPartRequestBuilderOps =
    new UploadPartRequestBuilderOps(v)

  implicit def toUploadPartRequestOps(v: UploadPartRequest): UploadPartRequestOps = new UploadPartRequestOps(v)

}
