// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterInstanceEventNotificationAttributesRequestBuilderOps(val self: RegisterInstanceEventNotificationAttributesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTagAttributeAsScala(value: Option[RegisterInstanceTagAttributeRequest]): RegisterInstanceEventNotificationAttributesRequest.Builder = {
            value.fold(self){ v => self.instanceTagAttribute(v) }
            } 


}

final class RegisterInstanceEventNotificationAttributesRequestOps(val self: RegisterInstanceEventNotificationAttributesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTagAttributeAsScala: Option[RegisterInstanceTagAttributeRequest] = Option(self.instanceTagAttribute) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterInstanceEventNotificationAttributesRequestOps {

implicit def toRegisterInstanceEventNotificationAttributesRequestBuilderOps(v: RegisterInstanceEventNotificationAttributesRequest.Builder): RegisterInstanceEventNotificationAttributesRequestBuilderOps = new RegisterInstanceEventNotificationAttributesRequestBuilderOps(v)

implicit def toRegisterInstanceEventNotificationAttributesRequestOps(v: RegisterInstanceEventNotificationAttributesRequest): RegisterInstanceEventNotificationAttributesRequestOps = new RegisterInstanceEventNotificationAttributesRequestOps(v)

}

