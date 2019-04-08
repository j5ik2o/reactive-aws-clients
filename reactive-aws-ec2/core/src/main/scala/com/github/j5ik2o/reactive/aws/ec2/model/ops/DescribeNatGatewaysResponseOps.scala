// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNatGatewaysResponseBuilderOps(val self: DescribeNatGatewaysResponse.Builder) extends AnyVal {

  final def natGatewaysAsScala(value: Option[Seq[NatGateway]]): DescribeNatGatewaysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.natGateways(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeNatGatewaysResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeNatGatewaysResponseOps(val self: DescribeNatGatewaysResponse) extends AnyVal {

  final def natGatewaysAsScala: Option[Seq[NatGateway]] = Option(self.natGateways).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNatGatewaysResponseOps {

  implicit def toDescribeNatGatewaysResponseBuilderOps(
      v: DescribeNatGatewaysResponse.Builder
  ): DescribeNatGatewaysResponseBuilderOps = new DescribeNatGatewaysResponseBuilderOps(v)

  implicit def toDescribeNatGatewaysResponseOps(v: DescribeNatGatewaysResponse): DescribeNatGatewaysResponseOps =
    new DescribeNatGatewaysResponseOps(v)

}
