// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LocalGatewayRouteTableBuilderOps(val self: LocalGatewayRouteTable.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala(value: Option[String]): LocalGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.localGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala(value: Option[String]): LocalGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.localGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala(value: Option[String]): LocalGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.outpostArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): LocalGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class LocalGatewayRouteTableOps(val self: LocalGatewayRouteTable) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableIdAsScala: Option[String] = Option(self.localGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayIdAsScala: Option[String] = Option(self.localGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outpostArnAsScala: Option[String] = Option(self.outpostArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLocalGatewayRouteTableOps {

  implicit def toLocalGatewayRouteTableBuilderOps(v: LocalGatewayRouteTable.Builder): LocalGatewayRouteTableBuilderOps =
    new LocalGatewayRouteTableBuilderOps(v)

  implicit def toLocalGatewayRouteTableOps(v: LocalGatewayRouteTable): LocalGatewayRouteTableOps =
    new LocalGatewayRouteTableOps(v)

}
