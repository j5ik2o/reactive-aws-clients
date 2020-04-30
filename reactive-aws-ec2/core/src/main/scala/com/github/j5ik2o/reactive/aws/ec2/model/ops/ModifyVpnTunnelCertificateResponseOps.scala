// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnTunnelCertificateResponseBuilderOps(val self: ModifyVpnTunnelCertificateResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala(value: Option[VpnConnection]): ModifyVpnTunnelCertificateResponse.Builder = {
            value.fold(self){ v => self.vpnConnection(v) }
            } 


}

final class ModifyVpnTunnelCertificateResponseOps(val self: ModifyVpnTunnelCertificateResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionAsScala: Option[VpnConnection] = Option(self.vpnConnection) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnTunnelCertificateResponseOps {

implicit def toModifyVpnTunnelCertificateResponseBuilderOps(v: ModifyVpnTunnelCertificateResponse.Builder): ModifyVpnTunnelCertificateResponseBuilderOps = new ModifyVpnTunnelCertificateResponseBuilderOps(v)

implicit def toModifyVpnTunnelCertificateResponseOps(v: ModifyVpnTunnelCertificateResponse): ModifyVpnTunnelCertificateResponseOps = new ModifyVpnTunnelCertificateResponseOps(v)

}

