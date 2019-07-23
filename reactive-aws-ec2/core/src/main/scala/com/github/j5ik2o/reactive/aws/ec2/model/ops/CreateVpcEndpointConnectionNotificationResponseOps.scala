// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointConnectionNotificationResponseBuilderOps(
    val self: CreateVpcEndpointConnectionNotificationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationAsScala(
      value: Option[ConnectionNotification]
  ): CreateVpcEndpointConnectionNotificationResponse.Builder = {
    value.fold(self) { v =>
      self.connectionNotification(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointConnectionNotificationResponse.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateVpcEndpointConnectionNotificationResponseOps(
    val self: CreateVpcEndpointConnectionNotificationResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionNotificationAsScala: Option[ConnectionNotification] = Option(self.connectionNotification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointConnectionNotificationResponseOps {

  implicit def toCreateVpcEndpointConnectionNotificationResponseBuilderOps(
      v: CreateVpcEndpointConnectionNotificationResponse.Builder
  ): CreateVpcEndpointConnectionNotificationResponseBuilderOps =
    new CreateVpcEndpointConnectionNotificationResponseBuilderOps(v)

  implicit def toCreateVpcEndpointConnectionNotificationResponseOps(
      v: CreateVpcEndpointConnectionNotificationResponse
  ): CreateVpcEndpointConnectionNotificationResponseOps = new CreateVpcEndpointConnectionNotificationResponseOps(v)

}
