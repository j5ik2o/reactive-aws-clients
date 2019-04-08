// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyResponseBuilderOps(val self: UploadPartCopyResponse.Builder) extends AnyVal {

  final def copySourceVersionIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.copySourceVersionId(v)
    }
  } // String

  final def copyPartResultAsScala(value: Option[CopyPartResult]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.copyPartResult(v)
    }
  } // CopyPartResult

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // ServerSideEncryption

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def requestChargedAsScala(value: Option[RequestCharged]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

}

final class UploadPartCopyResponseOps(val self: UploadPartCopyResponse) extends AnyVal {

  final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId) // String

  final def copyPartResultAsScala: Option[CopyPartResult] = Option(self.copyPartResult) // CopyPartResult

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] =
    Option(self.serverSideEncryption) // ServerSideEncryption

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyResponseOps {

  implicit def toUploadPartCopyResponseBuilderOps(v: UploadPartCopyResponse.Builder): UploadPartCopyResponseBuilderOps =
    new UploadPartCopyResponseBuilderOps(v)

  implicit def toUploadPartCopyResponseOps(v: UploadPartCopyResponse): UploadPartCopyResponseOps =
    new UploadPartCopyResponseOps(v)

}
