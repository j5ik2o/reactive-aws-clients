// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcAttributeRequestBuilderOps(val self: DescribeVpcAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[VpcAttributeName]): DescribeVpcAttributeRequest.Builder = {
    value.fold(self) { v => self.attribute(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): DescribeVpcAttributeRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

}

final class DescribeVpcAttributeRequestOps(val self: DescribeVpcAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[VpcAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcAttributeRequestOps {

  implicit def toDescribeVpcAttributeRequestBuilderOps(
      v: DescribeVpcAttributeRequest.Builder
  ): DescribeVpcAttributeRequestBuilderOps = new DescribeVpcAttributeRequestBuilderOps(v)

  implicit def toDescribeVpcAttributeRequestOps(v: DescribeVpcAttributeRequest): DescribeVpcAttributeRequestOps =
    new DescribeVpcAttributeRequestOps(v)

}
