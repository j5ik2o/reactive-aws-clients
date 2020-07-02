// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceEventNotificationAttributesResponseBuilderOps(
    val self: DescribeInstanceEventNotificationAttributesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala(
      value: Option[InstanceTagNotificationAttribute]
  ): DescribeInstanceEventNotificationAttributesResponse.Builder = {
    value.fold(self) { v => self.instanceTagAttribute(v) }
  }

}

final class DescribeInstanceEventNotificationAttributesResponseOps(
    val self: DescribeInstanceEventNotificationAttributesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala: Option[InstanceTagNotificationAttribute] = Option(self.instanceTagAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceEventNotificationAttributesResponseOps {

  implicit def toDescribeInstanceEventNotificationAttributesResponseBuilderOps(
      v: DescribeInstanceEventNotificationAttributesResponse.Builder
  ): DescribeInstanceEventNotificationAttributesResponseBuilderOps =
    new DescribeInstanceEventNotificationAttributesResponseBuilderOps(v)

  implicit def toDescribeInstanceEventNotificationAttributesResponseOps(
      v: DescribeInstanceEventNotificationAttributesResponse
  ): DescribeInstanceEventNotificationAttributesResponseOps =
    new DescribeInstanceEventNotificationAttributesResponseOps(v)

}
