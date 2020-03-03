// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyClientVpnEndpointRequestBuilderOps(val self: ModifyClientVpnEndpointRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala(value: Option[ConnectionLogOptions]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala(
      value: Option[DnsServersOptionsModifyStructure]
  ): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.dnsServers(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnPortAsScala(value: Option[Int]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.vpnPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def splitTunnelAsScala(value: Option[Boolean]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.splitTunnel(v)
    }
  }

}

final class ModifyClientVpnEndpointRequestOps(val self: ModifyClientVpnEndpointRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala: Option[ConnectionLogOptions] = Option(self.connectionLogOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala: Option[DnsServersOptionsModifyStructure] = Option(self.dnsServers)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnPortAsScala: Option[Int] = Option(self.vpnPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def splitTunnelAsScala: Option[Boolean] = Option(self.splitTunnel)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyClientVpnEndpointRequestOps {

  implicit def toModifyClientVpnEndpointRequestBuilderOps(
      v: ModifyClientVpnEndpointRequest.Builder
  ): ModifyClientVpnEndpointRequestBuilderOps = new ModifyClientVpnEndpointRequestBuilderOps(v)

  implicit def toModifyClientVpnEndpointRequestOps(
      v: ModifyClientVpnEndpointRequest
  ): ModifyClientVpnEndpointRequestOps = new ModifyClientVpnEndpointRequestOps(v)

}
