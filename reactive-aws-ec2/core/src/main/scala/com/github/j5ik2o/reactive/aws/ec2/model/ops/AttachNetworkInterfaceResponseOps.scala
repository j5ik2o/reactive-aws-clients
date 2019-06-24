// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachNetworkInterfaceResponseBuilderOps(val self: AttachNetworkInterfaceResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala(value: Option[String]): AttachNetworkInterfaceResponse.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  }

}

final class AttachNetworkInterfaceResponseOps(val self: AttachNetworkInterfaceResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachNetworkInterfaceResponseOps {

  implicit def toAttachNetworkInterfaceResponseBuilderOps(
      v: AttachNetworkInterfaceResponse.Builder
  ): AttachNetworkInterfaceResponseBuilderOps = new AttachNetworkInterfaceResponseBuilderOps(v)

  implicit def toAttachNetworkInterfaceResponseOps(
      v: AttachNetworkInterfaceResponse
  ): AttachNetworkInterfaceResponseOps = new AttachNetworkInterfaceResponseOps(v)

}
