// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterInstanceEventNotificationAttributesRequestBuilderOps(
    val self: DeregisterInstanceEventNotificationAttributesRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala(
      value: Option[DeregisterInstanceTagAttributeRequest]
  ): DeregisterInstanceEventNotificationAttributesRequest.Builder = {
    value.fold(self) { v => self.instanceTagAttribute(v) }
  }

}

final class DeregisterInstanceEventNotificationAttributesRequestOps(
    val self: DeregisterInstanceEventNotificationAttributesRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala: Option[DeregisterInstanceTagAttributeRequest] =
    Option(self.instanceTagAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterInstanceEventNotificationAttributesRequestOps {

  implicit def toDeregisterInstanceEventNotificationAttributesRequestBuilderOps(
      v: DeregisterInstanceEventNotificationAttributesRequest.Builder
  ): DeregisterInstanceEventNotificationAttributesRequestBuilderOps =
    new DeregisterInstanceEventNotificationAttributesRequestBuilderOps(v)

  implicit def toDeregisterInstanceEventNotificationAttributesRequestOps(
      v: DeregisterInstanceEventNotificationAttributesRequest
  ): DeregisterInstanceEventNotificationAttributesRequestOps =
    new DeregisterInstanceEventNotificationAttributesRequestOps(v)

}
