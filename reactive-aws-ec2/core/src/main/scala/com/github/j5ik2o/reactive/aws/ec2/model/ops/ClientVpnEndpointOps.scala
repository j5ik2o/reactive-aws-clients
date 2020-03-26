// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnEndpointBuilderOps(val self: ClientVpnEndpoint.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClientVpnEndpointStatus]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsNameAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.dnsName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientCidrBlockAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.clientCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala(value: Option[Seq[String]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dnsServers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def splitTunnelAsScala(value: Option[Boolean]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.splitTunnel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnProtocolAsScala(value: Option[VpnProtocol]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpnProtocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transportProtocolAsScala(value: Option[TransportProtocol]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.transportProtocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnPortAsScala(value: Option[Int]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpnPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatedTargetNetworksAsScala(value: Option[Seq[AssociatedTargetNetwork]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.associatedTargetNetworks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationOptionsAsScala(value: Option[Seq[ClientVpnAuthentication]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.authenticationOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala(value: Option[ConnectionLogResponseOptions]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ClientVpnEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): ClientVpnEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class ClientVpnEndpointOps(val self: ClientVpnEndpoint) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientVpnEndpointStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[String] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala: Option[String] = Option(self.deletionTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsNameAsScala: Option[String] = Option(self.dnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientCidrBlockAsScala: Option[String] = Option(self.clientCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala: Option[Seq[String]] = Option(self.dnsServers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def splitTunnelAsScala: Option[Boolean] = Option(self.splitTunnel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnProtocolAsScala: Option[VpnProtocol] = Option(self.vpnProtocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transportProtocolAsScala: Option[TransportProtocol] = Option(self.transportProtocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpnPortAsScala: Option[Int] = Option(self.vpnPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatedTargetNetworksAsScala: Option[Seq[AssociatedTargetNetwork]] =
    Option(self.associatedTargetNetworks).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationOptionsAsScala: Option[Seq[ClientVpnAuthentication]] =
    Option(self.authenticationOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala: Option[ConnectionLogResponseOptions] = Option(self.connectionLogOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnEndpointOps {

  implicit def toClientVpnEndpointBuilderOps(v: ClientVpnEndpoint.Builder): ClientVpnEndpointBuilderOps =
    new ClientVpnEndpointBuilderOps(v)

  implicit def toClientVpnEndpointOps(v: ClientVpnEndpoint): ClientVpnEndpointOps = new ClientVpnEndpointOps(v)

}
