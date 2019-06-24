// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayRouteTablesResponseBuilderOps(
    val self: DescribeTransitGatewayRouteTablesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTablesAsScala(
      value: Option[Seq[TransitGatewayRouteTable]]
  ): DescribeTransitGatewayRouteTablesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayRouteTables(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayRouteTablesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayRouteTablesResponseOps(val self: DescribeTransitGatewayRouteTablesResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTablesAsScala: Option[Seq[TransitGatewayRouteTable]] =
    Option(self.transitGatewayRouteTables).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayRouteTablesResponseOps {

  implicit def toDescribeTransitGatewayRouteTablesResponseBuilderOps(
      v: DescribeTransitGatewayRouteTablesResponse.Builder
  ): DescribeTransitGatewayRouteTablesResponseBuilderOps = new DescribeTransitGatewayRouteTablesResponseBuilderOps(v)

  implicit def toDescribeTransitGatewayRouteTablesResponseOps(
      v: DescribeTransitGatewayRouteTablesResponse
  ): DescribeTransitGatewayRouteTablesResponseOps = new DescribeTransitGatewayRouteTablesResponseOps(v)

}
