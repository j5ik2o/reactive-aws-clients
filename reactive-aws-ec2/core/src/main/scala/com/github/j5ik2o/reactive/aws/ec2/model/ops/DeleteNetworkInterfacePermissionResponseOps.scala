// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNetworkInterfacePermissionResponseBuilderOps(
    val self: DeleteNetworkInterfacePermissionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): DeleteNetworkInterfacePermissionResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class DeleteNetworkInterfacePermissionResponseOps(val self: DeleteNetworkInterfacePermissionResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNetworkInterfacePermissionResponseOps {

  implicit def toDeleteNetworkInterfacePermissionResponseBuilderOps(
      v: DeleteNetworkInterfacePermissionResponse.Builder
  ): DeleteNetworkInterfacePermissionResponseBuilderOps = new DeleteNetworkInterfacePermissionResponseBuilderOps(v)

  implicit def toDeleteNetworkInterfacePermissionResponseOps(
      v: DeleteNetworkInterfacePermissionResponse
  ): DeleteNetworkInterfacePermissionResponseOps = new DeleteNetworkInterfacePermissionResponseOps(v)

}
