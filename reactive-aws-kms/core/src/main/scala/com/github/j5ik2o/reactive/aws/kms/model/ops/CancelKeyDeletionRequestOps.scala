// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CancelKeyDeletionRequestBuilderOps(val self: CancelKeyDeletionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): CancelKeyDeletionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class CancelKeyDeletionRequestOps(val self: CancelKeyDeletionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelKeyDeletionRequestOps {

  implicit def toCancelKeyDeletionRequestBuilderOps(
      v: CancelKeyDeletionRequest.Builder
  ): CancelKeyDeletionRequestBuilderOps = new CancelKeyDeletionRequestBuilderOps(v)

  implicit def toCancelKeyDeletionRequestOps(v: CancelKeyDeletionRequest): CancelKeyDeletionRequestOps =
    new CancelKeyDeletionRequestOps(v)

}
