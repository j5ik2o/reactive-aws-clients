// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PeeringConnectionOptionsRequestBuilderOps(val self: PeeringConnectionOptionsRequest.Builder)
    extends AnyVal {

  final def allowDnsResolutionFromRemoteVpcAsScala(value: Option[Boolean]): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allowDnsResolutionFromRemoteVpc(v)
    }
  }

  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allowEgressFromLocalClassicLinkToRemoteVpc(v)
    }
  }

  final def allowEgressFromLocalVpcToRemoteClassicLinkAsScala(
      value: Option[Boolean]
  ): PeeringConnectionOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.allowEgressFromLocalVpcToRemoteClassicLink(v)
    }
  }

}

final class PeeringConnectionOptionsRequestOps(val self: PeeringConnectionOptionsRequest) extends AnyVal {

  final def allowDnsResolutionFromRemoteVpcAsScala: Option[Boolean] = Option(self.allowDnsResolutionFromRemoteVpc)

  final def allowEgressFromLocalClassicLinkToRemoteVpcAsScala: Option[Boolean] =
    Option(self.allowEgressFromLocalClassicLinkToRemoteVpc)

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
