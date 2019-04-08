// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportKeyPairRequestBuilderOps(val self: ImportKeyPairRequest.Builder) extends AnyVal {

  final def keyNameAsScala(value: Option[String]): ImportKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def publicKeyMaterialAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): ImportKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.publicKeyMaterial(v)
    }
  }

}

final class ImportKeyPairRequestOps(val self: ImportKeyPairRequest) extends AnyVal {

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def publicKeyMaterialAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.publicKeyMaterial)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportKeyPairRequestOps {

  implicit def toImportKeyPairRequestBuilderOps(v: ImportKeyPairRequest.Builder): ImportKeyPairRequestBuilderOps =
    new ImportKeyPairRequestBuilderOps(v)

  implicit def toImportKeyPairRequestOps(v: ImportKeyPairRequest): ImportKeyPairRequestOps =
    new ImportKeyPairRequestOps(v)

}
