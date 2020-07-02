// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterInstanceEventNotificationAttributesResponseBuilderOps(
    val self: RegisterInstanceEventNotificationAttributesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala(
      value: Option[InstanceTagNotificationAttribute]
  ): RegisterInstanceEventNotificationAttributesResponse.Builder = {
    value.fold(self) { v => self.instanceTagAttribute(v) }
  }

}

final class RegisterInstanceEventNotificationAttributesResponseOps(
    val self: RegisterInstanceEventNotificationAttributesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagAttributeAsScala: Option[InstanceTagNotificationAttribute] = Option(self.instanceTagAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterInstanceEventNotificationAttributesResponseOps {

  implicit def toRegisterInstanceEventNotificationAttributesResponseBuilderOps(
      v: RegisterInstanceEventNotificationAttributesResponse.Builder
  ): RegisterInstanceEventNotificationAttributesResponseBuilderOps =
    new RegisterInstanceEventNotificationAttributesResponseBuilderOps(v)

  implicit def toRegisterInstanceEventNotificationAttributesResponseOps(
      v: RegisterInstanceEventNotificationAttributesResponse
  ): RegisterInstanceEventNotificationAttributesResponseOps =
    new RegisterInstanceEventNotificationAttributesResponseOps(v)

}
