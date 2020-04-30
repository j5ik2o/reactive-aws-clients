// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayPeeringAttachmentBuilderOps(val self: TransitGatewayPeeringAttachment.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.transitGatewayAttachmentId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requesterTgwInfoAsScala(value: Option[PeeringTgwInfo]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.requesterTgwInfo(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accepterTgwInfoAsScala(value: Option[PeeringTgwInfo]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.accepterTgwInfo(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[PeeringAttachmentStatus]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[TransitGatewayAttachmentState]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayPeeringAttachment.Builder = {
            value.fold(self){ v => self.creationTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayPeeringAttachment.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class TransitGatewayPeeringAttachmentOps(val self: TransitGatewayPeeringAttachment) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requesterTgwInfoAsScala: Option[PeeringTgwInfo] = Option(self.requesterTgwInfo) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accepterTgwInfoAsScala: Option[PeeringTgwInfo] = Option(self.accepterTgwInfo) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[PeeringAttachmentStatus] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[TransitGatewayAttachmentState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayPeeringAttachmentOps {

implicit def toTransitGatewayPeeringAttachmentBuilderOps(v: TransitGatewayPeeringAttachment.Builder): TransitGatewayPeeringAttachmentBuilderOps = new TransitGatewayPeeringAttachmentBuilderOps(v)

implicit def toTransitGatewayPeeringAttachmentOps(v: TransitGatewayPeeringAttachment): TransitGatewayPeeringAttachmentOps = new TransitGatewayPeeringAttachmentOps(v)

}

