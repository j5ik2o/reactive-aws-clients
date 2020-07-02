// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayPropagationBuilderOps(val self: TransitGatewayPropagation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v => self.transitGatewayAttachmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v => self.resourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(
      value: Option[TransitGatewayAttachmentResourceType]
  ): TransitGatewayPropagation.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v => self.transitGatewayRouteTableId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[TransitGatewayPropagationState]): TransitGatewayPropagation.Builder = {
    value.fold(self) { v => self.state(v) }
  }

}

final class TransitGatewayPropagationOps(val self: TransitGatewayPropagation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[TransitGatewayAttachmentResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[TransitGatewayPropagationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayPropagationOps {

  implicit def toTransitGatewayPropagationBuilderOps(
      v: TransitGatewayPropagation.Builder
  ): TransitGatewayPropagationBuilderOps = new TransitGatewayPropagationBuilderOps(v)

  implicit def toTransitGatewayPropagationOps(v: TransitGatewayPropagation): TransitGatewayPropagationOps =
    new TransitGatewayPropagationOps(v)

}
