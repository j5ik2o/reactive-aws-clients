// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ClientVpnAuthorizationRuleStatusBuilderOps(val self: ClientVpnAuthorizationRuleStatus.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(
      value: Option[ClientVpnAuthorizationRuleStatusCode]
  ): ClientVpnAuthorizationRuleStatus.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): ClientVpnAuthorizationRuleStatus.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class ClientVpnAuthorizationRuleStatusOps(val self: ClientVpnAuthorizationRuleStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[ClientVpnAuthorizationRuleStatusCode] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClientVpnAuthorizationRuleStatusOps {

  implicit def toClientVpnAuthorizationRuleStatusBuilderOps(
      v: ClientVpnAuthorizationRuleStatus.Builder
  ): ClientVpnAuthorizationRuleStatusBuilderOps = new ClientVpnAuthorizationRuleStatusBuilderOps(v)

  implicit def toClientVpnAuthorizationRuleStatusOps(
      v: ClientVpnAuthorizationRuleStatus
  ): ClientVpnAuthorizationRuleStatusOps = new ClientVpnAuthorizationRuleStatusOps(v)

}
