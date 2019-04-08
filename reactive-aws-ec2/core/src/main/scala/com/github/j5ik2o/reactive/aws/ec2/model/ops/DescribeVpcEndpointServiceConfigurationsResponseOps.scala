// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServiceConfigurationsResponseBuilderOps(
    val self: DescribeVpcEndpointServiceConfigurationsResponse.Builder
) extends AnyVal {

  final def serviceConfigurationsAsScala(
      value: Option[Seq[ServiceConfiguration]]
  ): DescribeVpcEndpointServiceConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceConfigurations(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServiceConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointServiceConfigurationsResponseOps(
    val self: DescribeVpcEndpointServiceConfigurationsResponse
) extends AnyVal {

  final def serviceConfigurationsAsScala: Option[Seq[ServiceConfiguration]] = Option(self.serviceConfigurations).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServiceConfigurationsResponseOps {

  implicit def toDescribeVpcEndpointServiceConfigurationsResponseBuilderOps(
      v: DescribeVpcEndpointServiceConfigurationsResponse.Builder
  ): DescribeVpcEndpointServiceConfigurationsResponseBuilderOps =
    new DescribeVpcEndpointServiceConfigurationsResponseBuilderOps(v)

  implicit def toDescribeVpcEndpointServiceConfigurationsResponseOps(
      v: DescribeVpcEndpointServiceConfigurationsResponse
  ): DescribeVpcEndpointServiceConfigurationsResponseOps = new DescribeVpcEndpointServiceConfigurationsResponseOps(v)

}
