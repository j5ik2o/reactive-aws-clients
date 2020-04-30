// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteClientVpnRouteRequestBuilderOps(val self: DeleteClientVpnRouteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala(value: Option[String]): DeleteClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.clientVpnEndpointId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetVpcSubnetIdAsScala(value: Option[String]): DeleteClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.targetVpcSubnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): DeleteClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 


}

final class DeleteClientVpnRouteRequestOps(val self: DeleteClientVpnRouteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetVpcSubnetIdAsScala: Option[String] = Option(self.targetVpcSubnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClientVpnRouteRequestOps {

implicit def toDeleteClientVpnRouteRequestBuilderOps(v: DeleteClientVpnRouteRequest.Builder): DeleteClientVpnRouteRequestBuilderOps = new DeleteClientVpnRouteRequestBuilderOps(v)

implicit def toDeleteClientVpnRouteRequestOps(v: DeleteClientVpnRouteRequest): DeleteClientVpnRouteRequestOps = new DeleteClientVpnRouteRequestOps(v)

}

