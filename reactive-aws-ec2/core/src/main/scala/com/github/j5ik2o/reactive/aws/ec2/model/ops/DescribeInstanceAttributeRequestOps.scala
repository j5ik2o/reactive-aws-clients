// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceAttributeRequestBuilderOps(val self: DescribeInstanceAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[InstanceAttributeName]): DescribeInstanceAttributeRequest.Builder = {
    value.fold(self) { v => self.attribute(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): DescribeInstanceAttributeRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

}

final class DescribeInstanceAttributeRequestOps(val self: DescribeInstanceAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[InstanceAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceAttributeRequestOps {

  implicit def toDescribeInstanceAttributeRequestBuilderOps(
      v: DescribeInstanceAttributeRequest.Builder
  ): DescribeInstanceAttributeRequestBuilderOps = new DescribeInstanceAttributeRequestBuilderOps(v)

  implicit def toDescribeInstanceAttributeRequestOps(
      v: DescribeInstanceAttributeRequest
  ): DescribeInstanceAttributeRequestOps = new DescribeInstanceAttributeRequestOps(v)

}
