// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkInterfacePermissionResponseBuilderOps(
    val self: CreateNetworkInterfacePermissionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interfacePermissionAsScala(
      value: Option[NetworkInterfacePermission]
  ): CreateNetworkInterfacePermissionResponse.Builder = {
    value.fold(self) { v =>
      self.interfacePermission(v)
    }
  }

}

final class CreateNetworkInterfacePermissionResponseOps(val self: CreateNetworkInterfacePermissionResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interfacePermissionAsScala: Option[NetworkInterfacePermission] = Option(self.interfacePermission)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkInterfacePermissionResponseOps {

  implicit def toCreateNetworkInterfacePermissionResponseBuilderOps(
      v: CreateNetworkInterfacePermissionResponse.Builder
  ): CreateNetworkInterfacePermissionResponseBuilderOps = new CreateNetworkInterfacePermissionResponseBuilderOps(v)

  implicit def toCreateNetworkInterfacePermissionResponseOps(
      v: CreateNetworkInterfacePermissionResponse
  ): CreateNetworkInterfacePermissionResponseOps = new CreateNetworkInterfacePermissionResponseOps(v)

}
