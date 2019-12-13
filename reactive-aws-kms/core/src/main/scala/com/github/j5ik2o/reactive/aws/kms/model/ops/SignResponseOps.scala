// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class SignResponseBuilderOps(val self: SignResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): SignResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): SignResponse.Builder = {
    value.fold(self) { v =>
      self.signature(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala(value: Option[SigningAlgorithmSpec]): SignResponse.Builder = {
    value.fold(self) { v =>
      self.signingAlgorithm(v)
    }
  }

}

final class SignResponseOps(val self: SignResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signatureAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.signature)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def signingAlgorithmAsScala: Option[SigningAlgorithmSpec] = Option(self.signingAlgorithm)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSignResponseOps {

  implicit def toSignResponseBuilderOps(v: SignResponse.Builder): SignResponseBuilderOps = new SignResponseBuilderOps(v)

  implicit def toSignResponseOps(v: SignResponse): SignResponseOps = new SignResponseOps(v)

}
