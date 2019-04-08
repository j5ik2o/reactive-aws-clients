// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAttachmentAssociationBuilderOps(val self: TransitGatewayAttachmentAssociation.Builder)
    extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayAttachmentAssociation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayAssociationState]): TransitGatewayAttachmentAssociation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayAttachmentAssociationOps(val self: TransitGatewayAttachmentAssociation) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

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
