// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PeeringConnectionOptionsBuilderOps(val self: PeeringConnectionOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowDnsResolutionFromRemoteVpcAsScala(value: Option[Boolean]): PeeringConnectionOptions.Builder = {
    value.fold(self) { v => self.allowDnsResolutionFromRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptions.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalClassicLinkToRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalVpcToRemoteClassicLinkAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptions.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalVpcToRemoteClassicLink(v) }
  }

}

final class PeeringConnectionOptionsOps(val self: PeeringConnectionOptions) extends AnyVal {

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
trait ToPeeringConnectionOptionsOps {

  implicit def toPeeringConnectionOptionsBuilderOps(
      v: PeeringConnectionOptions.Builder
  ): PeeringConnectionOptionsBuilderOps = new PeeringConnectionOptionsBuilderOps(v)

  implicit def toPeeringConnectionOptionsOps(v: PeeringConnectionOptions): PeeringConnectionOptionsOps =
    new PeeringConnectionOptionsOps(v)

}
