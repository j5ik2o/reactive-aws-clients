// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class UpdateKeyDescriptionRequestBuilderOps(val self: UpdateKeyDescriptionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): UpdateKeyDescriptionRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateKeyDescriptionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class UpdateKeyDescriptionRequestOps(val self: UpdateKeyDescriptionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateKeyDescriptionRequestOps {

  implicit def toUpdateKeyDescriptionRequestBuilderOps(
      v: UpdateKeyDescriptionRequest.Builder
  ): UpdateKeyDescriptionRequestBuilderOps = new UpdateKeyDescriptionRequestBuilderOps(v)

  implicit def toUpdateKeyDescriptionRequestOps(v: UpdateKeyDescriptionRequest): UpdateKeyDescriptionRequestOps =
    new UpdateKeyDescriptionRequestOps(v)

}
