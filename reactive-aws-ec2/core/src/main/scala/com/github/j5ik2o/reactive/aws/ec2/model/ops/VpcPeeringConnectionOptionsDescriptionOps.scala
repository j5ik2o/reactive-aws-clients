// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcPeeringConnectionOptionsDescriptionBuilderOps(val self: VpcPeeringConnectionOptionsDescription.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowDnsResolutionFromRemoteVpcAsScala(
      value: Option[Boolean]
  ): VpcPeeringConnectionOptionsDescription.Builder = {
    value.fold(self) { v => self.allowDnsResolutionFromRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala(
      value: Option[Boolean]
  ): VpcPeeringConnectionOptionsDescription.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalClassicLinkToRemoteVpc(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowEgressFromLocalVpcToRemoteClassicLinkAsScala(
      value: Option[Boolean]
  ): VpcPeeringConnectionOptionsDescription.Builder = {
    value.fold(self) { v => self.allowEgressFromLocalVpcToRemoteClassicLink(v) }
  }

}

final class VpcPeeringConnectionOptionsDescriptionOps(val self: VpcPeeringConnectionOptionsDescription) extends AnyVal {

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
trait ToVpcPeeringConnectionOptionsDescriptionOps {

  implicit def toVpcPeeringConnectionOptionsDescriptionBuilderOps(
      v: VpcPeeringConnectionOptionsDescription.Builder
  ): VpcPeeringConnectionOptionsDescriptionBuilderOps = new VpcPeeringConnectionOptionsDescriptionBuilderOps(v)

  implicit def toVpcPeeringConnectionOptionsDescriptionOps(
      v: VpcPeeringConnectionOptionsDescription
  ): VpcPeeringConnectionOptionsDescriptionOps = new VpcPeeringConnectionOptionsDescriptionOps(v)

}
