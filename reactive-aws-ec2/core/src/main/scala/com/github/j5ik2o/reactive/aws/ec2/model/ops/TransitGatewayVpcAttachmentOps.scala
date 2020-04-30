// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayVpcAttachmentBuilderOps(val self: TransitGatewayVpcAttachment.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.transitGatewayId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcOwnerIdAsScala(value: Option[String]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.vpcOwnerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[TransitGatewayAttachmentState]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdsAsScala(value: Option[Seq[String]]): TransitGatewayVpcAttachment.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.creationTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionsAsScala(value: Option[TransitGatewayVpcAttachmentOptions]): TransitGatewayVpcAttachment.Builder = {
            value.fold(self){ v => self.options(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayVpcAttachment.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class TransitGatewayVpcAttachmentOps(val self: TransitGatewayVpcAttachment) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcOwnerIdAsScala: Option[String] = Option(self.vpcOwnerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[TransitGatewayAttachmentState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def optionsAsScala: Option[TransitGatewayVpcAttachmentOptions] = Option(self.options) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayVpcAttachmentOps {

implicit def toTransitGatewayVpcAttachmentBuilderOps(v: TransitGatewayVpcAttachment.Builder): TransitGatewayVpcAttachmentBuilderOps = new TransitGatewayVpcAttachmentBuilderOps(v)

implicit def toTransitGatewayVpcAttachmentOps(v: TransitGatewayVpcAttachment): TransitGatewayVpcAttachmentOps = new TransitGatewayVpcAttachmentOps(v)

}

