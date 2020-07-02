// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteTablePropagationBuilderOps(val self: TransitGatewayRouteTablePropagation.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v => self.transitGatewayAttachmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v => self.resourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayPropagationState]): TransitGatewayRouteTablePropagation.Builder = {
    value.fold(self) { v => self.state(v) }
  }

}

final class TransitGatewayRouteTablePropagationOps(val self: TransitGatewayRouteTablePropagation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
