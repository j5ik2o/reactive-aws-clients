// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpnConnectionRequestBuilderOps(val self: ModifyVpnConnectionRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala(value: Option[String]): ModifyVpnConnectionRequest.Builder = {
            value.fold(self){ v => self.vpnConnectionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): ModifyVpnConnectionRequest.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayIdAsScala(value: Option[String]): ModifyVpnConnectionRequest.Builder = {
            value.fold(self){ v => self.customerGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala(value: Option[String]): ModifyVpnConnectionRequest.Builder = {
            value.fold(self){ v => self.vpnGatewayId(v) }
            } 


}

final class ModifyVpnConnectionRequestOps(val self: ModifyVpnConnectionRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpnConnectionRequestOps {

implicit def toModifyVpnConnectionRequestBuilderOps(v: ModifyVpnConnectionRequest.Builder): ModifyVpnConnectionRequestBuilderOps = new ModifyVpnConnectionRequestBuilderOps(v)

implicit def toModifyVpnConnectionRequestOps(v: ModifyVpnConnectionRequest): ModifyVpnConnectionRequestOps = new ModifyVpnConnectionRequestOps(v)

}

