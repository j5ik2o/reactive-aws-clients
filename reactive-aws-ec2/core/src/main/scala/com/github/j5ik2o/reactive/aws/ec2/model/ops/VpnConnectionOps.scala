// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnConnectionBuilderOps(val self: VpnConnection.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayConfigurationAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.customerGatewayConfiguration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.customerGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def categoryAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.category(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[VpnState]): VpnConnection.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[GatewayType]): VpnConnection.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.vpnConnectionId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.vpnGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): VpnConnection.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionsAsScala(value: Option[VpnConnectionOptions]): VpnConnection.Builder = {
            value.fold(self){ v => self.options(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routesAsScala(value: Option[Seq[VpnStaticRoute]]): VpnConnection.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): VpnConnection.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vgwTelemetryAsScala(value: Option[Seq[VgwTelemetry]]): VpnConnection.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vgwTelemetry(v.asJava) } 
            }


}

final class VpnConnectionOps(val self: VpnConnection) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayConfigurationAsScala: Option[String] = Option(self.customerGatewayConfiguration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def categoryAsScala: Option[String] = Option(self.category) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[VpnState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[GatewayType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnConnectionIdAsScala: Option[String] = Option(self.vpnConnectionId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionsAsScala: Option[VpnConnectionOptions] = Option(self.options) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def routesAsScala: Option[Seq[VpnStaticRoute]] = Option(self.routes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vgwTelemetryAsScala: Option[Seq[VgwTelemetry]] = Option(self.vgwTelemetry).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnConnectionOps {

implicit def toVpnConnectionBuilderOps(v: VpnConnection.Builder): VpnConnectionBuilderOps = new VpnConnectionBuilderOps(v)

implicit def toVpnConnectionOps(v: VpnConnection): VpnConnectionOps = new VpnConnectionOps(v)

}

