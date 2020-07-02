// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAttachmentAssociationBuilderOps(val self: TransitGatewayAttachmentAssociation.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayAttachmentAssociation.Builder = {
    value.fold(self) { v => self.transitGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayAssociationState]): TransitGatewayAttachmentAssociation.Builder = {
    value.fold(self) { v => self.state(v) }
  }

}

final class TransitGatewayAttachmentAssociationOps(val self: TransitGatewayAttachmentAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayAssociationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayAttachmentAssociationOps {

  implicit def toTransitGatewayAttachmentAssociationBuilderOps(
      v: TransitGatewayAttachmentAssociation.Builder
  ): TransitGatewayAttachmentAssociationBuilderOps = new TransitGatewayAttachmentAssociationBuilderOps(v)

  implicit def toTransitGatewayAttachmentAssociationOps(
      v: TransitGatewayAttachmentAssociation
  ): TransitGatewayAttachmentAssociationOps = new TransitGatewayAttachmentAssociationOps(v)

}
