// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportKeyPairResponseBuilderOps(val self: ImportKeyPairResponse.Builder) extends AnyVal {

  final def keyFingerprintAsScala(value: Option[String]): ImportKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyFingerprint(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): ImportKeyPairResponse.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

}

final class ImportKeyPairResponseOps(val self: ImportKeyPairResponse) extends AnyVal {

  final def keyFingerprintAsScala: Option[String] = Option(self.keyFingerprint)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportKeyPairResponseOps {

  implicit def toImportKeyPairResponseBuilderOps(v: ImportKeyPairResponse.Builder): ImportKeyPairResponseBuilderOps =
    new ImportKeyPairResponseBuilderOps(v)

  implicit def toImportKeyPairResponseOps(v: ImportKeyPairResponse): ImportKeyPairResponseOps =
    new ImportKeyPairResponseOps(v)

}
