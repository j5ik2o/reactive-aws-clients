// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartResponseBuilderOps(val self: UploadPartResponse.Builder) extends AnyVal {

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withETagAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class UploadPartResponseOps(val self: UploadPartResponse) extends AnyVal {

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartResponseOps {

  implicit def toUploadPartResponseBuilderOps(v: UploadPartResponse.Builder): UploadPartResponseBuilderOps =
    new UploadPartResponseBuilderOps(v)

  implicit def toUploadPartResponseOps(v: UploadPartResponse): UploadPartResponseOps = new UploadPartResponseOps(v)

}
