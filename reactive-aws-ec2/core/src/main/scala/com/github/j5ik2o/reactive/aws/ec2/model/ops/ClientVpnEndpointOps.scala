// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnEndpointBuilderOps(val self: ClientVpnEndpoint.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def statusAsScala(value: Option[ClientVpnEndpointStatus]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def creationTimeAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def deletionTimeAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  }

  final def dnsNameAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.dnsName(v)
    }
  }

  final def clientCidrBlockAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.clientCidrBlock(v)
    }
  }

  final def dnsServersAsScala(value: Option[Seq[String]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dnsServers(v.asJava)
    }
  }

  final def splitTunnelAsScala(value: Option[Boolean]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.splitTunnel(v)
    }
  }

  final def vpnProtocolAsScala(value: Option[VpnProtocol]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpnProtocol(v)
    }
  }

  final def transportProtocolAsScala(value: Option[TransportProtocol]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.transportProtocol(v)
    }
  }

  final def associatedTargetNetworksAsScala(value: Option[Seq[AssociatedTargetNetwork]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.associatedTargetNetworks(v.asJava)
    }
  }

  final def serverCertificateArnAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  final def authenticationOptionsAsScala(value: Option[Seq[ClientVpnAuthentication]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.authenticationOptions(v.asJava)
    }
  }

  final def connectionLogOptionsAsScala(value: Option[ConnectionLogResponseOptions]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ClientVpnEndpointOps(val self: ClientVpnEndpoint) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def statusAsScala: Option[ClientVpnEndpointStatus] = Option(self.status)

  final def creationTimeAsScala: Option[String] = Option(self.creationTime)

  final def deletionTimeAsScala: Option[String] = Option(self.deletionTime)

  final def dnsNameAsScala: Option[String] = Option(self.dnsName)

  final def clientCidrBlockAsScala: Option[String] = Option(self.clientCidrBlock)

  final def dnsServersAsScala: Option[Seq[String]] = Option(self.dnsServers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def splitTunnelAsScala: Option[Boolean] = Option(self.splitTunnel)

  final def vpnProtocolAsScala: Option[VpnProtocol] = Option(self.vpnProtocol)

  final def transportProtocolAsScala: Option[TransportProtocol] = Option(self.transportProtocol)

  final def associatedTargetNetworksAsScala: Option[Seq[AssociatedTargetNetwork]] =
    Option(self.associatedTargetNetworks).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  final def authenticationOptionsAsScala: Option[Seq[ClientVpnAuthentication]] =
    Option(self.authenticationOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def connectionLogOptionsAsScala: Option[ConnectionLogResponseOptions] = Option(self.connectionLogOptions)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnEndpointOps {

  implicit def toClientVpnEndpointBuilderOps(v: ClientVpnEndpoint.Builder): ClientVpnEndpointBuilderOps =
    new ClientVpnEndpointBuilderOps(v)

  implicit def toClientVpnEndpointOps(v: ClientVpnEndpoint): ClientVpnEndpointOps = new ClientVpnEndpointOps(v)

}
