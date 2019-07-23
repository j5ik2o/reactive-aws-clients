// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateTransitGatewayRouteTableRequestBuilderOps(
    val self: DisassociateTransitGatewayRouteTableRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(
      value: Option[String]
  ): DisassociateTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): DisassociateTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class DisassociateTransitGatewayRouteTableRequestOps(val self: DisassociateTransitGatewayRouteTableRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateTransitGatewayRouteTableRequestOps {

  implicit def toDisassociateTransitGatewayRouteTableRequestBuilderOps(
      v: DisassociateTransitGatewayRouteTableRequest.Builder
  ): DisassociateTransitGatewayRouteTableRequestBuilderOps =
    new DisassociateTransitGatewayRouteTableRequestBuilderOps(v)

  implicit def toDisassociateTransitGatewayRouteTableRequestOps(
      v: DisassociateTransitGatewayRouteTableRequest
  ): DisassociateTransitGatewayRouteTableRequestOps = new DisassociateTransitGatewayRouteTableRequestOps(v)

}
