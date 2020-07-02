// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteNetworkInterfaceRequestBuilderOps(val self: DeleteNetworkInterfaceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): DeleteNetworkInterfaceRequest.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

}

final class DeleteNetworkInterfaceRequestOps(val self: DeleteNetworkInterfaceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteNetworkInterfaceRequestOps {

  implicit def toDeleteNetworkInterfaceRequestBuilderOps(
      v: DeleteNetworkInterfaceRequest.Builder
  ): DeleteNetworkInterfaceRequestBuilderOps = new DeleteNetworkInterfaceRequestBuilderOps(v)

  implicit def toDeleteNetworkInterfaceRequestOps(v: DeleteNetworkInterfaceRequest): DeleteNetworkInterfaceRequestOps =
    new DeleteNetworkInterfaceRequestOps(v)

}
