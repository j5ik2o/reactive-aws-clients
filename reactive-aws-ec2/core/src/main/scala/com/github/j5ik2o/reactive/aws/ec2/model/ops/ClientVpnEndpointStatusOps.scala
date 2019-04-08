// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnEndpointStatusBuilderOps(val self: ClientVpnEndpointStatus.Builder) extends AnyVal {

  final def codeAsScala(value: Option[ClientVpnEndpointStatusCode]): ClientVpnEndpointStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def messageAsScala(value: Option[String]): ClientVpnEndpointStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class ClientVpnEndpointStatusOps(val self: ClientVpnEndpointStatus) extends AnyVal {

  final def codeAsScala: Option[ClientVpnEndpointStatusCode] = Option(self.code)

  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnEndpointStatusOps {

  implicit def toClientVpnEndpointStatusBuilderOps(
      v: ClientVpnEndpointStatus.Builder
  ): ClientVpnEndpointStatusBuilderOps = new ClientVpnEndpointStatusBuilderOps(v)

  implicit def toClientVpnEndpointStatusOps(v: ClientVpnEndpointStatus): ClientVpnEndpointStatusOps =
    new ClientVpnEndpointStatusOps(v)

}
