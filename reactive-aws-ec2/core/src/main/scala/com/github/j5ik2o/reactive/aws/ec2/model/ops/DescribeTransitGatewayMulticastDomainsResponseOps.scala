// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayMulticastDomainsResponseBuilderOps(
    val self: DescribeTransitGatewayMulticastDomainsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainsAsScala(
      value: Option[Seq[TransitGatewayMulticastDomain]]
  ): DescribeTransitGatewayMulticastDomainsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayMulticastDomains(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayMulticastDomainsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeTransitGatewayMulticastDomainsResponseOps(val self: DescribeTransitGatewayMulticastDomainsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayMulticastDomainsAsScala: Option[Seq[TransitGatewayMulticastDomain]] =
    Option(self.transitGatewayMulticastDomains).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayMulticastDomainsResponseOps {

  implicit def toDescribeTransitGatewayMulticastDomainsResponseBuilderOps(
      v: DescribeTransitGatewayMulticastDomainsResponse.Builder
  ): DescribeTransitGatewayMulticastDomainsResponseBuilderOps =
    new DescribeTransitGatewayMulticastDomainsResponseBuilderOps(v)

  implicit def toDescribeTransitGatewayMulticastDomainsResponseOps(
      v: DescribeTransitGatewayMulticastDomainsResponse
  ): DescribeTransitGatewayMulticastDomainsResponseOps = new DescribeTransitGatewayMulticastDomainsResponseOps(v)

}
