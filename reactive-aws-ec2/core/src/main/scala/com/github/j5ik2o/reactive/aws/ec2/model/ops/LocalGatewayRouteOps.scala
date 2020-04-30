// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayRouteBuilderOps(val self: LocalGatewayRoute.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala(value: Option[String]): LocalGatewayRoute.Builder = {
            value.fold(self){ v => self.destinationCidrBlock(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayVirtualInterfaceGroupIdAsScala(value: Option[String]): LocalGatewayRoute.Builder = {
            value.fold(self){ v => self.localGatewayVirtualInterfaceGroupId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[LocalGatewayRouteType]): LocalGatewayRoute.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[LocalGatewayRouteState]): LocalGatewayRoute.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTableIdAsScala(value: Option[String]): LocalGatewayRoute.Builder = {
            value.fold(self){ v => self.localGatewayRouteTableId(v) }
            } 


}

final class LocalGatewayRouteOps(val self: LocalGatewayRoute) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayVirtualInterfaceGroupIdAsScala: Option[String] = Option(self.localGatewayVirtualInterfaceGroupId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[LocalGatewayRouteType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[LocalGatewayRouteState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayRouteOps {

implicit def toLocalGatewayRouteBuilderOps(v: LocalGatewayRoute.Builder): LocalGatewayRouteBuilderOps = new LocalGatewayRouteBuilderOps(v)

implicit def toLocalGatewayRouteOps(v: LocalGatewayRoute): LocalGatewayRouteOps = new LocalGatewayRouteOps(v)

}

