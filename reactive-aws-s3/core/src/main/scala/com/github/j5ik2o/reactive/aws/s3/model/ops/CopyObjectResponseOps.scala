// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectResponseBuilderOps(val self: CopyObjectResponse.Builder) extends AnyVal {

  final def withCopyObjectResultAsScala(value: Option[CopyObjectResult]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.copyObjectResult(v)
    }
  } // CopyObjectResult

  final def withExpirationAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def withCopySourceVersionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.copySourceVersionId(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class CopyObjectResponseOps(val self: CopyObjectResponse) extends AnyVal {

  final def copyObjectResultAsScala: Option[CopyObjectResult] = Option(self.copyObjectResult) // CopyObjectResult

  final def expirationAsScala: Option[String] = Option(self.expiration) // String

  final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectResponseOps {

  implicit def toCopyObjectResponseBuilderOps(v: CopyObjectResponse.Builder): CopyObjectResponseBuilderOps =
    new CopyObjectResponseBuilderOps(v)

  implicit def toCopyObjectResponseOps(v: CopyObjectResponse): CopyObjectResponseOps = new CopyObjectResponseOps(v)

}
