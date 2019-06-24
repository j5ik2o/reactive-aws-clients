// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAssociationBuilderOps(val self: TransitGatewayAssociation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayAssociation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayAssociation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayAssociation.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayAssociation.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayAssociationState]): TransitGatewayAssociation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayAssociationOps(val self: TransitGatewayAssociation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayAssociationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayAssociationOps {

  implicit def toTransitGatewayAssociationBuilderOps(
      v: TransitGatewayAssociation.Builder
  ): TransitGatewayAssociationBuilderOps = new TransitGatewayAssociationBuilderOps(v)

  implicit def toTransitGatewayAssociationOps(v: TransitGatewayAssociation): TransitGatewayAssociationOps =
    new TransitGatewayAssociationOps(v)

}
