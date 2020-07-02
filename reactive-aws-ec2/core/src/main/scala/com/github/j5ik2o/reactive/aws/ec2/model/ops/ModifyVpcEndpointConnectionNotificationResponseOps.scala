// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointConnectionNotificationResponseBuilderOps(
    val self: ModifyVpcEndpointConnectionNotificationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ModifyVpcEndpointConnectionNotificationResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ModifyVpcEndpointConnectionNotificationResponseOps(
    val self: ModifyVpcEndpointConnectionNotificationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointConnectionNotificationResponseOps {

  implicit def toModifyVpcEndpointConnectionNotificationResponseBuilderOps(
      v: ModifyVpcEndpointConnectionNotificationResponse.Builder
  ): ModifyVpcEndpointConnectionNotificationResponseBuilderOps =
    new ModifyVpcEndpointConnectionNotificationResponseBuilderOps(v)

  implicit def toModifyVpcEndpointConnectionNotificationResponseOps(
      v: ModifyVpcEndpointConnectionNotificationResponse
  ): ModifyVpcEndpointConnectionNotificationResponseOps = new ModifyVpcEndpointConnectionNotificationResponseOps(v)

}
