// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectResponseBuilderOps(val self: CopyObjectResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copyObjectResultAsScala(value: Option[CopyObjectResult]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.copyObjectResult(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.expiration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceVersionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.copySourceVersionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.versionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.serverSideEncryption(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.sseCustomerAlgorithm(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.sseCustomerKeyMD5(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.ssekmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsEncryptionContextAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.ssekmsEncryptionContext(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): CopyObjectResponse.Builder = {
    value.fold(self) { v => self.requestCharged(v) }
  }

}

final class CopyObjectResponseOps(val self: CopyObjectResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copyObjectResultAsScala: Option[CopyObjectResult] = Option(self.copyObjectResult)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala: Option[String] = Option(self.expiration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsEncryptionContextAsScala: Option[String] = Option(self.ssekmsEncryptionContext)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectResponseOps {

  implicit def toCopyObjectResponseBuilderOps(v: CopyObjectResponse.Builder): CopyObjectResponseBuilderOps =
    new CopyObjectResponseBuilderOps(v)

  implicit def toCopyObjectResponseOps(v: CopyObjectResponse): CopyObjectResponseOps = new CopyObjectResponseOps(v)

}
