// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EnableTransitGatewayRouteTablePropagationRequestBuilderOps(
    val self: EnableTransitGatewayRouteTablePropagationRequest.Builder
) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(
      value: Option[String]
  ): EnableTransitGatewayRouteTablePropagationRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): EnableTransitGatewayRouteTablePropagationRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class EnableTransitGatewayRouteTablePropagationRequestOps(
    val self: EnableTransitGatewayRouteTablePropagationRequest
) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnableTransitGatewayRouteTablePropagationRequestOps {

  implicit def toEnableTransitGatewayRouteTablePropagationRequestBuilderOps(
      v: EnableTransitGatewayRouteTablePropagationRequest.Builder
  ): EnableTransitGatewayRouteTablePropagationRequestBuilderOps =
    new EnableTransitGatewayRouteTablePropagationRequestBuilderOps(v)

  implicit def toEnableTransitGatewayRouteTablePropagationRequestOps(
      v: EnableTransitGatewayRouteTablePropagationRequest
  ): EnableTransitGatewayRouteTablePropagationRequestOps = new EnableTransitGatewayRouteTablePropagationRequestOps(v)

}
