// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(
    val self: RegisterTransitGatewayMulticastGroupSourcesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredMulticastGroupSourcesAsScala(
      value: Option[TransitGatewayMulticastRegisteredGroupSources]
  ): RegisterTransitGatewayMulticastGroupSourcesResponse.Builder = {
    value.fold(self) { v => self.registeredMulticastGroupSources(v) }
  }

}

final class RegisterTransitGatewayMulticastGroupSourcesResponseOps(
    val self: RegisterTransitGatewayMulticastGroupSourcesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredMulticastGroupSourcesAsScala: Option[TransitGatewayMulticastRegisteredGroupSources] =
    Option(self.registeredMulticastGroupSources)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTransitGatewayMulticastGroupSourcesResponseOps {

  implicit def toRegisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(
      v: RegisterTransitGatewayMulticastGroupSourcesResponse.Builder
  ): RegisterTransitGatewayMulticastGroupSourcesResponseBuilderOps =
    new RegisterTransitGatewayMulticastGroupSourcesResponseBuilderOps(v)

  implicit def toRegisterTransitGatewayMulticastGroupSourcesResponseOps(
      v: RegisterTransitGatewayMulticastGroupSourcesResponse
  ): RegisterTransitGatewayMulticastGroupSourcesResponseOps =
    new RegisterTransitGatewayMulticastGroupSourcesResponseOps(v)

}
