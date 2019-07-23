// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateCustomKeyStoreRequestBuilderOps(val self: CreateCustomKeyStoreRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala(value: Option[String]): CreateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala(value: Option[String]): CreateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.cloudHsmClusterId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trustAnchorCertificateAsScala(value: Option[String]): CreateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.trustAnchorCertificate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStorePasswordAsScala(value: Option[String]): CreateCustomKeyStoreRequest.Builder = {
    value.fold(self) { v =>
      self.keyStorePassword(v)
    }
  }

}

final class CreateCustomKeyStoreRequestOps(val self: CreateCustomKeyStoreRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala: Option[String] = Option(self.customKeyStoreName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala: Option[String] = Option(self.cloudHsmClusterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trustAnchorCertificateAsScala: Option[String] = Option(self.trustAnchorCertificate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStorePasswordAsScala: Option[String] = Option(self.keyStorePassword)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCustomKeyStoreRequestOps {

  implicit def toCreateCustomKeyStoreRequestBuilderOps(
      v: CreateCustomKeyStoreRequest.Builder
  ): CreateCustomKeyStoreRequestBuilderOps = new CreateCustomKeyStoreRequestBuilderOps(v)

  implicit def toCreateCustomKeyStoreRequestOps(v: CreateCustomKeyStoreRequest): CreateCustomKeyStoreRequestOps =
    new CreateCustomKeyStoreRequestOps(v)

}
