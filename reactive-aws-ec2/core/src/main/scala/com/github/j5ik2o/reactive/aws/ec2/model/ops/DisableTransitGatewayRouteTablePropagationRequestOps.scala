// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisableTransitGatewayRouteTablePropagationRequestBuilderOps(
    val self: DisableTransitGatewayRouteTablePropagationRequest.Builder
) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(
      value: Option[String]
  ): DisableTransitGatewayRouteTablePropagationRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): DisableTransitGatewayRouteTablePropagationRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class DisableTransitGatewayRouteTablePropagationRequestOps(
    val self: DisableTransitGatewayRouteTablePropagationRequest
) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableTransitGatewayRouteTablePropagationRequestOps {

  implicit def toDisableTransitGatewayRouteTablePropagationRequestBuilderOps(
      v: DisableTransitGatewayRouteTablePropagationRequest.Builder
  ): DisableTransitGatewayRouteTablePropagationRequestBuilderOps =
    new DisableTransitGatewayRouteTablePropagationRequestBuilderOps(v)

  implicit def toDisableTransitGatewayRouteTablePropagationRequestOps(
      v: DisableTransitGatewayRouteTablePropagationRequest
  ): DisableTransitGatewayRouteTablePropagationRequestOps = new DisableTransitGatewayRouteTablePropagationRequestOps(v)

}
