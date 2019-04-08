// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CopyObjectResponseBuilderOps(val self: CopyObjectResponse.Builder) extends AnyVal {

  final def copyObjectResultAsScala(value: Option[CopyObjectResult]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.copyObjectResult(v)
    }
  }

  final def expirationAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  }

  final def copySourceVersionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.copySourceVersionId(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): CopyObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class CopyObjectResponseOps(val self: CopyObjectResponse) extends AnyVal {

  final def copyObjectResultAsScala: Option[CopyObjectResult] = Option(self.copyObjectResult)

  final def expirationAsScala: Option[String] = Option(self.expiration)

  final def copySourceVersionIdAsScala: Option[String] = Option(self.copySourceVersionId)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCopyObjectResponseOps {

  implicit def toCopyObjectResponseBuilderOps(v: CopyObjectResponse.Builder): CopyObjectResponseBuilderOps =
    new CopyObjectResponseBuilderOps(v)

  implicit def toCopyObjectResponseOps(v: CopyObjectResponse): CopyObjectResponseOps = new CopyObjectResponseOps(v)

}
