// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class UploadPartResponseBuilderOps(val self: UploadPartResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala(value: Option[String]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): UploadPartResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class UploadPartResponseOps(val self: UploadPartResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eTagAsScala: Option[String] = Option(self.eTag)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUploadPartResponseOps {

  implicit def toUploadPartResponseBuilderOps(v: UploadPartResponse.Builder): UploadPartResponseBuilderOps =
    new UploadPartResponseBuilderOps(v)

  implicit def toUploadPartResponseOps(v: UploadPartResponse): UploadPartResponseOps = new UploadPartResponseOps(v)

}
