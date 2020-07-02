// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteClientVpnEndpointResponseBuilderOps(val self: DeleteClientVpnEndpointResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClientVpnEndpointStatus]): DeleteClientVpnEndpointResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class DeleteClientVpnEndpointResponseOps(val self: DeleteClientVpnEndpointResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientVpnEndpointStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClientVpnEndpointResponseOps {

  implicit def toDeleteClientVpnEndpointResponseBuilderOps(
      v: DeleteClientVpnEndpointResponse.Builder
  ): DeleteClientVpnEndpointResponseBuilderOps = new DeleteClientVpnEndpointResponseBuilderOps(v)

  implicit def toDeleteClientVpnEndpointResponseOps(
      v: DeleteClientVpnEndpointResponse
  ): DeleteClientVpnEndpointResponseOps = new DeleteClientVpnEndpointResponseOps(v)

}
