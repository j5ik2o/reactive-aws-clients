// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateKeyPairResponseBuilderOps(val self: CreateKeyPairResponse.Builder) extends AnyVal {

  final def keyFingerprintAsScala(value: Option[String]): CreateKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyFingerprint(v)
    }
  }

  final def keyMaterialAsScala(value: Option[String]): CreateKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyMaterial(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): CreateKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

}

final class CreateKeyPairResponseOps(val self: CreateKeyPairResponse) extends AnyVal {

  final def keyFingerprintAsScala: Option[String] = Option(self.keyFingerprint)

  final def keyMaterialAsScala: Option[String] = Option(self.keyMaterial)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyPairResponseOps {

  implicit def toCreateKeyPairResponseBuilderOps(v: CreateKeyPairResponse.Builder): CreateKeyPairResponseBuilderOps =
    new CreateKeyPairResponseBuilderOps(v)

  implicit def toCreateKeyPairResponseOps(v: CreateKeyPairResponse): CreateKeyPairResponseOps =
    new CreateKeyPairResponseOps(v)

}
