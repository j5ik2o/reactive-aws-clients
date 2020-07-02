// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterInstanceEventNotificationAttributesResponseBuilderOps(
    val self: DeregisterInstanceEventNotificationAttributesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala(
      value: Option[InstanceTagNotificationAttribute]
  ): DeregisterInstanceEventNotificationAttributesResponse.Builder = {
    value.fold(self) { v => self.instanceTagAttribute(v) }
  }

}

final class DeregisterInstanceEventNotificationAttributesResponseOps(
    val self: DeregisterInstanceEventNotificationAttributesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala: Option[InstanceTagNotificationAttribute] = Option(self.instanceTagAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterInstanceEventNotificationAttributesResponseOps {

  implicit def toDeregisterInstanceEventNotificationAttributesResponseBuilderOps(
      v: DeregisterInstanceEventNotificationAttributesResponse.Builder
  ): DeregisterInstanceEventNotificationAttributesResponseBuilderOps =
    new DeregisterInstanceEventNotificationAttributesResponseBuilderOps(v)

  implicit def toDeregisterInstanceEventNotificationAttributesResponseOps(
      v: DeregisterInstanceEventNotificationAttributesResponse
  ): DeregisterInstanceEventNotificationAttributesResponseOps =
    new DeregisterInstanceEventNotificationAttributesResponseOps(v)

}
