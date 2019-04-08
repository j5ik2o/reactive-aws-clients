// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachNetworkInterfaceRequestBuilderOps(val self: AttachNetworkInterfaceRequest.Builder) extends AnyVal {

  final def deviceIndexAsScala(value: Option[Int]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.deviceIndex(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): AttachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

}

final class AttachNetworkInterfaceRequestOps(val self: AttachNetworkInterfaceRequest) extends AnyVal {

  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

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
