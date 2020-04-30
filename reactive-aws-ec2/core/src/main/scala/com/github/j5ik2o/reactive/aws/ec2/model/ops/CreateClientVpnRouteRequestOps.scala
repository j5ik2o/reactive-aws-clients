// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnRouteRequestBuilderOps(val self: CreateClientVpnRouteRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.clientVpnEndpointId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetVpcSubnetIdAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.targetVpcSubnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): CreateClientVpnRouteRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 


}

final class CreateClientVpnRouteRequestOps(val self: CreateClientVpnRouteRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetVpcSubnetIdAsScala: Option[String] = Option(self.targetVpcSubnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnRouteRequestOps {

implicit def toCreateClientVpnRouteRequestBuilderOps(v: CreateClientVpnRouteRequest.Builder): CreateClientVpnRouteRequestBuilderOps = new CreateClientVpnRouteRequestBuilderOps(v)

implicit def toCreateClientVpnRouteRequestOps(v: CreateClientVpnRouteRequest): CreateClientVpnRouteRequestOps = new CreateClientVpnRouteRequestOps(v)

}

