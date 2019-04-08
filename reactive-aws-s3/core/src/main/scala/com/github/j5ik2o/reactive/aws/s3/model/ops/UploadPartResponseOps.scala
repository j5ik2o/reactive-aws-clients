// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartResponseBuilderOps(val self: UploadPartResponse.Builder) extends AnyVal {

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // ServerSideEncryption

  final def eTagAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def ssekmsKeyIdAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def requestChargedAsScala(value: Option[RequestCharged]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

}

final class UploadPartResponseOps(val self: UploadPartResponse) extends AnyVal {

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] =
    Option(self.serverSideEncryption) // ServerSideEncryption

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartResponseOps {

  implicit def toUploadPartResponseBuilderOps(v: UploadPartResponse.Builder): UploadPartResponseBuilderOps =
    new UploadPartResponseBuilderOps(v)

  implicit def toUploadPartResponseOps(v: UploadPartResponse): UploadPartResponseOps = new UploadPartResponseOps(v)

}
