// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteBuilderOps(val self: Route.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationIpv6CidrBlockAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.destinationIpv6CidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationPrefixListIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.destinationPrefixListId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.egressOnlyInternetGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.gatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceOwnerIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.instanceOwnerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def natGatewayIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.natGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.localGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.networkInterfaceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def originAsScala(value: Option[RouteOrigin]): Route.Builder = {
            value.fold(self){ v => self.origin(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[RouteState]): Route.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionIdAsScala(value: Option[String]): Route.Builder = {
            value.fold(self){ v => self.vpcPeeringConnectionId(v) }
            } 


}

final class RouteOps(val self: Route) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationIpv6CidrBlockAsScala: Option[String] = Option(self.destinationIpv6CidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationPrefixListIdAsScala: Option[String] = Option(self.destinationPrefixListId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def gatewayIdAsScala: Option[String] = Option(self.gatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceOwnerIdAsScala: Option[String] = Option(self.instanceOwnerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def originAsScala: Option[RouteOrigin] = Option(self.origin) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[RouteState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteOps {

implicit def toRouteBuilderOps(v: Route.Builder): RouteBuilderOps = new RouteBuilderOps(v)

implicit def toRouteOps(v: Route): RouteOps = new RouteOps(v)

}

