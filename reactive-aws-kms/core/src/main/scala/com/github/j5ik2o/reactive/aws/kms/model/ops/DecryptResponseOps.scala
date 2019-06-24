// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DecryptResponseBuilderOps(val self: DecryptResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): DecryptResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): DecryptResponse.Builder = {
    value.fold(self) { v =>
      self.plaintext(v)
    }
  }

}

final class DecryptResponseOps(val self: DecryptResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.plaintext)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecryptResponseOps {

  implicit def toDecryptResponseBuilderOps(v: DecryptResponse.Builder): DecryptResponseBuilderOps =
    new DecryptResponseBuilderOps(v)

  implicit def toDecryptResponseOps(v: DecryptResponse): DecryptResponseOps = new DecryptResponseOps(v)

}
