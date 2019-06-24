// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateClientVpnConnectionsResponseBuilderOps(val self: TerminateClientVpnConnectionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): TerminateClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usernameAsScala(value: Option[String]): TerminateClientVpnConnectionsResponse.Builder = {
    value.fold(self) { v =>
      self.username(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusesAsScala(
      value: Option[Seq[TerminateConnectionStatus]]
  ): TerminateClientVpnConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connectionStatuses(v.asJava)
    }
  }

}

final class TerminateClientVpnConnectionsResponseOps(val self: TerminateClientVpnConnectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usernameAsScala: Option[String] = Option(self.username)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStatusesAsScala: Option[Seq[TerminateConnectionStatus]] = Option(self.connectionStatuses).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
