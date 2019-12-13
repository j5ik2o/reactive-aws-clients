// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PeeringAttachmentStatusBuilderOps(val self: PeeringAttachmentStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): PeeringAttachmentStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): PeeringAttachmentStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class PeeringAttachmentStatusOps(val self: PeeringAttachmentStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPeeringAttachmentStatusOps {

  implicit def toPeeringAttachmentStatusBuilderOps(
      v: PeeringAttachmentStatus.Builder
  ): PeeringAttachmentStatusBuilderOps = new PeeringAttachmentStatusBuilderOps(v)

  implicit def toPeeringAttachmentStatusOps(v: PeeringAttachmentStatus): PeeringAttachmentStatusOps =
    new PeeringAttachmentStatusOps(v)

}
