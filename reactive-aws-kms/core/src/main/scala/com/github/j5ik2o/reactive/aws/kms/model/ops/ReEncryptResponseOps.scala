// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ReEncryptResponseBuilderOps(val self: ReEncryptResponse.Builder) extends AnyVal {

  final def ciphertextBlobAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): ReEncryptResponse.Builder = {
    value.fold(self) { v =>
      self.ciphertextBlob(v)
    }
  }

  final def sourceKeyIdAsScala(value: Option[String]): ReEncryptResponse.Builder = {
    value.fold(self) { v =>
      self.sourceKeyId(v)
    }
  }

  final def keyIdAsScala(value: Option[String]): ReEncryptResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class ReEncryptResponseOps(val self: ReEncryptResponse) extends AnyVal {

  final def ciphertextBlobAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.ciphertextBlob)

  final def sourceKeyIdAsScala: Option[String] = Option(self.sourceKeyId)

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReEncryptResponseOps {

  implicit def toReEncryptResponseBuilderOps(v: ReEncryptResponse.Builder): ReEncryptResponseBuilderOps =
    new ReEncryptResponseBuilderOps(v)

  implicit def toReEncryptResponseOps(v: ReEncryptResponse): ReEncryptResponseOps = new ReEncryptResponseOps(v)

}
