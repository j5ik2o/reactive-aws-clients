// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnEndpointRequestBuilderOps(val self: CreateClientVpnEndpointRequest.Builder) extends AnyVal {

  final def clientCidrBlockAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientCidrBlock(v)
    }
  }

  final def serverCertificateArnAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  final def authenticationOptionsAsScala(
      value: Option[Seq[ClientVpnAuthenticationRequest]]
  ): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.authenticationOptions(v.asJava)
    }
  }

  final def connectionLogOptionsAsScala(value: Option[ConnectionLogOptions]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  final def dnsServersAsScala(value: Option[Seq[String]]): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dnsServers(v.asJava)
    }
  }

  final def transportProtocolAsScala(value: Option[TransportProtocol]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.transportProtocol(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateClientVpnEndpointRequestOps(val self: CreateClientVpnEndpointRequest) extends AnyVal {

  final def clientCidrBlockAsScala: Option[String] = Option(self.clientCidrBlock)

  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  final def authenticationOptionsAsScala: Option[Seq[ClientVpnAuthenticationRequest]] =
    Option(self.authenticationOptions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def connectionLogOptionsAsScala: Option[ConnectionLogOptions] = Option(self.connectionLogOptions)

  final def dnsServersAsScala: Option[Seq[String]] = Option(self.dnsServers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def transportProtocolAsScala: Option[TransportProtocol] = Option(self.transportProtocol)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnEndpointRequestOps {

  implicit def toCreateClientVpnEndpointRequestBuilderOps(
      v: CreateClientVpnEndpointRequest.Builder
  ): CreateClientVpnEndpointRequestBuilderOps = new CreateClientVpnEndpointRequestBuilderOps(v)

  implicit def toCreateClientVpnEndpointRequestOps(
      v: CreateClientVpnEndpointRequest
  ): CreateClientVpnEndpointRequestOps = new CreateClientVpnEndpointRequestOps(v)

}
