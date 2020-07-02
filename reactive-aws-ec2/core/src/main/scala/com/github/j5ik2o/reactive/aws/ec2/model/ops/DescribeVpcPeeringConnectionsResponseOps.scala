// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcPeeringConnectionsResponseBuilderOps(val self: DescribeVpcPeeringConnectionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionsAsScala(
      value: Option[Seq[VpcPeeringConnection]]
  ): DescribeVpcPeeringConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcPeeringConnections(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVpcPeeringConnectionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeVpcPeeringConnectionsResponseOps(val self: DescribeVpcPeeringConnectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionsAsScala: Option[Seq[VpcPeeringConnection]] =
    Option(self.vpcPeeringConnections).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcPeeringConnectionsResponseOps {

  implicit def toDescribeVpcPeeringConnectionsResponseBuilderOps(
      v: DescribeVpcPeeringConnectionsResponse.Builder
  ): DescribeVpcPeeringConnectionsResponseBuilderOps = new DescribeVpcPeeringConnectionsResponseBuilderOps(v)

  implicit def toDescribeVpcPeeringConnectionsResponseOps(
      v: DescribeVpcPeeringConnectionsResponse
  ): DescribeVpcPeeringConnectionsResponseOps = new DescribeVpcPeeringConnectionsResponseOps(v)

}
