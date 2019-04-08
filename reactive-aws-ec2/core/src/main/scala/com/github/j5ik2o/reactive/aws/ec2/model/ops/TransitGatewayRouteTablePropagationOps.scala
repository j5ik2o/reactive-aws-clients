// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteTablePropagationBuilderOps(val self: TransitGatewayRouteTablePropagation.Builder)
    extends AnyVal {

  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayPropagationState]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayRouteTablePropagationOps(val self: TransitGatewayRouteTablePropagation) extends AnyVal {

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  final def stateAsScala: Option[TransitGatewayPropagationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteTablePropagationOps {

  implicit def toTransitGatewayRouteTablePropagationBuilderOps(
      v: TransitGatewayRouteTablePropagation.Builder
  ): TransitGatewayRouteTablePropagationBuilderOps = new TransitGatewayRouteTablePropagationBuilderOps(v)

  implicit def toTransitGatewayRouteTablePropagationOps(
      v: TransitGatewayRouteTablePropagation
  ): TransitGatewayRouteTablePropagationOps = new TransitGatewayRouteTablePropagationOps(v)

}
