// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnConnectionBuilderOps(val self: ClientVpnConnection.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def timestampAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  final def connectionIdAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionId(v)
    }
  }

  final def usernameAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.username(v)
    }
  }

  final def connectionEstablishedTimeAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionEstablishedTime(v)
    }
  }

  final def ingressBytesAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.ingressBytes(v)
    }
  }

  final def egressBytesAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.egressBytes(v)
    }
  }

  final def ingressPacketsAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.ingressPackets(v)
    }
  }

  final def egressPacketsAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.egressPackets(v)
    }
  }

  final def clientIpAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.clientIp(v)
    }
  }

  final def commonNameAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.commonName(v)
    }
  }

  final def statusAsScala(value: Option[ClientVpnConnectionStatus]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def connectionEndTimeAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionEndTime(v)
    }
  }

}

final class ClientVpnConnectionOps(val self: ClientVpnConnection) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def timestampAsScala: Option[String] = Option(self.timestamp)

  final def connectionIdAsScala: Option[String] = Option(self.connectionId)

  final def usernameAsScala: Option[String] = Option(self.username)

  final def connectionEstablishedTimeAsScala: Option[String] = Option(self.connectionEstablishedTime)

  final def ingressBytesAsScala: Option[String] = Option(self.ingressBytes)

  final def egressBytesAsScala: Option[String] = Option(self.egressBytes)

  final def ingressPacketsAsScala: Option[String] = Option(self.ingressPackets)

  final def egressPacketsAsScala: Option[String] = Option(self.egressPackets)

  final def clientIpAsScala: Option[String] = Option(self.clientIp)

  final def commonNameAsScala: Option[String] = Option(self.commonName)

  final def statusAsScala: Option[ClientVpnConnectionStatus] = Option(self.status)

  final def connectionEndTimeAsScala: Option[String] = Option(self.connectionEndTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnConnectionOps {

  implicit def toClientVpnConnectionBuilderOps(v: ClientVpnConnection.Builder): ClientVpnConnectionBuilderOps =
    new ClientVpnConnectionBuilderOps(v)

  implicit def toClientVpnConnectionOps(v: ClientVpnConnection): ClientVpnConnectionOps = new ClientVpnConnectionOps(v)

}
