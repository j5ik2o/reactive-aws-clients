// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartCopyResponseBuilderOps(val self: UploadPartCopyResponse.Builder) extends AnyVal {

  final def copySourceVersionIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.copySourceVersionId(v)
    }
  }

  final def copyPartResultAsScala(value: Option[CopyPartResult]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.copyPartResult(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): UploadPartCopyResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class UploadPartCopyResponseOps(val self: UploadPartCopyResponse) extends AnyVal {

  final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId)

  final def copyPartResultAsScala: Option[CopyPartResult] = Option(self.copyPartResult)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartCopyResponseOps {

  implicit def toUploadPartCopyResponseBuilderOps(v: UploadPartCopyResponse.Builder): UploadPartCopyResponseBuilderOps =
    new UploadPartCopyResponseBuilderOps(v)

  implicit def toUploadPartCopyResponseOps(v: UploadPartCopyResponse): UploadPartCopyResponseOps =
    new UploadPartCopyResponseOps(v)

}
