// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateClientVpnConnectionsRequestBuilderOps(val self: TerminateClientVpnConnectionsRequest.Builder)
    extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): TerminateClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def connectionIdAsScala(value: Option[String]): TerminateClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.connectionId(v)
    }
  }

  final def usernameAsScala(value: Option[String]): TerminateClientVpnConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.username(v)
    }
  }

}

final class TerminateClientVpnConnectionsRequestOps(val self: TerminateClientVpnConnectionsRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def connectionIdAsScala: Option[String] = Option(self.connectionId)

  final def usernameAsScala: Option[String] = Option(self.username)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateClientVpnConnectionsRequestOps {

  implicit def toTerminateClientVpnConnectionsRequestBuilderOps(
      v: TerminateClientVpnConnectionsRequest.Builder
  ): TerminateClientVpnConnectionsRequestBuilderOps = new TerminateClientVpnConnectionsRequestBuilderOps(v)

  implicit def toTerminateClientVpnConnectionsRequestOps(
      v: TerminateClientVpnConnectionsRequest
  ): TerminateClientVpnConnectionsRequestOps = new TerminateClientVpnConnectionsRequestOps(v)

}
