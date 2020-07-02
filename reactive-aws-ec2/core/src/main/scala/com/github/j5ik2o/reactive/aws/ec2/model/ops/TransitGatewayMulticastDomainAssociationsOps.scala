// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayMulticastDomainAssociationsBuilderOps(
    val self: TransitGatewayMulticastDomainAssociations.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastDomainAssociations.Builder = {
    value.fold(self) { v => self.transitGatewayMulticastDomainId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): TransitGatewayMulticastDomainAssociations.Builder = {
    value.fold(self) { v => self.transitGatewayAttachmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayMulticastDomainAssociations.Builder = {
    value.fold(self) { v => self.resourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayMulticastDomainAssociations.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala(value: Option[Seq[SubnetAssociation]]): TransitGatewayMulticastDomainAssociations.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnets(v.asJava)
    }
  }

}

final class TransitGatewayMulticastDomainAssociationsOps(val self: TransitGatewayMulticastDomainAssociations)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainIdAsScala: Option[String] = Option(self.transitGatewayMulticastDomainId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala: Option[Seq[SubnetAssociation]] =
    Option(self.subnets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayMulticastDomainAssociationsOps {

  implicit def toTransitGatewayMulticastDomainAssociationsBuilderOps(
      v: TransitGatewayMulticastDomainAssociations.Builder
  ): TransitGatewayMulticastDomainAssociationsBuilderOps = new TransitGatewayMulticastDomainAssociationsBuilderOps(v)

  implicit def toTransitGatewayMulticastDomainAssociationsOps(
      v: TransitGatewayMulticastDomainAssociations
  ): TransitGatewayMulticastDomainAssociationsOps = new TransitGatewayMulticastDomainAssociationsOps(v)

}
