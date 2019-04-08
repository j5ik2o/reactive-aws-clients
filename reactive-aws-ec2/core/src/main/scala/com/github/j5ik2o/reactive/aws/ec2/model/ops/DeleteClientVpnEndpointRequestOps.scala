// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteClientVpnEndpointRequestBuilderOps(val self: DeleteClientVpnEndpointRequest.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): DeleteClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

}

final class DeleteClientVpnEndpointRequestOps(val self: DeleteClientVpnEndpointRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClientVpnEndpointRequestOps {

  implicit def toDeleteClientVpnEndpointRequestBuilderOps(
      v: DeleteClientVpnEndpointRequest.Builder
  ): DeleteClientVpnEndpointRequestBuilderOps = new DeleteClientVpnEndpointRequestBuilderOps(v)

  implicit def toDeleteClientVpnEndpointRequestOps(
      v: DeleteClientVpnEndpointRequest
  ): DeleteClientVpnEndpointRequestOps = new DeleteClientVpnEndpointRequestOps(v)

}
