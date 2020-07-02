// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterTransitGatewayMulticastGroupMembersResponseBuilderOps(
    val self: RegisterTransitGatewayMulticastGroupMembersResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredMulticastGroupMembersAsScala(
      value: Option[TransitGatewayMulticastRegisteredGroupMembers]
  ): RegisterTransitGatewayMulticastGroupMembersResponse.Builder = {
    value.fold(self) { v => self.registeredMulticastGroupMembers(v) }
  }

}

final class RegisterTransitGatewayMulticastGroupMembersResponseOps(
    val self: RegisterTransitGatewayMulticastGroupMembersResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredMulticastGroupMembersAsScala: Option[TransitGatewayMulticastRegisteredGroupMembers] =
    Option(self.registeredMulticastGroupMembers)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTransitGatewayMulticastGroupMembersResponseOps {

  implicit def toRegisterTransitGatewayMulticastGroupMembersResponseBuilderOps(
      v: RegisterTransitGatewayMulticastGroupMembersResponse.Builder
  ): RegisterTransitGatewayMulticastGroupMembersResponseBuilderOps =
    new RegisterTransitGatewayMulticastGroupMembersResponseBuilderOps(v)

  implicit def toRegisterTransitGatewayMulticastGroupMembersResponseOps(
      v: RegisterTransitGatewayMulticastGroupMembersResponse
  ): RegisterTransitGatewayMulticastGroupMembersResponseOps =
    new RegisterTransitGatewayMulticastGroupMembersResponseOps(v)

}
