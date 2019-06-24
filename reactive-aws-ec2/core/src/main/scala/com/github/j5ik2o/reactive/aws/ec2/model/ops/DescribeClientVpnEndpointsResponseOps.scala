// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnEndpointsResponseBuilderOps(val self: DescribeClientVpnEndpointsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointsAsScala(
      value: Option[Seq[ClientVpnEndpoint]]
  ): DescribeClientVpnEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clientVpnEndpoints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnEndpointsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnEndpointsResponseOps(val self: DescribeClientVpnEndpointsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointsAsScala: Option[Seq[ClientVpnEndpoint]] = Option(self.clientVpnEndpoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnEndpointsResponseOps {

  implicit def toDescribeClientVpnEndpointsResponseBuilderOps(
      v: DescribeClientVpnEndpointsResponse.Builder
  ): DescribeClientVpnEndpointsResponseBuilderOps = new DescribeClientVpnEndpointsResponseBuilderOps(v)

  implicit def toDescribeClientVpnEndpointsResponseOps(
      v: DescribeClientVpnEndpointsResponse
  ): DescribeClientVpnEndpointsResponseOps = new DescribeClientVpnEndpointsResponseOps(v)

}
