// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnConnectionResponseBuilderOps(val self: ModifyVpnConnectionResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala(value: Option[VpnConnection]): ModifyVpnConnectionResponse.Builder = {
            value.fold(self){ v => self.vpnConnection(v) }
            } 


}

final class ModifyVpnConnectionResponseOps(val self: ModifyVpnConnectionResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala: Option[VpnConnection] = Option(self.vpnConnection) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnConnectionResponseOps {

implicit def toModifyVpnConnectionResponseBuilderOps(v: ModifyVpnConnectionResponse.Builder): ModifyVpnConnectionResponseBuilderOps = new ModifyVpnConnectionResponseBuilderOps(v)

implicit def toModifyVpnConnectionResponseOps(v: ModifyVpnConnectionResponse): ModifyVpnConnectionResponseOps = new ModifyVpnConnectionResponseOps(v)

}

