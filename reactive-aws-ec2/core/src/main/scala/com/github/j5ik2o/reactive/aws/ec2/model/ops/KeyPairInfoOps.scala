// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class KeyPairInfoBuilderOps(val self: KeyPairInfo.Builder) extends AnyVal {

  final def keyFingerprintAsScala(value: Option[String]): KeyPairInfo.Builder = {
    value.fold(self) { v =>
      self.keyFingerprint(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): KeyPairInfo.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

}

final class KeyPairInfoOps(val self: KeyPairInfo) extends AnyVal {

  final def keyFingerprintAsScala: Option[String] = Option(self.keyFingerprint)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyPairInfoOps {

  implicit def toKeyPairInfoBuilderOps(v: KeyPairInfo.Builder): KeyPairInfoBuilderOps = new KeyPairInfoBuilderOps(v)

  implicit def toKeyPairInfoOps(v: KeyPairInfo): KeyPairInfoOps = new KeyPairInfoOps(v)

}
