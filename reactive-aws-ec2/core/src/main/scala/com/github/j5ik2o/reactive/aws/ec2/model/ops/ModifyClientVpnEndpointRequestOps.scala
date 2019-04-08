// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyClientVpnEndpointRequestBuilderOps(val self: ModifyClientVpnEndpointRequest.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def serverCertificateArnAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  final def connectionLogOptionsAsScala(value: Option[ConnectionLogOptions]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  final def dnsServersAsScala(
      value: Option[DnsServersOptionsModifyStructure]
  ): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.dnsServers(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ModifyClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class ModifyClientVpnEndpointRequestOps(val self: ModifyClientVpnEndpointRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  final def connectionLogOptionsAsScala: Option[ConnectionLogOptions] = Option(self.connectionLogOptions)

  final def dnsServersAsScala: Option[DnsServersOptionsModifyStructure] = Option(self.dnsServers)

  final def descriptionAsScala: Option[String] = Option(self.description)

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
