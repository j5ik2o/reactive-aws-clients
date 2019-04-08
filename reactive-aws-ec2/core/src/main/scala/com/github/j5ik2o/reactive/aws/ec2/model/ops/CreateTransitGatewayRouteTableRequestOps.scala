// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRouteTableRequestBuilderOps(val self: CreateTransitGatewayRouteTableRequest.Builder)
    extends AnyVal {

  final def transitGatewayIdAsScala(value: Option[String]): CreateTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateTransitGatewayRouteTableRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateTransitGatewayRouteTableRequestOps(val self: CreateTransitGatewayRouteTableRequest) extends AnyVal {

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRouteTableRequestOps {

  implicit def toCreateTransitGatewayRouteTableRequestBuilderOps(
      v: CreateTransitGatewayRouteTableRequest.Builder
  ): CreateTransitGatewayRouteTableRequestBuilderOps = new CreateTransitGatewayRouteTableRequestBuilderOps(v)

  implicit def toCreateTransitGatewayRouteTableRequestOps(
      v: CreateTransitGatewayRouteTableRequest
  ): CreateTransitGatewayRouteTableRequestOps = new CreateTransitGatewayRouteTableRequestOps(v)

}
