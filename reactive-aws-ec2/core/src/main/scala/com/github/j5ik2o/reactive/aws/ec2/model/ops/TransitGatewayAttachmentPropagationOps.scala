// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayAttachmentPropagationBuilderOps(val self: TransitGatewayAttachmentPropagation.Builder)
    extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayAttachmentPropagation.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayPropagationState]): TransitGatewayAttachmentPropagation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class TransitGatewayAttachmentPropagationOps(val self: TransitGatewayAttachmentPropagation) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def stateAsScala: Option[TransitGatewayPropagationState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayAttachmentPropagationOps {

  implicit def toTransitGatewayAttachmentPropagationBuilderOps(
      v: TransitGatewayAttachmentPropagation.Builder
  ): TransitGatewayAttachmentPropagationBuilderOps = new TransitGatewayAttachmentPropagationBuilderOps(v)

  implicit def toTransitGatewayAttachmentPropagationOps(
      v: TransitGatewayAttachmentPropagation
  ): TransitGatewayAttachmentPropagationOps = new TransitGatewayAttachmentPropagationOps(v)

}
