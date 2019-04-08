// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DetachNetworkInterfaceRequestBuilderOps(val self: DetachNetworkInterfaceRequest.Builder) extends AnyVal {

  final def attachmentIdAsScala(value: Option[String]): DetachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.attachmentId(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DetachNetworkInterfaceRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DetachNetworkInterfaceRequestOps(val self: DetachNetworkInterfaceRequest) extends AnyVal {

  final def attachmentIdAsScala: Option[String] = Option(self.attachmentId)

  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetachNetworkInterfaceRequestOps {

  implicit def toDetachNetworkInterfaceRequestBuilderOps(
      v: DetachNetworkInterfaceRequest.Builder
  ): DetachNetworkInterfaceRequestBuilderOps = new DetachNetworkInterfaceRequestBuilderOps(v)

  implicit def toDetachNetworkInterfaceRequestOps(v: DetachNetworkInterfaceRequest): DetachNetworkInterfaceRequestOps =
    new DetachNetworkInterfaceRequestOps(v)

}
