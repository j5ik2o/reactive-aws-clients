// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class VerifyResponseBuilderOps(val self: VerifyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): VerifyResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureValidAsScala(value: Option[Boolean]): VerifyResponse.Builder = {
    value.fold(self) { v =>
      self.signatureValid(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala(value: Option[SigningAlgorithmSpec]): VerifyResponse.Builder = {
    value.fold(self) { v =>
      self.signingAlgorithm(v)
    }
  }

}

final class VerifyResponseOps(val self: VerifyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureValidAsScala: Option[Boolean] = Option(self.signatureValid)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala: Option[SigningAlgorithmSpec] = Option(self.signingAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVerifyResponseOps {

  implicit def toVerifyResponseBuilderOps(v: VerifyResponse.Builder): VerifyResponseBuilderOps =
    new VerifyResponseBuilderOps(v)

  implicit def toVerifyResponseOps(v: VerifyResponse): VerifyResponseOps = new VerifyResponseOps(v)

}
