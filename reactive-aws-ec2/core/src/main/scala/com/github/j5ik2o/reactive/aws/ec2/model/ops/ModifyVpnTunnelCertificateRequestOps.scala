// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnTunnelCertificateRequestBuilderOps(val self: ModifyVpnTunnelCertificateRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala(value: Option[String]): ModifyVpnTunnelCertificateRequest.Builder = {
            value.fold(self){ v => self.vpnConnectionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnTunnelOutsideIpAddressAsScala(value: Option[String]): ModifyVpnTunnelCertificateRequest.Builder = {
            value.fold(self){ v => self.vpnTunnelOutsideIpAddress(v) }
            } 


}

final class ModifyVpnTunnelCertificateRequestOps(val self: ModifyVpnTunnelCertificateRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnTunnelOutsideIpAddressAsScala: Option[String] = Option(self.vpnTunnelOutsideIpAddress) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnTunnelCertificateRequestOps {

implicit def toModifyVpnTunnelCertificateRequestBuilderOps(v: ModifyVpnTunnelCertificateRequest.Builder): ModifyVpnTunnelCertificateRequestBuilderOps = new ModifyVpnTunnelCertificateRequestBuilderOps(v)

implicit def toModifyVpnTunnelCertificateRequestOps(v: ModifyVpnTunnelCertificateRequest): ModifyVpnTunnelCertificateRequestOps = new ModifyVpnTunnelCertificateRequestOps(v)

}

