// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnConnectionStatusBuilderOps(val self: ClientVpnConnectionStatus.Builder) extends AnyVal {

  final def codeAsScala(value: Option[ClientVpnConnectionStatusCode]): ClientVpnConnectionStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): ClientVpnConnectionStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class ClientVpnConnectionStatusOps(val self: ClientVpnConnectionStatus) extends AnyVal {

  final def codeAsScala: Option[ClientVpnConnectionStatusCode] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnConnectionStatusOps {

  implicit def toClientVpnConnectionStatusBuilderOps(
      v: ClientVpnConnectionStatus.Builder
  ): ClientVpnConnectionStatusBuilderOps = new ClientVpnConnectionStatusBuilderOps(v)

  implicit def toClientVpnConnectionStatusOps(v: ClientVpnConnectionStatus): ClientVpnConnectionStatusOps =
    new ClientVpnConnectionStatusOps(v)

}
