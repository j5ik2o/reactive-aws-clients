// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnConnectionBuilderOps(val self: ClientVpnConnection.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionIdAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usernameAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.username(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEstablishedTimeAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionEstablishedTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressBytesAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.ingressBytes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressBytesAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.egressBytes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressPacketsAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.ingressPackets(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressPacketsAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.egressPackets(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientIpAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.clientIp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonNameAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.commonName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClientVpnConnectionStatus]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEndTimeAsScala(value: Option[String]): ClientVpnConnection.Builder = {
    value.fold(self) { v =>
      self.connectionEndTime(v)
    }
  }

}

final class ClientVpnConnectionOps(val self: ClientVpnConnection) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[String] = Option(self.timestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionIdAsScala: Option[String] = Option(self.connectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usernameAsScala: Option[String] = Option(self.username)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEstablishedTimeAsScala: Option[String] = Option(self.connectionEstablishedTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressBytesAsScala: Option[String] = Option(self.ingressBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressBytesAsScala: Option[String] = Option(self.egressBytes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ingressPacketsAsScala: Option[String] = Option(self.ingressPackets)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressPacketsAsScala: Option[String] = Option(self.egressPackets)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientIpAsScala: Option[String] = Option(self.clientIp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commonNameAsScala: Option[String] = Option(self.commonName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClientVpnConnectionStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionEndTimeAsScala: Option[String] = Option(self.connectionEndTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnConnectionOps {

  implicit def toClientVpnConnectionBuilderOps(v: ClientVpnConnection.Builder): ClientVpnConnectionBuilderOps =
    new ClientVpnConnectionBuilderOps(v)

  implicit def toClientVpnConnectionOps(v: ClientVpnConnection): ClientVpnConnectionOps = new ClientVpnConnectionOps(v)

}
