// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnTargetNetworksResponseBuilderOps(val self: DescribeClientVpnTargetNetworksResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnTargetNetworksAsScala(
      value: Option[Seq[TargetNetwork]]
  ): DescribeClientVpnTargetNetworksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.clientVpnTargetNetworks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnTargetNetworksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeClientVpnTargetNetworksResponseOps(val self: DescribeClientVpnTargetNetworksResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnTargetNetworksAsScala: Option[Seq[TargetNetwork]] = Option(self.clientVpnTargetNetworks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
