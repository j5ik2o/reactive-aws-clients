// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RevokeClientVpnIngressResponseBuilderOps(val self: RevokeClientVpnIngressResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[ClientVpnAuthorizationRuleStatus]): RevokeClientVpnIngressResponse.Builder = {
            value.fold(self){ v => self.status(v) }
            } 


}

final class RevokeClientVpnIngressResponseOps(val self: RevokeClientVpnIngressResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[ClientVpnAuthorizationRuleStatus] = Option(self.status) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRevokeClientVpnIngressResponseOps {

implicit def toRevokeClientVpnIngressResponseBuilderOps(v: RevokeClientVpnIngressResponse.Builder): RevokeClientVpnIngressResponseBuilderOps = new RevokeClientVpnIngressResponseBuilderOps(v)

implicit def toRevokeClientVpnIngressResponseOps(v: RevokeClientVpnIngressResponse): RevokeClientVpnIngressResponseOps = new RevokeClientVpnIngressResponseOps(v)

}

