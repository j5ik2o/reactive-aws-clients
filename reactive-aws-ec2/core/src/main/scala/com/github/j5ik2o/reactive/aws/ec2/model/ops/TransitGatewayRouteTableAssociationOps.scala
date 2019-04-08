// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteTableAssociationBuilderOps(val self: TransitGatewayRouteTableAssociation.Builder)
    extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayRouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): TransitGatewayRouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayRouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayAssociationState]): TransitGatewayRouteTableAssociation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayRouteTableAssociationOps(val self: TransitGatewayRouteTableAssociation) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  final def stateAsScala: Option[TransitGatewayAssociationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteTableAssociationOps {

  implicit def toTransitGatewayRouteTableAssociationBuilderOps(
      v: TransitGatewayRouteTableAssociation.Builder
  ): TransitGatewayRouteTableAssociationBuilderOps = new TransitGatewayRouteTableAssociationBuilderOps(v)

  implicit def toTransitGatewayRouteTableAssociationOps(
      v: TransitGatewayRouteTableAssociation
  ): TransitGatewayRouteTableAssociationOps = new TransitGatewayRouteTableAssociationOps(v)

}
