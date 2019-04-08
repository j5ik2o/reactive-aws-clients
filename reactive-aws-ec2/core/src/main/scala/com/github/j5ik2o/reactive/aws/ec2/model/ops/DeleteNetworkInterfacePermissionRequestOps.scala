// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNetworkInterfacePermissionRequestBuilderOps(val self: DeleteNetworkInterfacePermissionRequest.Builder)
    extends AnyVal {

  final def networkInterfacePermissionIdAsScala(
      value: Option[String]
  ): DeleteNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfacePermissionId(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DeleteNetworkInterfacePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DeleteNetworkInterfacePermissionRequestOps(val self: DeleteNetworkInterfacePermissionRequest)
    extends AnyVal {

  final def networkInterfacePermissionIdAsScala: Option[String] = Option(self.networkInterfacePermissionId)

  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNetworkInterfacePermissionRequestOps {

  implicit def toDeleteNetworkInterfacePermissionRequestBuilderOps(
      v: DeleteNetworkInterfacePermissionRequest.Builder
  ): DeleteNetworkInterfacePermissionRequestBuilderOps = new DeleteNetworkInterfacePermissionRequestBuilderOps(v)

  implicit def toDeleteNetworkInterfacePermissionRequestOps(
      v: DeleteNetworkInterfacePermissionRequest
  ): DeleteNetworkInterfacePermissionRequestOps = new DeleteNetworkInterfacePermissionRequestOps(v)

}
