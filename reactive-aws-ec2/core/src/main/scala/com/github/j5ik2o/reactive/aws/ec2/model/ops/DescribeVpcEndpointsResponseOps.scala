// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointsResponseBuilderOps(val self: DescribeVpcEndpointsResponse.Builder) extends AnyVal {

  final def vpcEndpointsAsScala(value: Option[Seq[VpcEndpoint]]): DescribeVpcEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.vpcEndpoints(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeVpcEndpointsResponseOps(val self: DescribeVpcEndpointsResponse) extends AnyVal {

  final def vpcEndpointsAsScala: Option[Seq[VpcEndpoint]] = Option(self.vpcEndpoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointsResponseOps {

  implicit def toDescribeVpcEndpointsResponseBuilderOps(
      v: DescribeVpcEndpointsResponse.Builder
  ): DescribeVpcEndpointsResponseBuilderOps = new DescribeVpcEndpointsResponseBuilderOps(v)

  implicit def toDescribeVpcEndpointsResponseOps(v: DescribeVpcEndpointsResponse): DescribeVpcEndpointsResponseOps =
    new DescribeVpcEndpointsResponseOps(v)

}
