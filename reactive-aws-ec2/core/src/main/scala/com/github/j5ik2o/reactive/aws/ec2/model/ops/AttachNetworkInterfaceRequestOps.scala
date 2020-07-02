// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachNetworkInterfaceRequestBuilderOps(val self: AttachNetworkInterfaceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala(value: Option[Int]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v => self.deviceIndex(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

}

final class AttachNetworkInterfaceRequestOps(val self: AttachNetworkInterfaceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachNetworkInterfaceRequestOps {

  implicit def toAttachNetworkInterfaceRequestBuilderOps(
      v: AttachNetworkInterfaceRequest.Builder
  ): AttachNetworkInterfaceRequestBuilderOps = new AttachNetworkInterfaceRequestBuilderOps(v)

  implicit def toAttachNetworkInterfaceRequestOps(v: AttachNetworkInterfaceRequest): AttachNetworkInterfaceRequestOps =
    new AttachNetworkInterfaceRequestOps(v)

}
