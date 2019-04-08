// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizeClientVpnIngressResponseBuilderOps(val self: AuthorizeClientVpnIngressResponse.Builder)
    extends AnyVal {

  final def statusAsScala(
      value: Option[ClientVpnAuthorizationRuleStatus]
  ): AuthorizeClientVpnIngressResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AuthorizeClientVpnIngressResponseOps(val self: AuthorizeClientVpnIngressResponse) extends AnyVal {

  final def statusAsScala: Option[ClientVpnAuthorizationRuleStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizeClientVpnIngressResponseOps {

  implicit def toAuthorizeClientVpnIngressResponseBuilderOps(
      v: AuthorizeClientVpnIngressResponse.Builder
  ): AuthorizeClientVpnIngressResponseBuilderOps = new AuthorizeClientVpnIngressResponseBuilderOps(v)

  implicit def toAuthorizeClientVpnIngressResponseOps(
      v: AuthorizeClientVpnIngressResponse
  ): AuthorizeClientVpnIngressResponseOps = new AuthorizeClientVpnIngressResponseOps(v)

}
