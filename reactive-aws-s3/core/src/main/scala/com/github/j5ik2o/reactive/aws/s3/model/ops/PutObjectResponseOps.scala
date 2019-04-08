// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectResponseBuilderOps(val self: PutObjectResponse.Builder) extends AnyVal {

  final def expirationAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  }

  final def eTagAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  }

  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  final def versionIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

  final def sseCustomerAlgorithmAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  final def sseCustomerKeyMD5AsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  final def ssekmsKeyIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class PutObjectResponseOps(val self: PutObjectResponse) extends AnyVal {

  final def expirationAsScala: Option[String] = Option(self.expiration)

  final def eTagAsScala: Option[String] = Option(self.eTag)

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  final def versionIdAsScala: Option[String] = Option(self.versionId)

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectResponseOps {

  implicit def toPutObjectResponseBuilderOps(v: PutObjectResponse.Builder): PutObjectResponseBuilderOps =
    new PutObjectResponseBuilderOps(v)

  implicit def toPutObjectResponseOps(v: PutObjectResponse): PutObjectResponseOps = new PutObjectResponseOps(v)

}
