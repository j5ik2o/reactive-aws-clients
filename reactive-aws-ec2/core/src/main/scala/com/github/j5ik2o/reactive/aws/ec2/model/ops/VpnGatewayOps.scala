// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpnGatewayBuilderOps(val self: VpnGateway.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): VpnGateway.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[VpnState]): VpnGateway.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[GatewayType]): VpnGateway.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcAttachmentsAsScala(value: Option[Seq[VpcAttachment]]): VpnGateway.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcAttachments(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala(value: Option[String]): VpnGateway.Builder = {
            value.fold(self){ v => self.vpnGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def amazonSideAsnAsScala(value: Option[Long]): VpnGateway.Builder = {
            value.fold(self){ v => self.amazonSideAsn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): VpnGateway.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class VpnGatewayOps(val self: VpnGateway) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[VpnState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[GatewayType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vpcAttachmentsAsScala: Option[Seq[VpcAttachment]] = Option(self.vpcAttachments).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpnGatewayIdAsScala: Option[String] = Option(self.vpnGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def amazonSideAsnAsScala: Option[Long] = Option(self.amazonSideAsn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpnGatewayOps {

implicit def toVpnGatewayBuilderOps(v: VpnGateway.Builder): VpnGatewayBuilderOps = new VpnGatewayBuilderOps(v)

implicit def toVpnGatewayOps(v: VpnGateway): VpnGatewayOps = new VpnGatewayOps(v)

}

