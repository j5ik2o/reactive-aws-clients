// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateClientVpnConnectionsResponseBuilderOps(val self: TerminateClientVpnConnectionsResponse.Builder)
    extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): TerminateClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def usernameAsScala(value: Option[String]): TerminateClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v =>
      self.username(v)
    }
  }

  final def connectionStatusesAsScala(
      value: Option[Seq[TerminateConnectionStatus]]
  ): TerminateClientVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.connectionStatuses(v.asJava)
    }
  }

}

final class TerminateClientVpnConnectionsResponseOps(val self: TerminateClientVpnConnectionsResponse) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def usernameAsScala: Option[String] = Option(self.username)

  final def connectionStatusesAsScala: Option[Seq[TerminateConnectionStatus]] = Option(self.connectionStatuses).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateClientVpnConnectionsResponseOps {

  implicit def toTerminateClientVpnConnectionsResponseBuilderOps(
      v: TerminateClientVpnConnectionsResponse.Builder
  ): TerminateClientVpnConnectionsResponseBuilderOps = new TerminateClientVpnConnectionsResponseBuilderOps(v)

  implicit def toTerminateClientVpnConnectionsResponseOps(
      v: TerminateClientVpnConnectionsResponse
  ): TerminateClientVpnConnectionsResponseOps = new TerminateClientVpnConnectionsResponseOps(v)

}
