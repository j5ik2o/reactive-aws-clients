// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CancelKeyDeletionResponseBuilderOps(val self: CancelKeyDeletionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): CancelKeyDeletionResponse.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class CancelKeyDeletionResponseOps(val self: CancelKeyDeletionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelKeyDeletionResponseOps {

  implicit def toCancelKeyDeletionResponseBuilderOps(
      v: CancelKeyDeletionResponse.Builder
  ): CancelKeyDeletionResponseBuilderOps = new CancelKeyDeletionResponseBuilderOps(v)

  implicit def toCancelKeyDeletionResponseOps(v: CancelKeyDeletionResponse): CancelKeyDeletionResponseOps =
    new CancelKeyDeletionResponseOps(v)

}
