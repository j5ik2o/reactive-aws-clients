// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpnConnectionResponseBuilderOps(val self: CreateVpnConnectionResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala(value: Option[VpnConnection]): CreateVpnConnectionResponse.Builder = {
            value.fold(self){ v => self.vpnConnection(v) }
            } 


}

final class CreateVpnConnectionResponseOps(val self: CreateVpnConnectionResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala: Option[VpnConnection] = Option(self.vpnConnection) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpnConnectionResponseOps {

implicit def toCreateVpnConnectionResponseBuilderOps(v: CreateVpnConnectionResponse.Builder): CreateVpnConnectionResponseBuilderOps = new CreateVpnConnectionResponseBuilderOps(v)

implicit def toCreateVpnConnectionResponseOps(v: CreateVpnConnectionResponse): CreateVpnConnectionResponseOps = new CreateVpnConnectionResponseOps(v)

}

