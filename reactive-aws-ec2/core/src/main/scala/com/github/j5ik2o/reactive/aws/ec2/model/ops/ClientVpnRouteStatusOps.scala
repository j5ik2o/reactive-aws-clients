// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnRouteStatusBuilderOps(val self: ClientVpnRouteStatus.Builder) extends AnyVal {

  final def codeAsScala(value: Option[ClientVpnRouteStatusCode]): ClientVpnRouteStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): ClientVpnRouteStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class ClientVpnRouteStatusOps(val self: ClientVpnRouteStatus) extends AnyVal {

  final def codeAsScala: Option[ClientVpnRouteStatusCode] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnRouteStatusOps {

  implicit def toClientVpnRouteStatusBuilderOps(v: ClientVpnRouteStatus.Builder): ClientVpnRouteStatusBuilderOps =
    new ClientVpnRouteStatusBuilderOps(v)

  implicit def toClientVpnRouteStatusOps(v: ClientVpnRouteStatus): ClientVpnRouteStatusOps =
    new ClientVpnRouteStatusOps(v)

}
