// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcAttributeResponseBuilderOps(val self: DescribeVpcAttributeResponse.Builder) extends AnyVal {

  final def vpcIdAsScala(value: Option[String]): DescribeVpcAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def enableDnsHostnamesAsScala(value: Option[AttributeBooleanValue]): DescribeVpcAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.enableDnsHostnames(v)
    }
  }

  final def enableDnsSupportAsScala(value: Option[AttributeBooleanValue]): DescribeVpcAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.enableDnsSupport(v)
    }
  }

}

final class DescribeVpcAttributeResponseOps(val self: DescribeVpcAttributeResponse) extends AnyVal {

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def enableDnsHostnamesAsScala: Option[AttributeBooleanValue] = Option(self.enableDnsHostnames)

  final def enableDnsSupportAsScala: Option[AttributeBooleanValue] = Option(self.enableDnsSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcAttributeResponseOps {

  implicit def toDescribeVpcAttributeResponseBuilderOps(
      v: DescribeVpcAttributeResponse.Builder
  ): DescribeVpcAttributeResponseBuilderOps = new DescribeVpcAttributeResponseBuilderOps(v)

  implicit def toDescribeVpcAttributeResponseOps(v: DescribeVpcAttributeResponse): DescribeVpcAttributeResponseOps =
    new DescribeVpcAttributeResponseOps(v)

}
