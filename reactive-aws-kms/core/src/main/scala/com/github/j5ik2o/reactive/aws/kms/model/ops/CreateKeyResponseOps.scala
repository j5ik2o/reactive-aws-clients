// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateKeyResponseBuilderOps(val self: CreateKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMetadataAsScala(value: Option[KeyMetadata]): CreateKeyResponse.Builder = {
    value.fold(self) { v => self.keyMetadata(v) }
  }

}

final class CreateKeyResponseOps(val self: CreateKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMetadataAsScala: Option[KeyMetadata] = Option(self.keyMetadata)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyResponseOps {

  implicit def toCreateKeyResponseBuilderOps(v: CreateKeyResponse.Builder): CreateKeyResponseBuilderOps =
    new CreateKeyResponseBuilderOps(v)

  implicit def toCreateKeyResponseOps(v: CreateKeyResponse): CreateKeyResponseOps = new CreateKeyResponseOps(v)

}
