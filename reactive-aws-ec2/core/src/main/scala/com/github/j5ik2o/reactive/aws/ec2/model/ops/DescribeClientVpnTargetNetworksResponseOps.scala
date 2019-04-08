// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnTargetNetworksResponseBuilderOps(val self: DescribeClientVpnTargetNetworksResponse.Builder)
    extends AnyVal {

  final def clientVpnTargetNetworksAsScala(
      value: Option[Seq[TargetNetwork]]
  ): DescribeClientVpnTargetNetworksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clientVpnTargetNetworks(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnTargetNetworksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnTargetNetworksResponseOps(val self: DescribeClientVpnTargetNetworksResponse)
    extends AnyVal {

  final def clientVpnTargetNetworksAsScala: Option[Seq[TargetNetwork]] = Option(self.clientVpnTargetNetworks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnTargetNetworksResponseOps {

  implicit def toDescribeClientVpnTargetNetworksResponseBuilderOps(
      v: DescribeClientVpnTargetNetworksResponse.Builder
  ): DescribeClientVpnTargetNetworksResponseBuilderOps = new DescribeClientVpnTargetNetworksResponseBuilderOps(v)

  implicit def toDescribeClientVpnTargetNetworksResponseOps(
      v: DescribeClientVpnTargetNetworksResponse
  ): DescribeClientVpnTargetNetworksResponseOps = new DescribeClientVpnTargetNetworksResponseOps(v)

}
