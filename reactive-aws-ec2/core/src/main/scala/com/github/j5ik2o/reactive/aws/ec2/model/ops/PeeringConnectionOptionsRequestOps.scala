// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PeeringConnectionOptionsRequestBuilderOps(val self: PeeringConnectionOptionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowDnsResolutionFromRemoteVpcAsScala(value: Option[Boolean]): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v => self.allowDnsResolutionFromRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalClassicLinkToRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalVpcToRemoteClassicLinkAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalVpcToRemoteClassicLink(v) }
  }

}

final class PeeringConnectionOptionsRequestOps(val self: PeeringConnectionOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowDnsResolutionFromRemoteVpcAsScala: Option[Boolean] = Option(self.allowDnsResolutionFromRemoteVpc)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala: Option[Boolean] =
    Option(self.allowEgressFromLocalClassicLinkToRemoteVpc)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalVpcToRemoteClassicLinkAsScala: Option[Boolean] =
    Option(self.allowEgressFromLocalVpcToRemoteClassicLink)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPeeringConnectionOptionsRequestOps {

  implicit def toPeeringConnectionOptionsRequestBuilderOps(
      v: PeeringConnectionOptionsRequest.Builder
  ): PeeringConnectionOptionsRequestBuilderOps = new PeeringConnectionOptionsRequestBuilderOps(v)

  implicit def toPeeringConnectionOptionsRequestOps(
      v: PeeringConnectionOptionsRequest
  ): PeeringConnectionOptionsRequestOps = new PeeringConnectionOptionsRequestOps(v)

}
